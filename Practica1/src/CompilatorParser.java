// Generated from Compilator.g4 by ANTLR 4.12.0

    import java.util.HashMap;
    import java.io.File;
    import java.io.FileWriter;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompilatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, SALTOS=34, COMENTARIO_PAREJA=35, COMENTARIO_SIMPLE=36, 
		CONST_DEF_IDENTIFIER=37, IDENTIFIER=38, NUMERIC_REAL_CONST=39, NUMERIC_INTEGER_CONST=40, 
		STRING_CONST=41, SIMPLES=42, BARRA=43, BARRA_BARRA=44, ANYCHARDOBLES=45, 
		ANYCHARSIMPLES=46, ANYCHAR=47, NEW_LINE=48;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_dcl = 2, RULE_ctedef = 3, RULE_simpvalue = 4, 
		RULE_varlist = 5, RULE_varlistP = 6, RULE_vardef = 7, RULE_vardefP = 8, 
		RULE_tbas = 9, RULE_tvoid = 10, RULE_struct = 11, RULE_funlist = 12, RULE_funcdef = 13, 
		RULE_funchead = 14, RULE_typedef1 = 15, RULE_typedef2 = 16, RULE_typedef2P = 17, 
		RULE_sentlist = 18, RULE_mainhead = 19, RULE_code = 20, RULE_sent = 21, 
		RULE_returnn = 22, RULE_asig = 23, RULE_exp = 24, RULE_expP = 25, RULE_op = 26, 
		RULE_factor = 27, RULE_funccall = 28, RULE_subpparamlist = 29, RULE_explist = 30, 
		RULE_explistP = 31, RULE_ifr = 32, RULE_elseP = 33, RULE_elser = 34, RULE_whiler = 35, 
		RULE_dowhiler = 36, RULE_forr = 37, RULE_forP = 38, RULE_expcond = 39, 
		RULE_expcondP = 40, RULE_oplog = 41, RULE_factorcond = 42, RULE_opcomp = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "dcl", "ctedef", "simpvalue", "varlist", "varlistP", 
			"vardef", "vardefP", "tbas", "tvoid", "struct", "funlist", "funcdef", 
			"funchead", "typedef1", "typedef2", "typedef2P", "sentlist", "mainhead", 
			"code", "sent", "returnn", "asig", "exp", "expP", "op", "factor", "funccall", 
			"subpparamlist", "explist", "explistP", "ifr", "elseP", "elser", "whiler", 
			"dowhiler", "forr", "forP", "expcond", "expcondP", "oplog", "factorcond", 
			"opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#define'", "'='", "'integer'", "'float'", "'string'", 
			"'void'", "'struct'", "'{'", "'}'", "'('", "')'", "','", "'Main'", "'return'", 
			"'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'if'", "'else'", "'while'", "'do'", 
			"'for'", "'||'", "'&'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			null, null, null, null, null, null, null, null, null, "'\\'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "SALTOS", 
			"COMENTARIO_PAREJA", "COMENTARIO_SIMPLE", "CONST_DEF_IDENTIFIER", "IDENTIFIER", 
			"NUMERIC_REAL_CONST", "NUMERIC_INTEGER_CONST", "STRING_CONST", "SIMPLES", 
			"BARRA", "BARRA_BARRA", "ANYCHARDOBLES", "ANYCHARSIMPLES", "ANYCHAR", 
			"NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Compilator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String, String> variables = new HashMap<>();
	    private String nombre;

	    public CompilatorParser ( TokenStream input, String name){
	        this(input);
	        nombre = name;
	    }

	public CompilatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DcllistContext dcllist;
		public FunlistContext funlist;
		public SentlistContext sentlist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((ProgramContext)_localctx).dcllist = dcllist("");
			setState(89);
			((ProgramContext)_localctx).funlist = funlist("", "", "");
			setState(90);
			((ProgramContext)_localctx).sentlist = sentlist();

			                try{
			                    System.out.println(nombre);
			                    String cadena = ((ProgramContext)_localctx).funlist.cabecera;
			                    String funcName = ((ProgramContext)_localctx).funlist.funcName;
			                    String[] listFunc = cadena.split("\n");
			                    String[] listFuncName = funcName.split("\n");

			                    File archivo = new File(nombre + ".html");
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
			                    escribir.write("<h1>Programa: " + nombre + "</h1>\n");

			                    //Funciones
			                    escribir.write("<h2>Funciones</h2>\n");
			                    escribir.write("<ul>\n");
			                    for (int i = 0; i < listFunc.length; i++){
			                        String nombre = listFuncName[i];
			                        String enlace = "<a href=\"#FUNCIONES:" + nombre + "\">" + listFunc[i] + "</a>";
			                        escribir.write("    <li>" + enlace + "</li>\n");
			                    }
			                    escribir.write("</ul>\n");
			                    escribir.write("<hr/>\n");
			                    escribir.write(((ProgramContext)_localctx).funlist.vc);

			                    //PROGRAMA PRINCIPAL
			                    escribir.write("\n<h2>Programa Principal</h2>\n<br>\n");

			                    //Variables
			                    escribir.write(((ProgramContext)_localctx).dcllist.value);
			                    escribir.write("<BR/>");

			                    //Main()

			                    escribir.write("\n"+((ProgramContext)_localctx).sentlist.value);


			                    escribir.close();
			                }catch (Exception e){
			                    System.out.println("Error al escribir");
			                }
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public String valueH;
		public String value;
		public DclContext dcl;
		public DcllistContext d1;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, String valueH) {
			super(parent, invokingState);
			this.valueH = valueH;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist(String valueH) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), valueH);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((DcllistContext)_localctx).dcl = dcl();
				((DcllistContext)_localctx).valueH =  _localctx.valueH + ((DcllistContext)_localctx).dcl.value;
				setState(95);
				((DcllistContext)_localctx).d1 = dcllist(_localctx.valueH);
				((DcllistContext)_localctx).value =  ((DcllistContext)_localctx).d1.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).value =  _localctx.valueH;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public String value;
		public CtedefContext ctedef;
		public VardefContext vardef;
		public CtedefContext ctedef() {
			return getRuleContext(CtedefContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((DclContext)_localctx).ctedef = ctedef();
				((DclContext)_localctx).value =  ((DclContext)_localctx).ctedef.value+"\n";
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((DclContext)_localctx).vardef = vardef("PROGRAMA_PRINCIPAL:");
				setState(105);
				match(T__0);
				((DclContext)_localctx).value =  ((DclContext)_localctx).vardef.value + ";\n" + "<br>\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtedefContext extends ParserRuleContext {
		public String value;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilatorParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterCtedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitCtedef(this);
		}
	}

	public final CtedefContext ctedef() throws RecognitionException {
		CtedefContext _localctx = new CtedefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ctedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__1);
			setState(111);
			((CtedefContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
			setState(112);
			((CtedefContext)_localctx).simpvalue = simpvalue();

			    String v = "<A NAME =\"PROGRAMA_PRINCIPAL:"+(((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null)+"\"></A><span style=\"font-weight: bold;\">#define</span> <span CLASS=\"ident\">"+ (((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) +"</span>";
			    ((CtedefContext)_localctx).value =  v+" "+((CtedefContext)_localctx).simpvalue.vc+"\n<br>\n";
			    variables.put((((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null), "PROGRAMA_PRINCIPAL:"+(((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String vc;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(CompilatorParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(CompilatorParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(CompilatorParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpvalue);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).vc =  "<SPAN CLASS=\"cte\">"+ (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) +"</SPAN>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).vc =  "<SPAN CLASS=\"cte\">"+ (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) +"</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).vc =  "<SPAN CLASS=\"cte\">"+ (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) +"</SPAN>";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public String vh;
		public String value;
		public VardefContext vardef;
		public VarlistPContext varlistP;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String vh) {
			super(parent, invokingState);
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist(String vh) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), vh);
		enterRule(_localctx, 10, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((VarlistContext)_localctx).vardef = vardef("");
			setState(124);
			match(T__0);
			setState(125);
			((VarlistContext)_localctx).varlistP = varlistP(vh);
			((VarlistContext)_localctx).value =  ((VarlistContext)_localctx).vardef.value + ";" + ((VarlistContext)_localctx).varlistP.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistPContext extends ParserRuleContext {
		public String vh;
		public String value;
		public VardefContext vardef;
		public VarlistPContext v1;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
		}
		public VarlistPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistPContext(ParserRuleContext parent, int invokingState, String vh) {
			super(parent, invokingState);
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_varlistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVarlistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVarlistP(this);
		}
	}

	public final VarlistPContext varlistP(String vh) throws RecognitionException {
		VarlistPContext _localctx = new VarlistPContext(_ctx, getState(), vh);
		enterRule(_localctx, 12, RULE_varlistP);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((VarlistPContext)_localctx).vardef = vardef("");
				setState(129);
				match(T__0);
				((VarlistPContext)_localctx).vh =  _localctx.vh + ((VarlistPContext)_localctx).vardef.value + ";";
				setState(131);
				((VarlistPContext)_localctx).v1 = varlistP(_localctx.vh);
				((VarlistPContext)_localctx).value =  ((VarlistPContext)_localctx).v1.value;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((VarlistPContext)_localctx).value =  _localctx.vh;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VardefContext extends ParserRuleContext {
		public String ref;
		public String value;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public VardefPContext vardefP;
		public StructContext struct;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public VardefPContext vardefP() {
			return getRuleContext(VardefPContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VardefContext(ParserRuleContext parent, int invokingState, String ref) {
			super(parent, invokingState);
			this.ref = ref;
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef(String ref) throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState(), ref);
		enterRule(_localctx, 14, RULE_vardef);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((VardefContext)_localctx).tbas = tbas();
				setState(138);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(139);
				((VardefContext)_localctx).vardefP = vardefP();


				        ((VardefContext)_localctx).value = "<A NAME=\""+_localctx.ref+(((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null)+"\"></A> \n"+ ((VardefContext)_localctx).tbas.vc + "<SPAN CLASS=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) +"</SPAN>" + ((VardefContext)_localctx).vardefP.value;
				        variables.put((((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null), _localctx.ref+(((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null));
				    
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((VardefContext)_localctx).struct = struct();

				        ((VardefContext)_localctx).value =  ((VardefContext)_localctx).struct.value;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VardefPContext extends ParserRuleContext {
		public String value;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public VardefPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardefP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVardefP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVardefP(this);
		}
	}

	public final VardefPContext vardefP() throws RecognitionException {
		VardefPContext _localctx = new VardefPContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardefP);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__2);
				setState(148);
				((VardefPContext)_localctx).simpvalue = simpvalue();
				((VardefPContext)_localctx).value =  " = " + ((VardefPContext)_localctx).simpvalue.vc;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				((VardefPContext)_localctx).value =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public String vc;
		public String value;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitTbas(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tbas);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__3);

				        ((TbasContext)_localctx).value =  "integer ";
				        ((TbasContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> integer </SPAN>";
				    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__4);

				        ((TbasContext)_localctx).value =  "float ";
				        ((TbasContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> float </SPAN>";
				    
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__5);

				        ((TbasContext)_localctx).value =  "string ";
				        ((TbasContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> string </SPAN>";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TvoidContext extends ParserRuleContext {
		public String vc;
		public String value;
		public TvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterTvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitTvoid(this);
		}
	}

	public final TvoidContext tvoid() throws RecognitionException {
		TvoidContext _localctx = new TvoidContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__6);

			        ((TvoidContext)_localctx).value =  "void ";
			        ((TvoidContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> void </SPAN>";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends ParserRuleContext {
		public String value;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__7);
			setState(166);
			match(T__8);
			setState(167);
			((StructContext)_localctx).varlist = varlist("");
			setState(168);
			match(T__9);

			        ((StructContext)_localctx).value =  "<SPAN CLASS=\"palres\"> struct </SPAN>" + "<span>{</span>" + "<BR/>" + "<DIV style=\"text-indent: 1cm\">" + ((StructContext)_localctx).varlist.value + "</DIV>" + "<span>}</span>";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunlistContext extends ParserRuleContext {
		public String listCab;
		public String listFunc;
		public String listFuncName;
		public String cabecera;
		public String vc;
		public String funcName;
		public FuncdefContext funcdef;
		public FunlistContext f1;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public FunlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunlistContext(ParserRuleContext parent, int invokingState, String listCab, String listFunc, String listFuncName) {
			super(parent, invokingState);
			this.listCab = listCab;
			this.listFunc = listFunc;
			this.listFuncName = listFuncName;
		}
		@Override public int getRuleIndex() { return RULE_funlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFunlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFunlist(this);
		}
	}

	public final FunlistContext funlist(String listCab,String listFunc,String listFuncName) throws RecognitionException {
		FunlistContext _localctx = new FunlistContext(_ctx, getState(), listCab, listFunc, listFuncName);
		enterRule(_localctx, 24, RULE_funlist);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((FunlistContext)_localctx).funcdef = funcdef();

				        ((FunlistContext)_localctx).listCab =  _localctx.listCab + ((FunlistContext)_localctx).funcdef.cabecera + "\n";
				        ((FunlistContext)_localctx).listFunc =  _localctx.listFunc + ((FunlistContext)_localctx).funcdef.vc;
				        ((FunlistContext)_localctx).listFuncName =  _localctx.listFuncName + ((FunlistContext)_localctx).funcdef.funcName + "\n";
				     
				setState(173);
				((FunlistContext)_localctx).f1 = funlist(_localctx.listCab, _localctx.listFunc, _localctx.listFuncName);

				        ((FunlistContext)_localctx).cabecera =  ((FunlistContext)_localctx).f1.cabecera;
				        ((FunlistContext)_localctx).vc =  ((FunlistContext)_localctx).f1.vc;
				        ((FunlistContext)_localctx).funcName =  ((FunlistContext)_localctx).f1.funcName;
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				        ((FunlistContext)_localctx).cabecera =  _localctx.listCab;
				        ((FunlistContext)_localctx).vc =  _localctx.listFunc;
				        ((FunlistContext)_localctx).funcName =  _localctx.listFuncName;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdefContext extends ParserRuleContext {
		public String cabecera;
		public String vc;
		public String funcName;
		public FuncheadContext funchead;
		public CodeContext code;
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((FuncdefContext)_localctx).funchead = funchead();
			setState(180);
			match(T__8);
			setState(181);
			((FuncdefContext)_localctx).code = code("","FUNCIONES:"+((FuncdefContext)_localctx).funchead.funcName+":", 1);
			setState(182);
			match(T__9);

			        ((FuncdefContext)_localctx).cabecera =  ((FuncdefContext)_localctx).funchead.valueCab;

			        ((FuncdefContext)_localctx).funcName =  ((FuncdefContext)_localctx).funchead.funcName;

			        String codigo = ((FuncdefContext)_localctx).code.value;
			        String iniFunc = "<a href=" + "\"#" + _localctx.funcName + "\"" + "><span>Inicio de la función</span></a>\n";
			        String iniProg = "<a href=\"#main\"><span> Inicio del programa</span></a>\n";

			        ((FuncdefContext)_localctx).vc =  "<a NAME=" + "\"FUNCIONES:" + _localctx.funcName + "\"" + "></a>\n" + ((FuncdefContext)_localctx).funchead.vc + "<span>{</span>" + codigo +"<span>}</span>" + "\n<br>\n" + iniFunc + iniProg + "<hr>";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheadContext extends ParserRuleContext {
		public String vc;
		public String valueCab;
		public String funcName;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef1Context typedef1;
		public TvoidContext tvoid;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public FuncheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funchead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFunchead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFunchead(this);
		}
	}

	public final FuncheadContext funchead() throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funchead);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((FuncheadContext)_localctx).tbas = tbas();
				setState(186);
				((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(187);
				match(T__10);
				setState(188);
				((FuncheadContext)_localctx).typedef1 = typedef1("FUNCIONES:"+(((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null)+":");
				setState(189);
				match(T__11);

				        ((FuncheadContext)_localctx).valueCab =  ((FuncheadContext)_localctx).tbas.value + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "(" + ((FuncheadContext)_localctx).typedef1.value + ")";

				        ((FuncheadContext)_localctx).funcName =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null);

				        String identifier = "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +"</SPAN>";
				        ((FuncheadContext)_localctx).vc =  ((FuncheadContext)_localctx).tbas.vc + identifier + " <span>(</span>" + ((FuncheadContext)_localctx).typedef1.vc + " <span>)</span>";
				    
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				((FuncheadContext)_localctx).tvoid = tvoid();
				setState(193);
				((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(194);
				match(T__10);
				setState(195);
				((FuncheadContext)_localctx).typedef1 = typedef1("FUNCIONES:"+(((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null)+":");
				setState(196);
				match(T__11);

				        ((FuncheadContext)_localctx).valueCab =  ((FuncheadContext)_localctx).tvoid.value + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "(" + ((FuncheadContext)_localctx).typedef1.value + ")";

				        ((FuncheadContext)_localctx).funcName =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null);

				        String identifier = "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +"</SPAN>";
				        ((FuncheadContext)_localctx).vc =  ((FuncheadContext)_localctx).tvoid.vc + identifier + " <span>(</span>" + ((FuncheadContext)_localctx).typedef1.vc + " <span>)</span>";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef1Context extends ParserRuleContext {
		public String nombreFuncion;
		public String vc;
		public String value;
		public Typedef2Context typedef2;
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef1Context(ParserRuleContext parent, int invokingState, String nombreFuncion) {
			super(parent, invokingState);
			this.nombreFuncion = nombreFuncion;
		}
		@Override public int getRuleIndex() { return RULE_typedef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterTypedef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitTypedef1(this);
		}
	}

	public final Typedef1Context typedef1(String nombreFuncion) throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState(), nombreFuncion);
		enterRule(_localctx, 30, RULE_typedef1);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((Typedef1Context)_localctx).typedef2 = typedef2(_localctx.nombreFuncion);

				        ((Typedef1Context)_localctx).value =  ((Typedef1Context)_localctx).typedef2.value;
				        ((Typedef1Context)_localctx).vc =  ((Typedef1Context)_localctx).typedef2.vc;
				    
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{

				        ((Typedef1Context)_localctx).value =  "";
				        ((Typedef1Context)_localctx).vc =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2Context extends ParserRuleContext {
		public String nombreFuncion;
		public String vc;
		public String value;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef2PContext typedef2P;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public Typedef2PContext typedef2P() {
			return getRuleContext(Typedef2PContext.class,0);
		}
		public Typedef2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef2Context(ParserRuleContext parent, int invokingState, String nombreFuncion) {
			super(parent, invokingState);
			this.nombreFuncion = nombreFuncion;
		}
		@Override public int getRuleIndex() { return RULE_typedef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterTypedef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitTypedef2(this);
		}
	}

	public final Typedef2Context typedef2(String nombreFuncion) throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState(), nombreFuncion);
		enterRule(_localctx, 32, RULE_typedef2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((Typedef2Context)_localctx).tbas = tbas();
			setState(208);
			((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(209);
			((Typedef2Context)_localctx).typedef2P = typedef2P(_localctx.nombreFuncion);

			        variables.put((((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null),nombreFuncion+(((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null));
			        ((Typedef2Context)_localctx).value =  ((Typedef2Context)_localctx).tbas.value + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + ((Typedef2Context)_localctx).typedef2P.value;

			        String identifier = "<A NAME=\""+_localctx.nombreFuncion+(((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null)+"\"></A>\n" +"<SPAN CLASS=\"ident\">" + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) +"</SPAN>";
			        ((Typedef2Context)_localctx).vc =  ((Typedef2Context)_localctx).tbas.vc + identifier + ((Typedef2Context)_localctx).typedef2P.vc;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2PContext extends ParserRuleContext {
		public String nombreFuncion;
		public String vc;
		public String value;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef2PContext t1;
		public Typedef2PContext typedef2P;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public Typedef2PContext typedef2P() {
			return getRuleContext(Typedef2PContext.class,0);
		}
		public Typedef2PContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef2PContext(ParserRuleContext parent, int invokingState, String nombreFuncion) {
			super(parent, invokingState);
			this.nombreFuncion = nombreFuncion;
		}
		@Override public int getRuleIndex() { return RULE_typedef2P; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterTypedef2P(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitTypedef2P(this);
		}
	}

	public final Typedef2PContext typedef2P(String nombreFuncion) throws RecognitionException {
		Typedef2PContext _localctx = new Typedef2PContext(_ctx, getState(), nombreFuncion);
		enterRule(_localctx, 34, RULE_typedef2P);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__12);
				setState(213);
				((Typedef2PContext)_localctx).tbas = tbas();
				setState(214);
				((Typedef2PContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(215);
				((Typedef2PContext)_localctx).t1 = ((Typedef2PContext)_localctx).typedef2P = typedef2P(_localctx.nombreFuncion);

				        variables.put((((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null),nombreFuncion+(((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null));
				        ((Typedef2PContext)_localctx).value =  ", " + ((Typedef2PContext)_localctx).tbas.value + (((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null) + (((Typedef2PContext)_localctx).typedef2P!=null?_input.getText(((Typedef2PContext)_localctx).typedef2P.start,((Typedef2PContext)_localctx).typedef2P.stop):null);

				         String identifier = "<A NAME=\""+_localctx.nombreFuncion+(((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null)+"\"></A>\n" +"<SPAN CLASS=\"ident\">" + (((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null) +"</SPAN>";
				        String coma = "<span>,</span>";
				        ((Typedef2PContext)_localctx).vc =  coma + ((Typedef2PContext)_localctx).tbas.vc + identifier + ((Typedef2PContext)_localctx).t1.vc;
				    
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{

				        ((Typedef2PContext)_localctx).value =  "";
				        ((Typedef2PContext)_localctx).vc =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public String value;
		public MainheadContext mainhead;
		public CodeContext code;
		public MainheadContext mainhead() {
			return getRuleContext(MainheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(222);
			match(T__8);
			setState(223);
			((SentlistContext)_localctx).code = code("","PROGRAMA_PRINCIPAL:Main:", 1);
			setState(224);
			match(T__9);
			((SentlistContext)_localctx).value =  ((SentlistContext)_localctx).mainhead.value + "{" + ((SentlistContext)_localctx).code.value + "}";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainheadContext extends ParserRuleContext {
		public String value;
		public TvoidContext tvoid;
		public Typedef1Context typedef1;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public MainheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterMainhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitMainhead(this);
		}
	}

	public final MainheadContext mainhead() throws RecognitionException {
		MainheadContext _localctx = new MainheadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(228);
			match(T__13);
			setState(229);
			match(T__10);
			setState(230);
			((MainheadContext)_localctx).typedef1 = typedef1("PROGRAMA_PRINCIPAL:Main:");
			setState(231);
			match(T__11);
			((MainheadContext)_localctx).value =  ((MainheadContext)_localctx).tvoid.vc + "<span class = \"ident\">Main</span>" + "(" + ((MainheadContext)_localctx).typedef1.value + ")";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public String valueH;
		public String ref;
		public int tab;
		public String value;
		public SentContext sent;
		public CodeContext c1;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeContext(ParserRuleContext parent, int invokingState, String valueH, String ref, int tab) {
			super(parent, invokingState);
			this.valueH = valueH;
			this.ref = ref;
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitCode(this);
		}
	}

	public final CodeContext code(String valueH,String ref,int tab) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), valueH, ref, tab);
		enterRule(_localctx, 40, RULE_code);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__14:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((CodeContext)_localctx).sent = sent(_localctx.ref, _localctx.tab);
				((CodeContext)_localctx).valueH =  _localctx.valueH + ((CodeContext)_localctx).sent.value;
				setState(236);
				((CodeContext)_localctx).c1 = code(_localctx.valueH, _localctx.ref, _localctx.tab);
				((CodeContext)_localctx).value =  ((CodeContext)_localctx).c1.value;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((CodeContext)_localctx).value =  _localctx.valueH;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public String ref;
		public int tab;
		public String value;
		public AsigContext asig;
		public FunccallContext funccall;
		public VardefContext vardef;
		public ReturnnContext returnn;
		public IfrContext ifr;
		public WhilerContext whiler;
		public DowhilerContext dowhiler;
		public ForrContext forr;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ReturnnContext returnn() {
			return getRuleContext(ReturnnContext.class,0);
		}
		public IfrContext ifr() {
			return getRuleContext(IfrContext.class,0);
		}
		public WhilerContext whiler() {
			return getRuleContext(WhilerContext.class,0);
		}
		public DowhilerContext dowhiler() {
			return getRuleContext(DowhilerContext.class,0);
		}
		public ForrContext forr() {
			return getRuleContext(ForrContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, String ref, int tab) {
			super(parent, invokingState);
			this.ref = ref;
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSent(this);
		}
	}

	public final SentContext sent(String ref,int tab) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), ref, tab);
		enterRule(_localctx, 42, RULE_sent);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((SentContext)_localctx).asig = asig();
				setState(243);
				match(T__0);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).asig.value + ";" + "\n</div>" + "\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((SentContext)_localctx).funccall = funccall();
				setState(247);
				match(T__0);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).funccall.value + ";" + "\n</div>" + "\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				((SentContext)_localctx).vardef = vardef("");
				setState(251);
				match(T__0);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).vardef.value + ";" + "\n</div>" + "\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				((SentContext)_localctx).returnn = returnn();
				setState(255);
				match(T__0);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).returnn.value + ";" + "\n</div>" + "\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				((SentContext)_localctx).ifr = ifr(_localctx.tab);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).ifr.value + "\n</div>" + "\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				((SentContext)_localctx).whiler = whiler(_localctx.tab);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).whiler.value + "\n</div>" + "\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				((SentContext)_localctx).dowhiler = dowhiler(_localctx.tab);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).dowhiler.value + "\n</div>" + "\n";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				((SentContext)_localctx).forr = forr(_localctx.tab);
				((SentContext)_localctx).value =  "\n<div style=\"text-indent:"+_localctx.tab+ "cm\">\n\t" + ((SentContext)_localctx).forr.value + "\n</div>" + "\n";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnnContext extends ParserRuleContext {
		public String value;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterReturnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitReturnn(this);
		}
	}

	public final ReturnnContext returnn() throws RecognitionException {
		ReturnnContext _localctx = new ReturnnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__14);
			setState(273);
			((ReturnnContext)_localctx).exp = exp();
			((ReturnnContext)_localctx).value =  "<SPAN CLASS=\"palres\">" + "return" + "</SPAN>" + ((ReturnnContext)_localctx).exp.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public String value;
		public Token IDENTIFIER;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(277);
			match(T__2);
			setState(278);
			((AsigContext)_localctx).exp = exp();

			    String referenciaVar = variables.get((((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null));
			    ((AsigContext)_localctx).value =  "<a href=\"#"+referenciaVar+"\">" + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) +"</a>" + " = " + ((AsigContext)_localctx).exp.value;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String value;
		public FactorContext factor;
		public ExpPContext expP;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpPContext expP() {
			return getRuleContext(ExpPContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ExpContext)_localctx).factor = factor();
			setState(282);
			((ExpContext)_localctx).expP = expP("");
			((ExpContext)_localctx).value =  ((ExpContext)_localctx).factor.value + ((ExpContext)_localctx).expP.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpPContext extends ParserRuleContext {
		public String valueH;
		public String value;
		public OpContext op;
		public FactorContext factor;
		public ExpPContext e1;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpPContext expP() {
			return getRuleContext(ExpPContext.class,0);
		}
		public ExpPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpPContext(ParserRuleContext parent, int invokingState, String valueH) {
			super(parent, invokingState);
			this.valueH = valueH;
		}
		@Override public int getRuleIndex() { return RULE_expP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExpP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExpP(this);
		}
	}

	public final ExpPContext expP(String valueH) throws RecognitionException {
		ExpPContext _localctx = new ExpPContext(_ctx, getState(), valueH);
		enterRule(_localctx, 50, RULE_expP);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((ExpPContext)_localctx).op = op();
				setState(286);
				((ExpPContext)_localctx).factor = factor();
				((ExpPContext)_localctx).valueH =  _localctx.valueH +" "+((ExpPContext)_localctx).op.value +" "+ ((ExpPContext)_localctx).factor.value;
				setState(288);
				((ExpPContext)_localctx).e1 = expP(_localctx.valueH);
				((ExpPContext)_localctx).value =  ((ExpPContext)_localctx).e1.value;
				}
				break;
			case T__0:
			case T__8:
			case T__11:
			case T__12:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				((ExpPContext)_localctx).value =  _localctx.valueH;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public String value;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__15);
				((OpContext)_localctx).value =  "+";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__16);
				((OpContext)_localctx).value =  "-";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(T__17);
				((OpContext)_localctx).value =  "*";
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(T__18);
				((OpContext)_localctx).value =  "DIV";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(T__19);
				((OpContext)_localctx).value =  "MOD";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String value;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public FunccallContext funccall;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_REAL_CONST:
			case NUMERIC_INTEGER_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).simpvalue.vc;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__10);
				setState(310);
				((FactorContext)_localctx).exp = exp();
				setState(311);
				match(T__11);
				((FactorContext)_localctx).value =  "(" + ((FactorContext)_localctx).exp.value + ")";
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				((FactorContext)_localctx).funccall = funccall();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).funccall.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunccallContext extends ParserRuleContext {
		public String value;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public Token CONST_DEF_IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilatorParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funccall);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(320);
				((FunccallContext)_localctx).subpparamlist = subpparamlist();

				    String refVar = variables.get((((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null));
				    ((FunccallContext)_localctx).value =  "<a href=\"#"+ refVar +"\">" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) +"</a>" + ((FunccallContext)_localctx).subpparamlist.value;
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(324);
				((FunccallContext)_localctx).subpparamlist = subpparamlist();

				    String refVar = variables.get((((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null));
				    ((FunccallContext)_localctx).value =  "<a href=\"#"+ refVar +"\">" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) +"</a>" + ((FunccallContext)_localctx).subpparamlist.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public String value;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSubpparamlist(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subpparamlist);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__10);
				setState(330);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(331);
				match(T__11);
				((SubpparamlistContext)_localctx).value =  "(" + ((SubpparamlistContext)_localctx).explist.value + ")";
				}
				break;
			case T__0:
			case T__8:
			case T__11:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).value =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String value;
		public ExpContext exp;
		public ExplistPContext explistP;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistPContext explistP() {
			return getRuleContext(ExplistPContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((ExplistContext)_localctx).exp = exp();
			setState(338);
			((ExplistContext)_localctx).explistP = explistP("");
			((ExplistContext)_localctx).value =  ((ExplistContext)_localctx).exp.value + ((ExplistContext)_localctx).explistP.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistPContext extends ParserRuleContext {
		public String valueH;
		public String value;
		public ExpContext exp;
		public ExplistPContext e1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistPContext explistP() {
			return getRuleContext(ExplistPContext.class,0);
		}
		public ExplistPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistPContext(ParserRuleContext parent, int invokingState, String valueH) {
			super(parent, invokingState);
			this.valueH = valueH;
		}
		@Override public int getRuleIndex() { return RULE_explistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExplistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExplistP(this);
		}
	}

	public final ExplistPContext explistP(String valueH) throws RecognitionException {
		ExplistPContext _localctx = new ExplistPContext(_ctx, getState(), valueH);
		enterRule(_localctx, 62, RULE_explistP);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__12);
				setState(342);
				((ExplistPContext)_localctx).exp = exp();
				((ExplistPContext)_localctx).valueH =  _localctx.valueH + ", " + ((ExplistPContext)_localctx).exp.value;
				setState(344);
				((ExplistPContext)_localctx).e1 = explistP(_localctx.valueH);
				((ExplistPContext)_localctx).value =  ((ExplistPContext)_localctx).e1.value;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				((ExplistPContext)_localctx).value =  _localctx.valueH;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfrContext extends ParserRuleContext {
		public int tab;
		public String value;
		public ExpcondContext expcond;
		public CodeContext code;
		public ElsePContext elseP;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElsePContext elseP() {
			return getRuleContext(ElsePContext.class,0);
		}
		public IfrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfrContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_ifr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterIfr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitIfr(this);
		}
	}

	public final IfrContext ifr(int tab) throws RecognitionException {
		IfrContext _localctx = new IfrContext(_ctx, getState(), tab);
		enterRule(_localctx, 64, RULE_ifr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__20);
			setState(351);
			((IfrContext)_localctx).expcond = expcond();
			setState(352);
			match(T__8);
			setState(353);
			((IfrContext)_localctx).code = code("", "", _localctx.tab+1);
			setState(354);
			match(T__9);
			setState(355);
			((IfrContext)_localctx).elseP = elseP(_localctx.tab);

			        String valueif = "<SPAN CLASS=\"palres\">if</SPAN>" + ((IfrContext)_localctx).expcond.value;
			        ((IfrContext)_localctx).value =  valueif + "<span>{</span>" + ((IfrContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>" + ((IfrContext)_localctx).elseP.value;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsePContext extends ParserRuleContext {
		public int tab;
		public String value;
		public ElserContext elser;
		public ElserContext elser() {
			return getRuleContext(ElserContext.class,0);
		}
		public ElsePContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElsePContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_elseP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterElseP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitElseP(this);
		}
	}

	public final ElsePContext elseP(int tab) throws RecognitionException {
		ElsePContext _localctx = new ElsePContext(_ctx, getState(), tab);
		enterRule(_localctx, 66, RULE_elseP);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__21);
				setState(359);
				((ElsePContext)_localctx).elser = elser(_localctx.tab);
				((ElsePContext)_localctx).value =  "<SPAN CLASS=\"palres\">else</SPAN>" + ((ElsePContext)_localctx).elser.value;
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__9:
			case T__14:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				((ElsePContext)_localctx).value =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElserContext extends ParserRuleContext {
		public int tab;
		public String value;
		public CodeContext code;
		public IfrContext ifr;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IfrContext ifr() {
			return getRuleContext(IfrContext.class,0);
		}
		public ElserContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElserContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_elser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterElser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitElser(this);
		}
	}

	public final ElserContext elser(int tab) throws RecognitionException {
		ElserContext _localctx = new ElserContext(_ctx, getState(), tab);
		enterRule(_localctx, 68, RULE_elser);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__8);
				setState(366);
				((ElserContext)_localctx).code = code("", "", _localctx.tab+1);
				setState(367);
				match(T__9);

				        ((ElserContext)_localctx).value =  "<span>{</span>" + ((ElserContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>";
				    
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				((ElserContext)_localctx).ifr = ifr(_localctx.tab+1);
				((ElserContext)_localctx).value =  ((ElserContext)_localctx).ifr.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilerContext extends ParserRuleContext {
		public int tab;
		public String value;
		public ExpcondContext expcond;
		public CodeContext code;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhilerContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhilerContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_whiler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterWhiler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitWhiler(this);
		}
	}

	public final WhilerContext whiler(int tab) throws RecognitionException {
		WhilerContext _localctx = new WhilerContext(_ctx, getState(), tab);
		enterRule(_localctx, 70, RULE_whiler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__22);
			setState(376);
			match(T__10);
			setState(377);
			((WhilerContext)_localctx).expcond = expcond();
			setState(378);
			match(T__11);
			setState(379);
			match(T__8);
			setState(380);
			((WhilerContext)_localctx).code = code("", "", _localctx.tab+1);
			setState(381);
			match(T__9);

			        ((WhilerContext)_localctx).value =  "<SPAN CLASS=\"palres\">while</SPAN>" + ((WhilerContext)_localctx).expcond.value + "<span>){</span>" + ((WhilerContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DowhilerContext extends ParserRuleContext {
		public int tab;
		public String value;
		public CodeContext code;
		public ExpcondContext expcond;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public DowhilerContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DowhilerContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_dowhiler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterDowhiler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitDowhiler(this);
		}
	}

	public final DowhilerContext dowhiler(int tab) throws RecognitionException {
		DowhilerContext _localctx = new DowhilerContext(_ctx, getState(), tab);
		enterRule(_localctx, 72, RULE_dowhiler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__23);
			setState(385);
			match(T__8);
			setState(386);
			((DowhilerContext)_localctx).code = code("", "", _localctx.tab+1);
			setState(387);
			match(T__9);
			setState(388);
			match(T__22);
			setState(389);
			match(T__10);
			setState(390);
			((DowhilerContext)_localctx).expcond = expcond();
			setState(391);
			match(T__11);
			setState(392);
			match(T__0);

			        ((DowhilerContext)_localctx).value =  "<SPAN CLASS=\"palres\">do{</SPAN>" + ((DowhilerContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>" + "<SPAN CLASS=\"palres\">while</SPAN>" + ((DowhilerContext)_localctx).expcond.value + "<span>);</span>";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForrContext extends ParserRuleContext {
		public int tab;
		public String value;
		public ForPContext forP;
		public ForPContext forP() {
			return getRuleContext(ForPContext.class,0);
		}
		public ForrContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForrContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_forr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterForr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitForr(this);
		}
	}

	public final ForrContext forr(int tab) throws RecognitionException {
		ForrContext _localctx = new ForrContext(_ctx, getState(), tab);
		enterRule(_localctx, 74, RULE_forr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__24);
			setState(396);
			match(T__10);
			setState(397);
			((ForrContext)_localctx).forP = forP(_localctx.tab);

			        ((ForrContext)_localctx).value =  "<SPAN CLASS=\"palres\">for</SPAN>" + "<span>(</span>" + ((ForrContext)_localctx).forP.value;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForPContext extends ParserRuleContext {
		public int tab;
		public String value;
		public VardefContext vardef;
		public ExpcondContext expcond;
		public AsigContext asig;
		public CodeContext code;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ForPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForPContext(ParserRuleContext parent, int invokingState, int tab) {
			super(parent, invokingState);
			this.tab = tab;
		}
		@Override public int getRuleIndex() { return RULE_forP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterForP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitForP(this);
		}
	}

	public final ForPContext forP(int tab) throws RecognitionException {
		ForPContext _localctx = new ForPContext(_ctx, getState(), tab);
		enterRule(_localctx, 76, RULE_forP);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((ForPContext)_localctx).vardef = vardef("");
				setState(401);
				match(T__0);
				setState(402);
				((ForPContext)_localctx).expcond = expcond();
				setState(403);
				match(T__0);
				setState(404);
				((ForPContext)_localctx).asig = asig();
				setState(405);
				match(T__11);
				setState(406);
				match(T__8);
				setState(407);
				((ForPContext)_localctx).code = code("", "", _localctx.tab+1);
				setState(408);
				match(T__9);

				        ((ForPContext)_localctx).value =  ((ForPContext)_localctx).vardef.value + "<span>;</span>" + ((ForPContext)_localctx).expcond.value + "<span>;</span>" + ((ForPContext)_localctx).asig.value + "<span>){</span>" + ((ForPContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>";
				    
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				((ForPContext)_localctx).asig = asig();
				setState(412);
				match(T__0);
				setState(413);
				((ForPContext)_localctx).expcond = expcond();
				setState(414);
				match(T__0);
				setState(415);
				((ForPContext)_localctx).asig = asig();
				setState(416);
				match(T__11);
				setState(417);
				match(T__8);
				setState(418);
				((ForPContext)_localctx).code = code("", "", _localctx.tab+1);
				setState(419);
				match(T__9);

				        ((ForPContext)_localctx).value =  ((ForPContext)_localctx).asig.value + "<span>;</span>" + ((ForPContext)_localctx).expcond.value + "<span>;</span>" + ((ForPContext)_localctx).asig.value + "<span>){</span>" + ((ForPContext)_localctx).code.value + "<div style=\"text-indent:"+_localctx.tab+ "cm\">}</div>";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public String value;
		public FactorcondContext factorcond;
		public ExpcondPContext expcondP;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondPContext expcondP() {
			return getRuleContext(ExpcondPContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(425);
			((ExpcondContext)_localctx).expcondP = expcondP("");
			((ExpcondContext)_localctx).value =  ((ExpcondContext)_localctx).factorcond.value + ((ExpcondContext)_localctx).expcondP.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondPContext extends ParserRuleContext {
		public String vh;
		public String value;
		public OplogContext oplog;
		public FactorcondContext factorcond;
		public ExpcondPContext e1;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondPContext expcondP() {
			return getRuleContext(ExpcondPContext.class,0);
		}
		public ExpcondPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondPContext(ParserRuleContext parent, int invokingState, String vh) {
			super(parent, invokingState);
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_expcondP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterExpcondP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitExpcondP(this);
		}
	}

	public final ExpcondPContext expcondP(String vh) throws RecognitionException {
		ExpcondPContext _localctx = new ExpcondPContext(_ctx, getState(), vh);
		enterRule(_localctx, 80, RULE_expcondP);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((ExpcondPContext)_localctx).oplog = oplog();
				setState(429);
				((ExpcondPContext)_localctx).factorcond = factorcond();
				((ExpcondPContext)_localctx).vh =  _localctx.vh + ((ExpcondPContext)_localctx).oplog.value + ((ExpcondPContext)_localctx).factorcond.value;
				setState(431);
				((ExpcondPContext)_localctx).e1 = expcondP(vh);
				((ExpcondPContext)_localctx).value =  ((ExpcondPContext)_localctx).e1.value;
				}
				break;
			case T__0:
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				((ExpcondPContext)_localctx).value =  vh;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public String value;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oplog);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(T__25);
				((OplogContext)_localctx).value =  "<span>||</span>";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(T__26);
				((OplogContext)_localctx).value =  "<span>&</span>";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public String value;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_factorcond);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				((FactorcondContext)_localctx).e1 = exp();
				setState(444);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(445);
				((FactorcondContext)_localctx).e2 = exp();
				((FactorcondContext)_localctx).value =  ((FactorcondContext)_localctx).e1.value + ((FactorcondContext)_localctx).opcomp.value + ((FactorcondContext)_localctx).e2.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T__10);
				setState(449);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(450);
				match(T__11);
				((FactorcondContext)_localctx).value =  "<span>(</span>" + ((FactorcondContext)_localctx).expcond.value + "<span>)</span>";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(T__27);
				setState(454);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).value =  "<span>!</span>" + ((FactorcondContext)_localctx).factorcond.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public String value;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opcomp);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(T__28);
				((OpcompContext)_localctx).value =  "<span><</span>";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(T__29);
				((OpcompContext)_localctx).value =  "<span>></span>";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(T__30);
				((OpcompContext)_localctx).value =  "<span><=</span>";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(T__31);
				((OpcompContext)_localctx).value =  "<span>>=</span>";
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(T__32);
				((OpcompContext)_localctx).value =  "<span>==</span>";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u01d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002m\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0099\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00b2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ce\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00dc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00f1\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u010f\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0125\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0131\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u013e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0148\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0150\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u015d\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u016c\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0176\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u01a7\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01b4\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u01ba\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01ca\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u01d6\b+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TV\u0000\u0000\u01d5\u0000X\u0001\u0000\u0000\u0000\u0002c\u0001\u0000"+
		"\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000"+
		"\by\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000\f\u0087\u0001\u0000"+
		"\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000"+
		"\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000"+
		"\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000"+
		"\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00c7\u0001\u0000"+
		"\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000\u0000"+
		"\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000"+
		"&\u00e3\u0001\u0000\u0000\u0000(\u00f0\u0001\u0000\u0000\u0000*\u010e"+
		"\u0001\u0000\u0000\u0000,\u0110\u0001\u0000\u0000\u0000.\u0114\u0001\u0000"+
		"\u0000\u00000\u0119\u0001\u0000\u0000\u00002\u0124\u0001\u0000\u0000\u0000"+
		"4\u0130\u0001\u0000\u0000\u00006\u013d\u0001\u0000\u0000\u00008\u0147"+
		"\u0001\u0000\u0000\u0000:\u014f\u0001\u0000\u0000\u0000<\u0151\u0001\u0000"+
		"\u0000\u0000>\u015c\u0001\u0000\u0000\u0000@\u015e\u0001\u0000\u0000\u0000"+
		"B\u016b\u0001\u0000\u0000\u0000D\u0175\u0001\u0000\u0000\u0000F\u0177"+
		"\u0001\u0000\u0000\u0000H\u0180\u0001\u0000\u0000\u0000J\u018b\u0001\u0000"+
		"\u0000\u0000L\u01a6\u0001\u0000\u0000\u0000N\u01a8\u0001\u0000\u0000\u0000"+
		"P\u01b3\u0001\u0000\u0000\u0000R\u01b9\u0001\u0000\u0000\u0000T\u01c9"+
		"\u0001\u0000\u0000\u0000V\u01d5\u0001\u0000\u0000\u0000XY\u0003\u0002"+
		"\u0001\u0000YZ\u0003\u0018\f\u0000Z[\u0003$\u0012\u0000[\\\u0006\u0000"+
		"\uffff\uffff\u0000\\\u0001\u0001\u0000\u0000\u0000]^\u0003\u0004\u0002"+
		"\u0000^_\u0006\u0001\uffff\uffff\u0000_`\u0003\u0002\u0001\u0000`a\u0006"+
		"\u0001\uffff\uffff\u0000ad\u0001\u0000\u0000\u0000bd\u0006\u0001\uffff"+
		"\uffff\u0000c]\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0003"+
		"\u0001\u0000\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0006\u0002\uffff"+
		"\uffff\u0000gm\u0001\u0000\u0000\u0000hi\u0003\u000e\u0007\u0000ij\u0005"+
		"\u0001\u0000\u0000jk\u0006\u0002\uffff\uffff\u0000km\u0001\u0000\u0000"+
		"\u0000le\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000m\u0005\u0001"+
		"\u0000\u0000\u0000no\u0005\u0002\u0000\u0000op\u0005%\u0000\u0000pq\u0003"+
		"\b\u0004\u0000qr\u0006\u0003\uffff\uffff\u0000r\u0007\u0001\u0000\u0000"+
		"\u0000st\u0005(\u0000\u0000tz\u0006\u0004\uffff\uffff\u0000uv\u0005\'"+
		"\u0000\u0000vz\u0006\u0004\uffff\uffff\u0000wx\u0005)\u0000\u0000xz\u0006"+
		"\u0004\uffff\uffff\u0000ys\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z\t\u0001\u0000\u0000\u0000{|\u0003\u000e"+
		"\u0007\u0000|}\u0005\u0001\u0000\u0000}~\u0003\f\u0006\u0000~\u007f\u0006"+
		"\u0005\uffff\uffff\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\u000e\u0007\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u0083"+
		"\u0006\u0006\uffff\uffff\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084\u0085"+
		"\u0006\u0006\uffff\uffff\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0006\u0006\uffff\uffff\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008c"+
		"\u0003\u0010\b\u0000\u008c\u008d\u0006\u0007\uffff\uffff\u0000\u008d\u0092"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090"+
		"\u0006\u0007\uffff\uffff\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u0089\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092"+
		"\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094"+
		"\u0095\u0003\b\u0004\u0000\u0095\u0096\u0006\b\uffff\uffff\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u0099\u0006\b\uffff\uffff\u0000\u0098"+
		"\u0093\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0011\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u00a1\u0006\t\uffff\uffff\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d"+
		"\u00a1\u0006\t\uffff\uffff\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f"+
		"\u00a1\u0006\t\uffff\uffff\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3"+
		"\u00a4\u0006\n\uffff\uffff\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00a8"+
		"\u0003\n\u0005\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0006"+
		"\u000b\uffff\uffff\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0003\u001a\r\u0000\u00ac\u00ad\u0006\f\uffff\uffff\u0000\u00ad\u00ae"+
		"\u0003\u0018\f\u0000\u00ae\u00af\u0006\f\uffff\uffff\u0000\u00af\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0006\f\uffff\uffff\u0000\u00b1\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u0019"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4\u00b5"+
		"\u0005\t\u0000\u0000\u00b5\u00b6\u0003(\u0014\u0000\u00b6\u00b7\u0005"+
		"\n\u0000\u0000\u00b7\u00b8\u0006\r\uffff\uffff\u0000\u00b8\u001b\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\u0012\t\u0000\u00ba\u00bb\u0005&"+
		"\u0000\u0000\u00bb\u00bc\u0005\u000b\u0000\u0000\u00bc\u00bd\u0003\u001e"+
		"\u000f\u0000\u00bd\u00be\u0005\f\u0000\u0000\u00be\u00bf\u0006\u000e\uffff"+
		"\uffff\u0000\u00bf\u00c8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\u0014"+
		"\n\u0000\u00c1\u00c2\u0005&\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000"+
		"\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00c5\u0005\f\u0000\u0000"+
		"\u00c5\u00c6\u0006\u000e\uffff\uffff\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c7\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000"+
		"\u00ca\u00cb\u0006\u000f\uffff\uffff\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0006\u000f\uffff\uffff\u0000\u00cd\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u001f\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0003\u0012\t\u0000\u00d0\u00d1\u0005&\u0000"+
		"\u0000\u00d1\u00d2\u0003\"\u0011\u0000\u00d2\u00d3\u0006\u0010\uffff\uffff"+
		"\u0000\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\r\u0000\u0000"+
		"\u00d5\u00d6\u0003\u0012\t\u0000\u00d6\u00d7\u0005&\u0000\u0000\u00d7"+
		"\u00d8\u0003\"\u0011\u0000\u00d8\u00d9\u0006\u0011\uffff\uffff\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00dc\u0006\u0011\uffff\uffff\u0000"+
		"\u00db\u00d4\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00de\u0003&\u0013\u0000\u00de\u00df"+
		"\u0005\t\u0000\u0000\u00df\u00e0\u0003(\u0014\u0000\u00e0\u00e1\u0005"+
		"\n\u0000\u0000\u00e1\u00e2\u0006\u0012\uffff\uffff\u0000\u00e2%\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0003\u0014\n\u0000\u00e4\u00e5\u0005\u000e"+
		"\u0000\u0000\u00e5\u00e6\u0005\u000b\u0000\u0000\u00e6\u00e7\u0003\u001e"+
		"\u000f\u0000\u00e7\u00e8\u0005\f\u0000\u0000\u00e8\u00e9\u0006\u0013\uffff"+
		"\uffff\u0000\u00e9\'\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003*\u0015"+
		"\u0000\u00eb\u00ec\u0006\u0014\uffff\uffff\u0000\u00ec\u00ed\u0003(\u0014"+
		"\u0000\u00ed\u00ee\u0006\u0014\uffff\uffff\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0006\u0014\uffff\uffff\u0000\u00f0\u00ea\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1)\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003.\u0017\u0000\u00f3\u00f4\u0005\u0001\u0000"+
		"\u0000\u00f4\u00f5\u0006\u0015\uffff\uffff\u0000\u00f5\u010f\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u00038\u001c\u0000\u00f7\u00f8\u0005\u0001\u0000"+
		"\u0000\u00f8\u00f9\u0006\u0015\uffff\uffff\u0000\u00f9\u010f\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0003\u000e\u0007\u0000\u00fb\u00fc\u0005\u0001"+
		"\u0000\u0000\u00fc\u00fd\u0006\u0015\uffff\uffff\u0000\u00fd\u010f\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0003,\u0016\u0000\u00ff\u0100\u0005\u0001"+
		"\u0000\u0000\u0100\u0101\u0006\u0015\uffff\uffff\u0000\u0101\u010f\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0003@ \u0000\u0103\u0104\u0006\u0015\uffff"+
		"\uffff\u0000\u0104\u010f\u0001\u0000\u0000\u0000\u0105\u0106\u0003F#\u0000"+
		"\u0106\u0107\u0006\u0015\uffff\uffff\u0000\u0107\u010f\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0003H$\u0000\u0109\u010a\u0006\u0015\uffff\uffff\u0000"+
		"\u010a\u010f\u0001\u0000\u0000\u0000\u010b\u010c\u0003J%\u0000\u010c\u010d"+
		"\u0006\u0015\uffff\uffff\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u00f2\u0001\u0000\u0000\u0000\u010e\u00f6\u0001\u0000\u0000\u0000\u010e"+
		"\u00fa\u0001\u0000\u0000\u0000\u010e\u00fe\u0001\u0000\u0000\u0000\u010e"+
		"\u0102\u0001\u0000\u0000\u0000\u010e\u0105\u0001\u0000\u0000\u0000\u010e"+
		"\u0108\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010f"+
		"+\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u000f\u0000\u0000\u0111\u0112"+
		"\u00030\u0018\u0000\u0112\u0113\u0006\u0016\uffff\uffff\u0000\u0113-\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005&\u0000\u0000\u0115\u0116\u0005\u0003"+
		"\u0000\u0000\u0116\u0117\u00030\u0018\u0000\u0117\u0118\u0006\u0017\uffff"+
		"\uffff\u0000\u0118/\u0001\u0000\u0000\u0000\u0119\u011a\u00036\u001b\u0000"+
		"\u011a\u011b\u00032\u0019\u0000\u011b\u011c\u0006\u0018\uffff\uffff\u0000"+
		"\u011c1\u0001\u0000\u0000\u0000\u011d\u011e\u00034\u001a\u0000\u011e\u011f"+
		"\u00036\u001b\u0000\u011f\u0120\u0006\u0019\uffff\uffff\u0000\u0120\u0121"+
		"\u00032\u0019\u0000\u0121\u0122\u0006\u0019\uffff\uffff\u0000\u0122\u0125"+
		"\u0001\u0000\u0000\u0000\u0123\u0125\u0006\u0019\uffff\uffff\u0000\u0124"+
		"\u011d\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"3\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0010\u0000\u0000\u0127\u0131"+
		"\u0006\u001a\uffff\uffff\u0000\u0128\u0129\u0005\u0011\u0000\u0000\u0129"+
		"\u0131\u0006\u001a\uffff\uffff\u0000\u012a\u012b\u0005\u0012\u0000\u0000"+
		"\u012b\u0131\u0006\u001a\uffff\uffff\u0000\u012c\u012d\u0005\u0013\u0000"+
		"\u0000\u012d\u0131\u0006\u001a\uffff\uffff\u0000\u012e\u012f\u0005\u0014"+
		"\u0000\u0000\u012f\u0131\u0006\u001a\uffff\uffff\u0000\u0130\u0126\u0001"+
		"\u0000\u0000\u0000\u0130\u0128\u0001\u0000\u0000\u0000\u0130\u012a\u0001"+
		"\u0000\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u01315\u0001\u0000\u0000\u0000\u0132\u0133\u0003\b"+
		"\u0004\u0000\u0133\u0134\u0006\u001b\uffff\uffff\u0000\u0134\u013e\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\u000b\u0000\u0000\u0136\u0137\u0003"+
		"0\u0018\u0000\u0137\u0138\u0005\f\u0000\u0000\u0138\u0139\u0006\u001b"+
		"\uffff\uffff\u0000\u0139\u013e\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"8\u001c\u0000\u013b\u013c\u0006\u001b\uffff\uffff\u0000\u013c\u013e\u0001"+
		"\u0000\u0000\u0000\u013d\u0132\u0001\u0000\u0000\u0000\u013d\u0135\u0001"+
		"\u0000\u0000\u0000\u013d\u013a\u0001\u0000\u0000\u0000\u013e7\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005&\u0000\u0000\u0140\u0141\u0003:\u001d\u0000"+
		"\u0141\u0142\u0006\u001c\uffff\uffff\u0000\u0142\u0148\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005%\u0000\u0000\u0144\u0145\u0003:\u001d\u0000\u0145"+
		"\u0146\u0006\u001c\uffff\uffff\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u013f\u0001\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000"+
		"\u01489\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u000b\u0000\u0000\u014a"+
		"\u014b\u0003<\u001e\u0000\u014b\u014c\u0005\f\u0000\u0000\u014c\u014d"+
		"\u0006\u001d\uffff\uffff\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0006\u001d\uffff\uffff\u0000\u014f\u0149\u0001\u0000\u0000\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150;\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u00030\u0018\u0000\u0152\u0153\u0003>\u001f\u0000\u0153\u0154\u0006"+
		"\u001e\uffff\uffff\u0000\u0154=\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"\r\u0000\u0000\u0156\u0157\u00030\u0018\u0000\u0157\u0158\u0006\u001f"+
		"\uffff\uffff\u0000\u0158\u0159\u0003>\u001f\u0000\u0159\u015a\u0006\u001f"+
		"\uffff\uffff\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u015d\u0006"+
		"\u001f\uffff\uffff\u0000\u015c\u0155\u0001\u0000\u0000\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015d?\u0001\u0000\u0000\u0000\u015e\u015f\u0005"+
		"\u0015\u0000\u0000\u015f\u0160\u0003N\'\u0000\u0160\u0161\u0005\t\u0000"+
		"\u0000\u0161\u0162\u0003(\u0014\u0000\u0162\u0163\u0005\n\u0000\u0000"+
		"\u0163\u0164\u0003B!\u0000\u0164\u0165\u0006 \uffff\uffff\u0000\u0165"+
		"A\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0016\u0000\u0000\u0167\u0168"+
		"\u0003D\"\u0000\u0168\u0169\u0006!\uffff\uffff\u0000\u0169\u016c\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0006!\uffff\uffff\u0000\u016b\u0166\u0001"+
		"\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016cC\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0005\t\u0000\u0000\u016e\u016f\u0003(\u0014"+
		"\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0171\u0006\"\uffff\uffff"+
		"\u0000\u0171\u0176\u0001\u0000\u0000\u0000\u0172\u0173\u0003@ \u0000\u0173"+
		"\u0174\u0006\"\uffff\uffff\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175"+
		"\u016d\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176"+
		"E\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0017\u0000\u0000\u0178\u0179"+
		"\u0005\u000b\u0000\u0000\u0179\u017a\u0003N\'\u0000\u017a\u017b\u0005"+
		"\f\u0000\u0000\u017b\u017c\u0005\t\u0000\u0000\u017c\u017d\u0003(\u0014"+
		"\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u017f\u0006#\uffff\uffff"+
		"\u0000\u017fG\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0018\u0000\u0000"+
		"\u0181\u0182\u0005\t\u0000\u0000\u0182\u0183\u0003(\u0014\u0000\u0183"+
		"\u0184\u0005\n\u0000\u0000\u0184\u0185\u0005\u0017\u0000\u0000\u0185\u0186"+
		"\u0005\u000b\u0000\u0000\u0186\u0187\u0003N\'\u0000\u0187\u0188\u0005"+
		"\f\u0000\u0000\u0188\u0189\u0005\u0001\u0000\u0000\u0189\u018a\u0006$"+
		"\uffff\uffff\u0000\u018aI\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0019"+
		"\u0000\u0000\u018c\u018d\u0005\u000b\u0000\u0000\u018d\u018e\u0003L&\u0000"+
		"\u018e\u018f\u0006%\uffff\uffff\u0000\u018fK\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0003\u000e\u0007\u0000\u0191\u0192\u0005\u0001\u0000\u0000\u0192"+
		"\u0193\u0003N\'\u0000\u0193\u0194\u0005\u0001\u0000\u0000\u0194\u0195"+
		"\u0003.\u0017\u0000\u0195\u0196\u0005\f\u0000\u0000\u0196\u0197\u0005"+
		"\t\u0000\u0000\u0197\u0198\u0003(\u0014\u0000\u0198\u0199\u0005\n\u0000"+
		"\u0000\u0199\u019a\u0006&\uffff\uffff\u0000\u019a\u01a7\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0003.\u0017\u0000\u019c\u019d\u0005\u0001\u0000\u0000"+
		"\u019d\u019e\u0003N\'\u0000\u019e\u019f\u0005\u0001\u0000\u0000\u019f"+
		"\u01a0\u0003.\u0017\u0000\u01a0\u01a1\u0005\f\u0000\u0000\u01a1\u01a2"+
		"\u0005\t\u0000\u0000\u01a2\u01a3\u0003(\u0014\u0000\u01a3\u01a4\u0005"+
		"\n\u0000\u0000\u01a4\u01a5\u0006&\uffff\uffff\u0000\u01a5\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a6\u0190\u0001\u0000\u0000\u0000\u01a6\u019b\u0001"+
		"\u0000\u0000\u0000\u01a7M\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003T*"+
		"\u0000\u01a9\u01aa\u0003P(\u0000\u01aa\u01ab\u0006\'\uffff\uffff\u0000"+
		"\u01abO\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003R)\u0000\u01ad\u01ae"+
		"\u0003T*\u0000\u01ae\u01af\u0006(\uffff\uffff\u0000\u01af\u01b0\u0003"+
		"P(\u0000\u01b0\u01b1\u0006(\uffff\uffff\u0000\u01b1\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0006(\uffff\uffff\u0000\u01b3\u01ac\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4Q\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0005\u001a\u0000\u0000\u01b6\u01ba\u0006)\uffff\uffff"+
		"\u0000\u01b7\u01b8\u0005\u001b\u0000\u0000\u01b8\u01ba\u0006)\uffff\uffff"+
		"\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01baS\u0001\u0000\u0000\u0000\u01bb\u01bc\u00030\u0018\u0000\u01bc"+
		"\u01bd\u0003V+\u0000\u01bd\u01be\u00030\u0018\u0000\u01be\u01bf\u0006"+
		"*\uffff\uffff\u0000\u01bf\u01ca\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"\u000b\u0000\u0000\u01c1\u01c2\u0003N\'\u0000\u01c2\u01c3\u0005\f\u0000"+
		"\u0000\u01c3\u01c4\u0006*\uffff\uffff\u0000\u01c4\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005\u001c\u0000\u0000\u01c6\u01c7\u0003T*\u0000\u01c7"+
		"\u01c8\u0006*\uffff\uffff\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9"+
		"\u01bb\u0001\u0000\u0000\u0000\u01c9\u01c0\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c5\u0001\u0000\u0000\u0000\u01caU\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005\u001d\u0000\u0000\u01cc\u01d6\u0006+\uffff\uffff\u0000\u01cd\u01ce"+
		"\u0005\u001e\u0000\u0000\u01ce\u01d6\u0006+\uffff\uffff\u0000\u01cf\u01d0"+
		"\u0005\u001f\u0000\u0000\u01d0\u01d6\u0006+\uffff\uffff\u0000\u01d1\u01d2"+
		"\u0005 \u0000\u0000\u01d2\u01d6\u0006+\uffff\uffff\u0000\u01d3\u01d4\u0005"+
		"!\u0000\u0000\u01d4\u01d6\u0006+\uffff\uffff\u0000\u01d5\u01cb\u0001\u0000"+
		"\u0000\u0000\u01d5\u01cd\u0001\u0000\u0000\u0000\u01d5\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d6W\u0001\u0000\u0000\u0000\u001acly\u0087\u0091\u0098"+
		"\u00a0\u00b1\u00c7\u00cd\u00db\u00f0\u010e\u0124\u0130\u013d\u0147\u014f"+
		"\u015c\u016b\u0175\u01a6\u01b3\u01b9\u01c9\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}