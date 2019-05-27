// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/gram.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(gramParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(gramParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(gramParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(gramParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gramParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gramParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#composite_operator}.
	 * @param ctx the parse tree
	 */
	void enterComposite_operator(gramParser.Composite_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#composite_operator}.
	 * @param ctx the parse tree
	 */
	void exitComposite_operator(gramParser.Composite_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#assignments_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignments_operator(gramParser.Assignments_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#assignments_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignments_operator(gramParser.Assignments_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(gramParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(gramParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#limited_cycle}.
	 * @param ctx the parse tree
	 */
	void enterLimited_cycle(gramParser.Limited_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#limited_cycle}.
	 * @param ctx the parse tree
	 */
	void exitLimited_cycle(gramParser.Limited_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#conditional_cycle}.
	 * @param ctx the parse tree
	 */
	void enterConditional_cycle(gramParser.Conditional_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#conditional_cycle}.
	 * @param ctx the parse tree
	 */
	void exitConditional_cycle(gramParser.Conditional_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(gramParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(gramParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(gramParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(gramParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#experssion}.
	 * @param ctx the parse tree
	 */
	void enterExperssion(gramParser.ExperssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#experssion}.
	 * @param ctx the parse tree
	 */
	void exitExperssion(gramParser.ExperssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(gramParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(gramParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#summand}.
	 * @param ctx the parse tree
	 */
	void enterSummand(gramParser.SummandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#summand}.
	 * @param ctx the parse tree
	 */
	void exitSummand(gramParser.SummandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void enterMultiplier(gramParser.MultiplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void exitMultiplier(gramParser.MultiplierContext ctx);
}