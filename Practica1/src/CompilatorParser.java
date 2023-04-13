// Generated from Compilator.g4 by ANTLR 4.12.0
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
		CONST_DEF_IDENTIFIER=1, IDENTIFIER=2, NUMERIC_REAL_CONST=3, NUMERIC_INTEGER_CONST=4, 
		STRING_CONST=5, SIMPLES=6, PUNTO=7;
	public static final int
		RULE_g = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"g"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_REAL_CONST", "NUMERIC_INTEGER_CONST", 
			"STRING_CONST", "SIMPLES", "PUNTO"
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
	public static class GContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CompilatorParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CompilatorParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CONST_DEF_IDENTIFIER() { return getTokens(CompilatorParser.CONST_DEF_IDENTIFIER); }
		public TerminalNode CONST_DEF_IDENTIFIER(int i) {
			return getToken(CompilatorParser.CONST_DEF_IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_INTEGER_CONST() { return getTokens(CompilatorParser.NUMERIC_INTEGER_CONST); }
		public TerminalNode NUMERIC_INTEGER_CONST(int i) {
			return getToken(CompilatorParser.NUMERIC_INTEGER_CONST, i);
		}
		public List<TerminalNode> NUMERIC_REAL_CONST() { return getTokens(CompilatorParser.NUMERIC_REAL_CONST); }
		public TerminalNode NUMERIC_REAL_CONST(int i) {
			return getToken(CompilatorParser.NUMERIC_REAL_CONST, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(CompilatorParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(CompilatorParser.STRING_CONST, i);
		}
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitG(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_g);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0) );
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
		"\u0004\u0001\u0007\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u0005\u0007\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000"+
		"\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000"+
		"\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}