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
            funlist["", "", ""]
            sentlist {
                try{
                    String cadena = $funlist.cabecera;
                    String funcName = $funlist.funcName;
                    String[] listFunc = cadena.split("\n");
                    String[] listFuncName = funcName.split("\n");

                    File archivo = new File("ejemplo.html");
                    FileWriter escribir=new FileWriter(archivo,false);
                    escribir.write("<style> .palres{font-weight: bold;} .ident{color: blue;} .cte{color: green} </style>");
                    escribir.write("<h1>Programa: XXXX</h1>\n");
                    escribir.write("<h2>Funciones</h2>\n");
                    escribir.write("<ul>\n");
                    for (int i = 0; i < listFunc.length; i++){
                        String nombre = listFuncName[i];
                        String enlace = "<a href=\"" + nombre + "\">" + listFunc[i] + "</a>";
                        escribir.write("    <li>" + enlace + "</li>\n");
                    }
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



vardef returns [String value]
    : tbas IDENTIFIER vardefP {$value = $tbas.value + $IDENTIFIER.text + $vardefP.value;};
vardefP returns [String value]
    : '=' simpvalue {$value = "=" + $simpvalue.vc;}
    | {$value = "";};

// Tipo de una variable
tbas returns [String vc, String value]
    : 'integer' {
        $value = "integer ";
        $vc = "<SPAN CLASS=\"palres\"> integer </SPAN>";
    }
    | 'float' {
        $value = "float ";
        $vc = "<SPAN CLASS=\"palres\"> float </SPAN>";
    }
    | 'string' {
        $value = "string ";
        $vc = "<SPAN CLASS=\"palres\"> string </SPAN>";
    };

tvoid returns [String vc, String value]
    : 'void' {
        $value = "void ";
        $vc = "<SPAN CLASS=\"palres\"> void </SPAN>";
    };

// ---------------------------------------------------------------------------------------------------------------------
// 2. DECLARACIÓN DE FUNCIONES
// ---------------------------------------------------------------------------------------------------------------------

funlist[String listCab, String listFunc, String listFuncName] returns [String cabecera, String vc, String funcName]:
     funcdef {
        $listCab = $listCab + $funcdef.cabecera + "\n";
        $listFunc = $listFunc + $funcdef.vc;
        $listFuncName = $listFuncName + $funcdef.funcName + "\n";
     } f1 = funlist[$listCab, $listFunc, $listFuncName] {
        $cabecera = $f1.cabecera;
        $vc = $f1.vc;
        $funcName = $f1.funcName;
     }
     | {
        $cabecera = $listCab;
        $vc = $listFunc;
        $funcName = $listFuncName;
    };

// Estructura de la función
funcdef returns [String cabecera, String vc, String funcName]
    : funchead '{' code[""] '}'{
        $cabecera = $funchead.valueCab;

        $funcName = $funchead.funcName;

        String codigo = "<DIV style=\"text-indent: 10cm\">" + $code.value + "</DIV>";

        System.out.println(codigo);
        $vc = $funchead.vc + "<span>{</span>" + codigo +"<span>}</span>" + "<BR/>";
    };

// Estructura de la cabecera de la función
funchead returns [String vc, String valueCab, String funcName]
    : tbas IDENTIFIER '(' typedef1 ')' {
        $valueCab = $tbas.value + $IDENTIFIER.text + "(" + $typedef1.value + ")";

        $funcName = $IDENTIFIER.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN";
        $vc = $tbas.vc + identifier + " <span>(</span>" + $typedef1.vc + " <span>)</span>";
    }
    | tvoid IDENTIFIER '(' typedef1 ')' {
        $valueCab = $tvoid.value + $IDENTIFIER.text + "(" + $typedef1.value + ")";

        $funcName = $IDENTIFIER.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN";
        $vc = $tvoid.vc + identifier + " <span>(</span>" + $typedef1.vc + " <span>)</span>";
    };

// Parámetros de la función
typedef1 returns [String vc, String value]
    : typedef2 {
        $value = $typedef2.value;
        $vc = $typedef2.vc;
    }
    | {
        $value = "";
        $vc = "";
    };

typedef2 returns [String vc, String value]
    : tbas IDENTIFIER typedef2P {
        $value = $tbas.value + $IDENTIFIER.text + $typedef2P.value;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN";
        $vc = $tbas.vc + identifier + $typedef2P.vc;
    };

typedef2P returns [String vc, String value]
    : ',' tbas IDENTIFIER t1 = typedef2P {
        $value = "," + $tbas.value + $IDENTIFIER.text + $typedef2P.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN";
        String coma = "<span>,</span>";
        $vc = coma + $tbas.vc + identifier + $t1.vc;
    }
    | {
        $value = "";
        $vc = "";
    };


// ---------------------------------------------------------------------------------------------------------------------
// 3. DECLARACIÓN DEL CUERPO DEL PROGRAMA
// ---------------------------------------------------------------------------------------------------------------------
sentlist returns[String value]
    :  mainhead '{' code["kjhkh"] '}' {$value = $mainhead.value + "{" + $code.value + "}";};

// Cabecera del programa principal
mainhead returns[String value]
    : tvoid 'Main' '(' typedef1 ')' {$value = $tvoid.value + "Main" + "(" + $typedef1.value + ")";};

// Código con sus respectivas sentencias
code[String valueH] returns[String value]
    : sent {$valueH = $valueH + $sent.value;} c1 = code[valueH] {$value = $c1.value;}
	| {$value = $valueH;};

sent returns[String value]
    : asig ';' {$value = $asig.value + ";";}
    | funccall ';' {$value = $funccall.value + ";";}
    | vardef ';' {$value = $vardef.value + ";";}
    | returnn ';' {$value = $returnn.value + ";";};

returnn returns[String value]
    : 'return' exp {$value = "return" + $exp.value;};

// Estructura de una asignación
asig returns[String value]
    : IDENTIFIER '=' exp {$value = $IDENTIFIER.text + "=" + $exp.value;};

// Estructura de una operación entre dos factores
exp returns[String value]
    : factor expP[""] {$value = $factor.value + $expP.value;};

expP[String valueH] returns [String value]
    : op factor {$valueH = $valueH + $op.value + $factor.value;} e1 = expP[$valueH]{$value = $e1.value;}
    | {$value = $valueH;};

op returns [String value]
    : '+' {$value = "+";}
    | '-' {$value = "-";}
    | '*' {$value = "*";}
    | 'DIV' {$value = "DIV";}
    | 'MOD' {$value = "MOD";};

// Factor que puede ser un valor, una expresión entre paréntesis o una llamada a una función
factor returns [String value]
    : simpvalue {$value = $simpvalue.vc;}
    | '(' exp ')' {$value = "(" + $exp.value + ")";}
    |  funccall {$value = $funccall.value;};

// Estructura de una llamada a una función en las sentencias del código
funccall returns [String value]
    : IDENTIFIER subpparamlist {$value = $IDENTIFIER.text + $subpparamlist.value;}
    | CONST_DEF_IDENTIFIER {$value = $CONST_DEF_IDENTIFIER.text;};

// Lista de parámetros
subpparamlist returns [String value]:
    '(' explist ')' {$value = "(" + $explist.value + ")";}
    | {$value = "";};

// Lista de expresiones
explist returns [String value]
    : exp explistP[""] {$value = $exp.value + $explistP.value;};


explistP[String valueH] returns [String value]
    : ',' exp {$valueH = $valueH + "," + $exp.value;} e1 = explistP[$valueH] {$value = $e1.value;}
    | {$value = $valueH;};

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
