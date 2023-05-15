grammar Compilator;
@header{
    import java.io.File;
    import java.io.FileWriter;
}
// ---------------------------------------------------
// ------------ANALIZADOR SINTÁCTICO------------------
// ---------------------------------------------------

// Axioma
program :
            dcllist
            funlist["", ""]
            sentlist {
                try{
                    File archivo = new File("ejemplo.html");
                    FileWriter escribir=new FileWriter(archivo,false);

                    String cadena = $funlist.cabecera;
                    String[] array = cadena.split("\n");
                    escribir.write("<style> .palres{font-weight: bold;} .ident{color: blue;} .cte{color: green} </style>");
                    escribir.write("<h2>Funciones</h2>\n");
                    escribir.write("<ul>\n");
                    for (int i = 0; i < array.length; i++)
                        escribir.write("    <li>" + array[i] + "</li>\n");
                    escribir.write("</ul>\n");
                    escribir.write("<hr/>\n");
                    escribir.write($funlist.vc);
                    escribir.close();
                }catch (Exception e){
                    System.out.println("Error al escribir");
                }
            }<EOF>;

// ---------------------------------------------------------------------------------------------------------------------
// 1. DECLARACIÓN DE VARIABLES Y CONSTANTES
// ---------------------------------------------------------------------------------------------------------------------

dcllist :dcl dcllist
    | ;

// Declaración de una variable o constante
dcl : ctedef
    | vardef ';' ;

ctedef: '#define' CONST_DEF_IDENTIFIER simpvalue ;

// Valor de la constante o variable
simpvalue returns[String vc]
    : NUMERIC_INTEGER_CONST {$vc = "<SPAN CLASS=\"cte\">"+ $NUMERIC_INTEGER_CONST.text +"</SPAN>";}
    | NUMERIC_REAL_CONST {$vc = "<SPAN CLASS=\"cte\">"+ $NUMERIC_REAL_CONST.text +"</SPAN>";}
    | STRING_CONST {$vc = "<SPAN CLASS=\"cte\">"+ $STRING_CONST.text +"</SPAN>";};

// Estructura de una declaración de variable
varlist : vardef ';' varlistP;
varlistP :
    vardef ';' varlistP
	| ;



vardef :tbas IDENTIFIER vardefP;
vardefP: '=' simpvalue
    | ;

// Tipo de una variable
tbas returns [String v, String vc]
    : 'integer' {
        $v = "integer ";
        $vc = "<SPAN CLASS=\"palres\"> integer </SPAN>\n";
    }
    | 'float' {
        $v = "float ";
        $vc = "<SPAN CLASS=\"palres\"> float </SPAN>\n";
    }
    | 'string' {
        $v = "string ";
        $vc = "<SPAN CLASS=\"palres\"> string </SPAN>\n";
    };

tvoid returns [String v, String vc]
    : 'void' {
        $v = "void ";
        $vc = "<SPAN CLASS=\"palres\"> void </SPAN>\n";
    };

// ---------------------------------------------------------------------------------------------------------------------
// 2. DECLARACIÓN DE FUNCIONES
// ---------------------------------------------------------------------------------------------------------------------

funlist[String list, String listFunc] returns [String cabecera, String vc]:
     funcdef {$list = $list + $funcdef.h + "\n"; $listFunc = $listFunc + $funcdef.vc;} f1 = funlist[$list, $listFunc] {$cabecera = $f1.cabecera; $vc = $f1.vc;}
     | {$cabecera = $list; $vc = $listFunc;};

// Estructura de la función
funcdef returns [String h, String vc]
    : funchead '{' code '}'{
        $h = $funchead.v;

        $vc = $funchead.vc + "<span>{</span>" + "<span>}</span>" + "<BR/>";
    };

// Estructura de la cabecera de la función
funchead returns [String v, String vc]
    : tbas IDENTIFIER '(' typedef1 ')' {
        $v = $tbas.v + $IDENTIFIER.text + " <span>(</span>" + $typedef1.v + "<span>)</span>";

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN\n";
        $vc = $tbas.vc + identifier + " <span>(</span>" + $typedef1.vc + " <span>)</span>";
    }
    | tvoid IDENTIFIER '(' typedef1 ')' {
        $v = $tvoid.v + $IDENTIFIER.text + "<span>(</span>" + $typedef1.v + "<span>)</span>";

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN\n";
        $vc = $tvoid.vc + identifier + " <span>(</span>" + $typedef1.vc + " <span>)</span>";
    };

// Parámetros de la función
typedef1 returns [String v, String vc]
    : typedef2 {
        $v = $typedef2.v;
        $vc = $typedef2.vc;
    }
    | {
        $v = "";
        $vc = "";
    };

typedef2 returns [String v, String vc]
    : tbas IDENTIFIER typedef2P {
        $v = $tbas.v + $IDENTIFIER.text + $typedef2P.v;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN\n";
        $vc = $tbas.vc + identifier + $typedef2P.vc;
    };

typedef2P returns [String v, String vc]
    : ',' tbas IDENTIFIER t1 = typedef2P {
        $v = ',' + $tbas.v + $IDENTIFIER.text + $typedef2P.v;
        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN\n";
        $vc = $tbas.vc + identifier + $t1.vc;
    }
    | {
        $v = "";
        $vc = "";
    };


// ---------------------------------------------------------------------------------------------------------------------
// 3. DECLARACIÓN DEL CUERPO DEL PROGRAMA
// ---------------------------------------------------------------------------------------------------------------------
sentlist:  mainhead '{' code '}';

// Cabecera del programa principal
mainhead : tvoid 'Main' '(' typedef1 ')';

// Código con sus respectivas sentencias
code : sent code
		| ;

sent : asig ';'
    | funccall ';'
    | vardef ';'
    | return ';' ;

return : 'return' exp;

// Estructura de una asignación
asig : IDENTIFIER '=' exp;

// Estructura de una operación entre dos factores
exp : factor expP;

expP : op factor expP
    | ;

op : '+'
    | '-'
    | '*'
    | 'DIV'
    | 'MOD' ;

// Factor que puede ser un valor, una expresión entre paréntesis o una llamada a una función
factor : simpvalue
    | '(' exp ')'
    |  funccall ;

// Estructura de una llamada a una función en las sentencias del código
funccall : IDENTIFIER subpparamlist | CONST_DEF_IDENTIFIER ;

// Lista de parámetros
subpparamlist :
    '(' explist ')'
    | ;

// Lista de expresiones
explist : exp explistP;


explistP : ',' exp explistP
    | ;

// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------

/* Analizador léxico */
//g : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST |STRING_CONST)+;

SALTOS: [\r\n\t ]+ -> skip;

COMENTARIO_PAREJA: ('/*') (ANYCHAR | NEW_LINE)* ('*/')->skip;
COMENTARIO_SIMPLE: (BARRA_BARRA) (ANYCHAR)* NEW_LINE? ->skip;

CONST_DEF_IDENTIFIER : ('_')* [A-Z]+ ([A-Z0-9]+ | '_')*;
IDENTIFIER : ('_')* [a-zA-Z]+ ([a-zA-Z0-9]+ | '_')*;

NUMERIC_REAL_CONST : ('+'|'-')? (([0-9]* '.' [0-9]+) | ([0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+) | ([0-9]* '.' [0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+));
NUMERIC_INTEGER_CONST : ('+'|'-')? [0-9]+;
//hemos quitado las simples
STRING_CONST : (DOBLES|SIMPLES) {
    String cadena = getText();
    cadena = cadena.replace("\\'", "'");
    cadena = cadena.replace("\\\"", "\"");
    cadena = cadena.substring(1, cadena.length()-1);
    setText(cadena);
    };

fragment
DOBLES : ('"') (ANYCHARDOBLES | '\'' | (BARRA '"') | (BARRA '\''))*  ('"');
SIMPLES :  ('\'') (ANYCHARSIMPLES | (BARRA '\'') | (BARRA '"') | '"')* ('\'');

//RESERVADAS : ;
BARRA : '\\';
BARRA_BARRA : '//';

ANYCHARDOBLES: ~["\r\n] ;
ANYCHARSIMPLES: ~['\r\n] ;

ANYCHAR: ~[\r\t\n];
NEW_LINE: [\r\n];
