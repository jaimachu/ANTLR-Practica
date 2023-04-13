grammar Compilator;
g : (IDENTIFIER | CONST_DEF_IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST |STRING_CONST)+;
CONST_DEF_IDENTIFIER : ('_')* [A-Z]+ ([A-Z0-9]+ | '_')*;
IDENTIFIER : ('_')* [a-zA-Z]+ ([a-zA-Z0-9]+ | '_')*;
NUMERIC_REAL_CONST : ('+'|'-')? (([0-9]* '.' [0-9]+) | ([0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+) | ([0-9]* '.' [0-9]+ ('e' | 'E') ('+'|'-')? [0-9]+));
NUMERIC_INTEGER_CONST : ('+'|'-')? [0-9]+;
STRING_CONST : (DOBLES | SIMPLES)+;

fragment
DOBLES : ('"') (PUNTO | '\'' | (BARRA '"') | (BARRA '\''))*  ('"');
SIMPLES :  ('\'') (PUNTO | (BARRA '\'') | (BARRA '"') | '"')* ('\'');
//RESERVADAS : ;
PUNTO : [a-zA-Z0-9] | ' ';
BARRA : '\\';