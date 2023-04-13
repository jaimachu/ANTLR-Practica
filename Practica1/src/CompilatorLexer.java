// Generated from Compilator.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompilatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST_DEF_IDENTIFIER=1, IDENTIFIER=2, NUMERIC_REAL_CONST=3, NUMERIC_INTEGER_CONST=4, 
		STRING_CONST=5, SIMPLES=6, PUNTO=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_REAL_CONST", "NUMERIC_INTEGER_CONST", 
			"STRING_CONST", "DOBLES", "SIMPLES", "PUNTO"
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


	public CompilatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compilator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000"+
		"\u0016\t\u0000\u0001\u0000\u0004\u0000\u0019\b\u0000\u000b\u0000\f\u0000"+
		"\u001a\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b\u0000\f\u0000\u001f"+
		"\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000\u0001\u0001"+
		"\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001\u0001\u0004\u0001"+
		"/\b\u0001\u000b\u0001\f\u00010\u0001\u0001\u0004\u00014\b\u0001\u000b"+
		"\u0001\f\u00015\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001"+
		"\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002"+
		"\f\u0002E\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002I\b\u0002\u000b\u0002"+
		"\f\u0002J\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O\u0001"+
		"\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0004\u0002W\b\u0002"+
		"\u000b\u0002\f\u0002X\u0001\u0002\u0005\u0002\\\b\u0002\n\u0002\f\u0002"+
		"_\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002c\b\u0002\u000b\u0002\f\u0002"+
		"d\u0001\u0002\u0001\u0002\u0003\u0002i\b\u0002\u0001\u0002\u0004\u0002"+
		"l\b\u0002\u000b\u0002\f\u0002m\u0003\u0002p\b\u0002\u0001\u0003\u0003"+
		"\u0003s\b\u0003\u0001\u0003\u0004\u0003v\b\u0003\u000b\u0003\f\u0003w"+
		"\u0001\u0004\u0001\u0004\u0004\u0004|\b\u0004\u000b\u0004\f\u0004}\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005\u0085\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007\u0094\b\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007\u0001"+
		"\u0000\b\u0001\u0000AZ\u0002\u000009AZ\u0002\u0000AZaz\u0003\u000009A"+
		"Zaz\u0002\u0000++--\u0001\u000009\u0002\u0000EEee\u0004\u0000  09AZaz"+
		"\u00b0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000"+
		"\u0003*\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007r"+
		"\u0001\u0000\u0000\u0000\t{\u0001\u0000\u0000\u0000\u000b\u007f\u0001"+
		"\u0000\u0000\u0000\r\u0088\u0001\u0000\u0000\u0000\u000f\u0093\u0001\u0000"+
		"\u0000\u0000\u0011\u0013\u0005_\u0000\u0000\u0012\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000"+
		"\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0019\u0007\u0000\u0000"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b$\u0001\u0000\u0000\u0000\u001c\u001e\u0007\u0001\u0000\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #"+
		"\u0001\u0000\u0000\u0000!#\u0005_\u0000\u0000\"\u001d\u0001\u0000\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0002\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000\')\u0005_\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-/\u0007"+
		"\u0002\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001:\u0001\u0000\u0000"+
		"\u000024\u0007\u0003\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000079\u0005_\u0000\u000083\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u0004\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=?\u0007\u0004\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?o\u0001\u0000\u0000\u0000@B\u0007\u0005\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000FH\u0005.\u0000\u0000GI\u0007\u0005\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000Kp\u0001\u0000\u0000\u0000LN\u0007\u0005\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0007\u0006"+
		"\u0000\u0000RT\u0007\u0004\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0007\u0005\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Yp\u0001\u0000\u0000\u0000Z\\\u0007\u0005"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`b\u0005.\u0000\u0000ac\u0007\u0005\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0007\u0006"+
		"\u0000\u0000gi\u0007\u0004\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u0007\u0005\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oC\u0001\u0000"+
		"\u0000\u0000oM\u0001\u0000\u0000\u0000o]\u0001\u0000\u0000\u0000p\u0006"+
		"\u0001\u0000\u0000\u0000qs\u0007\u0004\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0007\u0005"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\b\u0001\u0000\u0000\u0000"+
		"y|\u0003\u000b\u0005\u0000z|\u0003\r\u0006\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\n\u0001\u0000\u0000\u0000\u007f\u0083"+
		"\u0005\"\u0000\u0000\u0080\u0082\u0003\u000f\u0007\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\"\u0000\u0000\u0087\f\u0001\u0000\u0000\u0000\u0088\u008d\u0005\'\u0000"+
		"\u0000\u0089\u008c\u0003\u000f\u0007\u0000\u008a\u008c\u0005\'\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091"+
		"\u000e\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0007\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0010\u0001\u0000\u0000\u0000\u001e"+
		"\u0000\u0014\u001a\u001f\"$*058:>CJOSX]dhmorw{}\u0083\u008b\u008d\u0093"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}