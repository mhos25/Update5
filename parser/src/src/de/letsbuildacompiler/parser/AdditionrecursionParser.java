// Generated from Additionrecursion.g4 by ANTLR 4.7.1
package src.de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdditionrecursionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		NUM=39, NEWLINE=40, IDENTIFIER=41, WHITESPACE=42, STRING=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_varDeclaration = 3, 
		RULE_varDeclarationList = 4, RULE_assignment = 5, RULE_println = 6, RULE_print = 7, 
		RULE_branch = 8, RULE_do_while = 9, RULE_while_statement = 10, RULE_block = 11, 
		RULE_userInput = 12, RULE_incrementation = 13, RULE_decrement = 14, RULE_forLoop = 15, 
		RULE_forInitialization = 16, RULE_forChange = 17, RULE_booleanVarDeclaration = 18, 
		RULE_booleanVarAssignment = 19, RULE_booleanValue = 20, RULE_inverseBoolean = 21, 
		RULE_charArray = 22, RULE_arrayAssignment = 23;
	public static final String[] ruleNames = {
		"program", "statement", "expression", "varDeclaration", "varDeclarationList", 
		"assignment", "println", "print", "branch", "do_while", "while_statement", 
		"block", "userInput", "incrementation", "decrement", "forLoop", "forInitialization", 
		"forChange", "booleanVarDeclaration", "booleanVarAssignment", "booleanValue", 
		"inverseBoolean", "charArray", "arrayAssignment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", 
		"'&&'", "'||'", "'int'", "'='", "','", "'println('", "')'", "'print('", 
		"'if'", "'('", "'else'", "'do'", "'while'", "'{'", "'}'", "'UserInputReader.readInt()'", 
		"'UserInputReader.readChar()'", "'++'", "'--'", "'for'", "'boolean'", 
		"'true'", "'false'", "'!'", "'char'", "'[]'", "'new'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NUM", "NEWLINE", "IDENTIFIER", "WHITESPACE", "STRING"
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
	public String getGrammarFileName() { return "Additionrecursion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdditionrecursionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << IDENTIFIER))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BooleanVarDeclarationContext booleanVarDeclaration() {
			return getRuleContext(BooleanVarDeclarationContext.class,0);
		}
		public BooleanVarAssignmentContext booleanVarAssignment() {
			return getRuleContext(BooleanVarAssignmentContext.class,0);
		}
		public CharArrayContext charArray() {
			return getRuleContext(CharArrayContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				println();
				setState(54);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				print();
				setState(57);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				varDeclarationList(0);
				setState(60);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				varDeclaration();
				setState(63);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				assignment();
				setState(66);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				branch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				do_while();
				setState(70);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				incrementation();
				setState(74);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				decrement();
				setState(77);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(79);
				forLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(80);
				booleanVarDeclaration();
				setState(81);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(83);
				booleanVarAssignment();
				setState(84);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(86);
				charArray();
				setState(87);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(89);
				arrayAssignment();
				setState(90);
				match(T__0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InverseBoolContext extends ExpressionContext {
		public InverseBooleanContext inverseBoolean() {
			return getRuleContext(InverseBooleanContext.class,0);
		}
		public InverseBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInverseBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUM() { return getToken(AdditionrecursionParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95);
				((NumberContext)_localctx).number = match(NUM);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case T__32:
				{
				_localctx = new InverseBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				inverseBoolean();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(102);
						match(T__1);
						setState(103);
						((DivContext)_localctx).rght = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(105);
						match(T__2);
						setState(106);
						((MultContext)_localctx).rght = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(108);
						match(T__3);
						setState(109);
						((MinusContext)_localctx).rght = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(111);
						match(T__4);
						setState(112);
						((PlusContext)_localctx).rght = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(114);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						((RelationalContext)_localctx).rght = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						match(T__9);
						setState(118);
						((AndContext)_localctx).rght = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						match(T__10);
						setState(121);
						((OrContext)_localctx).rght = expression(6);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationAndAssignmentContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationAndAssignmentContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ListDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__11);
				setState(128);
				((VarDeclarationAndAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(129);
				match(T__12);
				setState(130);
				((VarDeclarationAndAssignmentContext)_localctx).exp = expression(0);
				}
				break;
			case 2:
				_localctx = new SimpleVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__11);
				setState(132);
				((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__13);
				setState(134);
				((ListDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		return varDeclarationList(0);
	}

	private VarDeclarationListContext varDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, _parentState);
		VarDeclarationListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_varDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			varDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclarationList);
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141);
					varDeclaration();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputVarContext extends AssignmentContext {
		public Token varName;
		public UserInputContext input;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public InputVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectVarAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DirectVarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDirectVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DirectVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((DirectVarAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(148);
				match(T__12);
				setState(149);
				((DirectVarAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new InputVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				((InputVarContext)_localctx).varName = match(IDENTIFIER);
				setState(151);
				match(T__12);
				setState(152);
				((InputVarContext)_localctx).input = userInput();
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

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementAndVariableContext extends PrintlnContext {
		public Token txt;
		public Token varName;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public PrintStatementAndVariableContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrintStatementAndVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePrintStatementContext extends PrintlnContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplePrintStatementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimplePrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintStatementAndVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__14);
				setState(156);
				((PrintStatementAndVariableContext)_localctx).txt = match(STRING);
				setState(157);
				match(T__4);
				setState(158);
				((PrintStatementAndVariableContext)_localctx).varName = match(IDENTIFIER);
				setState(159);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new SimplePrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__14);
				setState(161);
				((SimplePrintStatementContext)_localctx).argument = expression(0);
				setState(162);
				match(T__15);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__16);
			setState(167);
			((PrintContext)_localctx).argument = expression(0);
			setState(168);
			match(T__15);
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

	public static class BranchContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__17);
			setState(171);
			match(T__18);
			setState(172);
			((BranchContext)_localctx).condition = expression(0);
			setState(173);
			match(T__15);
			setState(174);
			((BranchContext)_localctx).onTrue = block();
			setState(175);
			match(T__19);
			setState(176);
			((BranchContext)_localctx).onFalse = block();
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

	public static class Do_whileContext extends ParserRuleContext {
		public BlockContext loop;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__20);
			setState(179);
			((Do_whileContext)_localctx).loop = block();
			setState(180);
			match(T__21);
			setState(181);
			match(T__18);
			setState(182);
			((Do_whileContext)_localctx).condition = expression(0);
			setState(183);
			match(T__15);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext loopCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__21);
			setState(186);
			match(T__18);
			setState(187);
			((While_statementContext)_localctx).condition = expression(0);
			setState(188);
			match(T__15);
			setState(189);
			((While_statementContext)_localctx).loopCondition = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__22);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__23);
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

	public static class UserInputContext extends ParserRuleContext {
		public UserInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputContext userInput() throws RecognitionException {
		UserInputContext _localctx = new UserInputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_userInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	public static class IncrementationContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public IncrementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitIncrementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementationContext incrementation() throws RecognitionException {
		IncrementationContext _localctx = new IncrementationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incrementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((IncrementationContext)_localctx).varName = match(IDENTIFIER);
			setState(203);
			match(T__26);
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

	public static class DecrementContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((DecrementContext)_localctx).varName = match(IDENTIFIER);
			setState(206);
			match(T__27);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForInitializationContext initialization;
		public ExpressionContext condition;
		public ForChangeContext change;
		public BlockContext loopCondition;
		public ForInitializationContext forInitialization() {
			return getRuleContext(ForInitializationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForChangeContext forChange() {
			return getRuleContext(ForChangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__28);
			setState(209);
			match(T__18);
			setState(210);
			((ForLoopContext)_localctx).initialization = forInitialization();
			setState(211);
			match(T__0);
			setState(212);
			((ForLoopContext)_localctx).condition = expression(0);
			setState(213);
			match(T__0);
			setState(214);
			((ForLoopContext)_localctx).change = forChange();
			setState(215);
			match(T__15);
			setState(216);
			((ForLoopContext)_localctx).loopCondition = block();
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

	public static class ForInitializationContext extends ParserRuleContext {
		public ForInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitialization; }
	 
		public ForInitializationContext() { }
		public void copyFrom(ForInitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVariable_ForContext extends ForInitializationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclareVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDeclareVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariable_ForContext extends ForInitializationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAssignVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializationContext forInitialization() throws RecognitionException {
		ForInitializationContext _localctx = new ForInitializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forInitialization);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
				_localctx = new DeclareVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				varDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				assignment();
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

	public static class ForChangeContext extends ParserRuleContext {
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForChangeContext forChange() throws RecognitionException {
		ForChangeContext _localctx = new ForChangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forChange);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				incrementation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				decrement();
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

	public static class BooleanVarDeclarationContext extends ParserRuleContext {
		public BooleanVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVarDeclaration; }
	 
		public BooleanVarDeclarationContext() { }
		public void copyFrom(BooleanVarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleBooleanVariableDeclarationContext extends BooleanVarDeclarationContext {
		public Token variableName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public SimpleBooleanVariableDeclarationContext(BooleanVarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleBooleanVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableDeclarationAndAssignmentContext extends BooleanVarDeclarationContext {
		public Token variableName;
		public BooleanValueContext value;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanVariableDeclarationAndAssignmentContext(BooleanVarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBooleanVariableDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanVarDeclarationContext booleanVarDeclaration() throws RecognitionException {
		BooleanVarDeclarationContext _localctx = new BooleanVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanVarDeclaration);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SimpleBooleanVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__29);
				setState(227);
				((SimpleBooleanVariableDeclarationContext)_localctx).variableName = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new BooleanVariableDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__29);
				setState(229);
				((BooleanVariableDeclarationAndAssignmentContext)_localctx).variableName = match(IDENTIFIER);
				setState(230);
				match(T__12);
				setState(231);
				((BooleanVariableDeclarationAndAssignmentContext)_localctx).value = booleanValue();
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

	public static class BooleanVarAssignmentContext extends ParserRuleContext {
		public Token variableName;
		public BooleanValueContext value;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanVarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVarAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBooleanVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanVarAssignmentContext booleanVarAssignment() throws RecognitionException {
		BooleanVarAssignmentContext _localctx = new BooleanVarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((BooleanVarAssignmentContext)_localctx).variableName = match(IDENTIFIER);
			setState(235);
			match(T__12);
			setState(236);
			((BooleanVarAssignmentContext)_localctx).value = booleanValue();
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	 
		public BooleanValueContext() { }
		public void copyFrom(BooleanValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueContext extends BooleanValueContext {
		public TrueContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends BooleanValueContext {
		public FalseContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanValue);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__31);
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

	public static class InverseBooleanContext extends ParserRuleContext {
		public Token variableName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public InverseBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseBoolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInverseBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseBooleanContext inverseBoolean() throws RecognitionException {
		InverseBooleanContext _localctx = new InverseBooleanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inverseBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__32);
			setState(243);
			((InverseBooleanContext)_localctx).variableName = match(IDENTIFIER);
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

	public static class CharArrayContext extends ParserRuleContext {
		public Token arrayName;
		public Token varName;
		public List<TerminalNode> IDENTIFIER() { return getTokens(AdditionrecursionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AdditionrecursionParser.IDENTIFIER, i);
		}
		public CharArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitCharArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrayContext charArray() throws RecognitionException {
		CharArrayContext _localctx = new CharArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_charArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__33);
			setState(246);
			match(T__34);
			setState(247);
			((CharArrayContext)_localctx).arrayName = match(IDENTIFIER);
			setState(248);
			match(T__12);
			setState(249);
			match(T__35);
			setState(250);
			match(T__33);
			setState(251);
			match(T__36);
			setState(252);
			((CharArrayContext)_localctx).varName = match(IDENTIFIER);
			setState(253);
			match(T__37);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public Token arrayName;
		public ExpressionContext number;
		public UserInputContext InputCharacter;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			((ArrayAssignmentContext)_localctx).arrayName = match(IDENTIFIER);
			setState(256);
			match(T__36);
			setState(257);
			((ArrayAssignmentContext)_localctx).number = expression(0);
			setState(258);
			match(T__37);
			setState(259);
			match(T__12);
			setState(260);
			((ArrayAssignmentContext)_localctx).InputCharacter = userInput();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return varDeclarationList_sempred((VarDeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean varDeclarationList_sempred(VarDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f"+
		"\6\16\6\u0094\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\5\22\u00df\n\22\3\23\3\23\5\23\u00e3\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u00f3\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\4\6\n\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2\b\13\3\2\33\34\2\u0113\2"+
		"\63\3\2\2\2\4^\3\2\2\2\6e\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u009b"+
		"\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8\3\2\2\2\22\u00ac\3\2\2\2\24\u00b4\3"+
		"\2\2\2\26\u00bb\3\2\2\2\30\u00c1\3\2\2\2\32\u00ca\3\2\2\2\34\u00cc\3\2"+
		"\2\2\36\u00cf\3\2\2\2 \u00d2\3\2\2\2\"\u00de\3\2\2\2$\u00e2\3\2\2\2&\u00ea"+
		"\3\2\2\2(\u00ec\3\2\2\2*\u00f2\3\2\2\2,\u00f4\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u0101\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\3\3\2\2\2\678\5\16\b\289\7\3\2\29_\3\2\2\2:;\5\20\t"+
		"\2;<\7\3\2\2<_\3\2\2\2=>\5\n\6\2>?\7\3\2\2?_\3\2\2\2@A\5\b\5\2AB\7\3\2"+
		"\2B_\3\2\2\2CD\5\f\7\2DE\7\3\2\2E_\3\2\2\2F_\5\22\n\2GH\5\24\13\2HI\7"+
		"\3\2\2I_\3\2\2\2J_\5\26\f\2KL\5\34\17\2LM\7\3\2\2M_\3\2\2\2NO\5\36\20"+
		"\2OP\7\3\2\2P_\3\2\2\2Q_\5 \21\2RS\5&\24\2ST\7\3\2\2T_\3\2\2\2UV\5(\25"+
		"\2VW\7\3\2\2W_\3\2\2\2XY\5.\30\2YZ\7\3\2\2Z_\3\2\2\2[\\\5\60\31\2\\]\7"+
		"\3\2\2]_\3\2\2\2^\67\3\2\2\2^:\3\2\2\2^=\3\2\2\2^@\3\2\2\2^C\3\2\2\2^"+
		"F\3\2\2\2^G\3\2\2\2^J\3\2\2\2^K\3\2\2\2^N\3\2\2\2^Q\3\2\2\2^R\3\2\2\2"+
		"^U\3\2\2\2^X\3\2\2\2^[\3\2\2\2_\5\3\2\2\2`a\b\4\1\2af\7)\2\2bf\7-\2\2"+
		"cf\7+\2\2df\5,\27\2e`\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f~\3\2\2\2"+
		"gh\f\r\2\2hi\7\4\2\2i}\5\6\4\16jk\f\f\2\2kl\7\5\2\2l}\5\6\4\rmn\f\13\2"+
		"\2no\7\6\2\2o}\5\6\4\fpq\f\n\2\2qr\7\7\2\2r}\5\6\4\13st\f\t\2\2tu\t\2"+
		"\2\2u}\5\6\4\nvw\f\b\2\2wx\7\f\2\2x}\5\6\4\tyz\f\7\2\2z{\7\r\2\2{}\5\6"+
		"\4\b|g\3\2\2\2|j\3\2\2\2|m\3\2\2\2|p\3\2\2\2|s\3\2\2\2|v\3\2\2\2|y\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\7\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0082\7\16\2\2\u0082\u0083\7+\2\2\u0083\u0084\7\17\2\2\u0084"+
		"\u008a\5\6\4\2\u0085\u0086\7\16\2\2\u0086\u008a\7+\2\2\u0087\u0088\7\20"+
		"\2\2\u0088\u008a\7+\2\2\u0089\u0081\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c\b\6\1\2\u008c\u008d\5\b\5\2"+
		"\u008d\u0092\3\2\2\2\u008e\u008f\f\4\2\2\u008f\u0091\5\b\5\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\13\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7+\2\2\u0096\u0097\7\17\2"+
		"\2\u0097\u009c\5\6\4\2\u0098\u0099\7+\2\2\u0099\u009a\7\17\2\2\u009a\u009c"+
		"\5\32\16\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\r\3\2\2\2\u009d"+
		"\u009e\7\21\2\2\u009e\u009f\7-\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\7+"+
		"\2\2\u00a1\u00a7\7\22\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\5\6\4\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a2\3"+
		"\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\5\6\4\2\u00aa"+
		"\u00ab\7\22\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00ae\7\25"+
		"\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\5\30\r\2\u00b1"+
		"\u00b2\7\26\2\2\u00b2\u00b3\5\30\r\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\27"+
		"\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\7\25\2\2\u00b8"+
		"\u00b9\5\6\4\2\u00b9\u00ba\7\22\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\7\30"+
		"\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7\22\2\2\u00bf"+
		"\u00c0\5\30\r\2\u00c0\27\3\2\2\2\u00c1\u00c5\7\31\2\2\u00c2\u00c4\5\4"+
		"\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\32"+
		"\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\33\3\2\2\2\u00cc\u00cd"+
		"\7+\2\2\u00cd\u00ce\7\35\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0"+
		"\u00d1\7\36\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\7\25"+
		"\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\3\2\2\u00d6\u00d7\5\6\4\2\u00d7"+
		"\u00d8\7\3\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\22\2\2\u00da\u00db\5"+
		"\30\r\2\u00db!\3\2\2\2\u00dc\u00df\5\b\5\2\u00dd\u00df\5\f\7\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df#\3\2\2\2\u00e0\u00e3\5\34\17\2\u00e1"+
		"\u00e3\5\36\20\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3%\3\2\2"+
		"\2\u00e4\u00e5\7 \2\2\u00e5\u00eb\7+\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8"+
		"\7+\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00eb\5*\26\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\7\17\2\2"+
		"\u00ee\u00ef\5*\26\2\u00ef)\3\2\2\2\u00f0\u00f3\7!\2\2\u00f1\u00f3\7\""+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00f5"+
		"\7#\2\2\u00f5\u00f6\7+\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8\u00f9"+
		"\7%\2\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\7\17\2\2\u00fb\u00fc\7&\2\2\u00fc"+
		"\u00fd\7$\2\2\u00fd\u00fe\7\'\2\2\u00fe\u00ff\7+\2\2\u00ff\u0100\7(\2"+
		"\2\u0100/\3\2\2\2\u0101\u0102\7+\2\2\u0102\u0103\7\'\2\2\u0103\u0104\5"+
		"\6\4\2\u0104\u0105\7(\2\2\u0105\u0106\7\17\2\2\u0106\u0107\5\32\16\2\u0107"+
		"\61\3\2\2\2\20\65^e|~\u0089\u0092\u009b\u00a6\u00c5\u00de\u00e2\u00ea"+
		"\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}