grammar Gnocchi;


start
	: functionDeclaration* functionMain
  ;


	functionDeclaration
	: FUNC functionIdentifier (ARROW type)? functionBody
  ;

  functionMain
  : FUNC MAIN
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


  functionBody
  : OPEN_BRACKET body CLOSE_BRACKET
	;

  body
  : (expression SEMICOLON)*
	;

  variable
	: VAR variableDef (ASSIGNMENT value)?
	;

  variableDef
  : IDENTIFIER COLON type
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
  ;

  operation
  : IDENTIFIER operator IDENTIFIER
	;

  operator
  : math_operator | logical_operator
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

  IDENTIFIER:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

  INT: 'Int';
  STRING: 'String';
  CHAR: 'Char';
  BOOLEAN: 'Bool';
  DOUBLE: 'Double';
  DOT: '.';


  fragment
  STRING_VALUE: (CHARACTER_VALUE)+ ;

  fragment
  CHARACTER_VALUE: [a-zA-Z] ;

  fragment
  DIGIT: '0' .. '9' ;

  fragment
  INT_VALUE: DIGIT+;

  fragment
  DOUBLE_VALUE: DIGIT+ DOT DIGIT+ ;

  fragment
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
