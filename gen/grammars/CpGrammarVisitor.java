// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/CpGrammar.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CpGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CpGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CpGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#idx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx(CpGrammarParser.IdxContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(CpGrammarParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CpGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(CpGrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CpGrammarParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(CpGrammarParser.ComplexContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CpGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CpGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#for_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cycle(CpGrammarParser.For_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cycle(CpGrammarParser.While_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CpGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CpGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CpGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_expr(CpGrammarParser.Sum_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_exrp}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_exrp(CpGrammarParser.Unary_exrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_expr(CpGrammarParser.Rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idx_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx_expr(CpGrammarParser.Idx_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr(CpGrammarParser.Logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expr(CpGrammarParser.Number_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link CpGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(CpGrammarParser.Mul_exprContext ctx);
}