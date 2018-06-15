grammar Gnocchi;

  //TODO funckje systemowe: print

  //Składnia języka

  start
  : (voidFunctionDeclaration | returningFunctionDeclaration)*  functionMain EOF
  ;

  identifier
  : IDENT
  ;

  //Budowa funkcji
  functionMain
  : FUNC MAIN OPEN_PARENTHESIS CLOSE_PARENTHESIS body
  ;

  voidFunctionDeclaration
  : FUNC functionIdentifier body
  ;

  returningFunctionDeclaration
  : FUNC functionIdentifier ARROW type functionBody
  ;

  functionIdentifier
  : identifier parameters
  ;

  functionCall
  : functionIdentifier
  ;

  parameters
  : OPEN_PARENTHESIS parameterList? CLOSE_PARENTHESIS
  ;

  parameterList
  : variableDeclaration (COMMA variableDeclaration)*
  | value (COMMA value)*
  ;

  //Ciało funkcji i to co w nim
  functionBody
  : OPEN_BRACKET (expression SEMICOLON)* (RETURN values SEMICOLON) CLOSE_BRACKET
  ;

  body
  : OPEN_BRACKET  (expression SEMICOLON)* CLOSE_BRACKET
  ;

  variableOperations
	: variableDeclaration
	| variableAssigment
	;

  variableDeclaration
  : VAR identifier COLON basicType (ASSIGNMENT value)?
  | VAR identifier COLON arrayType (ASSIGNMENT arrayValue)?
  ;

  variableAssigment
  : identifier ASSIGNMENT values
  | identifier OPEN_SQAURE_BRACKET INT_VALUE CLOSE_SQARE_BRACKET ASSIGNMENT values //dla tablic
  ;

  values
  : value
  | arrayValue
  | math_operation
  | identifier
  ;

  arrayValue
  : OPEN_BRACKET value (COMMA value)? CLOSE_BRACKET
  ;

    selectionStatement
    :   IF OPEN_PARENTHESIS logical_operation CLOSE_PARENTHESIS body (ELSE body)?
    ;

    iterationStatement
        :   WHILE OPEN_PARENTHESIS logical_operation CLOSE_PARENTHESIS body
        |   DO body WHILE OPEN_PARENTHESIS logical_operation CLOSE_PARENTHESIS
        |   FOR OPEN_PARENTHESIS forCondition CLOSE_PARENTHESIS body
        ;


    forCondition
    	:   (variableDeclaration | identifier)? SEMICOLON logical_operation? SEMICOLON unaryExpression?
    	;

    unaryExpression
        :   identifier INCREMENT
        |   identifier DECREMENT
        ;

  type
  : basicType
  | arrayType
  ;

  basicType
  : INT
  | STRING
  | CHAR
  | BOOLEAN
  | DOUBLE
  ;

  arrayType
  : OPEN_SQAURE_BRACKET basicType CLOSE_SQARE_BRACKET
  ;

	value
  : STRING_VALUE
  | INT_VALUE
  | CHAR_VALUE
  | BOOLEAN_VALUE
  | DOUBLE_VALUE
  ;

  expression
  : variableOperations
  | operation
  | functionCall
  | selectionStatement
  | iterationStatement
  ;


  operation
  : logical_operation
  | math_operation
  ;

  logical_operation
  : ( identifier | value ) logical_operator ( identifier | value )
    ;

	math_operation
	: (identifier | value) math_operator (identifier | value) (math_operator (identifier | value))*
	;

  math_operator
  : PLUS
  | MINUS
  | DIVIDE
  | MULTIPLY
  ;

  logical_operator
  : EQUALS
  | NOT_EQUALS
  | LOWER
  | GREATER
  | LOWER_OR_EQUAL
  | GREATER_OR_EQUAL
  ;

  //Tokeny

  VAR: 'var';
  FUNC: 'func';
  RETURN: 'return';
  MAIN: 'main';
	IF: 'if';
	ELSE: 'else';
	FOR: 'for';
	WHILE: 'while';
	DO: 'do';
	INT: 'Int';
  STRING: 'String';
  CHAR: 'Char';
  BOOLEAN: 'Bool';
  DOUBLE: 'Double';
  DOT: '.';

  ASSIGNMENT: '=';
  EQUALS: '==';
  NOT_EQUALS: '!=';
  LOWER: '<';
	GREATER: '>';
  LOWER_OR_EQUAL: '<=';
  GREATER_OR_EQUAL: '>=';
  PLUS: '+';
  MINUS: '-';
 	DIVIDE: '/';
  MULTIPLY: '*';

  SEMICOLON: ';';
  COLON: ':';
  ARROW: '=>';
  COMMA: ',';
  OPEN_BRACKET: '{';
  CLOSE_BRACKET: '}';
  OPEN_PARENTHESIS: '(';
  CLOSE_PARENTHESIS: ')';
  OPEN_SQAURE_BRACKET: '[';
  CLOSE_SQARE_BRACKET: ']';
  INCREMENT: '++';
  DECREMENT: '--';

  IDENT
	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
	;

  STRING_VALUE: (CHAR_VALUE)+ ;
  CHAR_VALUE: [a-zA-Z] ;
   fragment
  DIGIT: '0' .. '9' ;
  INT_VALUE: DIGIT+;
  DOUBLE_VALUE: DIGIT+ DOT DIGIT+ ;
  BOOLEAN_VALUE: 'true' | 'false' ;

  //Pomijane znaki

  Whitespace
    :   [ \t]+
        -> skip
    ;

    Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

    BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

    LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
