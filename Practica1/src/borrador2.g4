grammar Borrador;
//g : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST |STRING_CONST | COMENTARIO_SIMPLE | COMENTARIO_PAREJA)+;

// ---------------------------------------------------
// ------------ANALIZADOR SINTÁCTICO------------------
// ---------------------------------------------------

// Axioma
program : dcllist funlist sentlist <EOF>;

// ----------------------------------------
// 1. DECLARACIÓN DE VARIABLES Y CONSTANTES
// ----------------------------------------
dcllist :
    | dcl dcllist
    ;

// Declaración de una variable o constante
dcl : ctelist
    | varlist
    ;

// Estructura de una declaración de constante
ctelist : '#define' CONST_DEF_IDENTIFIER simpvalue ctelistP  ;

ctelistP : '#define' CONST_DEF_IDENTIFIER simpvalue ctelistP
        |
        ;

// Estructura de una declaración de variable
varlist : vardef ';' varlistP;

varlistP :
    vardef ';' varlistP
	|
	;

vardef :
    tbas IDENTIFIER vardefP
    | tvoid IDENTIFIER vardefP;

vardefP: '=' simpvalue | ;

// Valor de la constante o variable
simpvalue : NUMERIC_INTEGER_CONST
    | NUMERIC_REAL_CONST
    | STRING_CONST
    ;

// Tipo de una variable
tbas : 'integer'
    | 'float'
    | 'string'
    ;
tvoid : 'void';


// ----------------------------------------
// 2. DECLARACIÓN DE FUNCIONES
// ----------------------------------------

funlist :
     funcdef funlist
     | ;

// Estructura de la función
funcdef : funchead '{' code '}';

// Estructura de la cabecera de la función
funchead : tbas IDENTIFIER '(' typedef1 ')'
    |tvoid IDENTIFIER '(' typedef1 ')';

// Parámetros de la función
typedef1 :
    | typedef2
    ;

typedef2 : tbas IDENTIFIER t2Aux
    |tvoid IDENTIFIER t2Aux;

t2Aux: ',' typedef2P | ;

typedef2P :
    tbas IDENTIFIER t2Aux
    | tvoid IDENTIFIER t2Aux
	;

// ----------------------------------------
// 3. DECLARACIÓN DEL CUERPO DEL PROGRAMA
// ----------------------------------------
sentlist: tvoid mainhead '{' code '}';

// Cabecera del programa principal
mainhead : 'Main' '(' typedef1 ')';

// Código con sus respectivas sentencias
code : sent code
		|
		;
sent : IDENTIFIER sentAux |vardef ';';

sentAux: asig ';'| funccall ';';


// Estructura de una asignación
asig :  '=' exp;

// Estructura de una operación entre dos factores
exp : factor expP;
expP : op factor expP
    |
    ;

op : '+'
    | '-'
    | '*'
    | 'DIV'
    | 'MOD'
    ;

// Factor que puede ser un valor, una expresión entre paréntesis o una llamada a una función
factor : simpvalue
    | '(' exp ')'
    | IDENTIFIER funccall| CONST_DEF_IDENTIFIER funccall
    ;

// Estructura de una llamada a una función en las sentencias del código
funccall : subpparamlist ;

// Lista de parámetros
subpparamlist :
    | '(' explist ')'
    ;

// Lista de expresiones
explist : exp explistP;


explistP : ',' exp explistP
    |
    ;


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