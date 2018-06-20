// Generated from Gnocchi.G4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GnocchiParser}.
 */
public interface GnocchiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GnocchiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GnocchiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GnocchiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GnocchiParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMain(GnocchiParser.FunctionMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMain(GnocchiParser.FunctionMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#voidFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionDeclaration(GnocchiParser.VoidFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#voidFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionDeclaration(GnocchiParser.VoidFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#returningFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#returningFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GnocchiParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GnocchiParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GnocchiParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GnocchiParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GnocchiParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GnocchiParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GnocchiParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GnocchiParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#variableOperations}.
	 * @param ctx the parse tree
	 */
	void enterVariableOperations(GnocchiParser.VariableOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variableOperations}.
	 * @param ctx the parse tree
	 */
	void exitVariableOperations(GnocchiParser.VariableOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#variableFunctionAssigment}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionAssigment(GnocchiParser.VariableFunctionAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variableFunctionAssigment}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionAssigment(GnocchiParser.VariableFunctionAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssigment(GnocchiParser.VariableAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssigment(GnocchiParser.VariableAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(GnocchiParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(GnocchiParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(GnocchiParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(GnocchiParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(GnocchiParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(GnocchiParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GnocchiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GnocchiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#elsePattern}.
	 * @param ctx the parse tree
	 */
	void enterElsePattern(GnocchiParser.ElsePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#elsePattern}.
	 * @param ctx the parse tree
	 */
	void exitElsePattern(GnocchiParser.ElsePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(GnocchiParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(GnocchiParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(GnocchiParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(GnocchiParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#doCondition}.
	 * @param ctx the parse tree
	 */
	void enterDoCondition(GnocchiParser.DoConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#doCondition}.
	 * @param ctx the parse tree
	 */
	void exitDoCondition(GnocchiParser.DoConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(GnocchiParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(GnocchiParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GnocchiParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GnocchiParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GnocchiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GnocchiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(GnocchiParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(GnocchiParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(GnocchiParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(GnocchiParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GnocchiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GnocchiParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GnocchiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GnocchiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(GnocchiParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(GnocchiParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(GnocchiParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(GnocchiParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(GnocchiParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(GnocchiParser.MathOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GnocchiParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GnocchiParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(GnocchiParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(GnocchiParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(GnocchiParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(GnocchiParser.LogicalOperatorContext ctx);
}