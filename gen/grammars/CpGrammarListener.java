// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/CpGrammar.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CpGrammarParser}.
 */
public interface CpGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CpGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CpGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#idx}.
	 * @param ctx the parse tree
	 */
	void enterIdx(CpGrammarParser.IdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#idx}.
	 * @param ctx the parse tree
	 */
	void exitIdx(CpGrammarParser.IdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(CpGrammarParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(CpGrammarParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CpGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CpGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(CpGrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(CpGrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CpGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CpGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(CpGrammarParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(CpGrammarParser.ComplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CpGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CpGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CpGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CpGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#for_cycle}.
	 * @param ctx the parse tree
	 */
	void enterFor_cycle(CpGrammarParser.For_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#for_cycle}.
	 * @param ctx the parse tree
	 */
	void exitFor_cycle(CpGrammarParser.For_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cycle(CpGrammarParser.While_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cycle(CpGrammarParser.While_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CpGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CpGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CpGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CpGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CpGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CpGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSum_expr(CpGrammarParser.Sum_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSum_expr(CpGrammarParser.Sum_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_exrp}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_exrp(CpGrammarParser.Unary_exrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_exrp}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_exrp(CpGrammarParser.Unary_exrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(CpGrammarParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(CpGrammarParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idx_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdx_expr(CpGrammarParser.Idx_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idx_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdx_expr(CpGrammarParser.Idx_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(CpGrammarParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(CpGrammarParser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expr(CpGrammarParser.Number_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expr(CpGrammarParser.Number_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(CpGrammarParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(CpGrammarParser.Mul_exprContext ctx);
}