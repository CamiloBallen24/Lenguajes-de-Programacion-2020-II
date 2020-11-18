// Generated from D:/Documents/Julian/Unal/2020-2/Lenguajes de Programación/Lenguajes-de-Programacion-2020-II/Practica3/grammar\BCC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_BOOL=1, TK_NUM=2, TK_COMA=3, TK_DOS_PUNTOS=4, TK_END=5, TK_PUNTO_Y_COMA=6, 
		TK_VAR=7, TK_FUNCTION=8, TK_PARENTESIS_IZQUIERDO=9, TK_PARENTESIS_DERECHO=10, 
		TK_CORCHETE_IZQUIERDO=11, TK_CORCHETE_DERECHO=12, TK_PRINT=13, TK_INPUT=14, 
		TK_WHEN=15, TK_DO=16, TK_IF=17, TK_ELSE=18, TK_UNLESS=19, TK_WHILE=20, 
		TK_RETURN=21, TK_UNTIL=22, TK_REPEAT=23, TK_NEXT=24, TK_BREAK=25, TK_AND=26, 
		TK_OR=27, TK_LOOP=28, TK_FOR=29, TK_NOT=30, TK_ASIGNACION=31, TK_SUMA_IGUAL=32, 
		TK_RESTA_IGUAL=33, TK_PRODUCTO_IGUAL=34, TK_DIVISION_IGUAL=35, TK_MODULO_IGUAL=36, 
		TK_INCREMENTO=37, TK_DECREMENTO=38, TK_MENOR=39, TK_MAYOR=40, TK_IGUAL=41, 
		TK_DIFERENTE=42, TK_MENOR_IGUAL=43, TK_MAYOR_IGUAL=44, TK_SUMA=45, TK_RESTA=46, 
		TK_PRODUCTO=47, TK_DIVISION=48, TK_MODULO=49, BOOL=50, FID=51, ID=52, 
		NUM=53, COMMENT=54, ESP=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TK_BOOL", "TK_NUM", "TK_COMA", "TK_DOS_PUNTOS", "TK_END", "TK_PUNTO_Y_COMA", 
			"TK_VAR", "TK_FUNCTION", "TK_PARENTESIS_IZQUIERDO", "TK_PARENTESIS_DERECHO", 
			"TK_CORCHETE_IZQUIERDO", "TK_CORCHETE_DERECHO", "TK_PRINT", "TK_INPUT", 
			"TK_WHEN", "TK_DO", "TK_IF", "TK_ELSE", "TK_UNLESS", "TK_WHILE", "TK_RETURN", 
			"TK_UNTIL", "TK_REPEAT", "TK_NEXT", "TK_BREAK", "TK_AND", "TK_OR", "TK_LOOP", 
			"TK_FOR", "TK_NOT", "TK_ASIGNACION", "TK_SUMA_IGUAL", "TK_RESTA_IGUAL", 
			"TK_PRODUCTO_IGUAL", "TK_DIVISION_IGUAL", "TK_MODULO_IGUAL", "TK_INCREMENTO", 
			"TK_DECREMENTO", "TK_MENOR", "TK_MAYOR", "TK_IGUAL", "TK_DIFERENTE", 
			"TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", "TK_SUMA", "TK_RESTA", "TK_PRODUCTO", 
			"TK_DIVISION", "TK_MODULO", "BOOL", "FID", "ID", "NUM", "COMMENT", "ESP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'num'", "','", "':'", "'end'", "';'", "'var'", "'function'", 
			"'('", "')'", "'{'", "'}'", "'print'", "'input'", "'when'", "'do'", "'if'", 
			"'else'", "'unless'", "'while'", "'return'", "'until'", "'repeat'", "'next'", 
			"'break'", "'and'", "'or'", "'loop'", "'for'", "'not'", "':='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'<'", "'>'", "'=='", 
			"'!='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_BOOL", "TK_NUM", "TK_COMA", "TK_DOS_PUNTOS", "TK_END", "TK_PUNTO_Y_COMA", 
			"TK_VAR", "TK_FUNCTION", "TK_PARENTESIS_IZQUIERDO", "TK_PARENTESIS_DERECHO", 
			"TK_CORCHETE_IZQUIERDO", "TK_CORCHETE_DERECHO", "TK_PRINT", "TK_INPUT", 
			"TK_WHEN", "TK_DO", "TK_IF", "TK_ELSE", "TK_UNLESS", "TK_WHILE", "TK_RETURN", 
			"TK_UNTIL", "TK_REPEAT", "TK_NEXT", "TK_BREAK", "TK_AND", "TK_OR", "TK_LOOP", 
			"TK_FOR", "TK_NOT", "TK_ASIGNACION", "TK_SUMA_IGUAL", "TK_RESTA_IGUAL", 
			"TK_PRODUCTO_IGUAL", "TK_DIVISION_IGUAL", "TK_MODULO_IGUAL", "TK_INCREMENTO", 
			"TK_DECREMENTO", "TK_MENOR", "TK_MAYOR", "TK_IGUAL", "TK_DIFERENTE", 
			"TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", "TK_SUMA", "TK_RESTA", "TK_PRODUCTO", 
			"TK_DIVISION", "TK_MODULO", "BOOL", "FID", "ID", "NUM", "COMMENT", "ESP"
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


	public BCCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BCC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0131\n\63\3\64\3\64\3\64"+
		"\7\64\u0136\n\64\f\64\16\64\u0139\13\64\3\65\3\65\7\65\u013d\n\65\f\65"+
		"\16\65\u0140\13\65\3\66\6\66\u0143\n\66\r\66\16\66\u0144\3\66\6\66\u0148"+
		"\n\66\r\66\16\66\u0149\3\66\3\66\6\66\u014e\n\66\r\66\16\66\u014f\5\66"+
		"\u0152\n\66\3\67\3\67\7\67\u0156\n\67\f\67\16\67\u0159\13\67\3\67\3\67"+
		"\38\68\u015e\n8\r8\168\u015f\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\b\4\2C\\c|\6\2\62;C\\aa"+
		"c|\5\2C\\aac|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u016b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3q\3\2\2\2\5v\3\2\2\2\7z\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2\r\u0082"+
		"\3\2\2\2\17\u0084\3\2\2\2\21\u0088\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3"+
		"\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009f\3\2"+
		"\2\2\37\u00a5\3\2\2\2!\u00aa\3\2\2\2#\u00ad\3\2\2\2%\u00b0\3\2\2\2\'\u00b5"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00c2\3\2\2\2-\u00c9\3\2\2\2/\u00cf\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00db\3\2\2\2\65\u00e1\3\2\2\2\67\u00e5\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00ed\3\2\2\2=\u00f1\3\2\2\2?\u00f5\3\2\2\2A\u00f8\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I\u0104\3\2\2\2K\u0107\3\2"+
		"\2\2M\u010a\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S\u0111\3\2\2\2U\u0114"+
		"\3\2\2\2W\u0117\3\2\2\2Y\u011a\3\2\2\2[\u011d\3\2\2\2]\u011f\3\2\2\2_"+
		"\u0121\3\2\2\2a\u0123\3\2\2\2c\u0125\3\2\2\2e\u0130\3\2\2\2g\u0132\3\2"+
		"\2\2i\u013a\3\2\2\2k\u0151\3\2\2\2m\u0153\3\2\2\2o\u015d\3\2\2\2qr\7d"+
		"\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2u\4\3\2\2\2vw\7p\2\2wx\7w\2\2xy\7o\2\2"+
		"y\6\3\2\2\2z{\7.\2\2{\b\3\2\2\2|}\7<\2\2}\n\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7f\2\2\u0081\f\3\2\2\2\u0082\u0083\7=\2\2\u0083\16"+
		"\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087"+
		"\20\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a\7w\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7q\2\2"+
		"\u008f\u0090\7p\2\2\u0090\22\3\2\2\2\u0091\u0092\7*\2\2\u0092\24\3\2\2"+
		"\2\u0093\u0094\7+\2\2\u0094\26\3\2\2\2\u0095\u0096\7}\2\2\u0096\30\3\2"+
		"\2\2\u0097\u0098\7\177\2\2\u0098\32\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7w\2\2\u00a3\u00a4\7v\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9 \3\2\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab\u00ac\7q\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7h\2\2\u00af$\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba\u00bb\7u\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1*\3\2"+
		"\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7p\2\2\u00c8,\3\2\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7r\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\60\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7"+
		"z\2\2\u00d9\u00da\7v\2\2\u00da\62\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7m\2\2\u00e0"+
		"\64\3\2\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\66\3\2\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2\2\u00e78\3\2\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7r\2\2"+
		"\u00ec:\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2"+
		"\2\u00f0<\3\2\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7"+
		"v\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7\7?\2\2\u00f7@\3\2"+
		"\2\2\u00f8\u00f9\7-\2\2\u00f9\u00fa\7?\2\2\u00faB\3\2\2\2\u00fb\u00fc"+
		"\7/\2\2\u00fc\u00fd\7?\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100"+
		"\7?\2\2\u0100F\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7?\2\2\u0103H"+
		"\3\2\2\2\u0104\u0105\7\'\2\2\u0105\u0106\7?\2\2\u0106J\3\2\2\2\u0107\u0108"+
		"\7-\2\2\u0108\u0109\7-\2\2\u0109L\3\2\2\2\u010a\u010b\7/\2\2\u010b\u010c"+
		"\7/\2\2\u010cN\3\2\2\2\u010d\u010e\7>\2\2\u010eP\3\2\2\2\u010f\u0110\7"+
		"@\2\2\u0110R\3\2\2\2\u0111\u0112\7?\2\2\u0112\u0113\7?\2\2\u0113T\3\2"+
		"\2\2\u0114\u0115\7#\2\2\u0115\u0116\7?\2\2\u0116V\3\2\2\2\u0117\u0118"+
		"\7>\2\2\u0118\u0119\7?\2\2\u0119X\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c"+
		"\7?\2\2\u011cZ\3\2\2\2\u011d\u011e\7-\2\2\u011e\\\3\2\2\2\u011f\u0120"+
		"\7/\2\2\u0120^\3\2\2\2\u0121\u0122\7,\2\2\u0122`\3\2\2\2\u0123\u0124\7"+
		"\61\2\2\u0124b\3\2\2\2\u0125\u0126\7\'\2\2\u0126d\3\2\2\2\u0127\u0128"+
		"\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7w\2\2\u012a\u0131\7g\2\2\u012b"+
		"\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7n\2\2\u012e\u012f\7u\2\2"+
		"\u012f\u0131\7g\2\2\u0130\u0127\3\2\2\2\u0130\u012b\3\2\2\2\u0131f\3\2"+
		"\2\2\u0132\u0133\7B\2\2\u0133\u0137\t\2\2\2\u0134\u0136\t\3\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138h\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013e\t\4\2\2\u013b\u013d"+
		"\t\3\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fj\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\t\5\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0152\3\2\2\2\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\7\60\2\2\u014c\u014e\t\5\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u0142\3\2\2\2\u0151\u0147\3\2\2\2\u0152l\3\2\2\2\u0153\u0157"+
		"\7%\2\2\u0154\u0156\n\6\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015b\b\67\2\2\u015bn\3\2\2\2\u015c\u015e\t\7\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\b8\2\2\u0162p\3\2\2\2\f\2\u0130\u0137\u013e"+
		"\u0144\u0149\u014f\u0151\u0157\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}