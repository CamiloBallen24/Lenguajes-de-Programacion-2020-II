// Generated from D:/Documents/Julian/Unal/2020-2/Lenguajes de Programaci�n/ANTRL test/grammar\BCC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BCCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BCCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BCCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BCCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(BCCParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BCCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BCCParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(BCCParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(BCCParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless(BCCParser.UnlessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(BCCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(BCCParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(BCCParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BCCParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(BCCParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doUntil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoUntil(BCCParser.DoUntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(BCCParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(BCCParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(BCCParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(BCCParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaIgual(BCCParser.SumaIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code restaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestaIgual(BCCParser.RestaIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code productoIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductoIgual(BCCParser.ProductoIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionIgual(BCCParser.DivisionIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduloIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloIgual(BCCParser.ModuloIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncremento(BCCParser.PostIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecremento(BCCParser.PostDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncremento(BCCParser.PreIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecremento(BCCParser.PreDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(BCCParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(BCCParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(BCCParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BCCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(BCCParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(BCCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFactor(BCCParser.PostFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFactor(BCCParser.PreFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BCCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesisFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisFactor(BCCParser.ParentesisFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamadoFunct}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadoFunct(BCCParser.LlamadoFunctContext ctx);
}