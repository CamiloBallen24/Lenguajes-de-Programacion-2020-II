import grammar.BCCBaseVisitor;
import grammar.BCCParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Interprete<T> extends BCCBaseVisitor<T> {

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

    @Override public T visitMain_prog(BCCParser.Main_progContext ctx) {
        //Se añade un nuevo scope
        scopes.add(new HashMap<String,Variable>());
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        if(ctx.TK_VAR() != null){
            visitVar_decl(ctx.var_decl());
        }
        visitChildren(ctx);


        System.out.println("\n VARIABLES GUARDADAS EN EL SCOPE ");
        for (Map.Entry mapElement : actualScope.entrySet()) {
            Variable value = (Variable) mapElement.getValue();
            System.out.println(value.getName()+" "+value.getValue()+" "+value.getDataType()+" ");
        }


        return null;

    }

    @Override public T visitVar_decl(BCCParser.Var_declContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);
        for (int i = 0; i < ctx.ID().size(); i++) {
            actualScope.put(ctx.ID(i).getText(), new Variable( ctx.ID(i).getText(), null, visitData_type(ctx.data_type(i)).toString()));
        }
        return null;
    }

    @Override public T visitData_type(BCCParser.Data_typeContext ctx) {
        return (T) ctx.getText();
    }

    @Override public T visitStmt_block(BCCParser.Stmt_blockContext ctx) { return visitChildren(ctx); }

    @Override public T visitPrint(BCCParser.PrintContext ctx) {
        String a = visitLexpr(ctx.lexpr()).toString();
        System.out.println(a);
        return null;
    }

    @Override public T visitInput(BCCParser.InputContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();

            if(var.getDataType().toString().equals("num")){
                //verificar que sea un numero o tirar error
                if (isNum(input)) {
                    Variable new_var = new Variable(var.getName(), toNum(input), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Valor no valido");
                }
            }

            if(var.getDataType().toString().equals("bool")) {
                if(isBool(input)){
                    Variable new_var = new Variable(var.getName(), toBool(input), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Valor no valido");
                }
            }

        }
        else{
            twrowError("This variable don't exist");
        }
        return null;
    }

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

    @Override public T visitAsignacion(BCCParser.AsignacionContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if (var.getDataType().toString().equals("num")){
                if(isNum(value)){
                    Variable new_var = new Variable(var.getName(), toNum(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Valor no valido");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                if(isBool(value)) {
                    Variable new_var = new Variable(var.getName(), toBool(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Valor no valido");
                    return null;
                }
            }

            return null;

        }
        else{
            twrowError("This variable don't exist");
            return null;
        }


    }

    @Override public T visitSumaIgual(BCCParser.SumaIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitRestaIgual(BCCParser.RestaIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitProductoIgual(BCCParser.ProductoIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitDivisionIgual(BCCParser.DivisionIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitModuloIgual(BCCParser.ModuloIgualContext ctx) { return visitChildren(ctx); }

    @Override public T visitPostIncremento(BCCParser.PostIncrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPostDecremento(BCCParser.PostDecrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPreIncremento(BCCParser.PreIncrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPreDecremento(BCCParser.PreDecrementoContext ctx) { return visitChildren(ctx); }

    @Override public T visitLexpr(BCCParser.LexprContext ctx) {
        String  nexpr_inital = visitNexpr(ctx.nexpr(0)).toString();

        if(ctx.TK_AND().size()>0){
            if(!isBool(nexpr_inital)){ twrowError("Esta variable no es voleana");}
            Boolean lexpr = toBool(nexpr_inital);
            for (int i = 1; i < ctx.TK_AND().size() ; i++) {
                if(!isBool(visitNexpr(ctx.nexpr(i)).toString())){ twrowError("Esta variable no es voleana");}
                lexpr = lexpr && toBool(visitNexpr(ctx.nexpr(i)).toString());
            }
            return (T) Boolean.toString(lexpr);


        }
        if(ctx.TK_OR().size()>0){
            if(!isBool(nexpr_inital)){ twrowError("Esta variable no es voleana");}
            Boolean lexpr = toBool(nexpr_inital);
            for (int i = 1; i < ctx.TK_OR().size()+1 ; i++) {
                if(!isBool(visitNexpr(ctx.nexpr(i)).toString())){ twrowError("Esta variable no es voleana");}
                lexpr = lexpr || toBool(visitNexpr(ctx.nexpr(i)).toString());
            }
            return (T) Boolean.toString(lexpr);
        }
        return (T) nexpr_inital;
    }

    @Override public T visitNexpr(BCCParser.NexprContext ctx) {
        if (ctx.TK_NOT() == null){
            return visitRexpr(ctx.rexpr());
        }
        else{
            String value = visitLexpr(ctx.lexpr()).toString();
            if(isBool(value)){
                return (T) Boolean.toString(!toBool(value));
            }
            return null;
        }

    }

    @Override public T visitRexpr(BCCParser.RexprContext ctx) {

        if(ctx.simple_expr().size()==2){
            String simple_expr_0 = visit(ctx.simple_expr(0)).toString();
            String simple_expr_1 = visit(ctx.simple_expr(1)).toString();

            if(isNum(simple_expr_0) && isNum(simple_expr_1)){}
            switch (visitRexpr_operator(ctx.rexpr_operator()).toString()){
                case (">"):
                    return (T) Boolean.toString(toNum(simple_expr_0) > toNum(simple_expr_1));

                case ("<"):
                    return (T) Boolean.toString(toNum(simple_expr_0) < toNum(simple_expr_1));

                case (">="):
                    return (T) Boolean.toString(toNum(simple_expr_0) >= toNum(simple_expr_1));

                case ("<="):
                    return (T) Boolean.toString(toNum(simple_expr_0) <= toNum(simple_expr_1));

                case ("=="):
                    return (T) Boolean.toString(toNum(simple_expr_0) == toNum(simple_expr_1));

                case ("!="):
                    return (T) Boolean.toString(toNum(simple_expr_0) != toNum(simple_expr_1));
            }

            if(isBool(simple_expr_0) && isBool(simple_expr_1)){
                switch (visitRexpr_operator(ctx.rexpr_operator()).toString()){
                    case ("!="):
                        return (T) Boolean.toString(toBool(simple_expr_0) != toBool(simple_expr_1));

                    case ("=="):
                        return (T) Boolean.toString(toBool(simple_expr_0) == toBool(simple_expr_1));

                }
            }


            return null;
        }
        else{
            return (T) visit(ctx.simple_expr(0)).toString();
        }

    }

    @Override public T visitRexpr_operator(BCCParser.Rexpr_operatorContext ctx) {
        if(ctx.TK_MAYOR() != null){ return (T) ctx.TK_MAYOR().getText();}
        if(ctx.TK_MENOR() != null){ return (T) ctx.TK_MENOR().getText();}
        if(ctx.TK_IGUAL() != null){ return (T) ctx.TK_IGUAL().getText();}
        if(ctx.TK_DIFERENTE() != null){ return (T) ctx.TK_DIFERENTE().getText();}
        if(ctx.TK_MAYOR_IGUAL() != null){ return (T) ctx.TK_MAYOR_IGUAL().getText();}
        if(ctx.TK_MENOR_IGUAL() != null){ return (T) ctx.TK_MENOR_IGUAL().getText();}
        return null;
    }

    @Override public T visitSimple_expr(BCCParser.Simple_exprContext ctx) {
        //Term inicial
        String term_0 = visit(ctx.term(0)).toString();

        if(isNum(term_0)){
            Double simple_expr = toNum(term_0);

            for (int i = 1; i < ctx.term().size(); i++) {

                if(!isNum(visit(ctx.term(i)).toString())){
                    twrowError("Esta variable no es de tipo num");
                }
                if(visitSimple_expr_operator(ctx.simple_expr_operator(i-1)).toString().equals("+")){
                    simple_expr = simple_expr + toNum(visit(ctx.term(i)).toString());
                }
                if(visitSimple_expr_operator(ctx.simple_expr_operator(i-1)).toString().equals("-")){
                    simple_expr = simple_expr - toNum(visit(ctx.term(i)).toString());
                }
            }

            return (T) simple_expr;
        }
        else{
            //Asegurarse que sea solo 1
            return (T) term_0;
        }

    }

    @Override public T visitSimple_expr_operator(BCCParser.Simple_expr_operatorContext ctx) {
        if(ctx.TK_RESTA() != null){ return (T) ctx.TK_RESTA().getText();}
        if(ctx.TK_SUMA() != null){ return (T) ctx.TK_SUMA().getText();}
        return null;
    }

    @Override public T visitTerm(BCCParser.TermContext ctx) {
        //Factor inicial
        String factor_0 = visit(ctx.initialfactor).toString();


        if(isNum(factor_0)){
            Double term = toNum(factor_0);

            for (int i = 1; i < ctx.factor().size(); i++) {

                if(!isNum(visit(ctx.factor(i)).toString())){
                    twrowError("Esta variable no es de tipo num");
                }
                if(visitTerm_operator(ctx.term_operator(i-1)).toString().equals("*")){
                    term = term * toNum(visit(ctx.factor(i)).toString());
                }

                if(visitTerm_operator(ctx.term_operator(i-1)).toString().equals("/")){
                    term = term / toNum(visit(ctx.factor(i)).toString());
                }
                if(visitTerm_operator(ctx.term_operator(i-1)).toString().equals("%")){
                    term = term % toNum(visit(ctx.factor(i)).toString());
                }

            }
            return (T) term;
        }
        else{
            //Asegurarse que sea solo 1
            return (T) factor_0;
        }
    }

    @Override public T visitTerm_operator(BCCParser.Term_operatorContext ctx) {
        if(ctx.TK_PRODUCTO() != null){ return (T) ctx.TK_PRODUCTO().getText();}
        if(ctx.TK_DIVISION() != null){ return (T) ctx.TK_DIVISION().getText();}
        if(ctx.TK_MODULO() != null){ return (T) ctx.TK_MODULO().getText();}
        return null;
    }

    @Override public T visitNum(BCCParser.NumContext ctx) {
        return (T) ctx.getText();
    }

    @Override public T visitBool(BCCParser.BoolContext ctx) {
        return (T) ctx.getText();
    }

    @Override public T visitPostFactor(BCCParser.PostFactorContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if (var.getValue() == null) {
                twrowError("Esta variable no esta inicializada");
            }

            //verificar que sea un numero o tirar error
            if(var.getDataType().toString().equals("num")){
                if (ctx.TK_DECREMENTO() != null){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString())-1, var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                if (ctx.TK_INCREMENTO() != null){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString())+1, var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }

                return (T) toNum(var.getValue().toString());
            }
            else {
                twrowError("Esta variable no es de tipo num");
                return null;
            }
        }
        else{
            twrowError("This variable don't exist");
            return null;
        }
    }

    @Override public T visitPreFactor(BCCParser.PreFactorContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if (var.getValue() == null) {
                twrowError("Esta variable no esta inicializada");
            }

            //verificar que sea un numero o tirar error
            if(var.getDataType().toString().equals("num")){
                if (ctx.TK_DECREMENTO() != null){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString())-1, var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                if (ctx.TK_INCREMENTO() != null){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString())+1, var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                return (T) toNum(actualScope.get(ctx.ID().getText()).getValue().toString());
            }
            else {
                twrowError("Esta variable no es de tipo num");
                return null;
            }
        }
        else{
            twrowError("This variable don't exist");
            return null;
        }
    }

    @Override public T visitVariable(BCCParser.VariableContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());
            return (T) Double.valueOf(var.getValue().toString());
        }
        else{
            twrowError("This variable don't exist");
            return null;
        }
    }

    @Override public T visitParentesisFactor(BCCParser.ParentesisFactorContext ctx) {
        T lexprEvaluation = visitLexpr(ctx.lexpr());
        return lexprEvaluation;
    }

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

        //System.out.println("\n VARIABLES GUARDADAS EN EL SCOPE ");
        //for (Map.Entry mapElement : actualScope.entrySet()) {
        //    Variable value = (Variable) mapElement.getValue();
        //    System.out.println(value.getName()+" "+value.getValue()+" "+value.getDataType()+" ");
        //}

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

    private boolean isNum(String expresion){
        try {
            Double.valueOf(expresion);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    private Double toNum(String expresion){
        return Double.parseDouble(expresion);
    }

    private boolean isBool(String expresion){
        return true;
    }

    private Boolean toBool(String expresion){
        if(expresion.equals("true")){
            return true;
        }
        if(expresion.equals("false")){
            return false;
        }
        return false;
    }

    private boolean isTrue(String expresion){
        return true;
    }

    private boolean isFalse(String expresion){
        return true;
    }
}
