// Generated from /Users/marcinwloczko/Desktop/Gramatyka/Gnocchi.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by {@link GnocchiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GnocchiParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GnocchiParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#typcio}.
	 * @param ctx the parse tree
	 */
	void enterTypcio(GnocchiParser.TypcioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#typcio}.
	 * @param ctx the parse tree
	 */
	void exitTypcio(GnocchiParser.TypcioContext ctx);
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
	 * Enter a parse tree produced by {@link GnocchiParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link GnocchiParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GnocchiParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GnocchiParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by {@link GnocchiParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GnocchiParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GnocchiParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void enterVariableDef(GnocchiParser.VariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void exitVariableDef(GnocchiParser.VariableDefContext ctx);
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
	 * Enter a parse tree produced by {@link GnocchiParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(GnocchiParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(GnocchiParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(GnocchiParser.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(GnocchiParser.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GnocchiParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(GnocchiParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GnocchiParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(GnocchiParser.Logical_operatorContext ctx);
}