// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/gram.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(gramParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(gramParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gramParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#composite_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_operator(gramParser.Composite_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#assignments_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments_operator(gramParser.Assignments_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(gramParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#limited_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimited_cycle(gramParser.Limited_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#conditional_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_cycle(gramParser.Conditional_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(gramParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(gramParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperssion(gramParser.ExperssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(gramParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#summand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummand(gramParser.SummandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(gramParser.MultiplierContext ctx);
}