grammar Gnocchi;


start
	: functionDeclaration* functionMain EOF
  ;


	functionDeclaration
	: FUNC functionIdentifier (ARROW type)? body
  ;


  functionMain
  : FUNC MAIN OPEN_PARENTHESIS CLOSE_PARENTHESIS body
  ;

  functionIdentifier
  : IDENTIFIER parameters
  ;

  functionCall
  : functionIdentifier
  ;

  parameters
  : OPEN_PARENTHESIS parameterList? CLOSE_PARENTHESIS
  ;


  parameterList
  : variableDef (COMMA variableDef)*
  | value (COMMA value)*
  ;


  body
  : OPEN_BRACKET  (expression SEMICOLON)* CLOSE_BRACKET
  ;


  variable
	: VAR variableDef (ASSIGNMENT value)?
	;

  variableDef
  : IDENTIFIER COLON type
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
    	:   (variable | IDENTIFIER)? SEMICOLON logical_operation? SEMICOLON unaryExpression?
    	;

    unaryExpression
        :   IDENTIFIER INCREMENT
        |   IDENTIFIER DECREMENT
        ;

  type
  : INT
  | STRING
  | CHAR
  | BOOLEAN
  | DOUBLE
  ;

	value
  : STRING_VALUE
  | INT_VALUE
  | CHAR_VALUE
  | BOOLEAN_VALUE
  | DOUBLE_VALUE
  ;

  expression
  : variable
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
  : ( IDENTIFIER | value ) logical_operator ( IDENTIFIER | value )
    ;

	math_operation
	: ( IDENTIFIER | value ) math_operator ( IDENTIFIER | value )
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
  INCREMENT: '++';
  DECREMENT: '--';

  IDENTIFIER:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;



  STRING_VALUE: (CHAR_VALUE)+ ;


  CHAR_VALUE: [a-zA-Z] ;

   fragment
  DIGIT: '0' .. '9' ;


  INT_VALUE: DIGIT+;


  DOUBLE_VALUE: DIGIT+ DOT DIGIT+ ;


  BOOLEAN_VALUE: 'true' | 'false' ;


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
