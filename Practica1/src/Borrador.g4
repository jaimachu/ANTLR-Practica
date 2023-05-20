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
            dcllist[""]
            funlist["", "", ""]
            sentlist {
                try{
                    String cadena = $funlist.cabecera;
                    String funcName = $funlist.funcName;
                    String[] listFunc = cadena.split("\n");
                    String[] listFuncName = funcName.split("\n");

                    File archivo = new File("ejemplo.html");
                    FileWriter escribir=new FileWriter(archivo,false);

                    //CSS DE LA PAGINA
                    escribir.write("<style> \n" +
                    "    .palres{\n" +
                    "        font-weight: bold;\n" +
                    "    } \n" +
                    "    .ident{\n" +
                    "        color: blue;\n" +
                    "    } \n" +
                    "    .cte{\n" +
                    "        color: green\n" +
                    "    } \n" +
                    "</style>\n");
                    escribir.write("<hr/>\n");
                    escribir.write("<a name=\"main\"></a>\n");

                    //PROGRAMA
                    escribir.write("<h1>Programa: XXXX</h1>\n");

                    //Funciones
                    escribir.write("<h2>Funciones</h2>\n");
                    escribir.write("<ul>\n");
                    for (int i = 0; i < listFunc.length; i++){
                        String nombre = listFuncName[i];
                        String enlace = "<a href=\"#" + nombre + "\">" + listFunc[i] + "</a>";
                        escribir.write("    <li>" + enlace + "</li>\n");
                    }
                    escribir.write("</ul>\n");
                    escribir.write("<hr/>\n");
                    escribir.write($funlist.vc);

                    //PROGRAMA PRINCIPAL
                    escribir.write("\n<h2>Programa Principal</h2>\n<br>\n");

                    //Variables
                    escribir.write($dcllist.value);

                    //Main()

                    escribir.write("\n"+$sentlist.value);


                    escribir.close();
                }catch (Exception e){
                    System.out.println("Error al escribir");
                }
            }<EOF>;

// ---------------------------------------------------------------------------------------------------------------------
// 1. DECLARACIÓN DE VARIABLES Y CONSTANTES
// ---------------------------------------------------------------------------------------------------------------------

dcllist [String valueH]returns [String value] :
    dcl {$valueH = $valueH + $dcl.value;} d1=dcllist[$valueH] {$value = $d1.value;}
    |  {$value = $valueH;};

// DeclaraciÃ³n de una variable o constante
dcl returns [String value]:
    ctedef{$value = $ctedef.value+"\n";}
    | vardef ';'{$value = $vardef.value + ";\n" + "<br>\n";} ;

ctedef returns [String value]:
    '#define' CONST_DEF_IDENTIFIER simpvalue {
    String v = "<span style=\"font-weight: bold;\">#define</span> <span CLASS=\"ident\">"+ $CONST_DEF_IDENTIFIER.text +"</span>";
    $value = v+" "+$simpvalue.vc+"\n<br>\n";} ;

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
    : tbas IDENTIFIER vardefP {$value = $tbas.vc + "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>" + $vardefP.value;};
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
    : funchead '{' code["", 1] '}'{
        $cabecera = $funchead.valueCab;

        $funcName = $funchead.funcName;

        String codigo = $code.value;
        String iniFunc = "<a href=" + "\"#" + $funcName + "\"" + "><span>Inicio de la función</span></a>\n";
        String iniProg = "<a href=\"#main\"><span> Inicio del programa</span></a>\n";
        $vc = "<a NAME=" + "\"" + $funcName + "\"" + "></a>\n" + $funchead.vc + "<span>{</span>" + codigo +"<span>}</span>" + "\n<br>\n" + iniFunc + iniProg + "<hr>";
    };

// Estructura de la cabecera de la función
funchead returns [String vc, String valueCab, String funcName]
    : tbas IDENTIFIER '(' typedef1 ')' {
        $valueCab = $tbas.value + $IDENTIFIER.text + "(" + $typedef1.value + ")";

        $funcName = $IDENTIFIER.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>";
        $vc = $tbas.vc + identifier + " <span>(</span>" + $typedef1.vc + " <span>)</span>";
    }
    | tvoid IDENTIFIER '(' typedef1 ')' {
        $valueCab = $tvoid.value + $IDENTIFIER.text + "(" + $typedef1.value + ")";

        $funcName = $IDENTIFIER.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>";
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

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>";
        $vc = $tbas.vc + identifier + $typedef2P.vc;
    };

typedef2P returns [String vc, String value]
    : ',' tbas IDENTIFIER t1 = typedef2P {
        $value = "," + $tbas.value + $IDENTIFIER.text + $typedef2P.text;

        String identifier = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>";
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
    :  mainhead '{' code["", 1] '}' {$value = $mainhead.value + "{" + $code.value + "}";};

// Cabecera del programa principal
mainhead returns[String value]
    : tvoid 'Main' '(' typedef1 ')' {$value = $tvoid.value + "<span class = \"ident\">Main</span>" + "(" + $typedef1.value + ")";};

// Código con sus respectivas sentencias
code[String valueH, int tab] returns[String value]
    : sent[tab] {$valueH = $valueH + $sent.value;} c1 = code[$valueH, $tab] {$value = $c1.value;}
	| {$value = $valueH;};

sent[int tab] returns[String value]
    : asig ';' {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $asig.value + ";" + "\n</div>" + "\n";}
    | funccall ';' {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $funccall.value + ";" + "\n</div>" + "\n";}
    | vardef ';' {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $vardef.value + ";" + "\n</div>" + "\n";}
    | returnn ';' {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $returnn.value + ";" + "\n</div>" + "\n";}
    | ifr[$tab] {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $ifr.value + "\n</div>" + "\n";}
    | whiler[$tab] {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $whiler.value + "\n</div>" + "\n";}
    | dowhiler[$tab] {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $dowhiler.value + "\n</div>" + "\n";}
    | forr[$tab] {$value = "\n<div style=\"text-indent:"+$tab+ "cm\">\n\t" + $forr.value + "\n</div>" + "\n";};

returnn returns[String value]
    : 'return' exp {$value = "<SPAN CLASS=\"palres\">" + "return" + "</SPAN>" + $exp.value;};

// Estructura de una asignación
asig returns[String value]
    : IDENTIFIER '=' exp {$value = "<SPAN CLASS=\"ident\">" + $IDENTIFIER.text +"</SPAN>" + "=" + $exp.value;};

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
    | IDENTIFIER { $value = "<span class =\"ident\">"+$IDENTIFIER.text+"</span>";}
    | '(' exp ')' {$value = "(" + $exp.value + ")";}
    |  funccall {$value = $funccall.value;};


// Estructura de una llamada a una función en las sentencias del código
funccall returns [String value]
    : IDENTIFIER subpparamlist {$value = "<a href=\"#"+ $IDENTIFIER.text +"\">" + $IDENTIFIER.text +"</a>" + $subpparamlist.value;}
    | CONST_DEF_IDENTIFIER subpparamlist{$value = $CONST_DEF_IDENTIFIER.text;};

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

// Sentencias de control
ifr[int tab] returns [String value]
    : 'if' expcond '{' code["", $tab+1] '}' elseP[$tab] {
        String valueif = "<SPAN CLASS=\"palres\">if</SPAN>" + $expcond.value;
        $value = valueif + "<span>{</span>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>" + $elseP.value;
    };
elseP[int tab] returns [String value]:
    'else' elser[$tab] {$value = "<SPAN CLASS=\"palres\">else</SPAN>" + $elser.value;}
    | {$value = "";};
elser[int tab] returns [String value]
    : '{' code["", $tab+1] '}' {
        $value = "<span>{</span>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>";
    }
    | ifr[$tab+1] {$value = $ifr.value;};
whiler[int tab] returns [String value]
    : 'while' '(' expcond ')' '{' code["", $tab+1] '}'{
        $value = "<SPAN CLASS=\"palres\">while</SPAN>" + $expcond.value + "<span>){</span>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>";
    };
dowhiler[int tab] returns [String value]
    : 'do' '{' code["", $tab+1] '}' 'while' '(' expcond ')' ';'{
        $value = "<SPAN CLASS=\"palres\">do{</SPAN>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>" + "<SPAN CLASS=\"palres\">while</SPAN>" + $expcond.value + "<span>);</span>";
    };
forr[int tab] returns [String value]
    : 'for' '(' forP[$tab]{
        $value = "<SPAN CLASS=\"palres\">for</SPAN>" + "<span>(</span>" + $forP.value;
    };
forP[int tab] returns [String value]
    : vardef ';' expcond ';' asig ')' '{' code["", $tab+1] '}'{
        $value = $vardef.value + "<span>;</span>" + $expcond.value + "<span>;</span>" + $asig.value + "<span>){</span>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>";
    }
    | asig ';' expcond ';' asig ')' '{' code["", $tab+1] '}'{
        $value = $asig.value + "<span>;</span>" + $expcond.value + "<span>;</span>" + $asig.value + "<span>){</span>" + $code.value + "<div style=\"text-indent:"+$tab+ "cm\">}</div>";
    };


expcond returns [String value]
    : factorcond expcondP[""] {$value = $factorcond.value + $expcondP.value;};
expcondP[String vh] returns [String value]
    : oplog factorcond {$vh = $vh + $oplog.value + $factorcond.value;} e1 = expcondP[vh] {$value = $e1.value;}
    | {$value = vh;};
oplog returns [String value]
    : '||' {$value = "<span>||</span>";}
    | '&' {$value = "<span>&</span>";};
factorcond returns [String value]
    : e1 = exp opcomp e2 = exp {$value = $e1.value + $opcomp.value + $e2.value;}
    | '(' expcond ')' {$value = "<span>(</span>" + $expcond.value + "<span>)</span>";}
    | '!' factorcond {$value = "<span>!</span>" + $factorcond.value;};
opcomp returns [String value]
    : '<' {$value = "<span><</span>";}
    | '>' {$value = "<span>></span>";}
    | '<=' {$value = "<span><=</span>";}
    | '>=' {$value = "<span>>=</span>";}
    | '==' {$value = "<span>==</span>";};
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
