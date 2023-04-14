grammar Compilator;
//g : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST |STRING_CONST | COMENTARIO_SIMPLE | COMENTARIO_PAREJA)+;

/* Analizador sintáctico*/

program : dcllist funlist sentlist <EOF>{System.out.print("Aceptado");};

dcllist :
    | dcllist dcl;

funlist :
    | funlist funcdef;

sentlist: mainhead '{' code '}';

dcl : ctelist
    | varlist;

ctelist : '#define' CONST_DEF_IDENTIFIER simpvalue ctelistP{System.out.print("Hola");};
ctelistP : '#define' CONST_DEF_IDENTIFIER simpvalue
		|
		;

simpvalue : NUMERIC_INTEGER_CONST
    | NUMERIC_REAL_CONST
    | STRING_CONST;

varlist : vardef ';' varlistP;
varlistP : vardef ';'
		| ;

vardef : tbas IDENTIFIER
    | tbas IDENTIFIER '=' simpvalue;

tbas : 'integer'
    | 'float'
    | 'string'
    | tvoid;

tvoid : 'void';

funcdef : funchead '{' code '}';

funchead : tbas IDENTIFIER '(' typedef1 ')';

typedef1 :
    | typedef2;

typedef2 : tbas IDENTIFIER typedef2P;

typedef2P : ',' tbas IDENTIFIER typedef2P
		| ;

mainhead : tvoid 'Main' '(' typedef1 ')';

code : sent code
		| ;

sent : asig ';'
    | funccall ';'
    | vardef ';';

asig : IDENTIFIER '=' exp;

exp : op expP;
expP : factor exp expP
    | ;

op : '+'
    | '-'
    | '*'
    | 'DIV'
    | 'MOD';

factor : simpvalue
    | '(' exp ')'
    | funccall;

funccall : IDENTIFIER subpparamlist
    | CONST_DEF_IDENTIFIER subpparamlist;

subpparamlist :
    | '(' explist ')';

explist : exp
    | exp ','
    explist;

/* Analizador léxico */

ESPACIO: ' ' -> skip;
SALTOS: '\n' -> skip;
CONST_DEF_IDENTIFIER : ('_')* [A-Z]+ ([A-Z0-9]+ | '_')*{System.out.println("Hola");};
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
