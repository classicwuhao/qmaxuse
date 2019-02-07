grammar TestSuite;
options {
  superClass = BaseParser;
}

@header { 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.soil.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.parser.ocl.*;
import java.util.Collections;
import java.util.Arrays;
}

@lexer::header {
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.ParseErrorHandler;
}

@lexer::members {
    private ParseErrorHandler fParseErrorHandler;

    public String getFilename() {
        return fParseErrorHandler.getFileName();
    }
    
    @Override
    public String getErrorHeader(RecognitionException e) {
    	return "line " + e.line + ":" + e.charPositionInLine;
    }
    	
    public void emitErrorMessage(String msg) {
       	fParseErrorHandler.reportError(msg);
	}
 
    public void init(ParseErrorHandler handler) {
        fParseErrorHandler = handler;
    }
}

// grammar for testsuite

/* ------------------------------------
  testSuite ::= 'testsuite' IDENT 'for' 'model' filename
  				['setup'  cmdList 'end']
  				['finish' cmdList 'end']
  				tests*
*/
testSuite returns [ASTTestSuite suite]
@init{
  List setupStatements = new ArrayList();
}
:
  'testsuite'
    suiteName = IDENT { $suite = new ASTTestSuite($suiteName); }
    
  'for' 'model' 
    modelFile=filename { $suite.setModelFile($suiteName); }
    
  ('setup' 
  	('!' c = shellCommandOnly { setupStatements.add($c.n); })* 'end' { $suite.setSetupStatements(setupStatements); }
  )?
     
  tests = testCases { $suite.setTestCases($tests.testCases); }
  
  EOF
;

filename returns [String filename]
:
   name=IDENT '.' suffix=IDENT {$filename = $name.text + "." + $suffix.text;}
;

testCases returns [List testCases]
@init { $testCases = new ArrayList(); }
:
  (test = testCase { $testCases.add($test.n); })+
;

testCase returns [ASTTestCase n]
:
  'testcase' name=IDENT { $n = new ASTTestCase($name); }
  (
      '!' c = shellCommandOnly { $n.addStatement($c.n); } 
    |
      a=assertStatement { $n.addStatement($a.n); }
    |
      b='beginVariation' { $n.addStatement(new ASTVariationStart($b)); }
    |
      e='endVariation' { $n.addStatement(new ASTVariationEnd($e)); }
   )*
  'end'
;

assertStatement returns [ASTAssert n]
@init{ boolean valid = true; }
:
  s='assert'
  ('valid' { valid = true; } | 'invalid' {valid = false; })
  (
      exp = expression { $n = new ASTAssertOclExpression($exp.n.getStartToken(), input.LT(-1), valid, $exp.n); }
    |
      'invs' { $n = new ASTAssertGlobalInvariants($s, input.LT(-1), valid); }
    |
      'invs' classname=IDENT { $n = new ASTAssertClassInvariants($s, input.LT(-1), valid, $classname); }
    |
      'inv' classname=IDENT COLON_COLON invname=IDENT { $n = new ASTAssertSingleInvariant($s, input.LT(-1), valid, $classname, $invname); }
    |
      pre = assertionStatementPre[s=$s, valid=valid] {$n = $pre.n; }
    |
      post = assertionStatementPost[s=$s, valid=valid] {$n = $post.n; }
  )
  (
    COMMA msg=STRING { $n.setMessage($msg); }
  )?
;

assertionStatementPre[Token s, boolean valid] returns [ASTAssertPre n]
:
  'pre' objExp=expression opName=IDENT { $n = new ASTAssertPre($s, null, $valid, $objExp.n, $opName); }
  LPAREN 
    ( e=expression { $n.addArg($e.n); } ( COMMA e=expression { $n.addArg($e.n); } )* )? 
  RPAREN (COLON_COLON name=IDENT { $n.setConditionName($name); } )?
  { $n.setEnd(input.LT(-1)); }
;

assertionStatementPost[Token s, boolean valid] returns [ASTAssertPost n]
:
  'post' { $n = new ASTAssertPost($s, null, $valid); }
  (name=IDENT { $n.setConditionName($name); } )?
  { $n.setEnd(input.LT(-1)); }
;
/*
--------- Start of file OCLBase.gpart -------------------- 
*/

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2012 University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
/* ------------------------------------
  expressionOnly ::= 
    conditionalImpliesExpression
*/
expressionOnly returns [ASTExpression n]
:
    nExp=expression EOF {$n = $nExp.n;}
    ;
    
/* ------------------------------------
  expression ::= 
    { "let" id [ : type ] "=" expression "in" } conditionalImpliesExpression
*/
expression returns [ASTExpression n]
@init{ 
  ASTLetExpression prevLet = null, firstLet = null;
  ASTExpression e2;
  Token tok = null;
}
:
    { tok = input.LT(1); /* remember start of expression */ }
    ( 
      'let' 
      name=IDENT ( COLON t=type )? EQUAL e1=expression
      
      { ASTLetExpression nextLet = new ASTLetExpression($name, $t.n, $e1.n);
         if ( firstLet == null ) 
             firstLet = nextLet;
         if ( prevLet != null ) 
             prevLet.setInExpr(nextLet);
         prevLet = nextLet;
      }
      
      (
      COMMA
        name=IDENT ( COLON t=type )? EQUAL e1=expression
      
        { ASTLetExpression nextLet = new ASTLetExpression($name, $t.n, $e1.n);
           if ( firstLet == null ) 
               firstLet = nextLet;
           if ( prevLet != null ) 
               prevLet.setInExpr(nextLet);
           prevLet = nextLet;
        }
      )*
      
      'in'
    )*

    nCndImplies=conditionalImpliesExpression
    { 
        if ( $nCndImplies.n != null ) {
    	 $n = $nCndImplies.n;
         $n.setStartToken(tok);
      }
      
      if ( prevLet != null ) { 
         prevLet.setInExpr($n);
         $n = firstLet;
         $n.setStartToken(tok);
      }
    }
    ;

/* ------------------------------------
  paramList ::= 
    "(" [ variableDeclaration { "," variableDeclaration } ] ")"
*/
paramList returns [List<ASTVariableDeclaration> paramList]
@init{ $paramList = new ArrayList<ASTVariableDeclaration>(); }
:
    LPAREN
    ( 
      v=variableDeclaration { paramList.add($v.n); }
      ( COMMA v=variableDeclaration  { paramList.add($v.n); } )* 
    )?
    RPAREN
    ;

/* ------------------------------------
  idList ::= id { "," id }
*/
idList returns [List idList]
@init{ $idList = new ArrayList(); }
:
    id0=IDENT { $idList.add($id0); }
    ( COMMA idn=IDENT { $idList.add($idn); } )*
    ;


/* ------------------------------------
  variableDeclaration ::= 
    id ":" type
*/
variableDeclaration returns [ASTVariableDeclaration n]
:
    name=IDENT COLON t=type
    { n = new ASTVariableDeclaration($name, $t.n); }
    ;
    
/* ------------------------------------
  conditionalImpliesExpression ::= 
    conditionalOrExpression { "implies" conditionalOrExpression }
*/
conditionalImpliesExpression returns [ASTExpression n]
: 
    nCndOrExp=conditionalOrExpression {$n = $nCndOrExp.n;} 
    ( op='implies' n1=conditionalOrExpression 
        { $n = new ASTBinaryExpression($op, $n, $n1.n); } 
    )*
    ;

/* ------------------------------------
  conditionalOrExpression ::= 
    conditionalXOrExpression { "or" conditionalXOrExpression }
*/
conditionalOrExpression returns [ASTExpression n]
: 
    nCndXorExp=conditionalXOrExpression {$n = $nCndXorExp.n;} 
    ( op='or' n1=conditionalXOrExpression
        { $n = new ASTBinaryExpression($op, $n, $n1.n); } 
    )*
    ;

/* ------------------------------------
  conditionalXOrExpression ::= 
    conditionalAndExpression { "xor" conditionalAndExpression }
*/
conditionalXOrExpression returns [ASTExpression n]
: 
    nCndAndExp=conditionalAndExpression {$n = $nCndAndExp.n;} 
    ( op='xor' n1=conditionalAndExpression
        { $n = new ASTBinaryExpression($op, $n, $n1.n); } 
    )*
    ;

/* ------------------------------------
  conditionalAndExpression ::= 
    equalityExpression { "and" equalityExpression }
*/
conditionalAndExpression returns [ASTExpression n]
: 
    nEqExp=equalityExpression {$n = $nEqExp.n;} 
    ( op='and' n1=equalityExpression
        { $n = new ASTBinaryExpression($op, $n, $n1.n); }
    )*
    ;

/* ------------------------------------
  equalityExpression ::= 
    relationalExpression { ("=" | "<>") relationalExpression }
*/
equalityExpression returns [ASTExpression n]
@init { Token op = null; }
: 
    nRelExp=relationalExpression {$n = $nRelExp.n;} 
    ( { op = input.LT(1); }
      (EQUAL | NOT_EQUAL) n1=relationalExpression
        { $n = new ASTBinaryExpression(op, $n, $n1.n); } 
    )*
    ;

/* ------------------------------------
  relationalExpression ::= 
    additiveExpression { ("<" | ">" | "<=" | ">=") additiveExpression }
*/
relationalExpression returns [ASTExpression n]
@init { Token op = null; }
: 
    nAddiExp=additiveExpression {$n = $nAddiExp.n;}
    ( { op = input.LT(1); }
      (LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) n1=additiveExpression 
        { $n = new ASTBinaryExpression(op, $n, $n1.n); } 
    )*
    ;

/* ------------------------------------
  additiveExpression ::= 
    multiplicativeExpression { ("+" | "-") multiplicativeExpression }
*/
additiveExpression returns [ASTExpression n]
@init { Token op = null; }
: 
    nMulExp=multiplicativeExpression {$n = $nMulExp.n;}
    ( { op = input.LT(1); }
      (PLUS | MINUS) n1=multiplicativeExpression
        { $n = new ASTBinaryExpression(op, $n, $n1.n); } 
    )*
    ;


/* ------------------------------------
  multiplicativeExpression ::= 
    unaryExpression { ("*" | "/" | "div") unaryExpression }
*/
multiplicativeExpression returns [ASTExpression n]
@init { Token op = null; }
: 
    nUnExp=unaryExpression { $n = $nUnExp.n;}
    ( { op = input.LT(1); }
      (STAR | SLASH | 'div') n1=unaryExpression
        { $n = new ASTBinaryExpression(op, $n, $n1.n); } 
    )*
    ;


/* ------------------------------------
  unaryExpression ::= 
      ( "not" | "-" | "+" ) unaryExpression
    | postfixExpression
*/
unaryExpression returns [ASTExpression n]
@init { Token op = null; }
: 
      ( { op = input.LT(1); }
        ('not' | MINUS | PLUS ) 
        nUnExp=unaryExpression { $n = new ASTUnaryExpression(op, $nUnExp.n); }
      )
    | nPosExp=postfixExpression { $n = $nPosExp.n; }
    ;


/* ------------------------------------<fileset file="${parser.dir}/ocl/OCL.gpart" />
  postfixExpression ::= 
      primaryExpression { ( "." | "->" ) propertyCall }
*/
postfixExpression returns [ASTExpression n]
@init{ boolean arrow = false; }
: 
    nPrimExp=primaryExpression { $n = $nPrimExp.n; }
    ( 
     ( ARROW { arrow = true; } | DOT { arrow = false; } ) 
		nPc=propertyCall[$n, arrow] { $n = $nPc.n; }
    )*
    ;


/* ------------------------------------
  primaryExpression ::= 
      literal
    | propertyCall
    | "(" expression ")"
    | ifExpression

  Note: propertyCall includes variables
*/

primaryExpression returns [ASTExpression n]
: 
      nLit=literal { $n = $nLit.n; }
    | nOr = objectReference { $n = $nOr.n; }
    | nPc=propertyCall[null, false] { $n = $nPc.n; }
    | LPAREN nExp=expression RPAREN { $n = $nExp.n; }
    | nIfExp=ifExpression { $n = $nIfExp.n; }
    | id1=IDENT DOT 'allInstances' 
        { $n = new ASTAllInstancesExpression($id1); }
        ( AT 'pre' { $n.setIsPre(); } ) ?
        ( LPAREN RPAREN )?
    | id2=IDENT DOT 'byUseId' ( LPAREN idExp=expression RPAREN )
      { $n = new ASTObjectByUseIdExpression($id2, $idExp.n); }
      ( AT 'pre' { $n.setIsPre(); } ) ?
    ;


objectReference returns [ASTExpression n]
:
  AT
  objectName = IDENT
  { n = new ASTObjectReferenceExpression(objectName); }
;

/* ------------------------------------
  propertyCall ::= 
      queryId   "(" [ elemVarsDeclaration "|" ] expression ")"
    | "iterate" "(" elemVarsDeclaration ";" variableInitialization "|" expression ")"
    | id [ "(" actualParameterList ")" ]


  Note: source may be null (see primaryExpression).
*/
propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n]
:
      // this semantic predicate disambiguates operations from
      // iterate-based expressions which have a different syntax (the
      // OCL grammar is very loose here).
      { org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) }?
      { input.LA(2) == LPAREN }?
      nExpQuery=queryExpression[source] { $n = $nExpQuery.n; }
    | nExpIterate=iterateExpression[source] { $n = $nExpIterate.n; }
    | nExpOperation=operationExpression[source, followsArrow] { $n = $nExpOperation.n; }
    | nExpType=typeExpression[source, followsArrow] { $n = $nExpType.n; }
    | nExpInState=inStateExpression[source, followsArrow] { $n = $nExpInState.n; }
    ;


/* ------------------------------------
  queryExpression ::= 
    ("select" | "reject" | "collect" | "exists" | "forAll" | "isUnique" | "sortedBy" ) 
    "(" [ elemVarsDeclaration "|" ] expression ")"
*/
queryExpression[ASTExpression range] returns [ASTExpression n]	
@init {ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); }:
    op=IDENT 
    LPAREN 
    ( decls=elemVarsDeclaration {decl = $decls.n;} BAR )?
    nExp=expression
    RPAREN
    { $n = new ASTQueryExpression($op, $range, decl, $nExp.n); }
    ;


/* ------------------------------------
  iterateExpression ::= 
    "iterate" "(" 
    elemVarsDeclaration ";" 
    variableInitialization "|"
    expression ")"
*/
iterateExpression[ASTExpression range] returns [ASTExpression n]:
    i='iterate'
    LPAREN
    decls=elemVarsDeclaration SEMI
    init=variableInitialization BAR
    nExp=expression
    RPAREN
    { $n = new ASTIterateExpression($i, $range, $decls.n, $init.n, $nExp.n); }
    ;


/* ------------------------------------
  operationExpression ::= 
    id ( ("[" id "]") 
       | ( [ "@" "pre" ] [ "(" [ expression { "," expression } ] ")" ] ) )
*/

// Operations always require parentheses even if no arguments are
// required. This makes it easier, for example, to distinguish a
// class-defined operation from an attribute access operation where
// both operations may have the same name.

operationExpression[ASTExpression source, boolean followsArrow] 
    returns [ASTOperationExpression n]
:
    name=IDENT 
    { $n = new ASTOperationExpression($name, $source, $followsArrow); }

	// This is a little dirty, because either it is a navigation
	// along a m-ary association or a navigation over a qualified association 
	// or both.
    ( LBRACK 
        rolename=expression { $n.addExplicitRolenameOrQualifier($rolename.n); }
        (COMMA rolename=expression { $n.addExplicitRolenameOrQualifier($rolename.n); })*
      RBRACK
      
      ( LBRACK 
          rolename=expression { $n.addQualifier($rolename.n); }
          (COMMA rolename=expression { $n.addQualifier($rolename.n); })*
        RBRACK
      )?
    )?

    ( AT 'pre' { $n.setIsPre(); } ) ?
    
    (
      LPAREN { $n.hasParentheses(); }
      ( 
	     e=expression { $n.addArg($e.n); }
	     ( COMMA e=expression { $n.addArg($e.n); } )* 
	  )?
      RPAREN
    )?
    { $n.setStartToken($start); }
    ;

inStateExpression[ASTExpression source, boolean followsArrow]
  returns [ASTInStateExpression n]:
   opToken='oclInState'
   LPAREN
   s = IDENT
   RPAREN
   { $n = new ASTInStateExpression($opToken, $source, $s, $followsArrow); }
;

/* ------------------------------------
  typeExpression ::= 
    ("oclAsType" | "oclIsKindOf" | "oclIsTypeOf" | "selectByType" | "selectByKind" ) LPAREN type RPAREN
*/

typeExpression[ASTExpression source, boolean followsArrow] 
    returns [ASTTypeArgExpression n]
@init { Token opToken = null; }
:
	{ opToken = input.LT(1); }
	( 'oclAsType' | 'oclIsKindOf' |  'oclIsTypeOf' | 'selectByType' | 'selectByKind' )
	LPAREN t=type RPAREN 
      { $n = new ASTTypeArgExpression(opToken, $source, $t.n, $followsArrow); }
    ;


/* ------------------------------------
  elemVarsDeclaration ::= 
    id (":" type)? ("," id (":" type)?)*  
*/
elemVarsDeclaration returns [ASTElemVarsDeclaration n]
:
{ $n = new ASTElemVarsDeclaration(); }
   var1 = IDENT (COLON t=type)? {$n.addDeclaration($var1, $t.n);}
   (COMMA varN = IDENT (COLON tN = type)? {$n.addDeclaration($varN, $tN.n); })*
;


/* ------------------------------------
  variableInitialization ::= 
    id ":" type "=" expression
*/
variableInitialization returns [ASTVariableInitialization n]
:
    name=IDENT COLON t=type EQUAL e=expression
    { $n = new ASTVariableInitialization($name, $t.n, $e.n); }
    ;


/* ------------------------------------
  ifExpression ::= 
    "if" expression "then" expression "else" expression "endif"
*/
ifExpression returns [ASTExpression n]
:
    i='if' cond=expression 'then' t=expression 'else' e=expression 'endif'
        { $n = new ASTIfExpression($i, $cond.n, $t.n, $e.n); } 
    ;


/* ------------------------------------
  literal ::= 
      "true"
    | "false"
    | INT
    | REAL
    | STRING
    | "#" id
    | id "::" id
    | collectionLiteral
    | emptyCollectionLiteral
    | undefinedLiteral
    | tupleLiteral
*/
literal returns [ASTExpression n]
:
      t='true'   { $n = new ASTBooleanLiteral(true); }
    | f='false'  { $n = new ASTBooleanLiteral(false); }
    | i=INT    { $n = new ASTIntegerLiteral($i); }
    | r=REAL   { $n = new ASTRealLiteral($r); }
    | s=STRING { $n = new ASTStringLiteral($s); }
    | HASH enumLit=IDENT { $n = new ASTEnumLiteral($enumLit);}
    | enumName=IDENT '::' enumLit=IDENT { $n = new ASTEnumLiteral($enumName, $enumLit); }
    | nColIt=collectionLiteral { $n = $nColIt.n; }
    | nEColIt=emptyCollectionLiteral { $n = $nEColIt.n; }
    | nUndLit=undefinedLiteral {$n = $nUndLit.n; }
    | nTupleLit=tupleLiteral {$n = $nTupleLit.n; }
    | un=STAR { $n = new ASTUnlimitedNaturalLiteral($un); }
    ;


/* ------------------------------------
  collectionLiteral ::= 
    ( "Set" | "Sequence" | "Bag" | "OrderedSet" ) "{" collectionItem { "," collectionItem } "}"
*/
collectionLiteral returns [ASTCollectionLiteral n]
@init { Token op = null; }
:
    { op = input.LT(1); } 
    ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) 
    { $n = new ASTCollectionLiteral(op); }
    LBRACE 
    (
      ci=collectionItem { $n.addItem($ci.n); } 
      ( COMMA ci=collectionItem { $n.addItem($ci.n); } )*
    )? 
    RBRACE
    ;

/* ------------------------------------
  collectionItem ::=
    expression [ ".." expression ]
*/
collectionItem returns [ASTCollectionItem n]
@init{ $n = new ASTCollectionItem(); }
:
    e=expression { $n.setFirst($e.n); } 
    ( DOTDOT e=expression { $n.setSecond($e.n); } )?
    ;


/* ------------------------------------
  emptyCollectionLiteral ::= 
    "oclEmpty" "(" collectionType ")"

  Hack for avoiding typing problems with e.g. Set{}
*/
emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n]
:
    'oclEmpty' LPAREN t=collectionType RPAREN
    { $n = new ASTEmptyCollectionLiteral($t.n); }
|
    t=collectionType LBRACE RBRACE
    { $n = new ASTEmptyCollectionLiteral($t.n); }
    ;


/* ------------------------------------
  undefinedLiteral ::= 
    "oclUndefined" "(" type ")"

  OCL extension
*/
undefinedLiteral returns [ASTUndefinedLiteral n]
:
    'oclUndefined' LPAREN t=type RPAREN
    { $n = new ASTUndefinedLiteral($t.n); }
|
    'Undefined'
    { $n = new ASTUndefinedLiteral(); }
|
    'null' LPAREN t=type RPAREN
    { $n = new ASTUndefinedLiteral(t); }
|
    'null'
    { $n = new ASTUndefinedLiteral(); }
    ;
    


/* ------------------------------------
  tupleLiteral ::= 
    "Tuple" "{" tupleItem { "," tupleItem } "}"
*/
tupleLiteral returns [ASTTupleLiteral n]
@init{ List tiList = new ArrayList(); }
:
    'Tuple'
    LBRACE
    ti=tupleItem { tiList.add($ti.n); } 
    ( COMMA ti=tupleItem { tiList.add($ti.n); } )*
    RBRACE
    { $n = new ASTTupleLiteral(tiList); }
    ;

/* ------------------------------------
  tupleItem ::= id ":" expression
*/
tupleItem returns [ASTTupleItem n]
:
    name=IDENT
    ( 
      // For backward compatibility we have to look ahead,
      // to check for a given type.
      (COLON type EQUAL) => COLON t=type EQUAL e=expression
      { $n = new ASTTupleItem($name, $t.n, $e.n); }
    |
      (COLON | EQUAL) e=expression
      { $n = new ASTTupleItem($name, $e.n); }       
    ) 
    ;

/* ------------------------------------
  type ::= 
      simpleType 
    | collectionType
    | tupleType
*/
type returns [ASTType n]
@init { Token tok = null; }
:
    { tok = input.LT(1); /* remember start of type */ }
    (
      nTSimple=simpleType { $n = $nTSimple.n; if ($n != null) $n.setStartToken(tok); }
    | nTCollection=collectionType { $n = $nTCollection.n; if ($n != null) $n.setStartToken(tok); }
    | nTTuple=tupleType { $n = $nTTuple.n; if ($n != null) $n.setStartToken(tok); }
    )
    ;


typeOnly returns [ASTType n]
:
    nT=type EOF { $n = $nT.n; }
    ;


/* ------------------------------------
  simpleType ::= id 

  A simple type may be a basic type (Integer, Real, Boolean, String),
  an enumeration type, an object type, or OclAny.
*/
simpleType returns [ASTSimpleType n]
:
    name=IDENT { $n = new ASTSimpleType($name); }
    ;


/* ------------------------------------
  collectionType ::= 
    ( "Collection" | "Set" | "Sequence" | "Bag" | "OrderedSet" ) "(" type ")"
*/
collectionType returns [ASTCollectionType n]
@init { Token op = null; }
:
    { op = input.LT(1); } 
    ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) 
    LPAREN elemType=type RPAREN
    { $n = new ASTCollectionType(op, $elemType.n); if ($n != null) $n.setStartToken(op);}
    ;


/* ------------------------------------
  tupleType ::= "Tuple" "(" tuplePart { "," tuplePart } ")"
*/
tupleType returns [ASTTupleType n]
@init{ List tpList = new ArrayList(); }
:
    'Tuple' LPAREN 
    tp=tuplePart { tpList.add($tp.n); } 
    ( COMMA tp=tuplePart { tpList.add($tp.n); } )* 
    RPAREN
    { $n = new ASTTupleType(tpList); }
    ;


/* ------------------------------------
  tuplePart ::= id ":" type
*/
tuplePart returns [ASTTuplePart n]
:
    name=IDENT COLON t=type
    { $n = new ASTTuplePart($name, $t.n); }
    ;
////////////////////////////////////////////////////////////////////////////////
// the shell understands soil statements and a set of "legacy statements", which
// maps CMD language constructs to equivalent soil statements
////////////////////////////////////////////////////////////////////////////////
shellCommandOnly returns [ASTStatement n]
:
  (stat)=> s = stat
  { $n = $s.n; }
  |
  (legacyStat)=> l = legacyStat
  { $n = $l.n; }
;

////////////////////////////////////////////////////////////////////////////////
// the shell understands soil statements and a set of "legacy statements", which
// maps CMD language constructs to equivalent soil statements
////////////////////////////////////////////////////////////////////////////////
shellCommand returns [ASTStatement n]
:
  (legacyStat)=> l = legacyStat EOF
  { $n = $l.n; }
  |
  (stat)=> s = stat EOF
  { $n = $s.n; }
;


////////////////////////////////////////////////////////////////////////////////
// Sequence of legacy Cmds
//
// Cmds could be parsed as sequence of Cmds delimited by whitespaces
////////////////////////////////////////////////////////////////////////////////
legacyStat returns [ASTStatement n]
@init {
  ASTSequenceStatement seq = new ASTSequenceStatement($start);
}
:
  loe = legacyOpEnter
  { 
    $n = $loe.n;
  }
  |
  lox = legacyOpExit
   { 
    $n = $lox.n; 
  }
  |
  nextLegacyStat[seq]
  (
    nextLegacyStat[seq]
  )* 
  
  { 
    $n = seq.simplify();
  }
;


////////////////////////////////////////////////////////////////////////////////
// parses the next legacy statement and adds it to seq
////////////////////////////////////////////////////////////////////////////////
nextLegacyStat[ASTSequenceStatement seq]
:
  s = singleLegacyStat
  SEMI?
  
  {
     seq.addStatement($s.n);
  }
;


////////////////////////////////////////////////////////////////////////////////
// the concrete legacy statements
////////////////////////////////////////////////////////////////////////////////
singleLegacyStat returns [ASTStatement n]
:
    lcr = legacyCreate        { $n = $lcr.n; }
  | lca = legacyCreateAssign  { $n = $lca.n; }
  | lci = legacyCreateInsert  { $n = $lci.n; }
  | llt = legacyLet           { $n = $llt.n; }
  //| loe = legacyOpEnter       { $n = $loe.n; }
  //| lox = legacyOpExit        { $n = $lox.n; }
  | lex = legacyExecute       { $n = $lex.n; }
  | ods = objDestroyStat      { $n = $ods.n; }
  | 'set' e=expression aas = attAssignStat[$e.n] { $n = $aas.n; }
  | lis = lnkInsStat          { $n = $lis.n; }
  | lds = lnkDelStat          { $n = $lds.n; }
;


////////////////////////////////////////////////////////////////////////////////
// object creation without explicit variable binding
//
// syntax:
// 'create' objectNames ':' objectType
//
// semantics:
// for each object name a new object of class objectType is created 
////////////////////////////////////////////////////////////////////////////////
legacyCreate returns [ASTStatement n]
:
  'create'
  objNames = identListMin1
  COLON
  objType = simpleType
  
  { 
    ASTSequenceStatement seq = new ASTSequenceStatement($start);
    
    for (String objName : $objNames.n) {
      seq.addStatement(
        new ASTNewObjectStatement(
          $start,
          $objType.n, 
          new ASTStringLiteral(objName)));
    }
    
    $n = seq.simplify();
  }
;    


////////////////////////////////////////////////////////////////////////////////
// object creation with explicit variable binding
//
// syntax:
// 'assign' variableNames ':= create' objectType
//
// semantics:
// for each variable name supplied, an object of class objectType and with a 
// unique object name is created and bound to that variable
////////////////////////////////////////////////////////////////////////////////
legacyCreateAssign returns [ASTStatement n]
:
  'assign'
  varNames = identListMin1
  COLON_EQUAL
  'create'
  objType = simpleType
  
  {
    ASTSequenceStatement seq = new ASTSequenceStatement($start);
    
    for (String varName : $varNames.n) {
      seq.addStatement(
        new ASTVariableAssignmentStatement(
          $start,
          varName, 
          new ASTRValueNewObject($start, $objType.n)));
    }
    
    $n = seq.simplify();
  }
;


////////////////////////////////////////////////////////////////////////////////
// link object creation
//
// syntax:
// 'create' name ':' asClassName 'between' '(' participants ')'
//
// semantics:
// creates a link object of type 'asClassName' with object name 'name' 
// between some participating objects defined by 'participants' and assigns the 
// created object to variable 'name'
////////////////////////////////////////////////////////////////////////////////
legacyCreateInsert returns [ASTVariableAssignmentStatement n]
:
  'create'
  name = IDENT
  COLON
  asClassName = simpleType
  'between'
  LPAREN
    participants = rValListMin2WithOptionalQualifiers
  RPAREN
  
  {
    ASTNewLinkObjectStatement nlo = 
      new ASTNewLinkObjectStatement(
        $start,
        $asClassName.n, 
        $participants.participans,
        $participants.qualifiers,
        new ASTStringLiteral($name));
  
    $n = new ASTVariableAssignmentStatement($start,
      $name.text,
      new ASTRValueNewLinkObject(nlo));
  }
;


////////////////////////////////////////////////////////////////////////////////
// variable assignment with mandatory type
//
// syntax:
// 'let' varName [':' varType] '=' e
//
// semantics:
// creates a variable with name 'varname' and type 'varType' (if supplied) and
// assigns the value of ocl expression 'e' to it
////////////////////////////////////////////////////////////////////////////////
legacyLet returns [ASTVariableAssignmentStatement n]
:
  'let'
  varName = IDENT
  (
    COLON
    varType = type
  )?
  EQUAL
  e = inSoilExpression
 
  { $n = new ASTVariableAssignmentStatement($start, $varName.text, $e.n, $varType.n); }
;


////////////////////////////////////////////////////////////////////////////////
// enter operation
//
// syntax:
// 'openter' object '.' operation '(' arguments ')'
//
// semantics:
// prepares execution of an operation by preparing the stack (e.g. pushes the
// arguments). NOTE: there is no equivalent construct in the soil language, 
// i.e. there is no soil statement which achieves this effect.
////////////////////////////////////////////////////////////////////////////////
legacyOpEnter returns [ASTEnterOperationStatement n]
:
  'openter'
  obj = inSoilExpression
  op = IDENT
  LPAREN
    args = exprList
  RPAREN
  
  { $n = new ASTEnterOperationStatement($start, $obj.n, $op.text, $args.n); }
;


////////////////////////////////////////////////////////////////////////////////
// exit operation
// 
// syntax:
// 'opexit' [retVal]
//
// semantics:
// stops the execution of the currently active operation (pops the stack, etc)
// the result of the operation (i.e. the return value) can optionally be 
// supplied. NOTE: there is no equivalent construct in the soil language, 
// i.e. there is no soil statement which achieves this effect.
////////////////////////////////////////////////////////////////////////////////
legacyOpExit returns [ASTStatement n]
:
  'opexit' ((inSoilExpression)=> retVal = inSoilExpression | nothing)
  
  { $n = new ASTExitOperationStatement($start, $retVal.n); }
;


////////////////////////////////////////////////////////////////////////////////
// execute operation with side effects
//
// syntax:
// 'execute' expression
//
// semantics:
// leftover construct from UML AL experiments. essentially a no op
////////////////////////////////////////////////////////////////////////////////
legacyExecute returns [ASTStatement n]
:
  'execute'
  expression
  
  { 
    reportWarning("the execute command is not supported in this version"); 
    $n = new ASTEmptyStatement();
  }
;


/* -----------------------------------------------------------------------------
------------------------- start of file SoilBase.gpart ------------------------- 
----------------------------------------------------------------------------- */

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
/* $Id: SoilBase.gpart 5494 2015-02-05 12:59:25Z lhamann $ */

////////////////////////////////////////////////////////////////////////////////
// Soil grammar
////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////////
// statOnly ::= statement followed by EOF
////////////////////////////////////////////////////////////////////////////////
statOnly returns [ASTStatement n]
:
  s = stat
  EOF
  
  { $n = $s.n; }
;


////////////////////////////////////////////////////////////////////////////////
// single statement or component statement
////////////////////////////////////////////////////////////////////////////////
stat returns [ASTStatement n]
@init {
  ASTSequenceStatement seq = new ASTSequenceStatement($start);
}
:
  s = singleStat {seq.addStatement($s.n);}
  (
    SEMI
    s2 = singleStat {seq.addStatement($s2.n); }
  )* 
  
  { 
    $n = seq.simplify();
  }
;

////////////////////////////////////////////////////////////////////////////////
// 
////////////////////////////////////////////////////////////////////////////////
singleStat returns [ASTStatement n]
: 
    emp = emptyStat      { $n = $emp.n; } // i.    (empty statement)
  // handled in stat rule                 // ii.   (sequence)
  | (statStartingWithExpr)=> sse = statStartingWithExpr { $n = $sse.n; }
  | vas = varAssignStat  { $n = $vas.n; } // iii.  (variable assignment)
  | ocs = objCreateStat  { $n = $ocs.n; } // v.    (object creation) or (link object creation)
  | ods = objDestroyStat { $n = $ods.n; } // vi.   (object destruction)
  | lis = lnkInsStat     { $n = $lis.n; } // vii.  (link insertion)
  | lds = lnkDelStat     { $n = $lds.n; } // viii. (link deletion)
  | ces = condExStat     { $n = $ces.n; } // ix.   (conditional execution)
  | its = iterStat       { $n = $its.n; } // x.    (iteration)
  // handled in varAssignStat rule        // xii.  (operation call with result)
  | whs = whileStat      { $n = $whs.n; } // (new, not in Buettner:2011:DISS)
  | blk = blockStat      { $n = $blk.n; } // (ditto)
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
emptyStat returns [ASTEmptyStatement n]
:
  nothing
  
  { $n = new ASTEmptyStatement(); }
;

statStartingWithExpr returns [ASTStatement n]
:
  expr = inSoilExpression
  (
    aas = attAssignStat[$expr.n]  { $n = $aas.n; } // iv.   (attribute assignment)
  )?
  {
    if (aas == null) {
      $n = new ASTOperationCallStatement($start, $expr.n); 
    }
  }
;
	
////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
varAssignStat returns [ASTStatement n]
: 
  varName = IDENT
  COLON_EQUAL
  rVal = rValue
  {
    $n = new ASTVariableAssignmentStatement($varName, $varName.text, $rVal.n);
  }
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n]
:
  DOT 
  attName = IDENT
  COLON_EQUAL
  r = rValue
  
  { $n = new ASTAttributeAssignmentStatement($attName, $exp, $attName.text, $r.n); }
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
objCreateStat returns [ASTStatement n]
:
  'new'
  ident = simpleType
  (
    LPAREN
      (objName = inSoilExpression)?
    RPAREN
  )?
  
  (
    'between'
      LPAREN
        p = rValListMin2WithOptionalQualifiers
      RPAREN
    { 
    $n = new ASTNewLinkObjectStatement($start, $ident.n, $p.participans, $p.qualifiers, $objName.n);
    }
  )?
  
  {
    if ($n == null) {
      $n = new ASTNewObjectStatement($start, $ident.n, $objName.n);
    }
  }
;

////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
objDestroyStat returns [ASTStatement n]
:
  'destroy'
  el = exprListMin1
  
  {
    ASTSequenceStatement seq = new ASTSequenceStatement($start);
    
    for (ASTExpression expression : $el.n) {
      seq.addStatement(
        new ASTObjectDestructionStatement($start, expression));
    }
    
    $n = seq.simplify();
  }
;


////////////////////////////////////////////////////////////////////////////////
// link insertion statement
////////////////////////////////////////////////////////////////////////////////
lnkInsStat returns [ASTLinkInsertionStatement n]
:
  'insert'
  LPAREN
    p = rValListMin2WithOptionalQualifiers
  RPAREN
  'into'
  ass = IDENT

  { $n = new ASTLinkInsertionStatement($start, $ass.text, $p.participans, $p.qualifiers); }
;

rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers]
@init {
  $participans = new ArrayList<ASTRValue>();
  $qualifiers = new ArrayList<List<ASTRValue>>();
  List<ASTRValue> currentQualifiers = Collections.emptyList();
}
:
  r = rValue { $participans.add($r.n); }
  (
  	LBRACE
  	qualifierValues = rValList {currentQualifiers = $qualifierValues.n;}
  	RBRACE
  )?
  {
    $qualifiers.add(currentQualifiers);
    currentQualifiers = Collections.emptyList();
  }
  
  COMMA
  
  r = rValue { $participans.add($r.n); }
  (
  	LBRACE
  	qualifierValues = rValList {currentQualifiers = $qualifierValues.n;}
  	RBRACE
  )?
  {
    $qualifiers.add(currentQualifiers);
    currentQualifiers = Collections.emptyList();
  }
  
  (
    COMMA
    
    r = rValue { $participans.add($r.n); }
    
    (
  	  LBRACE
  	  qualifierValues = rValList {currentQualifiers = $qualifierValues.n;}
  	  RBRACE
  	)?
    
    {
      $qualifiers.add(currentQualifiers);
      currentQualifiers = Collections.emptyList();
    }	
  )*
;

////////////////////////////////////////////////////////////////////////////////
// link deletion statement
////////////////////////////////////////////////////////////////////////////////
lnkDelStat returns [ASTLinkDeletionStatement n]
:
  'delete'
  LPAREN
    p = rValListMin2WithOptionalQualifiers
  RPAREN
  'from' 
  ass = IDENT
  
  { $n = new ASTLinkDeletionStatement($start, $ass.text, $p.participans, $p.qualifiers); }
;


////////////////////////////////////////////////////////////////////////////////
// conditional execution statement
////////////////////////////////////////////////////////////////////////////////
condExStat returns [ASTConditionalExecutionStatement n]
@init {
  ASTStatement elseStat = new ASTEmptyStatement();
}
:
  'if' 
  con = inSoilExpression
  'then' 
  ts = statOrImplicitBlock 
  (
    'else' 
     es = statOrImplicitBlock  { elseStat = $es.n; }
  )?
  'end'
  
  { $n = new ASTConditionalExecutionStatement($start, $con.n, $ts.n, elseStat); }
;

////////////////////////////////////////////////////////////////////////////////
// iteration statement
////////////////////////////////////////////////////////////////////////////////
iterStat returns [ASTIterationStatement n]
:
  'for'
  var = IDENT
  'in'
  set = inSoilExpression
  'do'
  s = statOrImplicitBlock 
  'end'
  
  { $n = new ASTIterationStatement($start, $var.text, $set.n, $s.n); }
;


////////////////////////////////////////////////////////////////////////////////
// while statement
////////////////////////////////////////////////////////////////////////////////
whileStat returns [ASTWhileStatement n]
:
  'while'
  cond = inSoilExpression
  'do'
  s = statOrImplicitBlock 
  'end'
  
  { $n = new ASTWhileStatement($start, $cond.n, $s.n); }
;

////////////////////////////////////////////////////////////////////////////////
// block statement
////////////////////////////////////////////////////////////////////////////////
blockStat returns [ASTBlockStatement n]
@init {
  $n = new ASTBlockStatement($start, org.tzi.use.config.Options.explicitVariableDeclarations);
} 
:
 'begin'
 ( 'declare' vd = variableDeclaration { $n.addVariableDeclaration(vd);} ( COMMA vd1 = variableDeclaration { $n.addVariableDeclaration(vd1);} )* SEMI )?
 s = stat { $n.setBody($s.n); }
 'end'
; 


////////////////////////////////////////////////////////////////////////////////
// implicit block
////////////////////////////////////////////////////////////////////////////////
implicitBlockStat returns [ASTBlockStatement n]
@init {
  $n = new ASTBlockStatement($start, false);
} 
:
  'declare' vd = variableDeclaration { $n.addVariableDeclaration(vd);} ( COMMA vd1 = variableDeclaration { $n.addVariableDeclaration(vd1);} )* SEMI 
 s = stat { $n.setBody($s.n); }
; 

statOrImplicitBlock returns [ASTStatement n]
:
  (s1 = stat { n = $s1.n; } | s2 = implicitBlockStat { n = $s2.n; })
;

////////////////////////////////////////////////////////////////////////////////
//
// MISC HELPER RULES
//
////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////////
// dummy rule to make "nothing" choices more visible
////////////////////////////////////////////////////////////////////////////////
nothing
:
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
rValue returns [ASTRValue n]
:
    e = inSoilExpression { $n = new ASTRValueExpressionOrOpCall($e.n); }
  | oc = objCreateStat
  { 
    if ($oc.n instanceof ASTNewLinkObjectStatement)
    	$n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)$oc.n);
    else
    	$n = new ASTRValueNewObject((ASTNewObjectStatement)$oc.n);
  }
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
rValList returns [List<ASTRValue> n]
:
  nothing           
  { $n = Collections.<ASTRValue>emptyList(); }
  |
  rl = rValListMin1 
  { $n = $rl.n; }
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
rValListMin1 returns [List<ASTRValue> n]
@init {
  $n = new ArrayList<ASTRValue>();
}
:
  r = rValue
  { $n.add($r.n); }
  (
    COMMA
    r = rValue
    { $n.add($r.n); }
  )*
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
rValListMin2 returns [List<ASTRValue> n]
@init {
  $n = new ArrayList<ASTRValue>();
}
:
  r = rValue
  { $n.add($r.n); }
  COMMA
  r = rValue
  { $n.add($r.n); }
  (
    COMMA
    r = rValue
    { $n.add($r.n); }
  )*
;


////////////////////////////////////////////////////////////////////////////////
// 
////////////////////////////////////////////////////////////////////////////////
inSoilExpression returns [ASTExpression n]
:
  e = expression { if ($e.n != null) $e.n.setStringRep($e.text); } 
  
  { $n = $e.n; }
;


////////////////////////////////////////////////////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////
exprList returns [List<ASTExpression> n]
:
  nothing 
  { $n = new ArrayList<ASTExpression>(); }
  | 
  el = exprListMin1 
  { $n = $el.n; }
;


////////////////////////////////////////////////////////////////////////////////
// 
////////////////////////////////////////////////////////////////////////////////
exprListMin1 returns [List<ASTExpression> n]
@init {
  $n = new ArrayList<ASTExpression>();
}
:
  e = inSoilExpression 
  { if ($e.n != null) $n.add($e.n); }
  (
    COMMA
    e = inSoilExpression 
    { if ($e.n != null) $n.add($e.n); }
  )*
;


////////////////////////////////////////////////////////////////////////////////
// 
////////////////////////////////////////////////////////////////////////////////
exprListMin2 returns [List<ASTExpression> n]
@init {
  $n = new ArrayList<ASTExpression>();
}
:
  e = inSoilExpression
  { if ($e.n != null) $n.add($e.n); }
  COMMA
  e = inSoilExpression
  { if ($e.n != null) $n.add($e.n); }
  (
    COMMA
    e = inSoilExpression
    { if ($e.n != null) $n.add($e.n); }
  )*
;


////////////////////////////////////////////////////////////////////////////////
// collects a list of comma separated identifiers. may be empty
////////////////////////////////////////////////////////////////////////////////
identList returns [List<String> n]
:
  nothing
  { $n = new ArrayList<String>(); }
  | 
  il = identListMin1 
  { $n = $il.n; }
;


////////////////////////////////////////////////////////////////////////////////
// collects a list of comma separated identifiers. may not be empty
////////////////////////////////////////////////////////////////////////////////
identListMin1 returns [List<String> n]
@init {
  $n = new ArrayList<String>();
}
: 
  id = IDENT
  { $n.add($id.text); }
  (
    COMMA
    id = IDENT {
    $n.add($id.text); }
  )*
;
  
/* -----------------------------------------------------------------------------
-------------------------- end of file SoilBase.gpart --------------------------
----------------------------------------------------------------------------- */

/*
--------- Start of file OCLLexerRules.gpart -------------------- 
*/

// Whitespace -- ignored
WS:
    ( ' '
    | '\t'
    | '\f'
    | NEWLINE
    )
    { $channel=HIDDEN; }
    ;

// Single-line comments
SL_COMMENT:
    ('//' | '--')
    (~(NEWLINE))*
    { $channel=HIDDEN; }
    ;

// multiple-line comments
ML_COMMENT:
    '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; };

fragment
NEWLINE	:	
    '\r\n' | '\r' | '\n';
    
// Use paraphrases for nice error messages
ARROW 		 : '->';
AT     		 : '@';
BAR 		 : '|';
COLON 		 : ':';
COLON_COLON	 : '::';
COLON_EQUAL	 : ':=';
COMMA 		 : ',';
DOT 		 : '.';
DOTDOT 		 : '..';
EQUAL 		 : '=';
GREATER 	 : '>';
GREATER_EQUAL : '>=';
HASH 		 : '#';
LBRACE 		 : '{';
LBRACK 		 : '[';
LESS 		 : '<';
LESS_EQUAL 	 : '<=';
LPAREN 		 : '(';
MINUS 		 : '-';
NOT_EQUAL 	 : '<>';
PLUS 		 : '+';
RBRACE 		 : '}';
RBRACK 		 : ']';
RPAREN		 : ')';
SEMI		 : ';';
SLASH 		 : '/';
STAR 		 : '*';

fragment
INT:
    ('0'..'9')+
    ;

fragment
REAL:
    INT ('.' INT (('e' | 'E') ('+' | '-')? INT)? | ('e' | 'E') ('+' | '-')? INT)
    ;

RANGE_OR_INT:
      ( INT '..' )      => INT    { $type=INT; }
    | ( REAL )          => REAL   { $type=REAL; }
    |   INT                       { $type=INT; }
    ;

// String literals
STRING:	
    '\'' ( ~('\''|'\\') | ESC)* '\'';

NON_OCL_STRING:	
    '"' ( ~('"'|'\\') | ESC)* '"';
    
// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'7' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
fragment
ESC
:
    '\\'
     ( 'n'
     | 'r'
     | 't'
     | 'b'
     | 'f'
     | '"'
     | '\''
     | '\\'
     | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
     | '0'..'3' ('0'..'7' ('0'..'7')? )?  | '4'..'7' ('0'..'7')?
     )
     ;

// hexadecimal digit (again, note it's protected!)
fragment
HEX_DIGIT:
    ( '0'..'9' | 'A'..'F' | 'a'..'f' );


// An identifier.  Note that testLiterals is set to true!  This means
// that after we match the rule, we look in the literals table to see
// if it's a literal or really an identifier.

IDENT:
    ('$' | 'a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;
// A dummy rule to force vocabulary to be all characters (except
// special ones that ANTLR uses internally (0 to 2)

fragment
VOCAB:	
    '\U0003'..'\U0377'
    ;
