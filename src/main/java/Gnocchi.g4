grammar Gnocchi;


start
	: functionDeclaration* functionMain EOF
  ;


	functionDeclaration
	: FUNC functionIdentifier (ARROW type)? functionBody
  ;


  functionMain
  : FUNC MAIN OPEN_PARENTHESIS CLOSE_PARENTHESIS functionBody
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

	selectionStatement
    :   IF OPEN_PARENTHESIS operation CLOSE_PARENTHESIS functionBody (ELSE functionBody)?
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
	IF: 'if';
	ELSE: 'else';
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

  IDENTIFIER:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;



  STRING_VALUE: (CHAR_VALUE)+ ;


  CHAR_VALUE: [a-zA-Z] ;


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
