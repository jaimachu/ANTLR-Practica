grammar Compilator;
// ---------------------------------------------------
// ------------ANALIZADOR SINTÁCTICO------------------
// ---------------------------------------------------

// Axioma
program :
            dcllist
            funlist[""]
            sentlist {
            String cadena = $funlist.cabecera;
            String[] array = cadena.split("\n");
            System.out.println("<h2>Funciones</h2>");
            System.out.println("<ul>");
            for (int i = 0; i < array.length; i++)
                System.out.println("<li>" + array[i] + "</li>");
            System.out.println("</ul>");
            System.out.println("<hr/>");
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
simpvalue : NUMERIC_INTEGER_CONST
    | NUMERIC_REAL_CONST
    | STRING_CONST ;

// Estructura de una declaración de variable
varlist : vardef ';' varlistP;
varlistP :
    vardef ';' varlistP
	| ;



vardef :tbas IDENTIFIER vardefP;
vardefP: '=' simpvalue
    | ;

// Tipo de una variable
tbas returns [String v]
    : 'integer' {$v = "integer ";}
    | 'float' {$v = "float ";}
    | 'string' {$v = "string ";};

tvoid returns [String v]
    : 'void' {$v = "void ";};

// ---------------------------------------------------------------------------------------------------------------------
// 2. DECLARACIÓN DE FUNCIONES
// ---------------------------------------------------------------------------------------------------------------------

funlist[String list] returns [String cabecera]:
     funcdef {$list = $list + $funcdef.h + "\n";} f1 = funlist[$list] {$cabecera = $f1.cabecera;}
     | {$cabecera = $list;};

// Estructura de la función
funcdef returns [String h]
    : funchead '{' code '}'{
        $h = $funchead.v;
        //System.out.println($h);
    };

// Estructura de la cabecera de la función
funchead returns [String v]
    : tbas IDENTIFIER '(' typedef1 ')' {
        $v = $tbas.v + $IDENTIFIER.text + " (" + $typedef1.v + ")";
    }
    | tvoid IDENTIFIER '(' typedef1 ')' {
        $v = $tvoid.v + $IDENTIFIER.text + " (" + $typedef1.v + ")";
    };

// Parámetros de la función
typedef1 returns [String v]
    : typedef2 {
        $v = $typedef2.v;
    }
    | {
        $v = "";
    };

typedef2 returns [String v]
    : tbas IDENTIFIER typedef2P {
        $v = $tbas.v + $IDENTIFIER.text + $typedef2P.v;
    };

typedef2P returns [String v]
    : ',' tbas IDENTIFIER typedef2P {
        $v = ',' + $tbas.v + $IDENTIFIER.text + $typedef2P.v;
    }
    | {
        $v = "";
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
