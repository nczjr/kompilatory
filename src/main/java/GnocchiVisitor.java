// Generated from /Users/marcinwloczko/IdeaProjects/kompilatory/src/main/java/Gnocchi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GnocchiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GnocchiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GnocchiParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GnocchiParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GnocchiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#functionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMain(GnocchiParser.FunctionMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GnocchiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GnocchiParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GnocchiParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GnocchiParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GnocchiParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#variableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDef(GnocchiParser.VariableDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(GnocchiParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(GnocchiParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(GnocchiParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GnocchiParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GnocchiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GnocchiParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GnocchiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(GnocchiParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#logical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operation(GnocchiParser.Logical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operation(GnocchiParser.Math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operator(GnocchiParser.Math_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GnocchiParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(GnocchiParser.Logical_operatorContext ctx);
}