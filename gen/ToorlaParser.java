// Generated from /home/hadi/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

	import toorla.ast.Program;
	import toorla.ast.Tree;
	import toorla.ast.declaration.classDecs.*;
	import toorla.ast.declaration.classDecs.classMembersDecs.*;
	import toorla.ast.declaration.localVarDecs.*;
	import toorla.ast.expression.*;
	import toorla.ast.expression.binaryExpression.*;
	import toorla.ast.expression.unaryExpression.*;
	import toorla.ast.expression.value.*;
	import toorla.ast.statement.*;
	import toorla.ast.statement.localVarStats.*;
	import toorla.ast.statement.returnStatement.*;
	import toorla.types.*;
	import toorla.types.singleType.*;
	import toorla.types.arrayType.*;
	import java.util.List;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToorlaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, CONST_NUM=50, CONST_STR=51, NL=52, 
		ID=53, COMMENT=54, MULTILINE_COMMENT=55, WS=56;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_entryClassDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_access_modifier = 4, RULE_methodDeclaration = 5, 
		RULE_closedStatement = 6, RULE_closedConditional = 7, RULE_openConditional = 8, 
		RULE_openStatement = 9, RULE_statement = 10, RULE_statementVarDef = 11, 
		RULE_statementBlock = 12, RULE_statementContinue = 13, RULE_statementBreak = 14, 
		RULE_statementReturn = 15, RULE_statementClosedLoop = 16, RULE_statementOpenLoop = 17, 
		RULE_statementWrite = 18, RULE_statementAssignment = 19, RULE_statementInc = 20, 
		RULE_statementDec = 21, RULE_expression = 22, RULE_expressionOr = 23, 
		RULE_expressionOrTemp = 24, RULE_expressionAnd = 25, RULE_expressionAndTemp = 26, 
		RULE_expressionEq = 27, RULE_expressionEqTemp = 28, RULE_expressionCmp = 29, 
		RULE_expressionCmpTemp = 30, RULE_expressionAdd = 31, RULE_expressionAddTemp = 32, 
		RULE_expressionMultMod = 33, RULE_expressionMultModTemp = 34, RULE_expressionUnary = 35, 
		RULE_expressionMethods = 36, RULE_expressionMethodsTemp = 37, RULE_expressionOther = 38, 
		RULE_toorlaType = 39, RULE_singleType = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "entryClassDeclaration", "fieldDeclaration", 
			"access_modifier", "methodDeclaration", "closedStatement", "closedConditional", 
			"openConditional", "openStatement", "statement", "statementVarDef", "statementBlock", 
			"statementContinue", "statementBreak", "statementReturn", "statementClosedLoop", 
			"statementOpenLoop", "statementWrite", "statementAssignment", "statementInc", 
			"statementDec", "expression", "expressionOr", "expressionOrTemp", "expressionAnd", 
			"expressionAndTemp", "expressionEq", "expressionEqTemp", "expressionCmp", 
			"expressionCmpTemp", "expressionAdd", "expressionAddTemp", "expressionMultMod", 
			"expressionMultModTemp", "expressionUnary", "expressionMethods", "expressionMethodsTemp", 
			"expressionOther", "toorlaType", "singleType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "':'", "'end'", "'entry'", "'field'", 
			"','", "';'", "'public'", "'private'", "'function'", "'('", "')'", "'returns'", 
			"'if'", "'elif'", "'else'", "'var'", "'='", "'begin'", "'continue'", 
			"'break'", "'return'", "'while'", "'print'", "'++'", "'--'", "'||'", 
			"'&&'", "'=='", "'<>'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'.'", "'['", "']'", "'new'", "'self'", "'true'", "'false'", "'int'", 
			"'bool'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", "MULTILINE_COMMENT", 
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
	public String getGrammarFileName() { return "Toorla.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void setNodePosition( Tree node , int line , int col )
	    {
	        if( node != null )
	        {
	            node.line = line;
	            node.col = col;
	        }
	    }

	public ToorlaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program mProgram;
		public ClassDeclarationContext c1;
		public EntryClassDeclarationContext c2;
		public ClassDeclarationContext c3;
		public TerminalNode EOF() { return getToken(ToorlaParser.EOF, 0); }
		public EntryClassDeclarationContext entryClassDeclaration() {
			return getRuleContext(EntryClassDeclarationContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitProgram(this);
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
			((ProgramContext)_localctx).mProgram = new Program();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(83);
				((ProgramContext)_localctx).c1 = classDeclaration( false );
				_localctx.mProgram.addClass(((ProgramContext)_localctx).c1.mClass);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			((ProgramContext)_localctx).c2 = entryClassDeclaration();
			_localctx.mProgram.addClass(((ProgramContext)_localctx).c2.mClass);
				
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(93);
				((ProgramContext)_localctx).c3 = classDeclaration( false );
				_localctx.mProgram.addClass(((ProgramContext)_localctx).c3.mClass);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public boolean isEntry;
		public ClassDeclaration mClass;
		public Token n;
		public Token p;
		public FieldDeclarationContext f;
		public MethodDeclarationContext m;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState, boolean isEntry) {
			super(parent, invokingState);
			this.isEntry = isEntry;
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration(boolean isEntry) throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState(), isEntry);
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			((ClassDeclarationContext)_localctx).n = match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(105);
				match(T__1);
				setState(106);
				((ClassDeclarationContext)_localctx).p = match(ID);
				}
			}

			setState(109);
			match(T__2);

				    Identifier className = new Identifier( (((ClassDeclarationContext)_localctx).n!=null?((ClassDeclarationContext)_localctx).n.getText():null) );
				    Identifier parentName = new Identifier(null);
			        setNodePosition( className , ((ClassDeclarationContext)_localctx).n.getLine() , ((ClassDeclarationContext)_localctx).n.getCharPositionInLine() );
			        if( ((ClassDeclarationContext)_localctx).p != null && (((ClassDeclarationContext)_localctx).p!=null?((ClassDeclarationContext)_localctx).p.getText():null) != null )
			        {
			            parentName = new Identifier((((ClassDeclarationContext)_localctx).p!=null?((ClassDeclarationContext)_localctx).p.getText():null));
			            setNodePosition( parentName , ((ClassDeclarationContext)_localctx).p.getLine() , ((ClassDeclarationContext)_localctx).p.getCharPositionInLine() );
			        }
				    if( isEntry )
				        ((ClassDeclarationContext)_localctx).mClass = new EntryClassDeclaration( className , parentName );
			        else
			            ((ClassDeclarationContext)_localctx).mClass = new ClassDeclaration( className , parentName );
				
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(111);
					((ClassDeclarationContext)_localctx).f = fieldDeclaration();

							    _localctx.mClass.addFieldsDeclarations(((ClassDeclarationContext)_localctx).f.mFields);
							
					}
					break;
				case 2:
					{
					setState(114);
					((ClassDeclarationContext)_localctx).m = methodDeclaration();

							    _localctx.mClass.addMethodDeclaration(((ClassDeclarationContext)_localctx).m.mMethod);
							
					}
					break;
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__3);
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

	public static class EntryClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration mClass;
		public ClassDeclarationContext c;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EntryClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterEntryClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitEntryClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitEntryClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryClassDeclarationContext entryClassDeclaration() throws RecognitionException {
		EntryClassDeclarationContext _localctx = new EntryClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entryClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124);
			match(T__4);
			}
			setState(125);
			((EntryClassDeclarationContext)_localctx).c = classDeclaration( true );

				    ((EntryClassDeclarationContext)_localctx).mClass = ((EntryClassDeclarationContext)_localctx).c.mClass;
				
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> mFields;
		public AccessModifier access;
		public Access_modifierContext a;
		public Token i;
		public Token ii;
		public ToorlaTypeContext t;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public ToorlaTypeContext toorlaType() {
			return getRuleContext(ToorlaTypeContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((FieldDeclarationContext)_localctx).mFields = new ArrayList<>();
				
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(129);
				((FieldDeclarationContext)_localctx).a = access_modifier();

					    ((FieldDeclarationContext)_localctx).access = ((FieldDeclarationContext)_localctx).a.mAccess;
					
				}
			}

			setState(134);
			match(T__5);
			setState(135);
			((FieldDeclarationContext)_localctx).i = match(ID);

				    Identifier fieldName = new Identifier((((FieldDeclarationContext)_localctx).i!=null?((FieldDeclarationContext)_localctx).i.getText():null));
				    setNodePosition( fieldName , ((FieldDeclarationContext)_localctx).i.getLine() , ((FieldDeclarationContext)_localctx).i.getCharPositionInLine() );
				    FieldDeclaration fieldDecl = new FieldDeclaration( fieldName );
				    setNodePosition( fieldDecl , ((FieldDeclarationContext)_localctx).i.getLine() , ((FieldDeclarationContext)_localctx).i.getCharPositionInLine() );
				    _localctx.mFields.add( fieldDecl );
				
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(137);
				match(T__6);
				setState(138);
				((FieldDeclarationContext)_localctx).ii = match(ID);

						    fieldName = new Identifier((((FieldDeclarationContext)_localctx).ii!=null?((FieldDeclarationContext)_localctx).ii.getText():null));
				            setNodePosition( fieldName , ((FieldDeclarationContext)_localctx).ii.getLine() , ((FieldDeclarationContext)_localctx).ii.getCharPositionInLine() );
				            fieldDecl = new FieldDeclaration( fieldName );
				            setNodePosition( fieldDecl , ((FieldDeclarationContext)_localctx).ii.getLine() , ((FieldDeclarationContext)_localctx).ii.getCharPositionInLine() );
				            _localctx.mFields.add( fieldDecl );
						
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			((FieldDeclarationContext)_localctx).t = toorlaType();
			setState(146);
			match(T__7);

				    for(FieldDeclaration field:_localctx.mFields)
				    {
				        field.setType(((FieldDeclarationContext)_localctx).t.mType);
				        if( _localctx.access != null )
				            field.setAccessModifier(_localctx.access);
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

	public static class Access_modifierContext extends ParserRuleContext {
		public AccessModifier mAccess;
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_access_modifier);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__8);

					    ((Access_modifierContext)_localctx).mAccess = AccessModifier.ACCESS_MODIFIER_PUBLIC;
					
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__9);

					    ((Access_modifierContext)_localctx).mAccess = AccessModifier.ACCESS_MODIFIER_PRIVATE;
					
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration mMethod;
		public AccessModifier access;
		public Access_modifierContext a;
		public Token i;
		public Token i1;
		public ToorlaTypeContext t1;
		public Token i2;
		public ToorlaTypeContext t2;
		public ToorlaTypeContext t;
		public StatementContext s;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ToorlaTypeContext> toorlaType() {
			return getRuleContexts(ToorlaTypeContext.class);
		}
		public ToorlaTypeContext toorlaType(int i) {
			return getRuleContext(ToorlaTypeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(155);
				((MethodDeclarationContext)_localctx).a = access_modifier();

					        ((MethodDeclarationContext)_localctx).access = ((MethodDeclarationContext)_localctx).a.mAccess;
					    
				}
			}

			setState(160);
			match(T__10);
			setState(161);
			((MethodDeclarationContext)_localctx).i = match(ID);

				        Identifier methodName = new Identifier((((MethodDeclarationContext)_localctx).i!=null?((MethodDeclarationContext)_localctx).i.getText():null));
				        setNodePosition( methodName , ((MethodDeclarationContext)_localctx).i.getLine() , ((MethodDeclarationContext)_localctx).i.getCharPositionInLine() );
				        ((MethodDeclarationContext)_localctx).mMethod = new MethodDeclaration( methodName );
					
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(163);
				match(T__11);
				setState(164);
				match(T__12);
				}
				break;
			case 2:
				{
				{
				setState(165);
				match(T__11);
				setState(166);
				((MethodDeclarationContext)_localctx).i1 = match(ID);
				setState(167);
				match(T__2);
				setState(168);
				((MethodDeclarationContext)_localctx).t1 = toorlaType();

							    Identifier parameterName = new Identifier((((MethodDeclarationContext)_localctx).i1!=null?((MethodDeclarationContext)_localctx).i1.getText():null));
							    setNodePosition( parameterName , ((MethodDeclarationContext)_localctx).i1.getLine() , ((MethodDeclarationContext)_localctx).i1.getCharPositionInLine() );
							    ParameterDeclaration parameterDecl = new ParameterDeclaration( parameterName , ((MethodDeclarationContext)_localctx).t1.mType );
							    setNodePosition( parameterDecl , ((MethodDeclarationContext)_localctx).i1.getLine() , ((MethodDeclarationContext)_localctx).i1.getCharPositionInLine() );
							    _localctx.mMethod.addArg( parameterDecl );
							
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(170);
					match(T__6);
					setState(171);
					((MethodDeclarationContext)_localctx).i2 = match(ID);
					setState(172);
					match(T__2);
					setState(173);
					((MethodDeclarationContext)_localctx).t2 = toorlaType();

									    parameterName = new Identifier((((MethodDeclarationContext)_localctx).i2!=null?((MethodDeclarationContext)_localctx).i2.getText():null));
					                    setNodePosition( parameterName , ((MethodDeclarationContext)_localctx).i2.getLine() , ((MethodDeclarationContext)_localctx).i2.getCharPositionInLine() );
					                    parameterDecl = new ParameterDeclaration( parameterName , ((MethodDeclarationContext)_localctx).t2.mType );
					                    setNodePosition( parameterDecl , ((MethodDeclarationContext)_localctx).i2.getLine() , ((MethodDeclarationContext)_localctx).i2.getCharPositionInLine() );
					                    _localctx.mMethod.addArg( parameterDecl );
									
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(T__12);
				}
				}
				break;
			}
			setState(185);
			match(T__13);
			setState(186);
			((MethodDeclarationContext)_localctx).t = toorlaType();

			        _localctx.mMethod.setReturnType(((MethodDeclarationContext)_localctx).t.mType);
			    
			setState(188);
			match(T__2);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(189);
				((MethodDeclarationContext)_localctx).s = statement();

					    _localctx.mMethod.addStatement(((MethodDeclarationContext)_localctx).s.mStmt);
					
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__3);

				    if( _localctx.access != null )
				        _localctx.mMethod.setAccessModifier(_localctx.access);
				
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

	public static class ClosedStatementContext extends ParserRuleContext {
		public Statement mStmt;
		public StatementBlockContext s1;
		public ClosedConditionalContext conditionalStat;
		public StatementClosedLoopContext s3;
		public StatementWriteContext s4;
		public StatementAssignmentContext s5;
		public StatementReturnContext s6;
		public StatementVarDefContext s7;
		public StatementContinueContext s8;
		public StatementBreakContext s9;
		public StatementIncContext incStat;
		public StatementDecContext decStat;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ClosedConditionalContext closedConditional() {
			return getRuleContext(ClosedConditionalContext.class,0);
		}
		public StatementClosedLoopContext statementClosedLoop() {
			return getRuleContext(StatementClosedLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementVarDefContext statementVarDef() {
			return getRuleContext(StatementVarDefContext.class,0);
		}
		public StatementContinueContext statementContinue() {
			return getRuleContext(StatementContinueContext.class,0);
		}
		public StatementBreakContext statementBreak() {
			return getRuleContext(StatementBreakContext.class,0);
		}
		public StatementIncContext statementInc() {
			return getRuleContext(StatementIncContext.class,0);
		}
		public StatementDecContext statementDec() {
			return getRuleContext(StatementDecContext.class,0);
		}
		public ClosedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClosedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClosedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClosedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedStatementContext closedStatement() throws RecognitionException {
		ClosedStatementContext _localctx = new ClosedStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closedStatement);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((ClosedStatementContext)_localctx).s1 = statementBlock();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s1.mStmt;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((ClosedStatementContext)_localctx).conditionalStat = closedConditional();
				 ((ClosedStatementContext)_localctx).mStmt =  ((ClosedStatementContext)_localctx).conditionalStat.mStmt; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				((ClosedStatementContext)_localctx).s3 = statementClosedLoop();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s3.mStmt;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				((ClosedStatementContext)_localctx).s4 = statementWrite();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s4.mStmt;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((ClosedStatementContext)_localctx).s5 = statementAssignment();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s5.mStmt;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				((ClosedStatementContext)_localctx).s6 = statementReturn();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s6.mStmt;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				((ClosedStatementContext)_localctx).s7 = statementVarDef();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s7.mStmt;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				((ClosedStatementContext)_localctx).s8 = statementContinue();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s8.mStmt;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				((ClosedStatementContext)_localctx).s9 = statementBreak();
				((ClosedStatementContext)_localctx).mStmt = ((ClosedStatementContext)_localctx).s9.mStmt;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(227);
				((ClosedStatementContext)_localctx).incStat = statementInc();
				 ((ClosedStatementContext)_localctx).mStmt =  ((ClosedStatementContext)_localctx).incStat.incStatement; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(230);
				((ClosedStatementContext)_localctx).decStat = statementDec();
				 ((ClosedStatementContext)_localctx).mStmt =  ((ClosedStatementContext)_localctx).decStat.decStatement; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(233);
				match(T__7);
				 ((ClosedStatementContext)_localctx).mStmt =  new Skip(); 
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

	public static class ClosedConditionalContext extends ParserRuleContext {
		public Statement mStmt;
		public List<Expression> conditions;
		public List<Statement> statements;
		public ExpressionContext ifExp;
		public ClosedStatementContext ifStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ClosedStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public ClosedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClosedConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClosedConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClosedConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedConditionalContext closedConditional() throws RecognitionException {
		ClosedConditionalContext _localctx = new ClosedConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_closedConditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((ClosedConditionalContext)_localctx).statements =  new ArrayList<>();
			        ((ClosedConditionalContext)_localctx).conditions =  new ArrayList<>();
			    
			setState(238);
			match(T__14);
			setState(239);
			match(T__11);
			setState(240);
			((ClosedConditionalContext)_localctx).ifExp = expression();
			setState(241);
			match(T__12);
			setState(242);
			((ClosedConditionalContext)_localctx).ifStat = closedStatement();

			        _localctx.conditions.add( ((ClosedConditionalContext)_localctx).ifExp.expr );
			        _localctx.statements.add( ((ClosedConditionalContext)_localctx).ifStat.mStmt );
			    
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(244);
				match(T__15);
				setState(245);
				match(T__11);
				setState(246);
				((ClosedConditionalContext)_localctx).elifExp = expression();
				setState(247);
				match(T__12);
				setState(248);
				((ClosedConditionalContext)_localctx).elifStat = closedStatement();

				        _localctx.conditions.add( ((ClosedConditionalContext)_localctx).elifExp.expr );
				        _localctx.statements.add( ((ClosedConditionalContext)_localctx).elifStat.mStmt );
				    
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__16);
			setState(257);
			((ClosedConditionalContext)_localctx).elseStmt = closedStatement();

			        Statement lastIfStat = _localctx.statements.get( _localctx.statements.size() - 1 );
			        Expression lastIfCondition = _localctx.conditions.get( _localctx.conditions.size() - 1 );
			        Conditional previousConditionalStat = new Conditional( lastIfCondition , lastIfStat , ((ClosedConditionalContext)_localctx).elseStmt.mStmt );
			        Conditional currentConditionalStat = previousConditionalStat;
			        for( int i = _localctx.statements.size() - 2 ; i >= 0 ; i-- )
			        {
			            previousConditionalStat = currentConditionalStat;
			            Expression currentIfCondition = _localctx.conditions.get( i );
			            Statement currentIfStat = _localctx.statements.get( i );
			            currentConditionalStat = new Conditional( currentIfCondition , currentIfStat
			                , previousConditionalStat );

			        }
			        ((ClosedConditionalContext)_localctx).mStmt =  currentConditionalStat;
			    
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

	public static class OpenConditionalContext extends ParserRuleContext {
		public Statement mStmt;
		public List<Expression> conditions;
		public List<Statement> statements;
		public ExpressionContext ifExp;
		public StatementContext ifStat;
		public ClosedStatementContext secondIfStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ExpressionContext lastElifExp;
		public StatementContext lastElifStmt;
		public ClosedStatementContext thirdIfStat;
		public OpenStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public OpenConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterOpenConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitOpenConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitOpenConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenConditionalContext openConditional() throws RecognitionException {
		OpenConditionalContext _localctx = new OpenConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openConditional);
		int _la;
		try {
			int _alt;
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(260);
				match(T__14);
				setState(261);
				match(T__11);
				setState(262);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(263);
				match(T__12);
				setState(264);
				((OpenConditionalContext)_localctx).ifStat = statement();

				        ((OpenConditionalContext)_localctx).mStmt =  new Conditional( ((OpenConditionalContext)_localctx).ifExp.expr , ((OpenConditionalContext)_localctx).ifStat.mStmt );
				    
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(267);
				match(T__14);
				setState(268);
				match(T__11);
				setState(269);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(270);
				match(T__12);
				setState(271);
				((OpenConditionalContext)_localctx).secondIfStat = closedStatement();

				        ((OpenConditionalContext)_localctx).statements =  new ArrayList<>();
				        ((OpenConditionalContext)_localctx).conditions =  new ArrayList<>();
				        _localctx.conditions.add( ((OpenConditionalContext)_localctx).ifExp.expr );
				        _localctx.statements.add( ((OpenConditionalContext)_localctx).secondIfStat.mStmt );
				    
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						match(T__15);
						setState(274);
						match(T__11);
						setState(275);
						((OpenConditionalContext)_localctx).elifExp = expression();
						setState(276);
						match(T__12);
						setState(277);
						((OpenConditionalContext)_localctx).elifStat = closedStatement();

						        _localctx.conditions.add( ((OpenConditionalContext)_localctx).elifExp.expr );
						        _localctx.statements.add( ((OpenConditionalContext)_localctx).elifStat.mStmt );
						    
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(285);
				match(T__15);
				setState(286);
				match(T__11);
				setState(287);
				((OpenConditionalContext)_localctx).lastElifExp = expression();
				setState(288);
				match(T__12);
				setState(289);
				((OpenConditionalContext)_localctx).lastElifStmt = statement();

				        Conditional previousConditionalStat = new Conditional( ((OpenConditionalContext)_localctx).lastElifExp.expr
				        , ((OpenConditionalContext)_localctx).lastElifStmt.mStmt , new Skip() );
				        Conditional currentConditionalStat = previousConditionalStat;
				        for( int i = _localctx.statements.size() - 1 ; i >= 0 ; i-- )
				        {
				            previousConditionalStat = currentConditionalStat;
				            Expression currentIfCondition = _localctx.conditions.get( i );
				            Statement currentIfStat = _localctx.statements.get( i );
				            currentConditionalStat = new Conditional( currentIfCondition , currentIfStat
				                , previousConditionalStat );

				        }
				        ((OpenConditionalContext)_localctx).mStmt =  currentConditionalStat;
				    
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(292);
				match(T__14);
				setState(293);
				match(T__11);
				setState(294);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(295);
				match(T__12);
				setState(296);
				((OpenConditionalContext)_localctx).thirdIfStat = closedStatement();

				        ((OpenConditionalContext)_localctx).statements =  new ArrayList<>();
				        ((OpenConditionalContext)_localctx).conditions =  new ArrayList<>();
				        _localctx.conditions.add( ((OpenConditionalContext)_localctx).ifExp.expr );
				        _localctx.statements.add( ((OpenConditionalContext)_localctx).thirdIfStat.mStmt );
				    
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(298);
					match(T__15);
					setState(299);
					match(T__11);
					setState(300);
					((OpenConditionalContext)_localctx).elifExp = expression();
					setState(301);
					match(T__12);
					setState(302);
					((OpenConditionalContext)_localctx).elifStat = closedStatement();

					        _localctx.conditions.add( ((OpenConditionalContext)_localctx).elifExp.expr );
					        _localctx.statements.add( ((OpenConditionalContext)_localctx).elifStat.mStmt );
					    
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(T__16);
				setState(311);
				((OpenConditionalContext)_localctx).elseStmt = openStatement();

				        Statement lastIfStat = _localctx.statements.get( _localctx.statements.size() - 1 );
				        Expression lastIfCondition = _localctx.conditions.get( _localctx.conditions.size() - 1 );
				        Conditional previousConditionalStat = new Conditional( lastIfCondition , lastIfStat , ((OpenConditionalContext)_localctx).elseStmt.mStmt );
				        Conditional currentConditionalStat = previousConditionalStat;
				        for( int i = _localctx.statements.size() - 2 ; i >= 0 ; i-- )
				        {
				            previousConditionalStat = currentConditionalStat;
				            Expression currentIfCondition = _localctx.conditions.get( i );
				            Statement currentIfStat = _localctx.statements.get( i );
				            currentConditionalStat = new Conditional( currentIfCondition , currentIfStat
				                , previousConditionalStat );

				        }
				        ((OpenConditionalContext)_localctx).mStmt =  currentConditionalStat;
				    
				}
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

	public static class OpenStatementContext extends ParserRuleContext {
		public Statement mStmt;
		public StatementOpenLoopContext s1;
		public OpenConditionalContext conditionalStat;
		public StatementOpenLoopContext statementOpenLoop() {
			return getRuleContext(StatementOpenLoopContext.class,0);
		}
		public OpenConditionalContext openConditional() {
			return getRuleContext(OpenConditionalContext.class,0);
		}
		public OpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterOpenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitOpenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitOpenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStatementContext openStatement() throws RecognitionException {
		OpenStatementContext _localctx = new OpenStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_openStatement);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((OpenStatementContext)_localctx).s1 = statementOpenLoop();
				((OpenStatementContext)_localctx).mStmt = ((OpenStatementContext)_localctx).s1.mStmt;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((OpenStatementContext)_localctx).conditionalStat = openConditional();
				 ((OpenStatementContext)_localctx).mStmt =  ((OpenStatementContext)_localctx).conditionalStat.mStmt; 
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

	public static class StatementContext extends ParserRuleContext {
		public Statement mStmt;
		public ClosedStatementContext s1;
		public OpenStatementContext s2;
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				((StatementContext)_localctx).s1 = closedStatement();
				((StatementContext)_localctx).mStmt = ((StatementContext)_localctx).s1.mStmt;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				((StatementContext)_localctx).s2 = openStatement();
				((StatementContext)_localctx).mStmt = ((StatementContext)_localctx).s2.mStmt;
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

	public static class StatementVarDefContext extends ParserRuleContext {
		public Statement mStmt;
		public Token i1;
		public ExpressionContext e1;
		public Token i2;
		public ExpressionContext e2;
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementVarDefContext statementVarDef() throws RecognitionException {
		StatementVarDefContext _localctx = new StatementVarDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementVarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				        ((StatementVarDefContext)_localctx).mStmt = new LocalVarsDefinitions();
				    
			setState(333);
			match(T__17);
			setState(334);
			((StatementVarDefContext)_localctx).i1 = match(ID);
			setState(335);
			match(T__18);
			setState(336);
			((StatementVarDefContext)_localctx).e1 = expression();

				        Identifier localVarName = new Identifier( (((StatementVarDefContext)_localctx).i1!=null?((StatementVarDefContext)_localctx).i1.getText():null) );
				        setNodePosition( localVarName , ((StatementVarDefContext)_localctx).i1.getLine() , ((StatementVarDefContext)_localctx).i1.getCharPositionInLine() );
				        LocalVarDef localVarDef = new LocalVarDef( localVarName , ((StatementVarDefContext)_localctx).e1.expr );
				        setNodePosition( localVarDef , ((StatementVarDefContext)_localctx).i1.getLine() , ((StatementVarDefContext)_localctx).i1.getCharPositionInLine() );
				        ((LocalVarsDefinitions)_localctx.mStmt).addVarDefinition( localVarDef );
					
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(338);
				match(T__6);
				setState(339);
				((StatementVarDefContext)_localctx).i2 = match(ID);
				setState(340);
				match(T__18);
				setState(341);
				((StatementVarDefContext)_localctx).e2 = expression();

						    localVarName = new Identifier( (((StatementVarDefContext)_localctx).i2!=null?((StatementVarDefContext)_localctx).i2.getText():null) );
				            setNodePosition( localVarName , ((StatementVarDefContext)_localctx).i2.getLine() , ((StatementVarDefContext)_localctx).i2.getCharPositionInLine() );
				            localVarDef = new LocalVarDef( localVarName , ((StatementVarDefContext)_localctx).e2.expr );
				            setNodePosition( localVarDef , ((StatementVarDefContext)_localctx).i2.getLine() , ((StatementVarDefContext)_localctx).i2.getCharPositionInLine() );
						    ((LocalVarsDefinitions)_localctx.mStmt).addVarDefinition( localVarDef );
						
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(T__7);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public Statement mStmt;
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatementBlockContext)_localctx).mStmt = new Block();
			setState(352);
			match(T__19);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(353);
				((StatementBlockContext)_localctx).s = statement();
				((Block)_localctx.mStmt).addStatement(((StatementBlockContext)_localctx).s.mStmt);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__3);
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

	public static class StatementContinueContext extends ParserRuleContext {
		public Statement mStmt;
		public Token myContinue;
		public StatementContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContinueContext statementContinue() throws RecognitionException {
		StatementContinueContext _localctx = new StatementContinueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((StatementContinueContext)_localctx).myContinue = match(T__20);
			setState(364);
			match(T__7);

				    ((StatementContinueContext)_localctx).mStmt = new Continue();
				    setNodePosition( _localctx.mStmt , ((StatementContinueContext)_localctx).myContinue.getLine() , ((StatementContinueContext)_localctx).myContinue.getCharPositionInLine() );
				
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

	public static class StatementBreakContext extends ParserRuleContext {
		public Statement mStmt;
		public Token myBreak;
		public StatementBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBreakContext statementBreak() throws RecognitionException {
		StatementBreakContext _localctx = new StatementBreakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((StatementBreakContext)_localctx).myBreak = match(T__21);
			setState(368);
			match(T__7);

				    ((StatementBreakContext)_localctx).mStmt = new Break();
				    setNodePosition( _localctx.mStmt , ((StatementBreakContext)_localctx).myBreak.getLine() , ((StatementBreakContext)_localctx).myBreak.getCharPositionInLine() );
				
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

	public static class StatementReturnContext extends ParserRuleContext {
		public Statement mStmt;
		public Token myReturn;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((StatementReturnContext)_localctx).myReturn = match(T__22);
			setState(372);
			((StatementReturnContext)_localctx).e = expression();
			setState(373);
			match(T__7);

				    ((StatementReturnContext)_localctx).mStmt = new Return(((StatementReturnContext)_localctx).e.expr);
				    setNodePosition( _localctx.mStmt , ((StatementReturnContext)_localctx).myReturn.getLine() , ((StatementReturnContext)_localctx).myReturn.getCharPositionInLine() );
				
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

	public static class StatementClosedLoopContext extends ParserRuleContext {
		public Statement mStmt;
		public ExpressionContext e;
		public ClosedStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public StatementClosedLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementClosedLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementClosedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementClosedLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementClosedLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementClosedLoopContext statementClosedLoop() throws RecognitionException {
		StatementClosedLoopContext _localctx = new StatementClosedLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementClosedLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__23);
			setState(377);
			match(T__11);
			setState(378);
			((StatementClosedLoopContext)_localctx).e = expression();
			setState(379);
			match(T__12);
			setState(380);
			((StatementClosedLoopContext)_localctx).s = closedStatement();
			((StatementClosedLoopContext)_localctx).mStmt = new While(((StatementClosedLoopContext)_localctx).e.expr,((StatementClosedLoopContext)_localctx).s.mStmt);
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

	public static class StatementOpenLoopContext extends ParserRuleContext {
		public Statement mStmt;
		public ExpressionContext e;
		public OpenStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementOpenLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOpenLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementOpenLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementOpenLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementOpenLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOpenLoopContext statementOpenLoop() throws RecognitionException {
		StatementOpenLoopContext _localctx = new StatementOpenLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementOpenLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__23);
			setState(384);
			match(T__11);
			setState(385);
			((StatementOpenLoopContext)_localctx).e = expression();
			setState(386);
			match(T__12);
			setState(387);
			((StatementOpenLoopContext)_localctx).s = openStatement();
			((StatementOpenLoopContext)_localctx).mStmt = new While(((StatementOpenLoopContext)_localctx).e.expr,((StatementOpenLoopContext)_localctx).s.mStmt);
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

	public static class StatementWriteContext extends ParserRuleContext {
		public Statement mStmt;
		public Token printLine;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((StatementWriteContext)_localctx).printLine = match(T__24);
			setState(391);
			match(T__11);
			setState(392);
			((StatementWriteContext)_localctx).e = expression();
			setState(393);
			match(T__12);
			setState(394);
			match(T__7);

				    ((StatementWriteContext)_localctx).mStmt = new PrintLine(((StatementWriteContext)_localctx).e.expr);
				    setNodePosition( _localctx.mStmt , ((StatementWriteContext)_localctx).printLine.getLine() , ((StatementWriteContext)_localctx).printLine.getCharPositionInLine() );
				
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

	public static class StatementAssignmentContext extends ParserRuleContext {
		public Statement mStmt;
		public ExpressionContext left;
		public Token assignOp;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((StatementAssignmentContext)_localctx).left = expression();
			setState(398);
			((StatementAssignmentContext)_localctx).assignOp = match(T__18);
			setState(399);
			((StatementAssignmentContext)_localctx).right = expression();
			setState(400);
			match(T__7);

				    ((StatementAssignmentContext)_localctx).mStmt = new Assign( ((StatementAssignmentContext)_localctx).left.expr , ((StatementAssignmentContext)_localctx).right.expr );
				    setNodePosition( _localctx.mStmt , ((StatementAssignmentContext)_localctx).assignOp.getLine() , ((StatementAssignmentContext)_localctx).assignOp.getCharPositionInLine() );
				
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

	public static class StatementIncContext extends ParserRuleContext {
		public Statement incStatement;
		public ExpressionContext lvalExpr;
		public Token incOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIncContext statementInc() throws RecognitionException {
		StatementIncContext _localctx = new StatementIncContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((StatementIncContext)_localctx).lvalExpr = expression();
			setState(404);
			((StatementIncContext)_localctx).incOp = match(T__25);
			setState(405);
			match(T__7);

			        ((StatementIncContext)_localctx).incStatement =  new IncStatement( ((StatementIncContext)_localctx).lvalExpr.expr );
			        setNodePosition( _localctx.incStatement , ((StatementIncContext)_localctx).incOp.getLine() ,((StatementIncContext)_localctx).incOp.getCharPositionInLine() );
			    
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

	public static class StatementDecContext extends ParserRuleContext {
		public Statement decStatement;
		public ExpressionContext lvalExpr;
		public Token decOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDecContext statementDec() throws RecognitionException {
		StatementDecContext _localctx = new StatementDecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((StatementDecContext)_localctx).lvalExpr = expression();
			setState(409);
			((StatementDecContext)_localctx).decOp = match(T__26);
			setState(410);
			match(T__7);

			        ((StatementDecContext)_localctx).decStatement =  new DecStatement( ((StatementDecContext)_localctx).lvalExpr.expr );
			        setNodePosition( _localctx.decStatement , ((StatementDecContext)_localctx).decOp.getLine() ,((StatementDecContext)_localctx).decOp.getCharPositionInLine() );
			    
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
		public Expression expr;
		public ExpressionOrContext e;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((ExpressionContext)_localctx).e = expressionOr();
			((ExpressionContext)_localctx).expr = ((ExpressionContext)_localctx).e.expr;
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

	public static class ExpressionOrContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			((ExpressionOrContext)_localctx).a = expressionAnd();
			setState(417);
			((ExpressionOrContext)_localctx).ot = expressionOrTemp( ((ExpressionOrContext)_localctx).a.expr );

				    ((ExpressionOrContext)_localctx).expr =  ((ExpressionOrContext)_localctx).ot.expr;
				
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

	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token orOp;
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOrTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOrTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp(Expression leftOperand) throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 48, RULE_expressionOrTemp);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((ExpressionOrTempContext)_localctx).orOp = match(T__27);
				setState(421);
				((ExpressionOrTempContext)_localctx).a = expressionAnd();

					    ((ExpressionOrTempContext)_localctx).middleExpr =  new Or( _localctx.leftOperand , ((ExpressionOrTempContext)_localctx).a.expr );
					    setNodePosition( _localctx.middleExpr , ((ExpressionOrTempContext)_localctx).orOp.getLine() , ((ExpressionOrTempContext)_localctx).orOp.getCharPositionInLine() );
					
				setState(423);
				((ExpressionOrTempContext)_localctx).ot = expressionOrTemp( _localctx.middleExpr );

					    ((ExpressionOrTempContext)_localctx).expr =  ((ExpressionOrTempContext)_localctx).ot.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					    ((ExpressionOrTempContext)_localctx).expr =  _localctx.leftOperand;
					
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

	public static class ExpressionAndContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			((ExpressionAndContext)_localctx).e = expressionEq();
			setState(430);
			((ExpressionAndContext)_localctx).at = expressionAndTemp( ((ExpressionAndContext)_localctx).e.expr );

				    ((ExpressionAndContext)_localctx).expr =  ((ExpressionAndContext)_localctx).at.expr;
				
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

	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token andOp;
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAndTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAndTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp(Expression leftOperand) throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 52, RULE_expressionAndTemp);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				((ExpressionAndTempContext)_localctx).andOp = match(T__28);
				setState(434);
				((ExpressionAndTempContext)_localctx).e = expressionEq();

					    ((ExpressionAndTempContext)_localctx).middleExpr =  new And( _localctx.leftOperand , ((ExpressionAndTempContext)_localctx).e.expr );
					    setNodePosition( _localctx.middleExpr , ((ExpressionAndTempContext)_localctx).andOp.getLine() , ((ExpressionAndTempContext)_localctx).andOp.getCharPositionInLine() );
					
				setState(436);
				((ExpressionAndTempContext)_localctx).at = expressionAndTemp( _localctx.middleExpr );

					    ((ExpressionAndTempContext)_localctx).expr =  ((ExpressionAndTempContext)_localctx).at.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

				        ((ExpressionAndTempContext)_localctx).expr =  _localctx.leftOperand;
					
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

	public static class ExpressionEqContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			((ExpressionEqContext)_localctx).c = expressionCmp();
			setState(443);
			((ExpressionEqContext)_localctx).et = expressionEqTemp( ((ExpressionEqContext)_localctx).c.expr );

				    ((ExpressionEqContext)_localctx).expr =  ((ExpressionEqContext)_localctx).et.expr;
				
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

	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token eqOp;
		public Token neqOp;
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionEqTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionEqTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp(Expression leftOperand) throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 56, RULE_expressionEqTemp);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(446);
					((ExpressionEqTempContext)_localctx).eqOp = match(T__29);

							    ((ExpressionEqTempContext)_localctx).middleExpr = new Equals();
							    setNodePosition( _localctx.middleExpr , ((ExpressionEqTempContext)_localctx).eqOp.getLine() , ((ExpressionEqTempContext)_localctx).eqOp.getCharPositionInLine() );
							
					}
					break;
				case T__30:
					{
					setState(448);
					((ExpressionEqTempContext)_localctx).neqOp = match(T__30);

							    ((ExpressionEqTempContext)_localctx).middleExpr = new NotEquals();
							    setNodePosition( _localctx.middleExpr , ((ExpressionEqTempContext)_localctx).neqOp.getLine() , ((ExpressionEqTempContext)_localctx).neqOp.getCharPositionInLine() );
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452);
				((ExpressionEqTempContext)_localctx).c = expressionCmp();

					   _localctx.middleExpr.setSides( _localctx.leftOperand , ((ExpressionEqTempContext)_localctx).c.expr );
					
				setState(454);
				((ExpressionEqTempContext)_localctx).et = expressionEqTemp( _localctx.middleExpr );

					    ((ExpressionEqTempContext)_localctx).expr =  ((ExpressionEqTempContext)_localctx).et.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					    ((ExpressionEqTempContext)_localctx).expr =  _localctx.leftOperand;
					
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

	public static class ExpressionCmpContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			((ExpressionCmpContext)_localctx).a = expressionAdd();
			setState(461);
			((ExpressionCmpContext)_localctx).ct = expressionCmpTemp( ((ExpressionCmpContext)_localctx).a.expr );

			        ((ExpressionCmpContext)_localctx).expr =  ((ExpressionCmpContext)_localctx).ct.expr;
				
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

	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token ltOp;
		public Token gtOp;
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionCmpTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionCmpTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp(Expression leftOperand) throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 60, RULE_expressionCmpTemp);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(464);
					((ExpressionCmpTempContext)_localctx).ltOp = match(T__31);

							    ((ExpressionCmpTempContext)_localctx).middleExpr = new LessThan();
							    setNodePosition( _localctx.middleExpr , ((ExpressionCmpTempContext)_localctx).ltOp.getLine() , ((ExpressionCmpTempContext)_localctx).ltOp.getCharPositionInLine() );
							
					}
					break;
				case T__32:
					{
					setState(466);
					((ExpressionCmpTempContext)_localctx).gtOp = match(T__32);

							    ((ExpressionCmpTempContext)_localctx).middleExpr = new GreaterThan();
							    setNodePosition( _localctx.middleExpr , ((ExpressionCmpTempContext)_localctx).gtOp.getLine() , ((ExpressionCmpTempContext)_localctx).gtOp.getCharPositionInLine() );
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(470);
				((ExpressionCmpTempContext)_localctx).a = expressionAdd();

					    _localctx.middleExpr.setSides( _localctx.leftOperand , ((ExpressionCmpTempContext)_localctx).a.expr );
					
				setState(472);
				((ExpressionCmpTempContext)_localctx).ct = expressionCmpTemp( _localctx.middleExpr );

				        ((ExpressionCmpTempContext)_localctx).expr =  ((ExpressionCmpTempContext)_localctx).ct.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					    ((ExpressionCmpTempContext)_localctx).expr =  _localctx.leftOperand;
					
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

	public static class ExpressionAddContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((ExpressionAddContext)_localctx).m = expressionMultMod();
			setState(479);
			((ExpressionAddContext)_localctx).at = expressionAddTemp( ((ExpressionAddContext)_localctx).m.expr );

				    ((ExpressionAddContext)_localctx).expr =  ((ExpressionAddContext)_localctx).at.expr;
				
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

	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token addOp;
		public Token subOp;
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionAddTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionAddTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp(Expression leftOperand) throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 64, RULE_expressionAddTemp);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(482);
					((ExpressionAddTempContext)_localctx).addOp = match(T__33);

							    ((ExpressionAddTempContext)_localctx).middleExpr =  new Plus();
							    setNodePosition( _localctx.middleExpr , ((ExpressionAddTempContext)_localctx).addOp.getLine() , ((ExpressionAddTempContext)_localctx).addOp.getCharPositionInLine() );
							
					}
					break;
				case T__34:
					{
					setState(484);
					((ExpressionAddTempContext)_localctx).subOp = match(T__34);

							    ((ExpressionAddTempContext)_localctx).middleExpr =  new Minus();
							    setNodePosition( _localctx.middleExpr , ((ExpressionAddTempContext)_localctx).subOp.getLine() , ((ExpressionAddTempContext)_localctx).subOp.getCharPositionInLine() );
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488);
				((ExpressionAddTempContext)_localctx).m = expressionMultMod();

				        _localctx.middleExpr.setSides( _localctx.leftOperand , ((ExpressionAddTempContext)_localctx).m.expr );
					
				setState(490);
				((ExpressionAddTempContext)_localctx).at = expressionAddTemp( _localctx.middleExpr );

					    ((ExpressionAddTempContext)_localctx).expr =  ((ExpressionAddTempContext)_localctx).at.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					        ((ExpressionAddTempContext)_localctx).expr =  _localctx.leftOperand;
					    
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

	public static class ExpressionMultModContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMultMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMultMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMultMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModContext expressionMultMod() throws RecognitionException {
		ExpressionMultModContext _localctx = new ExpressionMultModContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionMultMod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			((ExpressionMultModContext)_localctx).u = expressionUnary();
			setState(497);
			((ExpressionMultModContext)_localctx).mt = expressionMultModTemp( ((ExpressionMultModContext)_localctx).u.expr );

				    ((ExpressionMultModContext)_localctx).expr =  ((ExpressionMultModContext)_localctx).mt.expr;
				
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

	public static class ExpressionMultModTempContext extends ParserRuleContext {
		public Expression leftOperand;
		public Expression expr;
		public BinaryExpression middleExpr;
		public Token mulOp;
		public Token divOp;
		public Token modOp;
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMultModTempContext(ParserRuleContext parent, int invokingState, Expression leftOperand) {
			super(parent, invokingState);
			this.leftOperand = leftOperand;
		}
		@Override public int getRuleIndex() { return RULE_expressionMultModTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMultModTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMultModTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMultModTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModTempContext expressionMultModTemp(Expression leftOperand) throws RecognitionException {
		ExpressionMultModTempContext _localctx = new ExpressionMultModTempContext(_ctx, getState(), leftOperand);
		enterRule(_localctx, 68, RULE_expressionMultModTemp);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(500);
					((ExpressionMultModTempContext)_localctx).mulOp = match(T__35);

							    ((ExpressionMultModTempContext)_localctx).middleExpr =  new Times();
							    setNodePosition( _localctx.middleExpr , ((ExpressionMultModTempContext)_localctx).mulOp.getLine() , ((ExpressionMultModTempContext)_localctx).mulOp.getCharPositionInLine() );
							
					}
					break;
				case T__36:
					{
					setState(502);
					((ExpressionMultModTempContext)_localctx).divOp = match(T__36);

					            ((ExpressionMultModTempContext)_localctx).middleExpr =  new Division();
					            setNodePosition( _localctx.middleExpr , ((ExpressionMultModTempContext)_localctx).divOp.getLine() , ((ExpressionMultModTempContext)_localctx).divOp.getCharPositionInLine() );
					        
					}
					break;
				case T__37:
					{
					setState(504);
					((ExpressionMultModTempContext)_localctx).modOp = match(T__37);

							    ((ExpressionMultModTempContext)_localctx).middleExpr =  new Modulo();
							    setNodePosition( _localctx.middleExpr , ((ExpressionMultModTempContext)_localctx).modOp.getLine() , ((ExpressionMultModTempContext)_localctx).modOp.getCharPositionInLine() );
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(508);
				((ExpressionMultModTempContext)_localctx).u = expressionUnary();

				        _localctx.middleExpr.setSides( _localctx.leftOperand , ((ExpressionMultModTempContext)_localctx).u.expr );
					
				setState(510);
				((ExpressionMultModTempContext)_localctx).mt = expressionMultModTemp( _localctx.middleExpr );

					    ((ExpressionMultModTempContext)_localctx).expr =  ((ExpressionMultModTempContext)_localctx).mt.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					    ((ExpressionMultModTempContext)_localctx).expr =  _localctx.leftOperand;
					
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

	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Expression expr;
		public Token notOp;
		public Token negOp;
		public ExpressionUnaryContext u;
		public ExpressionMethodsContext m;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionUnary);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__38:
					{
					setState(516);
					((ExpressionUnaryContext)_localctx).notOp = match(T__38);

							    ((ExpressionUnaryContext)_localctx).expr = new Not();
							    setNodePosition( _localctx.expr , ((ExpressionUnaryContext)_localctx).notOp.getLine() , ((ExpressionUnaryContext)_localctx).notOp.getCharPositionInLine() );
							
					}
					break;
				case T__34:
					{
					setState(518);
					((ExpressionUnaryContext)_localctx).negOp = match(T__34);

							    ((ExpressionUnaryContext)_localctx).expr = new Neg();
							    setNodePosition( _localctx.expr , ((ExpressionUnaryContext)_localctx).negOp.getLine() , ((ExpressionUnaryContext)_localctx).negOp.getCharPositionInLine() );
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(522);
				((ExpressionUnaryContext)_localctx).u = expressionUnary();
				((UnaryExpression)_localctx.expr).setExpr(((ExpressionUnaryContext)_localctx).u.expr);
				}
				break;
			case T__11:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				((ExpressionUnaryContext)_localctx).m = expressionMethods();
				((ExpressionUnaryContext)_localctx).expr = ((ExpressionUnaryContext)_localctx).m.expr;
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

	public static class ExpressionMethodsContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionOtherContext o;
		public ExpressionMethodsTempContext mt;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((ExpressionMethodsContext)_localctx).o = expressionOther();
			setState(531);
			((ExpressionMethodsContext)_localctx).mt = expressionMethodsTemp(((ExpressionMethodsContext)_localctx).o.expr);

				    ((ExpressionMethodsContext)_localctx).expr = ((ExpressionMethodsContext)_localctx).mt.expr;
				
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

	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Expression instance;
		public Expression expr;
		public Expression immediateExpr;
		public Token dotOp;
		public Token i;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ii;
		public Token leftBrace;
		public ExpressionContext e3;
		public ExpressionMethodsTempContext mt;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState, Expression instance) {
			super(parent, invokingState);
			this.instance = instance;
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionMethodsTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionMethodsTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp(Expression instance) throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState(), instance);
		enterRule(_localctx, 74, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(534);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(535);
					((ExpressionMethodsTempContext)_localctx).i = match(ID);

							    Identifier methodName = new Identifier((((ExpressionMethodsTempContext)_localctx).i!=null?((ExpressionMethodsTempContext)_localctx).i.getText():null));
							    setNodePosition( methodName , ((ExpressionMethodsTempContext)_localctx).i.getLine() , ((ExpressionMethodsTempContext)_localctx).i.getCharPositionInLine() );
							    ((ExpressionMethodsTempContext)_localctx).immediateExpr = new MethodCall(_localctx.instance,methodName);
							    setNodePosition( _localctx.immediateExpr , ((ExpressionMethodsTempContext)_localctx).dotOp.getLine() , ((ExpressionMethodsTempContext)_localctx).dotOp.getCharPositionInLine() );
							
					setState(537);
					match(T__11);
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
						{
						setState(538);
						((ExpressionMethodsTempContext)_localctx).e1 = expression();
						((MethodCall)_localctx.immediateExpr).addArg(((ExpressionMethodsTempContext)_localctx).e1.expr);
						setState(546);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__6) {
							{
							{
							setState(540);
							match(T__6);
							setState(541);
							((ExpressionMethodsTempContext)_localctx).e2 = expression();
							((MethodCall)_localctx.immediateExpr).addArg(((ExpressionMethodsTempContext)_localctx).e2.expr);
							}
							}
							setState(548);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(551);
					match(T__12);
					}
					break;
				case 2:
					{
					setState(552);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(553);
					((ExpressionMethodsTempContext)_localctx).ii = match(ID);

							    Identifier fieldName = new Identifier( (((ExpressionMethodsTempContext)_localctx).ii!=null?((ExpressionMethodsTempContext)_localctx).ii.getText():null) );
							    setNodePosition( fieldName , ((ExpressionMethodsTempContext)_localctx).ii.getLine() , ((ExpressionMethodsTempContext)_localctx).ii.getCharPositionInLine() );
							    ((ExpressionMethodsTempContext)_localctx).immediateExpr = new FieldCall(_localctx.instance, fieldName );
							    setNodePosition( _localctx.immediateExpr , ((ExpressionMethodsTempContext)_localctx).dotOp.getLine() , ((ExpressionMethodsTempContext)_localctx).dotOp.getCharPositionInLine() );
							
					}
					break;
				case 3:
					{
					setState(555);
					((ExpressionMethodsTempContext)_localctx).leftBrace = match(T__40);
					setState(556);
					((ExpressionMethodsTempContext)_localctx).e3 = expression();
					setState(557);
					match(T__41);

							    ((ExpressionMethodsTempContext)_localctx).immediateExpr = new ArrayCall(_localctx.instance,((ExpressionMethodsTempContext)_localctx).e3.expr);
							    setNodePosition( _localctx.immediateExpr , ((ExpressionMethodsTempContext)_localctx).leftBrace.getLine() , ((ExpressionMethodsTempContext)_localctx).leftBrace.getCharPositionInLine() );
							
					}
					break;
				}
				setState(562);
				((ExpressionMethodsTempContext)_localctx).mt = expressionMethodsTemp(_localctx.immediateExpr);

					    ((ExpressionMethodsTempContext)_localctx).expr = ((ExpressionMethodsTempContext)_localctx).mt.expr;
					
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{

					 ((ExpressionMethodsTempContext)_localctx).expr = _localctx.instance;
					
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

	public static class ExpressionOtherContext extends ParserRuleContext {
		public Expression expr;
		public Token n;
		public Token s;
		public Token newModifier;
		public SingleTypeContext st;
		public Token leftBrace;
		public ExpressionContext size;
		public Token i;
		public Token selfModifier;
		public Token trueModifier;
		public Token falseModifier;
		public Token i1;
		public Token i2;
		public ExpressionContext e;
		public Token leftPara;
		public ExpressionContext ee;
		public Token i3;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public TerminalNode CONST_NUM() { return getToken(ToorlaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(ToorlaParser.CONST_STR, 0); }
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionOther);
		int _la;
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				((ExpressionOtherContext)_localctx).n = match(CONST_NUM);

					    ((ExpressionOtherContext)_localctx).expr = new IntValue((((ExpressionOtherContext)_localctx).n!=null?Integer.valueOf(((ExpressionOtherContext)_localctx).n.getText()):0));
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).n.getLine() , ((ExpressionOtherContext)_localctx).n.getCharPositionInLine() );
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				((ExpressionOtherContext)_localctx).s = match(CONST_STR);

					    ((ExpressionOtherContext)_localctx).expr = new StringValue((((ExpressionOtherContext)_localctx).s!=null?((ExpressionOtherContext)_localctx).s.getText():null));
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).s.getLine() , ((ExpressionOtherContext)_localctx).s.getCharPositionInLine() );
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(573);
				((ExpressionOtherContext)_localctx).st = singleType();
				setState(574);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(575);
				((ExpressionOtherContext)_localctx).size = expression();
				setState(576);
				match(T__41);

					    ((ExpressionOtherContext)_localctx).expr = new NewArray(((ExpressionOtherContext)_localctx).st.sType,((ExpressionOtherContext)_localctx).size.expr);
				        setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).newModifier.getLine() , ((ExpressionOtherContext)_localctx).newModifier.getCharPositionInLine() );
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(580);
				((ExpressionOtherContext)_localctx).i = match(ID);
				setState(581);
				match(T__11);
				setState(582);
				match(T__12);

					    Identifier instanceClass = new Identifier( (((ExpressionOtherContext)_localctx).i!=null?((ExpressionOtherContext)_localctx).i.getText():null) );
					    setNodePosition( instanceClass , ((ExpressionOtherContext)_localctx).i.getLine() , ((ExpressionOtherContext)_localctx).i.getCharPositionInLine() );
					    ((ExpressionOtherContext)_localctx).expr = new NewClassInstance( instanceClass );
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).newModifier.getLine() , ((ExpressionOtherContext)_localctx).newModifier.getCharPositionInLine() );
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				((ExpressionOtherContext)_localctx).selfModifier = match(T__43);

					    ((ExpressionOtherContext)_localctx).expr = new Self();
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).selfModifier.getLine() , ((ExpressionOtherContext)_localctx).selfModifier.getCharPositionInLine() );
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(586);
				((ExpressionOtherContext)_localctx).trueModifier = match(T__44);

					    ((ExpressionOtherContext)_localctx).expr = new BoolValue(true);
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).trueModifier.getLine() , ((ExpressionOtherContext)_localctx).trueModifier.getCharPositionInLine() );
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				((ExpressionOtherContext)_localctx).falseModifier = match(T__45);

					    ((ExpressionOtherContext)_localctx).expr = new BoolValue(false);
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).falseModifier.getLine() , ((ExpressionOtherContext)_localctx).falseModifier.getCharPositionInLine() );
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(590);
				((ExpressionOtherContext)_localctx).i1 = match(ID);

					    ((ExpressionOtherContext)_localctx).expr = new Identifier((((ExpressionOtherContext)_localctx).i1!=null?((ExpressionOtherContext)_localctx).i1.getText():null));
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).i1.getLine() , ((ExpressionOtherContext)_localctx).i1.getCharPositionInLine() );
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
				((ExpressionOtherContext)_localctx).i2 = match(ID);
				setState(593);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(594);
				((ExpressionOtherContext)_localctx).e = expression();
				setState(595);
				match(T__41);

					    Identifier instanceId = new Identifier((((ExpressionOtherContext)_localctx).i2!=null?((ExpressionOtherContext)_localctx).i2.getText():null));
				        setNodePosition( instanceId , ((ExpressionOtherContext)_localctx).i2.getLine() , ((ExpressionOtherContext)_localctx).i2.getCharPositionInLine() );
					    ((ExpressionOtherContext)_localctx).expr =  new ArrayCall( instanceId , ((ExpressionOtherContext)_localctx).e.expr );
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).leftBrace.getLine() , ((ExpressionOtherContext)_localctx).leftBrace.getCharPositionInLine() );
					
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(598);
				((ExpressionOtherContext)_localctx).leftPara = match(T__11);
				setState(599);
				((ExpressionOtherContext)_localctx).ee = expression();
				setState(600);
				match(T__12);

					    ((ExpressionOtherContext)_localctx).expr =  ((ExpressionOtherContext)_localctx).ee.expr;
					
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(603);
				((ExpressionOtherContext)_localctx).i3 = match(ID);

					    Self instance = new Self();
					    setNodePosition( instance , ((ExpressionOtherContext)_localctx).i3.getLine() , ((ExpressionOtherContext)_localctx).i3.getCharPositionInLine() );
					    Identifier methodName = new Identifier( (((ExpressionOtherContext)_localctx).i3!=null?((ExpressionOtherContext)_localctx).i3.getText():null) );
					    setNodePosition( methodName , ((ExpressionOtherContext)_localctx).i3.getLine() , ((ExpressionOtherContext)_localctx).i3.getCharPositionInLine() );
					    ((ExpressionOtherContext)_localctx).expr = new MethodCall( instance , methodName );
					    setNodePosition( _localctx.expr , ((ExpressionOtherContext)_localctx).i3.getLine() , ((ExpressionOtherContext)_localctx).i3.getCharPositionInLine() );
					
				setState(605);
				match(T__11);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
					{
					setState(606);
					((ExpressionOtherContext)_localctx).e3 = expression();
					 ((MethodCall)_localctx.expr).addArg(((ExpressionOtherContext)_localctx).e3.expr); 
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(608);
						match(T__6);
						setState(609);
						((ExpressionOtherContext)_localctx).e4 = expression();
						 ((MethodCall)_localctx.expr).addArg(((ExpressionOtherContext)_localctx).e4.expr); 
						}
						}
						setState(616);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(619);
				match(T__12);
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

	public static class ToorlaTypeContext extends ParserRuleContext {
		public Type mType;
		public SingleTypeContext st;
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public ToorlaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toorlaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterToorlaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitToorlaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitToorlaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToorlaTypeContext toorlaType() throws RecognitionException {
		ToorlaTypeContext _localctx = new ToorlaTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_toorlaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			((ToorlaTypeContext)_localctx).st = singleType();
			((ToorlaTypeContext)_localctx).mType = ((ToorlaTypeContext)_localctx).st.sType;
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(624);
				match(T__40);
				setState(625);
				match(T__41);
				((ToorlaTypeContext)_localctx).mType = new ArrayType(((ToorlaTypeContext)_localctx).st.sType);
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

	public static class SingleTypeContext extends ParserRuleContext {
		public SingleType sType;
		public Token i;
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(629);
				match(T__46);
				((SingleTypeContext)_localctx).sType = new IntType();
				}
				break;
			case T__47:
				{
				setState(631);
				match(T__47);
				((SingleTypeContext)_localctx).sType = new BoolType();
				}
				break;
			case T__48:
				{
				setState(633);
				match(T__48);
				((SingleTypeContext)_localctx).sType = new StringType();
				}
				break;
			case ID:
				{
				setState(635);
				((SingleTypeContext)_localctx).i = match(ID);
				((SingleTypeContext)_localctx).sType = new UserDefinedType(new ClassDeclaration(new Identifier((((SingleTypeContext)_localctx).i!=null?((SingleTypeContext)_localctx).i.getText():null))));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0282\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16"+
		"\2f\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5\u0087\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\7\3\7\3\7\5\7\u00a1\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00b3\n\7\f\7\16\7\u00b6\13\7\3\7\3\7\5\7\u00ba\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ee\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00fe\n\t"+
		"\f\t\16\t\u0101\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u011b\n\n\f\n\16\n"+
		"\u011e\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u0134\n\n\f\n\16\n\u0137\13\n\3\n\3\n\3\n\3"+
		"\n\5\n\u013d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0145\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u014d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u015b\n\r\f\r\16\r\u015e\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0167\n\16\f\16\16\16\u016a\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01ae\n\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01bb\n\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\5\36\u01c5\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01cd\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01d7\n \3 \3 \3 \3 \3 \3 \5 \u01df"+
		"\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u01e9\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u01f1\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u01fd\n$\3$\3$\3$\3$\3"+
		"$\3$\5$\u0205\n$\3%\3%\3%\3%\5%\u020b\n%\3%\3%\3%\3%\3%\3%\5%\u0213\n"+
		"%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0223\n\'\f"+
		"\'\16\'\u0226\13\'\5\'\u0228\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0233\n\'\3\'\3\'\3\'\3\'\5\'\u0239\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0267\n(\f(\16(\u026a\13(\5(\u026c"+
		"\n(\3(\5(\u026f\n(\3)\3)\3)\3)\3)\5)\u0276\n)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u0280\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPR\2\2\2\u029a\2T\3\2\2\2\4i\3\2\2\2\6~\3\2\2\2\b"+
		"\u0082\3\2\2\2\n\u009b\3\2\2\2\f\u00a0\3\2\2\2\16\u00ed\3\2\2\2\20\u00ef"+
		"\3\2\2\2\22\u013c\3\2\2\2\24\u0144\3\2\2\2\26\u014c\3\2\2\2\30\u014e\3"+
		"\2\2\2\32\u0161\3\2\2\2\34\u016d\3\2\2\2\36\u0171\3\2\2\2 \u0175\3\2\2"+
		"\2\"\u017a\3\2\2\2$\u0181\3\2\2\2&\u0188\3\2\2\2(\u018f\3\2\2\2*\u0195"+
		"\3\2\2\2,\u019a\3\2\2\2.\u019f\3\2\2\2\60\u01a2\3\2\2\2\62\u01ad\3\2\2"+
		"\2\64\u01af\3\2\2\2\66\u01ba\3\2\2\28\u01bc\3\2\2\2:\u01cc\3\2\2\2<\u01ce"+
		"\3\2\2\2>\u01de\3\2\2\2@\u01e0\3\2\2\2B\u01f0\3\2\2\2D\u01f2\3\2\2\2F"+
		"\u0204\3\2\2\2H\u0212\3\2\2\2J\u0214\3\2\2\2L\u0238\3\2\2\2N\u026e\3\2"+
		"\2\2P\u0270\3\2\2\2R\u027f\3\2\2\2TZ\b\2\1\2UV\5\4\3\2VW\b\2\1\2WY\3\2"+
		"\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5"+
		"\6\4\2^d\b\2\1\2_`\5\4\3\2`a\b\2\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\2\2\3h\3\3\2\2\2ij\7\3\2\2jm"+
		"\7\67\2\2kl\7\4\2\2ln\7\67\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\5\2\2"+
		"py\b\3\1\2qr\5\b\5\2rs\b\3\1\2sx\3\2\2\2tu\5\f\7\2uv\b\3\1\2vx\3\2\2\2"+
		"wq\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2"+
		"|}\7\6\2\2}\5\3\2\2\2~\177\7\7\2\2\177\u0080\5\4\3\2\u0080\u0081\b\4\1"+
		"\2\u0081\7\3\2\2\2\u0082\u0086\b\5\1\2\u0083\u0084\5\n\6\2\u0084\u0085"+
		"\b\5\1\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008a\7\67\2\2\u008a\u0090\b"+
		"\5\1\2\u008b\u008c\7\t\2\2\u008c\u008d\7\67\2\2\u008d\u008f\b\5\1\2\u008e"+
		"\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5P)\2\u0094\u0095"+
		"\7\n\2\2\u0095\u0096\b\5\1\2\u0096\t\3\2\2\2\u0097\u0098\7\13\2\2\u0098"+
		"\u009c\b\6\1\2\u0099\u009a\7\f\2\2\u009a\u009c\b\6\1\2\u009b\u0097\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\13\3\2\2\2\u009d\u009e\5\n\6\2\u009e\u009f"+
		"\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7\67\2\2\u00a4\u00b9\b"+
		"\7\1\2\u00a5\u00a6\7\16\2\2\u00a6\u00ba\7\17\2\2\u00a7\u00a8\7\16\2\2"+
		"\u00a8\u00a9\7\67\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5P)\2\u00ab\u00b4"+
		"\b\7\1\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\7\67\2\2\u00ae\u00af\7\5\2\2"+
		"\u00af\u00b0\5P)\2\u00b0\u00b1\b\7\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00a7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\20\2\2\u00bc\u00bd\5P)\2\u00bd\u00be\b\7\1\2\u00be\u00c4\7\5"+
		"\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\b\7\1\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00c9\b\7\1\2\u00c9\r\3\2\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\b\b\1"+
		"\2\u00cc\u00ee\3\2\2\2\u00cd\u00ce\5\20\t\2\u00ce\u00cf\b\b\1\2\u00cf"+
		"\u00ee\3\2\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\b\b\1\2\u00d2\u00ee\3"+
		"\2\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\b\b\1\2\u00d5\u00ee\3\2\2\2\u00d6"+
		"\u00d7\5(\25\2\u00d7\u00d8\b\b\1\2\u00d8\u00ee\3\2\2\2\u00d9\u00da\5 "+
		"\21\2\u00da\u00db\b\b\1\2\u00db\u00ee\3\2\2\2\u00dc\u00dd\5\30\r\2\u00dd"+
		"\u00de\b\b\1\2\u00de\u00ee\3\2\2\2\u00df\u00e0\5\34\17\2\u00e0\u00e1\b"+
		"\b\1\2\u00e1\u00ee\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\b\b\1\2\u00e4"+
		"\u00ee\3\2\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\b\b\1\2\u00e7\u00ee\3\2"+
		"\2\2\u00e8\u00e9\5,\27\2\u00e9\u00ea\b\b\1\2\u00ea\u00ee\3\2\2\2\u00eb"+
		"\u00ec\7\n\2\2\u00ec\u00ee\b\b\1\2\u00ed\u00ca\3\2\2\2\u00ed\u00cd\3\2"+
		"\2\2\u00ed\u00d0\3\2\2\2\u00ed\u00d3\3\2\2\2\u00ed\u00d6\3\2\2\2\u00ed"+
		"\u00d9\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00df\3\2\2\2\u00ed\u00e2\3\2"+
		"\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\17\3\2\2\2\u00ef\u00f0\b\t\1\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\16"+
		"\2\2\u00f2\u00f3\5.\30\2\u00f3\u00f4\7\17\2\2\u00f4\u00f5\5\16\b\2\u00f5"+
		"\u00ff\b\t\1\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\5"+
		".\30\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc\b\t\1\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7\23\2\2\u0103\u0104\5\16\b\2\u0104\u0105\b\t\1\2\u0105\21\3\2"+
		"\2\2\u0106\u0107\7\21\2\2\u0107\u0108\7\16\2\2\u0108\u0109\5.\30\2\u0109"+
		"\u010a\7\17\2\2\u010a\u010b\5\26\f\2\u010b\u010c\b\n\1\2\u010c\u013d\3"+
		"\2\2\2\u010d\u010e\7\21\2\2\u010e\u010f\7\16\2\2\u010f\u0110\5.\30\2\u0110"+
		"\u0111\7\17\2\2\u0111\u0112\5\16\b\2\u0112\u011c\b\n\1\2\u0113\u0114\7"+
		"\22\2\2\u0114\u0115\7\16\2\2\u0115\u0116\5.\30\2\u0116\u0117\7\17\2\2"+
		"\u0117\u0118\5\16\b\2\u0118\u0119\b\n\1\2\u0119\u011b\3\2\2\2\u011a\u0113"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\22\2\2\u0120\u0121\7"+
		"\16\2\2\u0121\u0122\5.\30\2\u0122\u0123\7\17\2\2\u0123\u0124\5\26\f\2"+
		"\u0124\u0125\b\n\1\2\u0125\u013d\3\2\2\2\u0126\u0127\7\21\2\2\u0127\u0128"+
		"\7\16\2\2\u0128\u0129\5.\30\2\u0129\u012a\7\17\2\2\u012a\u012b\5\16\b"+
		"\2\u012b\u0135\b\n\1\2\u012c\u012d\7\22\2\2\u012d\u012e\7\16\2\2\u012e"+
		"\u012f\5.\30\2\u012f\u0130\7\17\2\2\u0130\u0131\5\16\b\2\u0131\u0132\b"+
		"\n\1\2\u0132\u0134\3\2\2\2\u0133\u012c\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7\23\2\2\u0139\u013a\5\24\13\2\u013a\u013b\b\n\1\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0106\3\2\2\2\u013c\u010d\3\2\2\2\u013c\u0126\3\2"+
		"\2\2\u013d\23\3\2\2\2\u013e\u013f\5$\23\2\u013f\u0140\b\13\1\2\u0140\u0145"+
		"\3\2\2\2\u0141\u0142\5\22\n\2\u0142\u0143\b\13\1\2\u0143\u0145\3\2\2\2"+
		"\u0144\u013e\3\2\2\2\u0144\u0141\3\2\2\2\u0145\25\3\2\2\2\u0146\u0147"+
		"\5\16\b\2\u0147\u0148\b\f\1\2\u0148\u014d\3\2\2\2\u0149\u014a\5\24\13"+
		"\2\u014a\u014b\b\f\1\2\u014b\u014d\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0149"+
		"\3\2\2\2\u014d\27\3\2\2\2\u014e\u014f\b\r\1\2\u014f\u0150\7\24\2\2\u0150"+
		"\u0151\7\67\2\2\u0151\u0152\7\25\2\2\u0152\u0153\5.\30\2\u0153\u015c\b"+
		"\r\1\2\u0154\u0155\7\t\2\2\u0155\u0156\7\67\2\2\u0156\u0157\7\25\2\2\u0157"+
		"\u0158\5.\30\2\u0158\u0159\b\r\1\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\n\2\2\u0160\31\3\2\2"+
		"\2\u0161\u0162\b\16\1\2\u0162\u0168\7\26\2\2\u0163\u0164\5\26\f\2\u0164"+
		"\u0165\b\16\1\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016c\7\6\2\2\u016c\33\3\2\2\2\u016d\u016e\7\27\2"+
		"\2\u016e\u016f\7\n\2\2\u016f\u0170\b\17\1\2\u0170\35\3\2\2\2\u0171\u0172"+
		"\7\30\2\2\u0172\u0173\7\n\2\2\u0173\u0174\b\20\1\2\u0174\37\3\2\2\2\u0175"+
		"\u0176\7\31\2\2\u0176\u0177\5.\30\2\u0177\u0178\7\n\2\2\u0178\u0179\b"+
		"\21\1\2\u0179!\3\2\2\2\u017a\u017b\7\32\2\2\u017b\u017c\7\16\2\2\u017c"+
		"\u017d\5.\30\2\u017d\u017e\7\17\2\2\u017e\u017f\5\16\b\2\u017f\u0180\b"+
		"\22\1\2\u0180#\3\2\2\2\u0181\u0182\7\32\2\2\u0182\u0183\7\16\2\2\u0183"+
		"\u0184\5.\30\2\u0184\u0185\7\17\2\2\u0185\u0186\5\24\13\2\u0186\u0187"+
		"\b\23\1\2\u0187%\3\2\2\2\u0188\u0189\7\33\2\2\u0189\u018a\7\16\2\2\u018a"+
		"\u018b\5.\30\2\u018b\u018c\7\17\2\2\u018c\u018d\7\n\2\2\u018d\u018e\b"+
		"\24\1\2\u018e\'\3\2\2\2\u018f\u0190\5.\30\2\u0190\u0191\7\25\2\2\u0191"+
		"\u0192\5.\30\2\u0192\u0193\7\n\2\2\u0193\u0194\b\25\1\2\u0194)\3\2\2\2"+
		"\u0195\u0196\5.\30\2\u0196\u0197\7\34\2\2\u0197\u0198\7\n\2\2\u0198\u0199"+
		"\b\26\1\2\u0199+\3\2\2\2\u019a\u019b\5.\30\2\u019b\u019c\7\35\2\2\u019c"+
		"\u019d\7\n\2\2\u019d\u019e\b\27\1\2\u019e-\3\2\2\2\u019f\u01a0\5\60\31"+
		"\2\u01a0\u01a1\b\30\1\2\u01a1/\3\2\2\2\u01a2\u01a3\5\64\33\2\u01a3\u01a4"+
		"\5\62\32\2\u01a4\u01a5\b\31\1\2\u01a5\61\3\2\2\2\u01a6\u01a7\7\36\2\2"+
		"\u01a7\u01a8\5\64\33\2\u01a8\u01a9\b\32\1\2\u01a9\u01aa\5\62\32\2\u01aa"+
		"\u01ab\b\32\1\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\b\32\1\2\u01ad\u01a6\3"+
		"\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\63\3\2\2\2\u01af\u01b0\58\35\2\u01b0"+
		"\u01b1\5\66\34\2\u01b1\u01b2\b\33\1\2\u01b2\65\3\2\2\2\u01b3\u01b4\7\37"+
		"\2\2\u01b4\u01b5\58\35\2\u01b5\u01b6\b\34\1\2\u01b6\u01b7\5\66\34\2\u01b7"+
		"\u01b8\b\34\1\2\u01b8\u01bb\3\2\2\2\u01b9\u01bb\b\34\1\2\u01ba\u01b3\3"+
		"\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\67\3\2\2\2\u01bc\u01bd\5<\37\2\u01bd"+
		"\u01be\5:\36\2\u01be\u01bf\b\35\1\2\u01bf9\3\2\2\2\u01c0\u01c1\7 \2\2"+
		"\u01c1\u01c5\b\36\1\2\u01c2\u01c3\7!\2\2\u01c3\u01c5\b\36\1\2\u01c4\u01c0"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5<\37\2\u01c7"+
		"\u01c8\b\36\1\2\u01c8\u01c9\5:\36\2\u01c9\u01ca\b\36\1\2\u01ca\u01cd\3"+
		"\2\2\2\u01cb\u01cd\b\36\1\2\u01cc\u01c4\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		";\3\2\2\2\u01ce\u01cf\5@!\2\u01cf\u01d0\5> \2\u01d0\u01d1\b\37\1\2\u01d1"+
		"=\3\2\2\2\u01d2\u01d3\7\"\2\2\u01d3\u01d7\b \1\2\u01d4\u01d5\7#\2\2\u01d5"+
		"\u01d7\b \1\2\u01d6\u01d2\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\5@!\2\u01d9\u01da\b \1\2\u01da\u01db\5> \2\u01db\u01dc"+
		"\b \1\2\u01dc\u01df\3\2\2\2\u01dd\u01df\b \1\2\u01de\u01d6\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df?\3\2\2\2\u01e0\u01e1\5D#\2\u01e1\u01e2\5B\"\2\u01e2"+
		"\u01e3\b!\1\2\u01e3A\3\2\2\2\u01e4\u01e5\7$\2\2\u01e5\u01e9\b\"\1\2\u01e6"+
		"\u01e7\7%\2\2\u01e7\u01e9\b\"\1\2\u01e8\u01e4\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\5D#\2\u01eb\u01ec\b\"\1\2\u01ec\u01ed"+
		"\5B\"\2\u01ed\u01ee\b\"\1\2\u01ee\u01f1\3\2\2\2\u01ef\u01f1\b\"\1\2\u01f0"+
		"\u01e8\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1C\3\2\2\2\u01f2\u01f3\5H%\2\u01f3"+
		"\u01f4\5F$\2\u01f4\u01f5\b#\1\2\u01f5E\3\2\2\2\u01f6\u01f7\7&\2\2\u01f7"+
		"\u01fd\b$\1\2\u01f8\u01f9\7\'\2\2\u01f9\u01fd\b$\1\2\u01fa\u01fb\7(\2"+
		"\2\u01fb\u01fd\b$\1\2\u01fc\u01f6\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5H%\2\u01ff\u0200\b$\1\2\u0200"+
		"\u0201\5F$\2\u0201\u0202\b$\1\2\u0202\u0205\3\2\2\2\u0203\u0205\b$\1\2"+
		"\u0204\u01fc\3\2\2\2\u0204\u0203\3\2\2\2\u0205G\3\2\2\2\u0206\u0207\7"+
		")\2\2\u0207\u020b\b%\1\2\u0208\u0209\7%\2\2\u0209\u020b\b%\1\2\u020a\u0206"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5H%\2\u020d"+
		"\u020e\b%\1\2\u020e\u0213\3\2\2\2\u020f\u0210\5J&\2\u0210\u0211\b%\1\2"+
		"\u0211\u0213\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u020f\3\2\2\2\u0213I\3"+
		"\2\2\2\u0214\u0215\5N(\2\u0215\u0216\5L\'\2\u0216\u0217\b&\1\2\u0217K"+
		"\3\2\2\2\u0218\u0219\7*\2\2\u0219\u021a\7\67\2\2\u021a\u021b\b\'\1\2\u021b"+
		"\u0227\7\16\2\2\u021c\u021d\5.\30\2\u021d\u0224\b\'\1\2\u021e\u021f\7"+
		"\t\2\2\u021f\u0220\5.\30\2\u0220\u0221\b\'\1\2\u0221\u0223\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u021c\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0233\7\17\2\2\u022a\u022b\7"+
		"*\2\2\u022b\u022c\7\67\2\2\u022c\u0233\b\'\1\2\u022d\u022e\7+\2\2\u022e"+
		"\u022f\5.\30\2\u022f\u0230\7,\2\2\u0230\u0231\b\'\1\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0218\3\2\2\2\u0232\u022a\3\2\2\2\u0232\u022d\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\5L\'\2\u0235\u0236\b\'\1\2\u0236\u0239\3\2"+
		"\2\2\u0237\u0239\b\'\1\2\u0238\u0232\3\2\2\2\u0238\u0237\3\2\2\2\u0239"+
		"M\3\2\2\2\u023a\u023b\7\64\2\2\u023b\u026f\b(\1\2\u023c\u023d\7\65\2\2"+
		"\u023d\u026f\b(\1\2\u023e\u023f\7-\2\2\u023f\u0240\5R*\2\u0240\u0241\7"+
		"+\2\2\u0241\u0242\5.\30\2\u0242\u0243\7,\2\2\u0243\u0244\b(\1\2\u0244"+
		"\u026f\3\2\2\2\u0245\u0246\7-\2\2\u0246\u0247\7\67\2\2\u0247\u0248\7\16"+
		"\2\2\u0248\u0249\7\17\2\2\u0249\u026f\b(\1\2\u024a\u024b\7.\2\2\u024b"+
		"\u026f\b(\1\2\u024c\u024d\7/\2\2\u024d\u026f\b(\1\2\u024e\u024f\7\60\2"+
		"\2\u024f\u026f\b(\1\2\u0250\u0251\7\67\2\2\u0251\u026f\b(\1\2\u0252\u0253"+
		"\7\67\2\2\u0253\u0254\7+\2\2\u0254\u0255\5.\30\2\u0255\u0256\7,\2\2\u0256"+
		"\u0257\b(\1\2\u0257\u026f\3\2\2\2\u0258\u0259\7\16\2\2\u0259\u025a\5."+
		"\30\2\u025a\u025b\7\17\2\2\u025b\u025c\b(\1\2\u025c\u026f\3\2\2\2\u025d"+
		"\u025e\7\67\2\2\u025e\u025f\b(\1\2\u025f\u026b\7\16\2\2\u0260\u0261\5"+
		".\30\2\u0261\u0268\b(\1\2\u0262\u0263\7\t\2\2\u0263\u0264\5.\30\2\u0264"+
		"\u0265\b(\1\2\u0265\u0267\3\2\2\2\u0266\u0262\3\2\2\2\u0267\u026a\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u0260\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\7\17\2\2\u026e\u023a\3\2\2\2\u026e\u023c\3\2\2\2\u026e"+
		"\u023e\3\2\2\2\u026e\u0245\3\2\2\2\u026e\u024a\3\2\2\2\u026e\u024c\3\2"+
		"\2\2\u026e\u024e\3\2\2\2\u026e\u0250\3\2\2\2\u026e\u0252\3\2\2\2\u026e"+
		"\u0258\3\2\2\2\u026e\u025d\3\2\2\2\u026fO\3\2\2\2\u0270\u0271\5R*\2\u0271"+
		"\u0275\b)\1\2\u0272\u0273\7+\2\2\u0273\u0274\7,\2\2\u0274\u0276\b)\1\2"+
		"\u0275\u0272\3\2\2\2\u0275\u0276\3\2\2\2\u0276Q\3\2\2\2\u0277\u0278\7"+
		"\61\2\2\u0278\u0280\b*\1\2\u0279\u027a\7\62\2\2\u027a\u0280\b*\1\2\u027b"+
		"\u027c\7\63\2\2\u027c\u0280\b*\1\2\u027d\u027e\7\67\2\2\u027e\u0280\b"+
		"*\1\2\u027f\u0277\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u027b\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280S\3\2\2\2,Zdmwy\u0086\u0090\u009b\u00a0\u00b4\u00b9"+
		"\u00c4\u00ed\u00ff\u011c\u0135\u013c\u0144\u014c\u015c\u0168\u01ad\u01ba"+
		"\u01c4\u01cc\u01d6\u01de\u01e8\u01f0\u01fc\u0204\u020a\u0212\u0224\u0227"+
		"\u0232\u0238\u0268\u026b\u026e\u0275\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}