// Generated from Compilator.g4 by ANTLR 4.12.0

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
		T__17=18, T__18=19, SALTOS=20, COMENTARIO_PAREJA=21, COMENTARIO_SIMPLE=22, 
		CONST_DEF_IDENTIFIER=23, IDENTIFIER=24, NUMERIC_REAL_CONST=25, NUMERIC_INTEGER_CONST=26, 
		STRING_CONST=27, SIMPLES=28, BARRA=29, BARRA_BARRA=30, ANYCHARDOBLES=31, 
		ANYCHARSIMPLES=32, ANYCHAR=33, NEW_LINE=34;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_dcl = 2, RULE_ctedef = 3, RULE_simpvalue = 4, 
		RULE_varlist = 5, RULE_varlistP = 6, RULE_vardef = 7, RULE_vardefP = 8, 
		RULE_tbas = 9, RULE_tvoid = 10, RULE_funlist = 11, RULE_funcdef = 12, 
		RULE_funchead = 13, RULE_typedef1 = 14, RULE_typedef2 = 15, RULE_typedef2P = 16, 
		RULE_sentlist = 17, RULE_mainhead = 18, RULE_code = 19, RULE_sent = 20, 
		RULE_returnn = 21, RULE_asig = 22, RULE_exp = 23, RULE_expP = 24, RULE_op = 25, 
		RULE_factor = 26, RULE_funccall = 27, RULE_subpparamlist = 28, RULE_explist = 29, 
		RULE_explistP = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "dcl", "ctedef", "simpvalue", "varlist", "varlistP", 
			"vardef", "vardefP", "tbas", "tvoid", "funlist", "funcdef", "funchead", 
			"typedef1", "typedef2", "typedef2P", "sentlist", "mainhead", "code", 
			"sent", "returnn", "asig", "exp", "expP", "op", "factor", "funccall", 
			"subpparamlist", "explist", "explistP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#define'", "'='", "'integer'", "'float'", "'string'", 
			"'void'", "'{'", "'}'", "'('", "')'", "','", "'Main'", "'return'", "'+'", 
			"'-'", "'*'", "'DIV'", "'MOD'", null, null, null, null, null, null, null, 
			null, null, "'\\'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SALTOS", "COMENTARIO_PAREJA", 
			"COMENTARIO_SIMPLE", "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_REAL_CONST", 
			"NUMERIC_INTEGER_CONST", "STRING_CONST", "SIMPLES", "BARRA", "BARRA_BARRA", 
			"ANYCHARDOBLES", "ANYCHARSIMPLES", "ANYCHAR", "NEW_LINE"
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

	public CompilatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunlistContext funlist;
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
			setState(62);
			dcllist();
			setState(63);
			((ProgramContext)_localctx).funlist = funlist("", "", "");
			setState(64);
			sentlist();

			                try{
			                    String cadena = ((ProgramContext)_localctx).funlist.cabecera;
			                    String funcName = ((ProgramContext)_localctx).funlist.funcName;
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
			                    escribir.write(((ProgramContext)_localctx).funlist.vc);
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				dcl();
				setState(68);
				dcllist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				ctedef();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				vardef();
				setState(75);
				match(T__0);
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
			setState(79);
			match(T__1);
			setState(80);
			match(CONST_DEF_IDENTIFIER);
			setState(81);
			simpvalue();
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).vc =  "<SPAN CLASS=\"cte\">"+ (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) +"</SPAN>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).vc =  "<SPAN CLASS=\"cte\">"+ (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) +"</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			vardef();
			setState(92);
			match(T__0);
			setState(93);
			varlistP();
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
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
		}
		public VarlistPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final VarlistPContext varlistP() throws RecognitionException {
		VarlistPContext _localctx = new VarlistPContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlistP);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				vardef();
				setState(96);
				match(T__0);
				setState(97);
				varlistP();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
		public String value;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public VardefPContext vardefP;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilatorParser.IDENTIFIER, 0); }
		public VardefPContext vardefP() {
			return getRuleContext(VardefPContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((VardefContext)_localctx).tbas = tbas();
			setState(103);
			((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(104);
			((VardefContext)_localctx).vardefP = vardefP();
			((VardefContext)_localctx).value =  ((VardefContext)_localctx).tbas.value + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + ((VardefContext)_localctx).vardefP.value;
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__2);
				setState(108);
				((VardefPContext)_localctx).simpvalue = simpvalue();
				((VardefPContext)_localctx).value =  "=" + ((VardefPContext)_localctx).simpvalue.vc;
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__3);

				        ((TbasContext)_localctx).value =  "integer ";
				        ((TbasContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> integer </SPAN>";
				    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__4);

				        ((TbasContext)_localctx).value =  "float ";
				        ((TbasContext)_localctx).vc =  "<SPAN CLASS=\"palres\"> float </SPAN>";
				    
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
			setState(122);
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
		enterRule(_localctx, 22, RULE_funlist);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((FunlistContext)_localctx).funcdef = funcdef();

				        ((FunlistContext)_localctx).listCab =  _localctx.listCab + ((FunlistContext)_localctx).funcdef.cabecera + "\n";
				        ((FunlistContext)_localctx).listFunc =  _localctx.listFunc + ((FunlistContext)_localctx).funcdef.vc;
				        ((FunlistContext)_localctx).listFuncName =  _localctx.listFuncName + ((FunlistContext)_localctx).funcdef.funcName + "\n";
				     
				setState(127);
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
		enterRule(_localctx, 24, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((FuncdefContext)_localctx).funchead = funchead();
			setState(134);
			match(T__7);
			setState(135);
			((FuncdefContext)_localctx).code = code("");
			setState(136);
			match(T__8);

			        ((FuncdefContext)_localctx).cabecera =  ((FuncdefContext)_localctx).funchead.valueCab;

			        ((FuncdefContext)_localctx).funcName =  ((FuncdefContext)_localctx).funchead.funcName;

			        String codigo = "<DIV style=\"text-indent: 10cm\">" + ((FuncdefContext)_localctx).code.value + "</DIV>";

			        System.out.println(codigo);
			        ((FuncdefContext)_localctx).vc =  ((FuncdefContext)_localctx).funchead.vc + "<span>{</span>" + codigo +"<span>}</span>" + "<BR/>";
			    
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
		enterRule(_localctx, 26, RULE_funchead);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((FuncheadContext)_localctx).tbas = tbas();
				setState(140);
				((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(141);
				match(T__9);
				setState(142);
				((FuncheadContext)_localctx).typedef1 = typedef1();
				setState(143);
				match(T__10);

				        ((FuncheadContext)_localctx).valueCab =  ((FuncheadContext)_localctx).tbas.value + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "(" + ((FuncheadContext)_localctx).typedef1.value + ")";

				        ((FuncheadContext)_localctx).funcName =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null);

				        String identifier = "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +"</SPAN";
				        ((FuncheadContext)_localctx).vc =  ((FuncheadContext)_localctx).tbas.vc + identifier + " <span>(</span>" + ((FuncheadContext)_localctx).typedef1.vc + " <span>)</span>";
				    
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((FuncheadContext)_localctx).tvoid = tvoid();
				setState(147);
				((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(148);
				match(T__9);
				setState(149);
				((FuncheadContext)_localctx).typedef1 = typedef1();
				setState(150);
				match(T__10);

				        ((FuncheadContext)_localctx).valueCab =  ((FuncheadContext)_localctx).tvoid.value + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "(" + ((FuncheadContext)_localctx).typedef1.value + ")";

				        ((FuncheadContext)_localctx).funcName =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null);

				        String identifier = "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +"</SPAN";
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
		public String vc;
		public String value;
		public Typedef2Context typedef2;
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Typedef1Context typedef1() throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_typedef1);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((Typedef1Context)_localctx).typedef2 = typedef2();

				        ((Typedef1Context)_localctx).value =  ((Typedef1Context)_localctx).typedef2.value;
				        ((Typedef1Context)_localctx).vc =  ((Typedef1Context)_localctx).typedef2.vc;
				    
				}
				break;
			case T__10:
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
		public Typedef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Typedef2Context typedef2() throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedef2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((Typedef2Context)_localctx).tbas = tbas();
			setState(162);
			((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(163);
			((Typedef2Context)_localctx).typedef2P = typedef2P();

			        ((Typedef2Context)_localctx).value =  ((Typedef2Context)_localctx).tbas.value + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + ((Typedef2Context)_localctx).typedef2P.value;

			        String identifier = "<SPAN CLASS=\"ident\">" + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) +"</SPAN";
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
		public Typedef2PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Typedef2PContext typedef2P() throws RecognitionException {
		Typedef2PContext _localctx = new Typedef2PContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedef2P);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__11);
				setState(167);
				((Typedef2PContext)_localctx).tbas = tbas();
				setState(168);
				((Typedef2PContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(169);
				((Typedef2PContext)_localctx).t1 = ((Typedef2PContext)_localctx).typedef2P = typedef2P();

				        ((Typedef2PContext)_localctx).value =  "," + ((Typedef2PContext)_localctx).tbas.value + (((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null) + (((Typedef2PContext)_localctx).typedef2P!=null?_input.getText(((Typedef2PContext)_localctx).typedef2P.start,((Typedef2PContext)_localctx).typedef2P.stop):null);

				        String identifier = "<SPAN CLASS=\"ident\">" + (((Typedef2PContext)_localctx).IDENTIFIER!=null?((Typedef2PContext)_localctx).IDENTIFIER.getText():null) +"</SPAN";
				        String coma = "<span>,</span>";
				        ((Typedef2PContext)_localctx).vc =  coma + ((Typedef2PContext)_localctx).tbas.vc + identifier + ((Typedef2PContext)_localctx).t1.vc;
				    
				}
				break;
			case T__10:
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
		enterRule(_localctx, 34, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(176);
			match(T__7);
			setState(177);
			((SentlistContext)_localctx).code = code("");
			setState(178);
			match(T__8);
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
		enterRule(_localctx, 36, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(182);
			match(T__12);
			setState(183);
			match(T__9);
			setState(184);
			((MainheadContext)_localctx).typedef1 = typedef1();
			setState(185);
			match(T__10);
			((MainheadContext)_localctx).value =  ((MainheadContext)_localctx).tvoid.value + "Main" + "(" + ((MainheadContext)_localctx).typedef1.value + ")";
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
		public CodeContext(ParserRuleContext parent, int invokingState, String valueH) {
			super(parent, invokingState);
			this.valueH = valueH;
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

	public final CodeContext code(String valueH) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), valueH);
		enterRule(_localctx, 38, RULE_code);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__13:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((CodeContext)_localctx).sent = sent();
				((CodeContext)_localctx).valueH =  _localctx.valueH + ((CodeContext)_localctx).sent.value;
				setState(190);
				((CodeContext)_localctx).c1 = code(valueH);
				((CodeContext)_localctx).value =  ((CodeContext)_localctx).c1.value;
				}
				break;
			case T__8:
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
		public String value;
		public AsigContext asig;
		public FunccallContext funccall;
		public VardefContext vardef;
		public ReturnnContext returnn;
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
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((SentContext)_localctx).asig = asig();
				setState(197);
				match(T__0);
				((SentContext)_localctx).value =  ((SentContext)_localctx).asig.value + ";";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((SentContext)_localctx).funccall = funccall();
				setState(201);
				match(T__0);
				((SentContext)_localctx).value =  ((SentContext)_localctx).funccall.value + ";";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((SentContext)_localctx).vardef = vardef();
				setState(205);
				match(T__0);
				((SentContext)_localctx).value =  ((SentContext)_localctx).vardef.value + ";";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				((SentContext)_localctx).returnn = returnn();
				setState(209);
				match(T__0);
				((SentContext)_localctx).value =  ((SentContext)_localctx).returnn.value + ";";
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
		enterRule(_localctx, 42, RULE_returnn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__13);
			setState(215);
			((ReturnnContext)_localctx).exp = exp();
			((ReturnnContext)_localctx).value =  "return" + ((ReturnnContext)_localctx).exp.value;
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
		enterRule(_localctx, 44, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(219);
			match(T__2);
			setState(220);
			((AsigContext)_localctx).exp = exp();
			((AsigContext)_localctx).value =  (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + "=" + ((AsigContext)_localctx).exp.value;
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
		enterRule(_localctx, 46, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((ExpContext)_localctx).factor = factor();
			setState(224);
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
		enterRule(_localctx, 48, RULE_expP);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((ExpPContext)_localctx).op = op();
				setState(228);
				((ExpPContext)_localctx).factor = factor();
				((ExpPContext)_localctx).valueH =  _localctx.valueH + ((ExpPContext)_localctx).op.value + ((ExpPContext)_localctx).factor.value;
				setState(230);
				((ExpPContext)_localctx).e1 = expP(_localctx.valueH);
				((ExpPContext)_localctx).value =  ((ExpPContext)_localctx).e1.value;
				}
				break;
			case T__0:
			case T__10:
			case T__11:
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
		enterRule(_localctx, 50, RULE_op);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__14);
				((OpContext)_localctx).value =  "+";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__15);
				((OpContext)_localctx).value =  "-";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(T__16);
				((OpContext)_localctx).value =  "*";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(T__17);
				((OpContext)_localctx).value =  "DIV";
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(T__18);
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
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_REAL_CONST:
			case NUMERIC_INTEGER_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).value =  ((FactorContext)_localctx).simpvalue.vc;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__9);
				setState(252);
				((FactorContext)_localctx).exp = exp();
				setState(253);
				match(T__10);
				((FactorContext)_localctx).value =  "(" + ((FactorContext)_localctx).exp.value + ")";
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
		enterRule(_localctx, 54, RULE_funccall);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(262);
				((FunccallContext)_localctx).subpparamlist = subpparamlist();
				((FunccallContext)_localctx).value =  (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + ((FunccallContext)_localctx).subpparamlist.value;
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				((FunccallContext)_localctx).value =  (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null);
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
		enterRule(_localctx, 56, RULE_subpparamlist);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__9);
				setState(270);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(271);
				match(T__10);
				((SubpparamlistContext)_localctx).value =  "(" + ((SubpparamlistContext)_localctx).explist.value + ")";
				}
				break;
			case T__0:
			case T__10:
			case T__11:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
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
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ExplistContext)_localctx).exp = exp();
			setState(278);
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
		enterRule(_localctx, 60, RULE_explistP);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__11);
				setState(282);
				((ExplistPContext)_localctx).exp = exp();
				((ExplistPContext)_localctx).valueH =  _localctx.valueH + "," + ((ExplistPContext)_localctx).exp.value;
				setState(284);
				((ExplistPContext)_localctx).e1 = explistP(_localctx.valueH);
				((ExplistPContext)_localctx).value =  ((ExplistPContext)_localctx).e1.value;
				}
				break;
			case T__10:
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

	public static final String _serializedATN =
		"\u0004\u0001\"\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006e\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bq\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ty\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u009a\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00ae\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c3"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d5"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00eb\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f7\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0104\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u010c\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0114\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0121\b\u001e\u0001\u001e\u0000"+
		"\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0000\u011d\u0000>\u0001"+
		"\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000"+
		"\u0000\u0006O\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001"+
		"\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000"+
		"\u0000\u0010p\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014"+
		"z\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000\u0018\u0085"+
		"\u0001\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u009f"+
		"\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 \u00ad\u0001"+
		"\u0000\u0000\u0000\"\u00af\u0001\u0000\u0000\u0000$\u00b5\u0001\u0000"+
		"\u0000\u0000&\u00c2\u0001\u0000\u0000\u0000(\u00d4\u0001\u0000\u0000\u0000"+
		"*\u00d6\u0001\u0000\u0000\u0000,\u00da\u0001\u0000\u0000\u0000.\u00df"+
		"\u0001\u0000\u0000\u00000\u00ea\u0001\u0000\u0000\u00002\u00f6\u0001\u0000"+
		"\u0000\u00004\u0103\u0001\u0000\u0000\u00006\u010b\u0001\u0000\u0000\u0000"+
		"8\u0113\u0001\u0000\u0000\u0000:\u0115\u0001\u0000\u0000\u0000<\u0120"+
		"\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0003\u0016\u000b"+
		"\u0000@A\u0003\"\u0011\u0000AB\u0006\u0000\uffff\uffff\u0000B\u0001\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0004\u0002\u0000DE\u0003\u0002\u0001\u0000"+
		"EH\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IN\u0003"+
		"\u0006\u0003\u0000JK\u0003\u000e\u0007\u0000KL\u0005\u0001\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000"+
		"\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0005\u0002\u0000\u0000PQ\u0005"+
		"\u0017\u0000\u0000QR\u0003\b\u0004\u0000R\u0007\u0001\u0000\u0000\u0000"+
		"ST\u0005\u001a\u0000\u0000TZ\u0006\u0004\uffff\uffff\u0000UV\u0005\u0019"+
		"\u0000\u0000VZ\u0006\u0004\uffff\uffff\u0000WX\u0005\u001b\u0000\u0000"+
		"XZ\u0006\u0004\uffff\uffff\u0000YS\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0003"+
		"\u000e\u0007\u0000\\]\u0005\u0001\u0000\u0000]^\u0003\f\u0006\u0000^\u000b"+
		"\u0001\u0000\u0000\u0000_`\u0003\u000e\u0007\u0000`a\u0005\u0001\u0000"+
		"\u0000ab\u0003\f\u0006\u0000be\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000d_\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\r\u0001\u0000"+
		"\u0000\u0000fg\u0003\u0012\t\u0000gh\u0005\u0018\u0000\u0000hi\u0003\u0010"+
		"\b\u0000ij\u0006\u0007\uffff\uffff\u0000j\u000f\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0003\u0000\u0000lm\u0003\b\u0004\u0000mn\u0006\b\uffff\uffff"+
		"\u0000nq\u0001\u0000\u0000\u0000oq\u0006\b\uffff\uffff\u0000pk\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\u0011\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0004\u0000\u0000sy\u0006\t\uffff\uffff\u0000tu\u0005\u0005\u0000"+
		"\u0000uy\u0006\t\uffff\uffff\u0000vw\u0005\u0006\u0000\u0000wy\u0006\t"+
		"\uffff\uffff\u0000xr\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0005\u0007"+
		"\u0000\u0000{|\u0006\n\uffff\uffff\u0000|\u0015\u0001\u0000\u0000\u0000"+
		"}~\u0003\u0018\f\u0000~\u007f\u0006\u000b\uffff\uffff\u0000\u007f\u0080"+
		"\u0003\u0016\u000b\u0000\u0080\u0081\u0006\u000b\uffff\uffff\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0084\u0006\u000b\uffff\uffff\u0000"+
		"\u0083}\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u001a\r\u0000\u0086\u0087"+
		"\u0005\b\u0000\u0000\u0087\u0088\u0003&\u0013\u0000\u0088\u0089\u0005"+
		"\t\u0000\u0000\u0089\u008a\u0006\f\uffff\uffff\u0000\u008a\u0019\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005\u0018"+
		"\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0003\u001c\u000e"+
		"\u0000\u008f\u0090\u0005\u000b\u0000\u0000\u0090\u0091\u0006\r\uffff\uffff"+
		"\u0000\u0091\u009a\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0014\n\u0000"+
		"\u0093\u0094\u0005\u0018\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095"+
		"\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097"+
		"\u0098\u0006\r\uffff\uffff\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099"+
		"\u008b\u0001\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u009a"+
		"\u001b\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u001e\u000f\u0000\u009c"+
		"\u009d\u0006\u000e\uffff\uffff\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0006\u000e\uffff\uffff\u0000\u009f\u009b\u0001\u0000\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u001d\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u0012\t\u0000\u00a2\u00a3\u0005\u0018\u0000\u0000"+
		"\u00a3\u00a4\u0003 \u0010\u0000\u00a4\u00a5\u0006\u000f\uffff\uffff\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0012\t\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa"+
		"\u0003 \u0010\u0000\u00aa\u00ab\u0006\u0010\uffff\uffff\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0006\u0010\uffff\uffff\u0000\u00ad"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"!\u0001\u0000\u0000\u0000\u00af\u00b0\u0003$\u0012\u0000\u00b0\u00b1\u0005"+
		"\b\u0000\u0000\u00b1\u00b2\u0003&\u0013\u0000\u00b2\u00b3\u0005\t\u0000"+
		"\u0000\u00b3\u00b4\u0006\u0011\uffff\uffff\u0000\u00b4#\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0014\n\u0000\u00b6\u00b7\u0005\r\u0000\u0000"+
		"\u00b7\u00b8\u0005\n\u0000\u0000\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9"+
		"\u00ba\u0005\u000b\u0000\u0000\u00ba\u00bb\u0006\u0012\uffff\uffff\u0000"+
		"\u00bb%\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd\u00be"+
		"\u0006\u0013\uffff\uffff\u0000\u00be\u00bf\u0003&\u0013\u0000\u00bf\u00c0"+
		"\u0006\u0013\uffff\uffff\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0006\u0013\uffff\uffff\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003,\u0016\u0000\u00c5\u00c6\u0005\u0001\u0000\u0000\u00c6\u00c7"+
		"\u0006\u0014\uffff\uffff\u0000\u00c7\u00d5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u00036\u001b\u0000\u00c9\u00ca\u0005\u0001\u0000\u0000\u00ca\u00cb"+
		"\u0006\u0014\uffff\uffff\u0000\u00cb\u00d5\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0003\u000e\u0007\u0000\u00cd\u00ce\u0005\u0001\u0000\u0000\u00ce"+
		"\u00cf\u0006\u0014\uffff\uffff\u0000\u00cf\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0003*\u0015\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000\u00d2"+
		"\u00d3\u0006\u0014\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c4\u0001\u0000\u0000\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d5)\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u000e\u0000\u0000\u00d7"+
		"\u00d8\u0003.\u0017\u0000\u00d8\u00d9\u0006\u0015\uffff\uffff\u0000\u00d9"+
		"+\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0018\u0000\u0000\u00db\u00dc"+
		"\u0005\u0003\u0000\u0000\u00dc\u00dd\u0003.\u0017\u0000\u00dd\u00de\u0006"+
		"\u0016\uffff\uffff\u0000\u00de-\u0001\u0000\u0000\u0000\u00df\u00e0\u0003"+
		"4\u001a\u0000\u00e0\u00e1\u00030\u0018\u0000\u00e1\u00e2\u0006\u0017\uffff"+
		"\uffff\u0000\u00e2/\u0001\u0000\u0000\u0000\u00e3\u00e4\u00032\u0019\u0000"+
		"\u00e4\u00e5\u00034\u001a\u0000\u00e5\u00e6\u0006\u0018\uffff\uffff\u0000"+
		"\u00e6\u00e7\u00030\u0018\u0000\u00e7\u00e8\u0006\u0018\uffff\uffff\u0000"+
		"\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00eb\u0006\u0018\uffff\uffff"+
		"\u0000\u00ea\u00e3\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb1\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u000f\u0000\u0000"+
		"\u00ed\u00f7\u0006\u0019\uffff\uffff\u0000\u00ee\u00ef\u0005\u0010\u0000"+
		"\u0000\u00ef\u00f7\u0006\u0019\uffff\uffff\u0000\u00f0\u00f1\u0005\u0011"+
		"\u0000\u0000\u00f1\u00f7\u0006\u0019\uffff\uffff\u0000\u00f2\u00f3\u0005"+
		"\u0012\u0000\u0000\u00f3\u00f7\u0006\u0019\uffff\uffff\u0000\u00f4\u00f5"+
		"\u0005\u0013\u0000\u0000\u00f5\u00f7\u0006\u0019\uffff\uffff\u0000\u00f6"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f73\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0003\b\u0004\u0000\u00f9\u00fa\u0006\u001a\uffff\uffff\u0000\u00fa\u0104"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0003"+
		".\u0017\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u00ff\u0006\u001a"+
		"\uffff\uffff\u0000\u00ff\u0104\u0001\u0000\u0000\u0000\u0100\u0101\u0003"+
		"6\u001b\u0000\u0101\u0102\u0006\u001a\uffff\uffff\u0000\u0102\u0104\u0001"+
		"\u0000\u0000\u0000\u0103\u00f8\u0001\u0000\u0000\u0000\u0103\u00fb\u0001"+
		"\u0000\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u01045\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u0018\u0000\u0000\u0106\u0107\u00038\u001c"+
		"\u0000\u0107\u0108\u0006\u001b\uffff\uffff\u0000\u0108\u010c\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u0017\u0000\u0000\u010a\u010c\u0006\u001b"+
		"\uffff\uffff\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c7\u0001\u0000\u0000\u0000\u010d\u010e\u0005\n"+
		"\u0000\u0000\u010e\u010f\u0003:\u001d\u0000\u010f\u0110\u0005\u000b\u0000"+
		"\u0000\u0110\u0111\u0006\u001c\uffff\uffff\u0000\u0111\u0114\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0006\u001c\uffff\uffff\u0000\u0113\u010d\u0001"+
		"\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u01149\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0003.\u0017\u0000\u0116\u0117\u0003<\u001e\u0000"+
		"\u0117\u0118\u0006\u001d\uffff\uffff\u0000\u0118;\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\f\u0000\u0000\u011a\u011b\u0003.\u0017\u0000\u011b"+
		"\u011c\u0006\u001e\uffff\uffff\u0000\u011c\u011d\u0003<\u001e\u0000\u011d"+
		"\u011e\u0006\u001e\uffff\uffff\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u0121\u0006\u001e\uffff\uffff\u0000\u0120\u0119\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121=\u0001\u0000\u0000\u0000"+
		"\u0012GMYdpx\u0083\u0099\u009f\u00ad\u00c2\u00d4\u00ea\u00f6\u0103\u010b"+
		"\u0113\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}