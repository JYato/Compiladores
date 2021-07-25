// Generated from g:\Onedrive\CursosUniversidad\Octavo Semestre\Compiladores\Second Time\Trabajo Final\MINI-0\Mini0.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mini0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, FUNCTION=2, LITNUMERAL=3, LITSTRING=4, PARENIZQ=5, PARENDER=6, DOSPUNTOS=7, 
		COMA=8, END=9, LLAVIZQ=10, LLAVDER=11, INT=12, BOOL=13, CHAR=14, STRING=15, 
		IF=16, ELSE=17, WHILE=18, LOOP=19, IGUAL=20, RETURN=21, TRUE=22, FALSE=23, 
		NEW=24, SUMA=25, RESTA=26, MULTI=27, DIV=28, MAYOR=29, MENOR=30, MAYORIGUAL=31, 
		MENORIGUAL=32, DIFER=33, AND=34, OR=35, NOT=36, ID=37, COMENTARIOS=38, 
		COMENTARIO=39, WS=40;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_nl = 2, RULE_globall = 3, RULE_funcion = 4, 
		RULE_bloques = 5, RULE_bloque = 6, RULE_params = 7, RULE_parametro = 8, 
		RULE_tipobase = 9, RULE_tipo = 10, RULE_var = 11, RULE_declvar = 12, RULE_comandos = 13, 
		RULE_comando = 14, RULE_cmdif = 15, RULE_cmdwhile = 16, RULE_cmdasign = 17, 
		RULE_llamada = 18, RULE_listaexp = 19, RULE_cmdreturn = 20, RULE_exp = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "nl", "globall", "funcion", "bloques", "bloque", 
			"params", "parametro", "tipobase", "tipo", "var", "declvar", "comandos", 
			"comando", "cmdif", "cmdwhile", "cmdasign", "llamada", "listaexp", "cmdreturn", 
			"exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'fun'", null, null, "'('", "')'", "':'", "','", "'end'", 
			"'['", "']'", "'int'", "'bool'", "'char'", "'string'", "'if'", "'else'", 
			"'while'", "'loop'", "'='", "'return'", "'true'", "'false'", "'new'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", 
			"'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "FUNCTION", "LITNUMERAL", "LITSTRING", "PARENIZQ", "PARENDER", 
			"DOSPUNTOS", "COMA", "END", "LLAVIZQ", "LLAVDER", "INT", "BOOL", "CHAR", 
			"STRING", "IF", "ELSE", "WHILE", "LOOP", "IGUAL", "RETURN", "TRUE", "FALSE", 
			"NEW", "SUMA", "RESTA", "MULTI", "DIV", "MAYOR", "MENOR", "MAYORIGUAL", 
			"MENORIGUAL", "DIFER", "AND", "OR", "NOT", "ID", "COMENTARIOS", "COMENTARIO", 
			"WS"
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
	public String getGrammarFileName() { return "Mini0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Mini0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Mini0Parser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(Mini0Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Mini0Parser.NL, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(44);
				match(NL);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			decl();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==ID) {
				{
				{
				setState(51);
				decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public GloballContext globall() {
			return getRuleContext(GloballContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				funcion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				globall();
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

	public static class NlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(Mini0Parser.NL, 0); }
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(NL);
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

	public static class GloballContext extends ParserRuleContext {
		public DeclvarContext declvar() {
			return getRuleContext(DeclvarContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public GloballContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globall; }
	}

	public final GloballContext globall() throws RecognitionException {
		GloballContext _localctx = new GloballContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			declvar();
			setState(66);
			nl();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Mini0Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Mini0Parser.ID, 0); }
		public TerminalNode PARENIZQ() { return getToken(Mini0Parser.PARENIZQ, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(Mini0Parser.PARENDER, 0); }
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public BloquesContext bloques() {
			return getRuleContext(BloquesContext.class,0);
		}
		public TerminalNode END() { return getToken(Mini0Parser.END, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Mini0Parser.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FUNCTION);
			setState(69);
			match(ID);
			setState(70);
			match(PARENIZQ);
			setState(71);
			params();
			setState(72);
			match(PARENDER);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOSPUNTOS) {
				{
				setState(73);
				match(DOSPUNTOS);
				setState(74);
				tipo();
				}
			}

			setState(77);
			nl();
			setState(78);
			bloques();
			setState(79);
			match(END);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(80);
				nl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BloquesContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public BloquesContext bloques() {
			return getRuleContext(BloquesContext.class,0);
		}
		public BloquesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloques; }
	}

	public final BloquesContext bloques() throws RecognitionException {
		BloquesContext _localctx = new BloquesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloques);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				bloque();
				setState(87);
				bloques();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					declvar();
					setState(93);
					nl();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(100);
				comandos();
				}
			}

			setState(103);
			nl();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Mini0Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Mini0Parser.COMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				parametro();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(106);
					match(COMA);
					setState(107);
					parametro();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PARENDER:
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini0Parser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Mini0Parser.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(117);
			match(DOSPUNTOS);
			setState(118);
			tipo();
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

	public static class TipobaseContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Mini0Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(Mini0Parser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(Mini0Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(Mini0Parser.STRING, 0); }
		public TipobaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipobase; }
	}

	public final TipobaseContext tipobase() throws RecognitionException {
		TipobaseContext _localctx = new TipobaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipobase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TipoContext extends ParserRuleContext {
		public TipobaseContext tipobase() {
			return getRuleContext(TipobaseContext.class,0);
		}
		public TerminalNode LLAVIZQ() { return getToken(Mini0Parser.LLAVIZQ, 0); }
		public TerminalNode LLAVDER() { return getToken(Mini0Parser.LLAVDER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				tipobase();
				}
				break;
			case LLAVIZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(LLAVIZQ);
				setState(124);
				match(LLAVDER);
				setState(125);
				tipo();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini0Parser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LLAVIZQ() { return getToken(Mini0Parser.LLAVIZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LLAVDER() { return getToken(Mini0Parser.LLAVDER, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(131);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(132);
					match(LLAVIZQ);
					setState(133);
					exp(0);
					setState(134);
					match(LLAVDER);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini0Parser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Mini0Parser.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(DOSPUNTOS);
			setState(143);
			tipo();
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				comando();
				setState(146);
				nl();
				setState(147);
				comandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				comando();
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

	public static class ComandoContext extends ParserRuleContext {
		public CmdifContext cmdif() {
			return getRuleContext(CmdifContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public CmdasignContext cmdasign() {
			return getRuleContext(CmdasignContext.class,0);
		}
		public CmdreturnContext cmdreturn() {
			return getRuleContext(CmdreturnContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				cmdif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				cmdwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				cmdasign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				cmdreturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				llamada();
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

	public static class CmdifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Mini0Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Mini0Parser.IF, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<BloquesContext> bloques() {
			return getRuleContexts(BloquesContext.class);
		}
		public BloquesContext bloques(int i) {
			return getRuleContext(BloquesContext.class,i);
		}
		public TerminalNode END() { return getToken(Mini0Parser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(Mini0Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Mini0Parser.ELSE, i);
		}
		public CmdifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdif; }
	}

	public final CmdifContext cmdif() throws RecognitionException {
		CmdifContext _localctx = new CmdifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IF);
			setState(160);
			exp(0);
			setState(161);
			nl();
			setState(162);
			bloques();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					match(ELSE);
					setState(164);
					match(IF);
					setState(165);
					exp(0);
					setState(166);
					nl();
					setState(167);
					bloques();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(174);
				match(ELSE);
				setState(175);
				nl();
				setState(176);
				bloques();
				}
			}

			setState(180);
			match(END);
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

	public static class CmdwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Mini0Parser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public BloquesContext bloques() {
			return getRuleContext(BloquesContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(Mini0Parser.LOOP, 0); }
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(WHILE);
			setState(183);
			exp(0);
			setState(184);
			nl();
			setState(185);
			bloques();
			setState(186);
			match(LOOP);
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

	public static class CmdasignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Mini0Parser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdasignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdasign; }
	}

	public final CmdasignContext cmdasign() throws RecognitionException {
		CmdasignContext _localctx = new CmdasignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdasign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			var(0);
			setState(189);
			match(IGUAL);
			setState(190);
			exp(0);
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

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mini0Parser.ID, 0); }
		public TerminalNode PARENIZQ() { return getToken(Mini0Parser.PARENIZQ, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(Mini0Parser.PARENDER, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(PARENIZQ);
			setState(194);
			listaexp();
			setState(195);
			match(PARENDER);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Mini0Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Mini0Parser.COMA, i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listaexp);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENDER:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LITNUMERAL:
			case LITSTRING:
			case PARENIZQ:
			case TRUE:
			case FALSE:
			case NEW:
			case RESTA:
			case NOT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				exp(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(199);
					match(COMA);
					setState(200);
					exp(0);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CmdreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Mini0Parser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdreturn; }
	}

	public final CmdreturnContext cmdreturn() throws RecognitionException {
		CmdreturnContext _localctx = new CmdreturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdreturn);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(RETURN);
				setState(209);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(RETURN);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode LITNUMERAL() { return getToken(Mini0Parser.LITNUMERAL, 0); }
		public TerminalNode LITSTRING() { return getToken(Mini0Parser.LITSTRING, 0); }
		public TerminalNode TRUE() { return getToken(Mini0Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Mini0Parser.FALSE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Mini0Parser.NEW, 0); }
		public TerminalNode LLAVIZQ() { return getToken(Mini0Parser.LLAVIZQ, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LLAVDER() { return getToken(Mini0Parser.LLAVDER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(Mini0Parser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(Mini0Parser.PARENDER, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Mini0Parser.NOT, 0); }
		public TerminalNode RESTA() { return getToken(Mini0Parser.RESTA, 0); }
		public TerminalNode SUMA() { return getToken(Mini0Parser.SUMA, 0); }
		public TerminalNode MULTI() { return getToken(Mini0Parser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(Mini0Parser.DIV, 0); }
		public TerminalNode MAYOR() { return getToken(Mini0Parser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Mini0Parser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Mini0Parser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Mini0Parser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(Mini0Parser.IGUAL, 0); }
		public TerminalNode DIFER() { return getToken(Mini0Parser.DIFER, 0); }
		public TerminalNode AND() { return getToken(Mini0Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Mini0Parser.OR, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(214);
				match(LITNUMERAL);
				}
				break;
			case 2:
				{
				setState(215);
				match(LITSTRING);
				}
				break;
			case 3:
				{
				setState(216);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(217);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(218);
				var(0);
				}
				break;
			case 6:
				{
				setState(219);
				match(NEW);
				setState(220);
				match(LLAVIZQ);
				setState(221);
				exp(0);
				setState(222);
				match(LLAVDER);
				setState(223);
				tipo();
				}
				break;
			case 7:
				{
				setState(225);
				match(PARENIZQ);
				setState(226);
				exp(0);
				setState(227);
				match(PARENDER);
				}
				break;
			case 8:
				{
				setState(229);
				llamada();
				}
				break;
			case 9:
				{
				setState(230);
				match(NOT);
				setState(231);
				exp(2);
				}
				break;
			case 10:
				{
				setState(232);
				match(RESTA);
				setState(233);
				exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(236);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(237);
						match(SUMA);
						setState(238);
						exp(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(240);
						match(RESTA);
						setState(241);
						exp(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(242);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(243);
						match(MULTI);
						setState(244);
						exp(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(245);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(246);
						match(DIV);
						setState(247);
						exp(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						match(MAYOR);
						setState(250);
						exp(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(251);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(252);
						match(MENOR);
						setState(253);
						exp(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(254);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(255);
						match(MAYORIGUAL);
						setState(256);
						exp(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258);
						match(MENORIGUAL);
						setState(259);
						exp(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261);
						match(IGUAL);
						setState(262);
						exp(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(264);
						match(DIFER);
						setState(265);
						exp(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(266);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(267);
						match(AND);
						setState(268);
						exp(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(269);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(270);
						match(OR);
						setState(271);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return var_sempred((VarContext)_localctx, predIndex);
		case 21:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0118\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\5\3@\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3"+
		"\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\7"+
		"\bb\n\b\f\b\16\be\13\b\3\b\5\bh\n\b\3\b\3\b\3\t\3\t\3\t\7\to\n\t\f\t\16"+
		"\tr\13\t\3\t\5\tu\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0081"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00ac\n\21\f\21\16\21\u00af\13\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00b5\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00cc\n\25\f\25"+
		"\16\25\u00cf\13\25\5\25\u00d1\n\25\3\26\3\26\3\26\5\26\u00d6\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ed\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0113\n\27\f\27\16\27\u0116\13\27\3\27\2\4\30,\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\16\21\2\u012c"+
		"\2\61\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nF\3\2\2\2\f\\\3\2\2\2"+
		"\16c\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24z\3\2\2\2\26\u0080\3\2\2\2\30\u0082"+
		"\3\2\2\2\32\u008f\3\2\2\2\34\u0098\3\2\2\2\36\u009f\3\2\2\2 \u00a1\3\2"+
		"\2\2\"\u00b8\3\2\2\2$\u00be\3\2\2\2&\u00c2\3\2\2\2(\u00d0\3\2\2\2*\u00d5"+
		"\3\2\2\2,\u00ec\3\2\2\2.\60\7\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\5\4\3\2\65\67\5\4\3\2"+
		"\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;"+
		"<\7\2\2\3<\3\3\2\2\2=@\5\n\6\2>@\5\b\5\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2"+
		"\2AB\7\3\2\2B\7\3\2\2\2CD\5\32\16\2DE\5\6\4\2E\t\3\2\2\2FG\7\4\2\2GH\7"+
		"\'\2\2HI\7\7\2\2IJ\5\20\t\2JM\7\b\2\2KL\7\t\2\2LN\5\26\f\2MK\3\2\2\2M"+
		"N\3\2\2\2NO\3\2\2\2OP\5\6\4\2PQ\5\f\7\2QU\7\13\2\2RT\5\6\4\2SR\3\2\2\2"+
		"TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2\2XY\5\16\b\2YZ\5\f"+
		"\7\2Z]\3\2\2\2[]\5\16\b\2\\X\3\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\5\32\16\2"+
		"_`\5\6\4\2`b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2fh\5\34\17\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\6\4\2j\17\3\2"+
		"\2\2kp\5\22\n\2lm\7\n\2\2mo\5\22\n\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qu\3\2\2\2rp\3\2\2\2su\3\2\2\2tk\3\2\2\2ts\3\2\2\2u\21\3\2\2\2v"+
		"w\7\'\2\2wx\7\t\2\2xy\5\26\f\2y\23\3\2\2\2z{\t\2\2\2{\25\3\2\2\2|\u0081"+
		"\5\24\13\2}~\7\f\2\2~\177\7\r\2\2\177\u0081\5\26\f\2\u0080|\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\27\3\2\2\2\u0082\u0083\b\r\1\2\u0083\u0084\7\'\2\2\u0084"+
		"\u008c\3\2\2\2\u0085\u0086\f\3\2\2\u0086\u0087\7\f\2\2\u0087\u0088\5,"+
		"\27\2\u0088\u0089\7\r\2\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\7\t\2\2\u0091\u0092"+
		"\5\26\f\2\u0092\33\3\2\2\2\u0093\u0094\5\36\20\2\u0094\u0095\5\6\4\2\u0095"+
		"\u0096\5\34\17\2\u0096\u0099\3\2\2\2\u0097\u0099\5\36\20\2\u0098\u0093"+
		"\3\2\2\2\u0098\u0097\3\2\2\2\u0099\35\3\2\2\2\u009a\u00a0\5 \21\2\u009b"+
		"\u00a0\5\"\22\2\u009c\u00a0\5$\23\2\u009d\u00a0\5*\26\2\u009e\u00a0\5"+
		"&\24\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\37\3\2\2\2\u00a1\u00a2\7\22\2"+
		"\2\u00a2\u00a3\5,\27\2\u00a3\u00a4\5\6\4\2\u00a4\u00ad\5\f\7\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\5\6\4\2"+
		"\u00a9\u00aa\5\f\7\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b4\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\5"+
		"\f\7\2\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\13\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7\24\2"+
		"\2\u00b9\u00ba\5,\27\2\u00ba\u00bb\5\6\4\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd"+
		"\7\25\2\2\u00bd#\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\7\26\2\2\u00c0"+
		"\u00c1\5,\27\2\u00c1%\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3\u00c4\7\7\2\2"+
		"\u00c4\u00c5\5(\25\2\u00c5\u00c6\7\b\2\2\u00c6\'\3\2\2\2\u00c7\u00d1\3"+
		"\2\2\2\u00c8\u00cd\5,\27\2\u00c9\u00ca\7\n\2\2\u00ca\u00cc\5,\27\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00d6\5,\27\2"+
		"\u00d4\u00d6\7\27\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6+\3"+
		"\2\2\2\u00d7\u00d8\b\27\1\2\u00d8\u00ed\7\5\2\2\u00d9\u00ed\7\6\2\2\u00da"+
		"\u00ed\7\30\2\2\u00db\u00ed\7\31\2\2\u00dc\u00ed\5\30\r\2\u00dd\u00de"+
		"\7\32\2\2\u00de\u00df\7\f\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\7\r\2\2"+
		"\u00e1\u00e2\5\26\f\2\u00e2\u00ed\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5"+
		"\5,\27\2\u00e5\u00e6\7\b\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00ed\5&\24\2\u00e8"+
		"\u00e9\7&\2\2\u00e9\u00ed\5,\27\4\u00ea\u00eb\7\34\2\2\u00eb\u00ed\5,"+
		"\27\3\u00ec\u00d7\3\2\2\2\u00ec\u00d9\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec"+
		"\u00db\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e3\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u0114\3\2\2\2\u00ee\u00ef\f\20\2\2\u00ef\u00f0\7\33\2\2\u00f0\u0113\5"+
		",\27\21\u00f1\u00f2\f\17\2\2\u00f2\u00f3\7\34\2\2\u00f3\u0113\5,\27\20"+
		"\u00f4\u00f5\f\16\2\2\u00f5\u00f6\7\35\2\2\u00f6\u0113\5,\27\17\u00f7"+
		"\u00f8\f\r\2\2\u00f8\u00f9\7\36\2\2\u00f9\u0113\5,\27\16\u00fa\u00fb\f"+
		"\f\2\2\u00fb\u00fc\7\37\2\2\u00fc\u0113\5,\27\r\u00fd\u00fe\f\13\2\2\u00fe"+
		"\u00ff\7 \2\2\u00ff\u0113\5,\27\f\u0100\u0101\f\n\2\2\u0101\u0102\7!\2"+
		"\2\u0102\u0113\5,\27\13\u0103\u0104\f\t\2\2\u0104\u0105\7\"\2\2\u0105"+
		"\u0113\5,\27\n\u0106\u0107\f\b\2\2\u0107\u0108\7\26\2\2\u0108\u0113\5"+
		",\27\t\u0109\u010a\f\7\2\2\u010a\u010b\7#\2\2\u010b\u0113\5,\27\b\u010c"+
		"\u010d\f\6\2\2\u010d\u010e\7$\2\2\u010e\u0113\5,\27\7\u010f\u0110\f\5"+
		"\2\2\u0110\u0111\7%\2\2\u0111\u0113\5,\27\6\u0112\u00ee\3\2\2\2\u0112"+
		"\u00f1\3\2\2\2\u0112\u00f4\3\2\2\2\u0112\u00f7\3\2\2\2\u0112\u00fa\3\2"+
		"\2\2\u0112\u00fd\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u0103\3\2\2\2\u0112"+
		"\u0106\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010f\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"-\3\2\2\2\u0116\u0114\3\2\2\2\30\618?MU\\cgpt\u0080\u008c\u0098\u009f"+
		"\u00ad\u00b4\u00cd\u00d0\u00d5\u00ec\u0112\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}