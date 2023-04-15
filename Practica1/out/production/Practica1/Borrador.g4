grammar Borrador;
//g : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST |STRING_CONST | COMENTARIO_SIMPLE | COMENTARIO_PAREJA)+;

@parser::members{

    private sintesis informacion;

    public CompilatorParser ( TokenStream input, sintesis informacion){
        this(input);
        this.informacion = informacion;
    }

}

// ---------------------------------------------------
// ------------ANALIZADOR SINTÁCTICO------------------
// ---------------------------------------------------

// Axioma
program : dcllist funlist sentlist <EOF>;

// ----------------------------------------
// 1. DECLARACIÓN DE VARIABLES Y CONSTANTES
// ----------------------------------------
dcllist :
    | dcllist dcl
    ;

// Declaración de una variable o constante
dcl : ctelist
    | varlist
    ;

// Estructura de una declaración de constante
ctelist : '#define' CONST_DEF_IDENTIFIER simpvalue ctelistP;
ctelistP : '#define' CONST_DEF_IDENTIFIER simpvalue
        |
        ;

// Estructura de una declaración de variable
varlist : vardef ';' varlistP;
varlistP : vardef ';'
		|
		;

vardef : tbas IDENTIFIER
    | tbas IDENTIFIER '=' simpvalue
    ;

// Valor de la constante o variable
simpvalue : NUMERIC_INTEGER_CONST
    | NUMERIC_REAL_CONST
    | STRING_CONST
    ;

// Tipo de una variable
tbas : 'integer'
    | 'float'
    | 'string'
    | tvoid
    | struct
    ;

tvoid : 'void';

struct : 'struct' '{' varlist '}';

// ----------------------------------------
// 2. DECLARACIÓN DE FUNCIONES
// ----------------------------------------
funlist :
    | funlist funcdef
    ;

// Estructura de la función
funcdef : funchead '{' code '}';

// Estructura de la cabecera de la función
funchead : tbas IDENTIFIER '(' typedef1 ')';

// Parámetros de la función
typedef1 :
    | typedef2
    ;

typedef2 : tbas IDENTIFIER typedef2P;
typedef2P : ',' tbas IDENTIFIER typedef2P
		|
		;

// ----------------------------------------
// 3. DECLARACIÓN DEL CUERPO DEL PROGRAMA
// ----------------------------------------
sentlist: mainhead '{' code '}';

// Cabecera del programa principal
mainhead : tvoid 'Main' '(' typedef1 ')';

// Código con sus respectivas sentencias
code : sent code
		|
		;

sent : asig ';'
    | funccall ';'
    | vardef ';'
    | if
    | while
    | dowhile
    | for
    ;

// Estructura de una asignación
asig : IDENTIFIER '=' exp;

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
    | funccall
    ;

// Estructura de una llamada a una función en las sentencias del código
funccall : IDENTIFIER subpparamlist
    | CONST_DEF_IDENTIFIER subpparamlist
    ;

// Lista de parámetros
subpparamlist :
    | '(' explist ')'
    ;

// Lista de expresiones
explist : exp
    | exp ','
    explist
    ;

// Sentencias de control
if : 'if' expcond '{' code '}' else;
else : 'else' '{' code '}'
    | 'else' if
    |
    ;

while : 'while' '(' expcond ')' '{' code '}';

dowhile : 'do' '{' code '}' 'while' '(' expcond ')' ';';

for : 'for' '(' vardef ';' expcond ';' asig ')' '{' code '}'
    | 'for' '(' asig ';' expcond ';' asig ')' '{' code '}';

// Expresiones de condiciones para las sentencias de control
expcond : factorcond expcondP;
expcondP : oplog factorcond expcondP
    |
    ;

// OR AND
oplog : '||'
    | '&'
    ;

// La expresión que va antes o después de un and u or
factorcond : exp opcomp exp
    | '(' expcond ')'
    | '!' factorcond
    ;

opcomp : '<'
    | '>'
    | '<='
    | '>='
    | '=='
    ;

/* Analizador léxico */

ESPACIO: ' ' -> skip;
SALTOS: [\r\n\t] -> skip;
CONST_DEF_IDENTIFIER : ('_')* [A-Z]+ ([A-Z0-9]+ | '_')*;
IDENTIFIER : ('_')* [a-zA-Z]+ ([a-zA-Z0-9]+ | '_')*;
NUMERIC_REAL_CONST : ('+'|'-')? (([0-9]* '.' [0-9]+) | ([0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+) | ([0-9]* '.' [0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+));
NUMERIC_INTEGER_CONST : ('+'|'-')? [0-9]+;
STRING_CONST : (DOBLES | SIMPLES)+ {
    String cadena = getText();
    cadena = cadena.replace("'", "");
    System.out.println("Token string: " + cadena);
    };
COMENTARIO_SIMPLE: (BARRA_BARRA) (ANYCHAR)* NEW_LINE? -> channel(HIDDEN);
COMENTARIO_PAREJA: ('/*') (ANYCHAR | NEW_LINE)* ('*/') -> channel(HIDDEN);

fragment
DOBLES : ('"') (ANYCHAR | '\'' | (BARRA '"') | (BARRA '\''))*  ('"');
SIMPLES :  ('\'') (ANYCHAR | (BARRA '\'') | (BARRA '"') | '"')* ('\'');
//RESERVADAS : ;
PUNTO : [a-zA-Z0-9.] | ' ';
BARRA : '\\' -> skip;
BARRA_BARRA : '//';
ANYCHAR: ~[\r\n*/] | ~'\'';
NEW_LINE: [\r\n];
