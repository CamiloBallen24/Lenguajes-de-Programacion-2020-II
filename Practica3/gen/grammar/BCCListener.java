// Generated from D:/Repositorios/Lenguajes-de-Programacion-2020-II/Practica3/grammar\BCC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BCCParser}.
 */
public interface BCCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BCCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BCCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BCCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void enterMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void exitMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(BCCParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(BCCParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BCCParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BCCParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput(BCCParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput(BCCParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhen(BCCParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhen(BCCParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(BCCParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(BCCParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnless(BCCParser.UnlessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnless(BCCParser.UnlessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(BCCParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(BCCParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(BCCParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(BCCParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUntil(BCCParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUntil(BCCParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BCCParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BCCParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(BCCParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(BCCParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doUntil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDoUntil(BCCParser.DoUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doUntil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDoUntil(BCCParser.DoUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor(BCCParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor(BCCParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNext(BCCParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNext(BCCParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak(BCCParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak(BCCParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(BCCParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(BCCParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSumaIgual(BCCParser.SumaIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSumaIgual(BCCParser.SumaIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code restaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterRestaIgual(BCCParser.RestaIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code restaIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitRestaIgual(BCCParser.RestaIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code productoIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterProductoIgual(BCCParser.ProductoIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code productoIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitProductoIgual(BCCParser.ProductoIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDivisionIgual(BCCParser.DivisionIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDivisionIgual(BCCParser.DivisionIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterModuloIgual(BCCParser.ModuloIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloIgual}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitModuloIgual(BCCParser.ModuloIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPostIncremento(BCCParser.PostIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPostIncremento(BCCParser.PostIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPostDecremento(BCCParser.PostDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPostDecremento(BCCParser.PostDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPreIncremento(BCCParser.PreIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPreIncremento(BCCParser.PreIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPreDecremento(BCCParser.PreDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecremento}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPreDecremento(BCCParser.PreDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(BCCParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(BCCParser.LexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void enterNexpr(BCCParser.NexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void exitNexpr(BCCParser.NexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void enterRexpr(BCCParser.RexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void exitRexpr(BCCParser.RexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#rexpr_operator}.
	 * @param ctx the parse tree
	 */
	void enterRexpr_operator(BCCParser.Rexpr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#rexpr_operator}.
	 * @param ctx the parse tree
	 */
	void exitRexpr_operator(BCCParser.Rexpr_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#simple_expr_operator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr_operator(BCCParser.Simple_expr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#simple_expr_operator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr_operator(BCCParser.Simple_expr_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BCCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BCCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#term_operator}.
	 * @param ctx the parse tree
	 */
	void enterTerm_operator(BCCParser.Term_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#term_operator}.
	 * @param ctx the parse tree
	 */
	void exitTerm_operator(BCCParser.Term_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNum(BCCParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNum(BCCParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBool(BCCParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBool(BCCParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPostFactor(BCCParser.PostFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPostFactor(BCCParser.PostFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPreFactor(BCCParser.PreFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPreFactor(BCCParser.PreFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BCCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BCCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesisFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParentesisFactor(BCCParser.ParentesisFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesisFactor}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParentesisFactor(BCCParser.ParentesisFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamadoFunct}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterLlamadoFunct(BCCParser.LlamadoFunctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamadoFunct}
	 * labeled alternative in {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitLlamadoFunct(BCCParser.LlamadoFunctContext ctx);
}