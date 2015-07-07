package gerado;

// Generated from Desespero.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DesesperoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIM=2, IFDES=3, ELSE=4, WHILEDES=5, FORDES=6, DODES=7, INT=8, 
		STRING=9, DOUBLE=10, BOOL=11, BIN=12, HEXA=13, VOID=14, BREAK=15, SWITCHDES=16, 
		CASE=17, DEFAULTDES=18, MAIS=19, MENOS=20, MAIORQUE=21, MENORQUE=22, MAIOROUIGUAL=23, 
		MENOROUIGUAL=24, IDENTICO=25, DIFERENTE=26, AND=27, OR=28, AND2=29, OR2=30, 
		NOT=31, BITSHIFTRIGHT=32, BITSHIFTLEFT=33, BITAND=34, BITOR=35, BITXOR=36, 
		BITNOT=37, CONSTREAL=38, CONSTINTEIRO=39, CONSTBINARIO=40, CONSTHEXA=41, 
		CONSTSTRING=42, CONSTLOGICO=43, COMENTARIOLINHA=44, COMENTARIOMULTIPLO=45, 
		PONTO=46, IGUAL=47, PONTOEVIRGULA=48, VIRGULA=49, DOISPONTOS=50, COLCHETESABRE=51, 
		COLCHETESFECHA=52, CHAVESABRE=53, CHAVESFECHA=54, PARENTESEABRE=55, PARENTESEFECHA=56, 
		ID=57, RETORNO=58, WHITESPACE=59;
	public static final int
		RULE_prog = 0, RULE_funcoes = 1, RULE_parametros = 2, RULE_bloco = 3, 
		RULE_comandos = 4, RULE_retorno = 5, RULE_chamadaFuncao = 6, RULE_parametrosChamada = 7, 
		RULE_condicionais = 8, RULE_ifdes = 9, RULE_ifdeselse = 10, RULE_ifdeselseif = 11, 
		RULE_whiledes = 12, RULE_fordes = 13, RULE_dodes = 14, RULE_switchdes = 15, 
		RULE_switchCase = 16, RULE_defaultdes = 17, RULE_declaracoes = 18, RULE_multidimensional = 19, 
		RULE_declaracoesArray = 20, RULE_subArrayDeclaracoes = 21, RULE_atribuicoes = 22, 
		RULE_atribuicoesIncEDec = 23, RULE_tipoComVoid = 24, RULE_tipo = 25, RULE_expressao = 26, 
		RULE_operations = 27, RULE_op_rel = 28, RULE_op_neg = 29, RULE_op_bitwise = 30, 
		RULE_op_arit_baixa = 31, RULE_op_logica = 32, RULE_val_final = 33;
	public static final String[] ruleNames = {
		"prog", "funcoes", "parametros", "bloco", "comandos", "retorno", "chamadaFuncao", 
		"parametrosChamada", "condicionais", "ifdes", "ifdeselse", "ifdeselseif", 
		"whiledes", "fordes", "dodes", "switchdes", "switchCase", "defaultdes", 
		"declaracoes", "multidimensional", "declaracoesArray", "subArrayDeclaracoes", 
		"atribuicoes", "atribuicoesIncEDec", "tipoComVoid", "tipo", "expressao", 
		"operations", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", "op_logica", 
		"val_final"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CORRAM PARA AS COLINAS!!!'", "'VAMOS TODOS MORRER'", "'POR AQUI!!!'", 
		"'NAO, DROGA POR AQUI!!!'", "'CADE A SAIDA!!!'", "'NOS PERDEMOS DE NOVO...'", 
		"'CORRAM PARA AS COLINAS... DE NOVO'", "'TA TODO MUNDO INTEIRO?!?'", "'AONDE FICA A CADEIA?!?'", 
		"'NAO PODE SER REAL...'", "'ACHO QUE FOI UM FANTASMA!!!'", "'OU � VOCE OU EU !'", 
		"'ESTOU TROCANDO NUMEROS POR LETRAS'", "'ESTOU ME SENTINDO TAO VAZIO...'", 
		"'YOU SHALL NOT PASS!!!'", "'SALVEM-SE QUEM PUDER!!!'", "'AAAH!!'", "'AAAAAAAAAAAAH!!!!!'", 
		"'CARREGUE!!!'", "'DESCARREGUE!!!'", "'>;-;>'", "'<;-;<'", "'>;-;|'", 
		"'<;-;|'", "'|;-;|'", "'!;-;!'", "'JUNTOS CONSEGUIREMOS!!!'", "'CADA UM POR SI!!!'", 
		"'JUNTOS CONSEGUIREMOS!!! MAS SE DER MERDA NEM VOU CONTINUAR'", "'CADA UM POR SI!!! MAS SE DER MERDA NEM VOU CONTINUAR'", 
		"'NAAAAAO!!!'", "'CRIANCAS, AVANCAR!!!'", "'CRIANCAS, RECUAR!!!'", "'CRIANCAS, JUNTOS CONSEGUIREMOS!!!'", 
		"'CRIANCAS, CADA UM POR SI!!!'", "'CRIANCAS, SO UM SOBREVIVERA'", "'CRIANCAS, NAAAAAO!!!'", 
		null, null, null, null, null, "'(VIVO)|(MORTO)'", null, null, "'.'", "';-;'", 
		"';'", "','", "':'", "'AI'", "'AI!'", "'OUCH'", "'OUCH!'", "'UI'", "'UI!'", 
		null, "'VOLTEM!VOLTEM!VOLTEM!!!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "FIM", "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", 
		"INT", "STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "BREAK", "SWITCHDES", 
		"CASE", "DEFAULTDES", "MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", 
		"MENOROUIGUAL", "IDENTICO", "DIFERENTE", "AND", "OR", "AND2", "OR2", "NOT", 
		"BITSHIFTRIGHT", "BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", 
		"CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", 
		"CONSTLOGICO", "COMENTARIOLINHA", "COMENTARIOMULTIPLO", "PONTO", "IGUAL", 
		"PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", "COLCHETESABRE", "COLCHETESFECHA", 
		"CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ID", 
		"RETORNO", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "Desespero.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DesesperoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(DesesperoParser.INICIO, 0); }
		public TerminalNode CHAVESABRE() { return getToken(DesesperoParser.CHAVESABRE, 0); }
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(DesesperoParser.CHAVESFECHA, 0); }
		public TerminalNode FIM() { return getToken(DesesperoParser.FIM, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INICIO);
			setState(69);
			match(CHAVESABRE);
			setState(70);
			funcoes();
			setState(71);
			match(CHAVESFECHA);
			setState(72);
			match(FIM);
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

	public static class FuncoesContext extends ParserRuleContext {
		public TipoComVoidContext tipoComVoid() {
			return getRuleContext(TipoComVoidContext.class,0);
		}
		public TerminalNode ID() { return getToken(DesesperoParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID))) != 0)) {
				{
				setState(74);
				tipoComVoid();
				setState(75);
				match(ID);
				setState(76);
				match(PARENTESEABRE);
				setState(77);
				parametros();
				setState(78);
				match(PARENTESEFECHA);
				setState(79);
				bloco();
				setState(80);
				funcoes();
				}
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DesesperoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DesesperoParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DesesperoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DesesperoParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA))) != 0)) {
				{
				setState(84);
				tipo();
				setState(85);
				match(ID);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(86);
					match(VIRGULA);
					setState(87);
					tipo();
					setState(88);
					match(ID);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode CHAVESABRE() { return getToken(DesesperoParser.CHAVESABRE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(DesesperoParser.CHAVESFECHA, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(CHAVESABRE);
			setState(98);
			comandos();
			setState(99);
			match(CHAVESFECHA);
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
		public List<CondicionaisContext> condicionais() {
			return getRuleContexts(CondicionaisContext.class);
		}
		public CondicionaisContext condicionais(int i) {
			return getRuleContext(CondicionaisContext.class,i);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(DesesperoParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(DesesperoParser.PONTOEVIRGULA, i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public List<ChamadaFuncaoContext> chamadaFuncao() {
			return getRuleContexts(ChamadaFuncaoContext.class);
		}
		public ChamadaFuncaoContext chamadaFuncao(int i) {
			return getRuleContext(ChamadaFuncaoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IFDES) | (1L << WHILEDES) | (1L << FORDES) | (1L << DODES) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << SWITCHDES) | (1L << ID) | (1L << RETORNO))) != 0)) {
				{
				setState(110);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(101);
					condicionais();
					}
					break;
				case INT:
				case STRING:
				case DOUBLE:
				case BOOL:
				case BIN:
				case HEXA:
				case ID:
				case RETORNO:
					{
					{
					setState(106);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(102);
						retorno();
						}
						break;
					case 2:
						{
						setState(103);
						declaracoes();
						}
						break;
					case 3:
						{
						setState(104);
						atribuicoes();
						}
						break;
					case 4:
						{
						setState(105);
						chamadaFuncao();
						}
						break;
					}
					setState(108);
					match(PONTOEVIRGULA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(DesesperoParser.RETORNO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(RETORNO);
			setState(116);
			expressao();
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DesesperoParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(PARENTESEABRE);
			setState(120);
			parametrosChamada();
			setState(121);
			match(PARENTESEFECHA);
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

	public static class ParametrosChamadaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DesesperoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DesesperoParser.VIRGULA, i);
		}
		public ParametrosChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterParametrosChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitParametrosChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitParametrosChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT) | (1L << CONSTREAL) | (1L << CONSTINTEIRO) | (1L << CONSTSTRING) | (1L << CONSTLOGICO) | (1L << PARENTESEABRE) | (1L << ID))) != 0)) {
				{
				setState(123);
				expressao();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(124);
					match(VIRGULA);
					setState(125);
					expressao();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class CondicionaisContext extends ParserRuleContext {
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public WhiledesContext whiledes() {
			return getRuleContext(WhiledesContext.class,0);
		}
		public FordesContext fordes() {
			return getRuleContext(FordesContext.class,0);
		}
		public DodesContext dodes() {
			return getRuleContext(DodesContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(DesesperoParser.PONTOEVIRGULA, 0); }
		public SwitchdesContext switchdes() {
			return getRuleContext(SwitchdesContext.class,0);
		}
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterCondicionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitCondicionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitCondicionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionais);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				dodes();
				setState(137);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				switchdes();
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

	public static class IfdesContext extends ParserRuleContext {
		public TerminalNode IFDES() { return getToken(DesesperoParser.IFDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext ifdeselse() {
			return getRuleContext(IfdeselseContext.class,0);
		}
		public IfdeselseifContext ifdeselseif() {
			return getRuleContext(IfdeselseifContext.class,0);
		}
		public IfdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterIfdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitIfdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitIfdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IFDES);
			setState(143);
			match(PARENTESEABRE);
			setState(144);
			expressao();
			setState(145);
			match(PARENTESEFECHA);
			setState(146);
			bloco();
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(147);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(148);
				ifdeselseif();
				}
				break;
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

	public static class IfdeselseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DesesperoParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterIfdeselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitIfdeselse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitIfdeselse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseContext ifdeselse() throws RecognitionException {
		IfdeselseContext _localctx = new IfdeselseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ELSE);
			setState(152);
			bloco();
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

	public static class IfdeselseifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DesesperoParser.ELSE, 0); }
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public IfdeselseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterIfdeselseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitIfdeselseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitIfdeselseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseifContext ifdeselseif() throws RecognitionException {
		IfdeselseifContext _localctx = new IfdeselseifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ELSE);
			setState(155);
			ifdes();
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

	public static class WhiledesContext extends ParserRuleContext {
		public TerminalNode WHILEDES() { return getToken(DesesperoParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhiledesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterWhiledes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitWhiledes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitWhiledes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WHILEDES);
			setState(158);
			match(PARENTESEABRE);
			setState(159);
			expressao();
			setState(160);
			match(PARENTESEFECHA);
			setState(161);
			bloco();
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

	public static class FordesContext extends ParserRuleContext {
		public TerminalNode FORDES() { return getToken(DesesperoParser.FORDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(DesesperoParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(DesesperoParser.PONTOEVIRGULA, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public FordesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterFordes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitFordes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitFordes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FORDES);
			setState(164);
			match(PARENTESEABRE);
			setState(167);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
				{
				setState(165);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(166);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			match(PONTOEVIRGULA);
			setState(170);
			expressao();
			setState(171);
			match(PONTOEVIRGULA);
			setState(172);
			atribuicoes();
			setState(173);
			match(PARENTESEFECHA);
			setState(174);
			bloco();
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

	public static class DodesContext extends ParserRuleContext {
		public TerminalNode DODES() { return getToken(DesesperoParser.DODES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILEDES() { return getToken(DesesperoParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public DodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterDodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitDodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitDodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodesContext dodes() throws RecognitionException {
		DodesContext _localctx = new DodesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DODES);
			setState(177);
			bloco();
			setState(178);
			match(WHILEDES);
			setState(179);
			match(PARENTESEABRE);
			setState(180);
			expressao();
			setState(181);
			match(PARENTESEFECHA);
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

	public static class SwitchdesContext extends ParserRuleContext {
		public TerminalNode SWITCHDES() { return getToken(DesesperoParser.SWITCHDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public TerminalNode CHAVESABRE() { return getToken(DesesperoParser.CHAVESABRE, 0); }
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public DefaultdesContext defaultdes() {
			return getRuleContext(DefaultdesContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(DesesperoParser.CHAVESFECHA, 0); }
		public SwitchdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterSwitchdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitSwitchdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitSwitchdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SWITCHDES);
			setState(184);
			match(PARENTESEABRE);
			setState(185);
			expressao();
			setState(186);
			match(PARENTESEFECHA);
			setState(187);
			match(CHAVESABRE);
			setState(188);
			switchCase();
			setState(189);
			defaultdes();
			setState(190);
			match(CHAVESFECHA);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(DesesperoParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(DesesperoParser.CASE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(DesesperoParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(DesesperoParser.DOISPONTOS, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(DesesperoParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(DesesperoParser.BREAK, i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(192);
				match(CASE);
				setState(193);
				expressao();
				setState(194);
				match(DOISPONTOS);
				setState(195);
				comandos();
				setState(197);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(196);
					match(BREAK);
					}
				}

				}
				}
				setState(203);
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

	public static class DefaultdesContext extends ParserRuleContext {
		public TerminalNode DEFAULTDES() { return getToken(DesesperoParser.DEFAULTDES, 0); }
		public TerminalNode DOISPONTOS() { return getToken(DesesperoParser.DOISPONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(DesesperoParser.BREAK, 0); }
		public DefaultdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterDefaultdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitDefaultdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitDefaultdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(204);
				match(DEFAULTDES);
				setState(205);
				match(DOISPONTOS);
				setState(206);
				comandos();
				setState(208);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(207);
					match(BREAK);
					}
				}

				}
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(DesesperoParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(DesesperoParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public DeclaracoesArrayContext declaracoesArray() {
			return getRuleContext(DeclaracoesArrayContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			tipo();
			setState(213);
			match(ID);
			setState(221);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(214);
				match(IGUAL);
				setState(215);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(216);
				multidimensional();
				setState(219);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(217);
					match(IGUAL);
					setState(218);
					declaracoesArray();
					}
				}

				}
				}
				break;
			case PONTOEVIRGULA:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultidimensionalContext extends ParserRuleContext {
		public List<TerminalNode> COLCHETESABRE() { return getTokens(DesesperoParser.COLCHETESABRE); }
		public TerminalNode COLCHETESABRE(int i) {
			return getToken(DesesperoParser.COLCHETESABRE, i);
		}
		public List<TerminalNode> CONSTINTEIRO() { return getTokens(DesesperoParser.CONSTINTEIRO); }
		public TerminalNode CONSTINTEIRO(int i) {
			return getToken(DesesperoParser.CONSTINTEIRO, i);
		}
		public List<TerminalNode> COLCHETESFECHA() { return getTokens(DesesperoParser.COLCHETESFECHA); }
		public TerminalNode COLCHETESFECHA(int i) {
			return getToken(DesesperoParser.COLCHETESFECHA, i);
		}
		public MultidimensionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimensional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterMultidimensional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitMultidimensional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitMultidimensional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultidimensionalContext multidimensional() throws RecognitionException {
		MultidimensionalContext _localctx = new MultidimensionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(COLCHETESABRE);
				setState(224);
				match(CONSTINTEIRO);
				setState(225);
				match(COLCHETESFECHA);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLCHETESABRE );
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

	public static class DeclaracoesArrayContext extends ParserRuleContext {
		public List<TerminalNode> CHAVESABRE() { return getTokens(DesesperoParser.CHAVESABRE); }
		public TerminalNode CHAVESABRE(int i) {
			return getToken(DesesperoParser.CHAVESABRE, i);
		}
		public List<TerminalNode> CHAVESFECHA() { return getTokens(DesesperoParser.CHAVESFECHA); }
		public TerminalNode CHAVESFECHA(int i) {
			return getToken(DesesperoParser.CHAVESFECHA, i);
		}
		public List<SubArrayDeclaracoesContext> subArrayDeclaracoes() {
			return getRuleContexts(SubArrayDeclaracoesContext.class);
		}
		public SubArrayDeclaracoesContext subArrayDeclaracoes(int i) {
			return getRuleContext(SubArrayDeclaracoesContext.class,i);
		}
		public List<DeclaracoesArrayContext> declaracoesArray() {
			return getRuleContexts(DeclaracoesArrayContext.class);
		}
		public DeclaracoesArrayContext declaracoesArray(int i) {
			return getRuleContext(DeclaracoesArrayContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DesesperoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DesesperoParser.VIRGULA, i);
		}
		public DeclaracoesArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoesArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterDeclaracoesArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitDeclaracoesArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitDeclaracoesArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesArrayContext declaracoesArray() throws RecognitionException {
		DeclaracoesArrayContext _localctx = new DeclaracoesArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracoesArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(CHAVESABRE);
			setState(233);
			switch (_input.LA(1)) {
			case MENOS:
			case NOT:
			case BITNOT:
			case CONSTREAL:
			case CONSTINTEIRO:
			case CONSTSTRING:
			case CONSTLOGICO:
			case PARENTESEABRE:
			case ID:
				{
				setState(231);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(232);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(CHAVESFECHA);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(236);
				match(VIRGULA);
				setState(237);
				match(CHAVESABRE);
				setState(240);
				switch (_input.LA(1)) {
				case MENOS:
				case NOT:
				case BITNOT:
				case CONSTREAL:
				case CONSTINTEIRO:
				case CONSTSTRING:
				case CONSTLOGICO:
				case PARENTESEABRE:
				case ID:
					{
					setState(238);
					subArrayDeclaracoes();
					}
					break;
				case CHAVESABRE:
					{
					setState(239);
					declaracoesArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242);
				match(CHAVESFECHA);
				}
				}
				setState(248);
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

	public static class SubArrayDeclaracoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DesesperoParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DesesperoParser.VIRGULA, i);
		}
		public SubArrayDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subArrayDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterSubArrayDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitSubArrayDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitSubArrayDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubArrayDeclaracoesContext subArrayDeclaracoes() throws RecognitionException {
		SubArrayDeclaracoesContext _localctx = new SubArrayDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expressao();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(250);
				match(VIRGULA);
				setState(251);
				expressao();
				}
				}
				setState(256);
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

	public static class AtribuicoesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DesesperoParser.ID, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public AtribuicoesIncEDecContext atribuicoesIncEDec() {
			return getRuleContext(AtribuicoesIncEDecContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(DesesperoParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterAtribuicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitAtribuicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitAtribuicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesContext atribuicoes() throws RecognitionException {
		AtribuicoesContext _localctx = new AtribuicoesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(259);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(258);
				multidimensional();
				}
			}

			setState(264);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				{
				{
				setState(261);
				atribuicoesIncEDec();
				}
				}
				break;
			case IGUAL:
				{
				{
				setState(262);
				match(IGUAL);
				setState(263);
				expressao();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AtribuicoesIncEDecContext extends ParserRuleContext {
		public List<TerminalNode> MAIS() { return getTokens(DesesperoParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(DesesperoParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(DesesperoParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(DesesperoParser.MENOS, i);
		}
		public AtribuicoesIncEDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoesIncEDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterAtribuicoesIncEDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitAtribuicoesIncEDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitAtribuicoesIncEDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesIncEDecContext atribuicoesIncEDec() throws RecognitionException {
		AtribuicoesIncEDecContext _localctx = new AtribuicoesIncEDecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atribuicoesIncEDec);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(MAIS);
				setState(267);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(MENOS);
				setState(269);
				match(MENOS);
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

	public static class TipoComVoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(DesesperoParser.VOID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoComVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoComVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterTipoComVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitTipoComVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitTipoComVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoComVoidContext tipoComVoid() throws RecognitionException {
		TipoComVoidContext _localctx = new TipoComVoidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoComVoid);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DesesperoParser.INT, 0); }
		public TerminalNode STRING() { return getToken(DesesperoParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(DesesperoParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(DesesperoParser.BOOL, 0); }
		public TerminalNode BIN() { return getToken(DesesperoParser.BIN, 0); }
		public TerminalNode HEXA() { return getToken(DesesperoParser.HEXA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Val_finalContext> val_final() {
			return getRuleContexts(Val_finalContext.class);
		}
		public Val_finalContext val_final(int i) {
			return getRuleContext(Val_finalContext.class,i);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(278);
				op_neg();
				}
			}

			{
			setState(281);
			val_final();
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << AND2) | (1L << OR2) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(282);
				operations();
				}
				{
				setState(283);
				val_final();
				}
				}
				}
				setState(289);
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

	public static class OperationsContext extends ParserRuleContext {
		public Op_relContext op_rel() {
			return getRuleContext(Op_relContext.class,0);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public Op_bitwiseContext op_bitwise() {
			return getRuleContext(Op_bitwiseContext.class,0);
		}
		public Op_arit_baixaContext op_arit_baixa() {
			return getRuleContext(Op_arit_baixaContext.class,0);
		}
		public Op_logicaContext op_logica() {
			return getRuleContext(Op_logicaContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operations);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				op_logica();
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIORQUE() { return getToken(DesesperoParser.MAIORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(DesesperoParser.MENORQUE, 0); }
		public TerminalNode MAIOROUIGUAL() { return getToken(DesesperoParser.MAIOROUIGUAL, 0); }
		public TerminalNode MENOROUIGUAL() { return getToken(DesesperoParser.MENOROUIGUAL, 0); }
		public TerminalNode IDENTICO() { return getToken(DesesperoParser.IDENTICO, 0); }
		public TerminalNode DIFERENTE() { return getToken(DesesperoParser.DIFERENTE, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOp_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Op_negContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(DesesperoParser.MENOS, 0); }
		public TerminalNode BITNOT() { return getToken(DesesperoParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(DesesperoParser.NOT, 0); }
		public Op_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOp_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOp_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOp_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Op_bitwiseContext extends ParserRuleContext {
		public TerminalNode BITSHIFTLEFT() { return getToken(DesesperoParser.BITSHIFTLEFT, 0); }
		public TerminalNode BITSHIFTRIGHT() { return getToken(DesesperoParser.BITSHIFTRIGHT, 0); }
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOp_bitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOp_bitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOp_bitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==BITSHIFTRIGHT || _la==BITSHIFTLEFT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Op_arit_baixaContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(DesesperoParser.MAIS, 0); }
		public Op_arit_baixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit_baixa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOp_arit_baixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOp_arit_baixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOp_arit_baixa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_arit_baixaContext op_arit_baixa() throws RecognitionException {
		Op_arit_baixaContext _localctx = new Op_arit_baixaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_arit_baixa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(MAIS);
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

	public static class Op_logicaContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DesesperoParser.AND, 0); }
		public TerminalNode OR2() { return getToken(DesesperoParser.OR2, 0); }
		public TerminalNode NOT() { return getToken(DesesperoParser.NOT, 0); }
		public TerminalNode AND2() { return getToken(DesesperoParser.AND2, 0); }
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitOp_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitOp_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << AND2) | (1L << OR2) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Val_finalContext extends ParserRuleContext {
		public TerminalNode CONSTINTEIRO() { return getToken(DesesperoParser.CONSTINTEIRO, 0); }
		public TerminalNode CONSTSTRING() { return getToken(DesesperoParser.CONSTSTRING, 0); }
		public TerminalNode CONSTLOGICO() { return getToken(DesesperoParser.CONSTLOGICO, 0); }
		public TerminalNode CONSTREAL() { return getToken(DesesperoParser.CONSTREAL, 0); }
		public TerminalNode ID() { return getToken(DesesperoParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public TerminalNode PARENTESEABRE() { return getToken(DesesperoParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(DesesperoParser.PARENTESEFECHA, 0); }
		public Val_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).enterVal_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesesperoListener ) ((DesesperoListener)listener).exitVal_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesesperoVisitor ) return ((DesesperoVisitor<? extends T>)visitor).visitVal_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_finalContext val_final() throws RecognitionException {
		Val_finalContext _localctx = new Val_finalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_val_final);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(CONSTLOGICO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(CONSTREAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				match(ID);
				setState(314);
				multidimensional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				match(PARENTESEABRE);
				setState(316);
				expressao();
				setState(317);
				match(PARENTESEFECHA);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\5\4b\n\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\7\6q\n\6\f\6\16"+
		"\6t\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0081\n\t\f\t"+
		"\16\t\u0084\13\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00aa"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c8\n\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00d3\n\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00de\n\24\5\24\u00e0\n\24\3\25\3\25\3\25\6\25\u00e5\n\25"+
		"\r\25\16\25\u00e6\3\26\3\26\3\26\5\26\u00ec\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00f3\n\26\3\26\3\26\7\26\u00f7\n\26\f\26\16\26\u00fa\13\26\3"+
		"\27\3\27\3\27\7\27\u00ff\n\27\f\27\16\27\u0102\13\27\3\30\3\30\5\30\u0106"+
		"\n\30\3\30\3\30\3\30\5\30\u010b\n\30\3\31\3\31\3\31\3\31\5\31\u0111\n"+
		"\31\3\32\3\32\5\32\u0115\n\32\3\33\3\33\3\34\5\34\u011a\n\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0120\n\34\f\34\16\34\u0123\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u012a\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0142\n#\3#\2\2$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\n\17\3\2\27\34"+
		"\5\2\26\26!!\'\'\3\2\"#\4\2\35\35\37!\u014f\2F\3\2\2\2\4T\3\2\2\2\6a\3"+
		"\2\2\2\bc\3\2\2\2\nr\3\2\2\2\fu\3\2\2\2\16x\3\2\2\2\20\u0085\3\2\2\2\22"+
		"\u008e\3\2\2\2\24\u0090\3\2\2\2\26\u0099\3\2\2\2\30\u009c\3\2\2\2\32\u009f"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00b2\3\2\2\2 \u00b9\3\2\2\2\"\u00cb\3\2"+
		"\2\2$\u00d4\3\2\2\2&\u00d6\3\2\2\2(\u00e4\3\2\2\2*\u00e8\3\2\2\2,\u00fb"+
		"\3\2\2\2.\u0103\3\2\2\2\60\u0110\3\2\2\2\62\u0114\3\2\2\2\64\u0116\3\2"+
		"\2\2\66\u0119\3\2\2\28\u0129\3\2\2\2:\u012b\3\2\2\2<\u012d\3\2\2\2>\u012f"+
		"\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D\u0141\3\2\2\2FG\7\3\2\2GH\7\67"+
		"\2\2HI\5\4\3\2IJ\78\2\2JK\7\4\2\2K\3\3\2\2\2LM\5\62\32\2MN\7;\2\2NO\7"+
		"9\2\2OP\5\6\4\2PQ\7:\2\2QR\5\b\5\2RS\5\4\3\2SU\3\2\2\2TL\3\2\2\2TU\3\2"+
		"\2\2U\5\3\2\2\2VW\5\64\33\2W^\7;\2\2XY\7\63\2\2YZ\5\64\33\2Z[\7;\2\2["+
		"]\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aV\3\2\2\2ab\3\2\2\2b\7\3\2\2\2cd\7\67\2\2de\5\n\6\2ef\78\2\2f\t\3\2"+
		"\2\2gq\5\22\n\2hm\5\f\7\2im\5&\24\2jm\5.\30\2km\5\16\b\2lh\3\2\2\2li\3"+
		"\2\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7\62\2\2oq\3\2\2\2pg\3\2\2\2pl"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\13\3\2\2\2tr\3\2\2\2uv\7<\2\2"+
		"vw\5\66\34\2w\r\3\2\2\2xy\7;\2\2yz\79\2\2z{\5\20\t\2{|\7:\2\2|\17\3\2"+
		"\2\2}\u0082\5\66\34\2~\177\7\63\2\2\177\u0081\5\66\34\2\u0080~\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085}\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u008f\5\24\13\2\u0088\u008f\5\32\16\2\u0089\u008f\5"+
		"\34\17\2\u008a\u008b\5\36\20\2\u008b\u008c\7\62\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008f\5 \21\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f\23\3\2\2\2\u0090"+
		"\u0091\7\5\2\2\u0091\u0092\79\2\2\u0092\u0093\5\66\34\2\u0093\u0094\7"+
		":\2\2\u0094\u0097\5\b\5\2\u0095\u0098\5\26\f\2\u0096\u0098\5\30\r\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2\2"+
		"\2\u0099\u009a\7\6\2\2\u009a\u009b\5\b\5\2\u009b\27\3\2\2\2\u009c\u009d"+
		"\7\6\2\2\u009d\u009e\5\24\13\2\u009e\31\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0"+
		"\u00a1\79\2\2\u00a1\u00a2\5\66\34\2\u00a2\u00a3\7:\2\2\u00a3\u00a4\5\b"+
		"\5\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a9\79\2\2\u00a7\u00aa"+
		"\5&\24\2\u00a8\u00aa\5.\30\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\62\2\2\u00ac\u00ad\5\66\34\2\u00ad\u00ae"+
		"\7\62\2\2\u00ae\u00af\5.\30\2\u00af\u00b0\7:\2\2\u00b0\u00b1\5\b\5\2\u00b1"+
		"\35\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\7\7\2"+
		"\2\u00b5\u00b6\79\2\2\u00b6\u00b7\5\66\34\2\u00b7\u00b8\7:\2\2\u00b8\37"+
		"\3\2\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\79\2\2\u00bb\u00bc\5\66\34\2"+
		"\u00bc\u00bd\7:\2\2\u00bd\u00be\7\67\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0"+
		"\5$\23\2\u00c0\u00c1\78\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\23\2\2\u00c3"+
		"\u00c4\5\66\34\2\u00c4\u00c5\7\64\2\2\u00c5\u00c7\5\n\6\2\u00c6\u00c8"+
		"\7\21\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2"+
		"\u00c9\u00c2\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\24\2\2\u00cf"+
		"\u00d0\7\64\2\2\u00d0\u00d2\5\n\6\2\u00d1\u00d3\7\21\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00df\7;\2\2"+
		"\u00d8\u00d9\7\61\2\2\u00d9\u00e0\5\66\34\2\u00da\u00dd\5(\25\2\u00db"+
		"\u00dc\7\61\2\2\u00dc\u00de\5*\26\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\7\65\2\2\u00e2\u00e3\7)\2\2"+
		"\u00e3\u00e5\7\66\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00eb\7\67\2\2\u00e9"+
		"\u00ec\5,\27\2\u00ea\u00ec\5*\26\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f8\78\2\2\u00ee\u00ef\7\63\2\2\u00ef"+
		"\u00f2\7\67\2\2\u00f0\u00f3\5,\27\2\u00f1\u00f3\5*\26\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\78\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0100"+
		"\5\66\34\2\u00fc\u00fd\7\63\2\2\u00fd\u00ff\5\66\34\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"-\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7;\2\2\u0104\u0106\5(\25\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107\u010b\5\60"+
		"\31\2\u0108\u0109\7\61\2\2\u0109\u010b\5\66\34\2\u010a\u0107\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b/\3\2\2\2\u010c\u010d\7\25\2\2\u010d\u0111\7\25\2"+
		"\2\u010e\u010f\7\26\2\2\u010f\u0111\7\26\2\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\61\3\2\2\2\u0112\u0115\7\20\2\2\u0113\u0115\5\64"+
		"\33\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\63\3\2\2\2\u0116\u0117"+
		"\t\2\2\2\u0117\65\3\2\2\2\u0118\u011a\5<\37\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0121\5D#\2\u011c\u011d\58\35"+
		"\2\u011d\u011e\5D#\2\u011e\u0120\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\67\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u012a\5:\36\2\u0125\u012a\5<\37\2\u0126\u012a\5>"+
		" \2\u0127\u012a\5@!\2\u0128\u012a\5B\"\2\u0129\u0124\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"9\3\2\2\2\u012b\u012c\t\3\2\2\u012c;\3\2\2\2\u012d\u012e\t\4\2\2\u012e"+
		"=\3\2\2\2\u012f\u0130\t\5\2\2\u0130?\3\2\2\2\u0131\u0132\7\25\2\2\u0132"+
		"A\3\2\2\2\u0133\u0134\t\6\2\2\u0134C\3\2\2\2\u0135\u0142\7)\2\2\u0136"+
		"\u0142\7,\2\2\u0137\u0142\7-\2\2\u0138\u0142\7(\2\2\u0139\u0142\7;\2\2"+
		"\u013a\u0142\5\16\b\2\u013b\u013c\7;\2\2\u013c\u0142\5(\25\2\u013d\u013e"+
		"\79\2\2\u013e\u013f\5\66\34\2\u013f\u0140\7:\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u0135\3\2\2\2\u0141\u0136\3\2\2\2\u0141\u0137\3\2\2\2\u0141\u0138\3\2"+
		"\2\2\u0141\u0139\3\2\2\2\u0141\u013a\3\2\2\2\u0141\u013b\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0142E\3\2\2\2 T^alpr\u0082\u0085\u008e\u0097\u00a9\u00c7"+
		"\u00cb\u00d2\u00d4\u00dd\u00df\u00e6\u00eb\u00f2\u00f8\u0100\u0105\u010a"+
		"\u0110\u0114\u0119\u0121\u0129\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}