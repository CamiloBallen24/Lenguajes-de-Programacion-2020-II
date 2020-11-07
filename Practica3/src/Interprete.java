import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Interprete<T> extends BCCBaseVisitor<T>{

    HashMap<String, BCCParser.Fn_decl_listContext> functions = new HashMap<>();
    ArrayList<HashMap<String, Variable>> scopes = new ArrayList<HashMap<String, Variable>>(){ {add(new HashMap<>());} };

    //HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1); PARA OBTENER EL SCOPE ACTUAL

    @Override public T visitProg(BCCParser.ProgContext ctx) { return visitChildren(ctx); }

    @Override public T visitFn_decl_list(BCCParser.Fn_decl_listContext ctx) {
        //Donde se verifica que los nombres de las variables no esté repetido?
        //(ACTUALMENTE SE VERIFICA AL LLAMAR A LA FUNCIÓN)
        functions.put(ctx.FID().toString(),ctx);
        return null;
    }

    @Override public T visitMain_prog(BCCParser.Main_progContext ctx) { return visitChildren(ctx); }

    @Override public T visitVar_decl(BCCParser.Var_declContext ctx) { return visitChildren(ctx); }

    @Override public T visitData_type(BCCParser.Data_typeContext ctx) {
        return (T) ctx.getText();
    }

    @Override public T visitStmt_block(BCCParser.Stmt_blockContext ctx) { return visitChildren(ctx); }

    @Override public T visitPrint(BCCParser.PrintContext ctx) {
        System.out.println("PRINT DEL LENGUAJE: "+visitChildren(ctx));
        return null;
    }

    @Override public T visitInput(BCCParser.InputContext ctx) { return visitChildren(ctx); }

    @Override public T visitWhen(BCCParser.WhenContext ctx) { return visitChildren(ctx); }

    @Override public T visitIf(BCCParser.IfContext ctx) { return visitChildren(ctx); }

    @Override public T visitUnless(BCCParser.UnlessContext ctx) { return visitChildren(ctx); }

    @Override public T visitWhile(BCCParser.WhileContext ctx) { return visitChildren(ctx); }

    @Override public T visitReturn(BCCParser.ReturnContext ctx) { return visitChildren(ctx); }

    @Override public T visitUntil(BCCParser.UntilContext ctx) { return visitChildren(ctx); }

    @Override public T visitLoop(BCCParser.LoopContext ctx) { return visitChildren(ctx); }

    @Override public T visitDoWhile(BCCParser.DoWhileContext ctx) { return visitChildren(ctx); }

    @Override public T visitDoUntil(BCCParser.DoUntilContext ctx) { return visitChildren(ctx); }

    @Override public T visitRepeat(BCCParser.RepeatContext ctx) { return visitChildren(ctx); }

    @Override public T visitFor(BCCParser.ForContext ctx) { return visitChildren(ctx); }

    @Override public T visitNext(BCCParser.NextContext ctx) { return visitChildren(ctx); }

    @Override public T visitBreak(BCCParser.BreakContext ctx) { return visitChildren(ctx); }

    @Override public T visitAsignacion(BCCParser.AsignacionContext ctx) { return visitChildren(ctx); }

    @Override public T visitSumaIgual(BCCParser.SumaIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitRestaIgual(BCCParser.RestaIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitProductoIgual(BCCParser.ProductoIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitDivisionIgual(BCCParser.DivisionIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitModuloIgual(BCCParser.ModuloIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitPostIncremento(BCCParser.PostIncrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPostDecremento(BCCParser.PostDecrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPreIncremento(BCCParser.PreIncrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPreDecremento(BCCParser.PreDecrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitLexpr(BCCParser.LexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitNexpr(BCCParser.NexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitRexpr(BCCParser.RexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitSimple_expr(BCCParser.Simple_exprContext ctx) { return visitChildren(ctx); }

    @Override public T visitTerm(BCCParser.TermContext ctx) { return visitChildren(ctx); }

    @Override public T visitNum(BCCParser.NumContext ctx) {
        return (T) ctx.getText();
    }

    @Override public T visitBool(BCCParser.BoolContext ctx) { return visitChildren(ctx); }

    @Override public T visitPostFactor(BCCParser.PostFactorContext ctx) { return visitChildren(ctx); }

    @Override public T visitPreFactor(BCCParser.PreFactorContext ctx) { return visitChildren(ctx); }

    @Override public T visitVariable(BCCParser.VariableContext ctx) { return visitChildren(ctx); }

    @Override public T visitParentesisFactor(BCCParser.ParentesisFactorContext ctx) { return visitChildren(ctx); }

    @Override public T visitLlamadoFunct(BCCParser.LlamadoFunctContext ctx) {

        //Se obtiene la función llamada
        BCCParser.Fn_decl_listContext functionCtx = functions.get(ctx.FID().toString());

        //Si la función es null, se tira un error
        if(functionCtx == null) twrowError("The function was not declared");

        //Se añade un nuevo scope
        scopes.add(new HashMap<String,Variable>());
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Se pasan variables a la función (Se verifica que el número de variables esperado y el número recibido sea el mismo)
        //Ademas se hace la verficación de que el número de valores pasados sea el mismo número de parametros esperados
        if(ctx.lexpr() != null && functionCtx.parametros != null && functionCtx.parametros.ID().size() == ctx.lexpr().size()){

            //Se resuelven los parámetros pasados (Variables a valores, operaciones, etc) y
            //si los tipos de datos coinciden (En orden), se guardan en el nuevo scope
            for(int i=0; i<functionCtx.parametros.ID().size(); i++){
                Object parameterResolved = visitChildren(ctx.lexpr(i));                                                 //REVISAR CUANDO SE TERMINE LEXPR//
                String receivedDataType = "num";                                                                        //REVISAR CUANDO SE TERMINE LEXPR//
                String expectedDataType = visitData_type(functionCtx.parametros.data_type(i)).toString();

                if(receivedDataType.equals(expectedDataType)) {
                    if(actualScope.get(functionCtx.parametros.ID(i).toString())!=null){
                        twrowError("There's a variable name repeated");
                        break;
                    }
                    actualScope.put(functionCtx.parametros.ID(i).toString(), new Variable(functionCtx.parametros.ID(i).toString(), parameterResolved, expectedDataType));
                }else {
                    twrowError("A parameter passed didn't matched the datatype expected");
                    break;
                }
            }
        }else if(ctx.lexpr() != null || functionCtx.parametros != null) twrowError("The number of parameters passed doesn't match the number of parameters expected");


        //Se añaden las variables declaradas en la funcion al scope (Si las hay)
        if(functionCtx.variables != null){
            for(int i=0; i<functionCtx.variables.ID().size() ; i++){
                actualScope.put(functionCtx.variables.ID(i).toString(), new Variable(functionCtx.variables.ID(i).toString(), visitData_type(functionCtx.variables.data_type(i)).toString()));
            }
        }

        System.out.println("\n VARIABLES GUARDADAS EN EL SCOPE ");
        for (Map.Entry mapElement : actualScope.entrySet()) {
            Variable value = (Variable) mapElement.getValue();
            System.out.println(value.getName()+" "+value.getValue()+" "+value.getDataType()+" ");
        }

        //Se realizan las operaciones de la funcion
        T functionExecution = visitChildren(functionCtx.stmt_block());

        //Se elimina el scope de la función
        scopes.remove(scopes.size()-1);

        //Se retorna lo devuelto luego de la ejecución de la función
        return functionExecution;
    }

    private void twrowError(String msg){
        System.out.println(msg);
    }
}
