grammar gnocchi;


start
	: function
  ; variable


function
	: FUNC IDENTIFIER parameters (ARROW type)? functionBody
  ;

  parameters
  : OPEN_PARENTHESIS parameterList? CLOSE_PARENTHESIS


  parameterList
  : variableDef (COMMA variableDef)*
  | value (COMMA value)*
  ;


  functionBody
  : OPEN_BRACKET expression CLOSE_BRACKET


  variable
	: VAR variableDef (ASSIGNMENT value)? SEMICOLON
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
  : variable expression
  | operation expression
  | function expression
  | variable
  | operation
  | function

  operation
  : IDENTIFIER operator IDENTIFIER SEMICOLON
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
