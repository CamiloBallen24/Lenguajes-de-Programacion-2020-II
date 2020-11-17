import grammar.BCCBaseVisitor;
import grammar.BCCParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
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
        for (int i = 0; i < ctx.stmt().size(); i++) {
            if (ctx.stmt(i).getClass().equals(BCCParser.NextContext.class)){
                twrowError("La palabra clave next debe estar dentro de un comando de iteracion");
                return null;
            }
            if (ctx.stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                twrowError("La palabra clave break debe estar dentro de un comando de iteracion");
                return null;
            }
            if (ctx.stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                twrowError("La palabra clave return debe estar dentro de una funcion");
                return null;
            }
            visit(ctx.stmt(i));
        }


//        System.out.println("\n VARIABLES GUARDADAS EN EL SCOPE ");
//        for (Map.Entry mapElement : actualScope.entrySet()) {
//            Variable value = (Variable) mapElement.getValue();
//            System.out.println(value.getName()+" "+value.getValue()+" "+value.getDataType()+" ");
//        }


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

    @Override public T visitStmt_block(BCCParser.Stmt_blockContext ctx) {
        return visitChildren(ctx);
    }

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
                    twrowError("Se esperaba que ingresara un dato de tipo num");
                }
            }

            if(var.getDataType().toString().equals("bool")) {
                if(isBool(input)){
                    Variable new_var = new Variable(var.getName(), toBool(input), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba que ingresara un dato de tipo bool");
                }
            }

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
        }
        return null;
    }

    @Override public T visitWhen(BCCParser.WhenContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            if(toBool(expr)){
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        return visitNext((BCCParser.NextContext) ctx.stmt_block().stmt(i));
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return visitBreak((BCCParser.BreakContext) ctx.stmt_block().stmt(i));
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        return stmt_return;
                    }
                }
            }
        }
        return null;
    }

    @Override public T visitIf(BCCParser.IfContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            if(toBool(expr)){
                for (int i = 0; i < ctx.stmt_block(0).stmt().size(); i++) {
                    if (ctx.stmt_block(0).stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        return visitNext((BCCParser.NextContext) ctx.stmt_block(0).stmt(i));
                    }
                    if (ctx.stmt_block(0).stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return visitBreak((BCCParser.BreakContext) ctx.stmt_block(0).stmt(i));
                    }
                    if (ctx.stmt_block(0).stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block(0).stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block(0).stmt(i));
                    if(stmt_return!=null) {
                        return stmt_return;
                    }
                }
            }
            else{
                for (int i = 0; i < ctx.stmt_block(1).stmt().size(); i++) {
                    if (ctx.stmt_block(1).stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        return visitNext((BCCParser.NextContext) ctx.stmt_block(1).stmt(i));
                    }
                    if (ctx.stmt_block(1).stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return visitBreak((BCCParser.BreakContext) ctx.stmt_block(1).stmt(i));
                    }
                    if (ctx.stmt_block(1).stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block(1).stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block(1).stmt(i));
                    if(stmt_return!=null) {
                        return stmt_return;
                    }
                }
            }
        }
        return null;
    }

    @Override public T visitUnless(BCCParser.UnlessContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            if(!toBool(expr)){
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        return visitNext((BCCParser.NextContext) ctx.stmt_block().stmt(i));
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return visitBreak((BCCParser.BreakContext) ctx.stmt_block().stmt(i));
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        return stmt_return;
                    }
                }
            }
        }
        return null;
    }

    @Override public T visitWhile(BCCParser.WhileContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            while(toBool(visitLexpr(ctx.lexpr()).toString())){
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }

            }
        }
        return null;
    }

    @Override public T visitReturn(BCCParser.ReturnContext ctx) {
        Boolean isInFuntion = false;
        RuleContext parent = ctx.parent;
        while (!isInFuntion && !parent.getClass().equals(BCCParser.ProgContext.class)){
            if (parent.getClass().equals(BCCParser.Fn_decl_listContext.class))
                isInFuntion = true;
            else
                parent =  parent.parent;
        }
        if (isInFuntion){
            return (T) visitLexpr(ctx.lexpr()).toString();
        }
        else{
            twrowError("La palabra clave return debe estar dentro de una funcion");
            return null;
        }

    }

    @Override public T visitUntil(BCCParser.UntilContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            while(!toBool(visitLexpr(ctx.lexpr()).toString())){
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }
            }
        }
        return null;
    }

    @Override public T visitLoop(BCCParser.LoopContext ctx) {
        while(true){
            for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                    break;
                }
                if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                    return null;
                }
                if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                    return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                }
                T stmt_return = visit(ctx.stmt_block().stmt(i));
                if(stmt_return!=null) {
                    if(stmt_return.toString().equals("break")) return null;
                    else if(stmt_return.toString().equals("next")) break;
                    else return stmt_return;
                }
            }
        }
    }

    @Override public T visitDoWhile(BCCParser.DoWhileContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            do{
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }
            }
            while(toBool(visitLexpr(ctx.lexpr()).toString()));
        }
        return null;
    }

    @Override public T visitDoUntil(BCCParser.DoUntilContext ctx) {
        String expr = visitLexpr(ctx.lexpr()).toString();
        if(isBool(expr)){
            do{
                for (int i = 0; i < ctx.stmt_block().stmt().size(); i++) {
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(i));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(i));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }
            }
            while(!toBool(visitLexpr(ctx.lexpr()).toString()));
        }
        return null;
    }

    @Override public T visitRepeat(BCCParser.RepeatContext ctx) {
        String expr = ctx.NUM().getText();
        if(isNum(expr)){
            for (int i = 0; i < toNum(expr); i++) {
                for (int j = 0; j < ctx.stmt_block().stmt().size(); j++) {
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(j));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(j));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }
            }

        }
        return null;
    }

    @Override public T visitFor(BCCParser.ForContext ctx) {
        String expr_init = visitLexpr(ctx.lexpr(0)).toString();
        String expr_end = visitLexpr(ctx.lexpr(1)).toString();
        String expr_step = visitLexpr(ctx.lexpr(2)).toString();
        if(isNum(expr_init) && isNum(expr_end) && isNum(expr_step)){
            for (double i = toNum(expr_init); i < toNum(expr_end); i = i + toNum(expr_step)) {
                for (int j = 0; j < ctx.stmt_block().stmt().size(); j++) {
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.NextContext.class)){
                        break;
                    }
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.BreakContext.class)){
                        return null;
                    }
                    if (ctx.stmt_block().stmt(j).getClass().equals(BCCParser.ReturnContext.class)){
                        return visitReturn((BCCParser.ReturnContext) ctx.stmt_block().stmt(j));
                    }
                    T stmt_return = visit(ctx.stmt_block().stmt(j));
                    if(stmt_return!=null) {
                        if(stmt_return.toString().equals("break")) return null;
                        else if(stmt_return.toString().equals("next")) break;
                        else return stmt_return;
                    }
                }
            }

        }
        return visitChildren(ctx);


    }

    @Override public T visitNext(BCCParser.NextContext ctx) {
        Boolean isInLoop = false;
        RuleContext parent = ctx.parent;
        while (!isInLoop && !parent.getClass().equals(BCCParser.ProgContext.class)){
            if (parent.getClass().equals(BCCParser.WhileContext.class) ||
                    parent.getClass().equals(BCCParser.LoopContext.class) ||
                    parent.getClass().equals(BCCParser.ForContext.class) ||
                    parent.getClass().equals(BCCParser.UntilContext.class) ||
                    parent.getClass().equals(BCCParser.RepeatContext.class) ||
                    parent.getClass().equals(BCCParser.DoWhileContext.class) ||
                    parent.getClass().equals(BCCParser.DoUntilContext.class))
                isInLoop = true;
            else
                parent =  parent.parent;
        }
        if (isInLoop){
            return (T) ctx.TK_NEXT().getText();
        }
        else{
            twrowError("La palabra clave next debe estar dentro de un comando de iteracion");
            return null;
        }
    }

    @Override public T visitBreak(BCCParser.BreakContext ctx) {
        Boolean isInLoop = false;
        RuleContext parent = ctx.parent;
        while (!isInLoop && !parent.getClass().equals(BCCParser.ProgContext.class)){
            if (parent.getClass().equals(BCCParser.WhileContext.class) ||
                parent.getClass().equals(BCCParser.LoopContext.class) ||
                parent.getClass().equals(BCCParser.ForContext.class) ||
                parent.getClass().equals(BCCParser.UntilContext.class) ||
                parent.getClass().equals(BCCParser.RepeatContext.class) ||
                parent.getClass().equals(BCCParser.DoWhileContext.class) ||
                parent.getClass().equals(BCCParser.DoUntilContext.class))
                isInLoop = true;
            else
                parent =  parent.parent;
        }
        if (isInLoop){
            return (T) ctx.TK_BREAK().getText();
        }
        else{
            twrowError("La palabra clave break debe estar dentro de un comando de iteracion");
            return null;

        }
    }

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
                    twrowError("Tipo de dato incongruente se esperaba num y se encontro bool en variable '" + var.getName() + "'");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                if(isBool(value)) {
                    Variable new_var = new Variable(var.getName(), toBool(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Tipo de dato incongruente se esperaba bool y se encontro num en variable '" + var.getName() + "'");
                }
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }


    }

    @Override public T visitSumaIgual(BCCParser.SumaIgualContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                if(isNum(value)){
                    Variable new_var = new Variable(var.getName(), toNum(value) + toNum(var.getValue().toString()), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba un dato de tipo num y se recibio un bool");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer una suma con asignacion a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitRestaIgual(BCCParser.RestaIgualContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                if(isNum(value)){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) - toNum(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba un dato de tipo num y se recibio un bool");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer una resta con asignacion a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitProductoIgual(BCCParser.ProductoIgualContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                if(isNum(value)){
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) * toNum(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba un dato de tipo num y se recibio un bool");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer una multiplicacion con asignacion a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitDivisionIgual(BCCParser.DivisionIgualContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){

                if(isNum(value)){
                    if(toNum(value) == 0){
                        twrowError("No se puede dividir por 0");
                        return  null;
                    }
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) / toNum(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba un dato de tipo num y se recibio un bool");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer una division con asignacion a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitModuloIgual(BCCParser.ModuloIgualContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            String value = visitLexpr(ctx.lexpr()).toString();

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){

                if(isNum(value)){
                    if(toNum(value) == 0){
                        twrowError("No se puede hacer modulo por 0");
                        return  null;
                    }
                    Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) % toNum(value), var.getDataType().toString());
                    actualScope.put(var.getName(), new_var);
                }
                else{
                    twrowError("Se esperaba un dato de tipo num y se recibio un bool");
                    return null;
                }
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer modulo con asignacion a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitPostIncremento(BCCParser.PostIncrementoContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) + 1, var.getDataType().toString());
                actualScope.put(var.getName(), new_var);
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer incremento a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitPostDecremento(BCCParser.PostDecrementoContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) - 1, var.getDataType().toString());
                actualScope.put(var.getName(), new_var);
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer decremento a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitPreIncremento(BCCParser.PreIncrementoContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) + 1, var.getDataType().toString());
                actualScope.put(var.getName(), new_var);
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer incremento a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitPreDecremento(BCCParser.PreDecrementoContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());

            if(var.getValue() == null) {
                return null;
            }

            if (var.getDataType().toString().equals("num")){
                Variable new_var = new Variable(var.getName(), toNum(var.getValue().toString()) - 1, var.getDataType().toString());
                actualScope.put(var.getName(), new_var);
            }

            if (var.getDataType().toString().equals("bool")){
                twrowError("No se puede hacer decremento a un dato de tipo bool en variable '" + var.getName() + "'");
                return null;
            }

            return null;

        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitLexpr(BCCParser.LexprContext ctx) {
        String  nexpr_inital = visitNexpr(ctx.nexpr(0)).toString();

        if(ctx.TK_AND().size()>0){
            if(!isBool(nexpr_inital)){
                twrowError("El dato inicial no es booleano");
            }
            Boolean lexpr = toBool(nexpr_inital);
            for (int i = 1; i < ctx.TK_AND().size()+1; i++) {
                if(!isBool(visitNexpr(ctx.nexpr(i)).toString())){ twrowError("2Esta variable no es voleana");}
                lexpr = lexpr && toBool(visitNexpr(ctx.nexpr(i)).toString());
            }
            return (T) Boolean.toString(lexpr);


        }
        if(ctx.TK_OR().size()>0){
            if(!isBool(nexpr_inital)){ twrowError("3Esta variable no es voleana");}
            Boolean lexpr = toBool(nexpr_inital);
            for (int i = 1; i < ctx.TK_OR().size()+1 ; i++) {
                if(!isBool(visitNexpr(ctx.nexpr(i)).toString())){ twrowError("4Esta variable no es voleana");}
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

            if(isNum(simple_expr_0) && isNum(simple_expr_1)) {
                switch (visitRexpr_operator(ctx.rexpr_operator()).toString()) {
                    case (">"):
                        return (T) Boolean.toString(toNum(simple_expr_0) > toNum(simple_expr_1));

                    case ("<"):
                        return (T) Boolean.toString(toNum(simple_expr_0) < toNum(simple_expr_1));

                    case (">="):
                        return (T) Boolean.toString(toNum(simple_expr_0) >= toNum(simple_expr_1));

                    case ("<="):
                        return (T) Boolean.toString(toNum(simple_expr_0) <= toNum(simple_expr_1));

                    case ("=="):
                        return (T) Boolean.toString(toNum(simple_expr_0).equals(toNum(simple_expr_1)));

                    case ("!="):
                        return (T) Boolean.toString(toNum(simple_expr_0) != toNum(simple_expr_1));
                }
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
//        Term inicial
        String term_0 = visit(ctx.term(0)).toString();

        if(isNum(term_0)){
            Double simple_expr = toNum(term_0);

            for (int i = 1; i < ctx.term().size(); i++) {

                if(!isNum(visit(ctx.term(i)).toString())){
                    twrowError("No se pueden hacer operaciones entre datos  de tipo num y bool");
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
                    twrowError("No se pueden hacer operaciones entre datos  de tipo num y bool");
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
                twrowError("La variable '" + var.getName() + "' no esta inicializada");
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
                twrowError("La variable '" + var.getName() + "' no es de tipo num");
                return null;
            }
        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
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
                twrowError("No se puede operar una variable de tipo bool");
                return null;
            }
        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
            return null;
        }
    }

    @Override public T visitVariable(BCCParser.VariableContext ctx) {
        HashMap<String, Variable> actualScope = scopes.get(scopes.size()-1);

        //Existe la variable?
        if (actualScope.get(ctx.ID().getText()) != null){
            Variable var = actualScope.get(ctx.ID().getText());
            return (T) var.getValue().toString();
        }
        else{
            twrowError("La variable '" + ctx.ID().getText() + "' no esta definida");
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
//
//        //Si la función es null, se tira un error
        if(functionCtx == null) twrowError("La funcion '" + ctx.FID().toString() + "' no ha sido declarada");
//
//        //Se añade un nuevo scope
        HashMap<String, Variable> actualScope = new HashMap<String,Variable>();

//
//        //Se pasan variables a la función (Se verifica que el número de variables esperado y el número recibido sea el mismo)
//        //Ademas se hace la verficación de que el número de valores pasados sea el mismo número de parametros esperados
        if(ctx.lexpr() != null && functionCtx.parametros != null && functionCtx.parametros.ID().size() == ctx.lexpr().size()){
//
//            //Se resuelven los parámetros pasados (Variables a valores, operaciones, etc) y
//            //si los tipos de datos coinciden (En orden), se guardan en el nuevo scope
            for(int i=0; i<functionCtx.parametros.ID().size(); i++){

                String parameterResolved = visitLexpr(ctx.lexpr(i)).toString();                                                 //REVISAR CUANDO SE TERMINE LEXPR//
                String receivedDataType = isNum(parameterResolved)?"num":"bool";                                                //REVISAR CUANDO SE TERMINE LEXPR//
                String expectedDataType = visitData_type(functionCtx.parametros.data_type(i)).toString();
//
                if(receivedDataType.equals(expectedDataType)) {
                    if(actualScope.get(functionCtx.parametros.ID(i).toString())!=null){
                        twrowError("Nombre de variable repetida en '" + ctx.FID().toString() + "'");
                        break;
                    }
                    actualScope.put(functionCtx.parametros.ID(i).toString(), new Variable(functionCtx.parametros.ID(i).toString(), parameterResolved, expectedDataType));
                }else {
                    twrowError("Uno o varios tipos de datos de los parametros en el llamado a '" +  ctx.FID().toString() + "' no coinciden con los definidos");
                    break;
                }
            }


        }else if(ctx.lexpr() != null && functionCtx.parametros != null) twrowError("El numero de parametros en el llamado a '" +  ctx.FID().toString() + "' no coinciden con los definidos");
        scopes.add(actualScope);
        //
//
//        //Se añaden las variables declaradas en la funcion al scope (Si las hay)
        if(functionCtx.variables != null){
            for(int i=0; i<functionCtx.variables.ID().size() ; i++){
                actualScope.put(functionCtx.variables.ID(i).toString(), new Variable(functionCtx.variables.ID(i).toString(), visitData_type(functionCtx.variables.data_type(i)).toString()));
            }
        }

//        System.out.println("\n VARIABLES GUARDADAS EN EL SCOPE ");
//        for (Map.Entry mapElement : actualScope.entrySet()) {
//            Variable value = (Variable) mapElement.getValue();
//            System.out.println(value.getName()+" "+value.getValue()+" "+value.getDataType()+" ");
//        }

        //Se realizan las operaciones de la funcion
        T functionExecution = null;
        for (int i = 0; i < functionCtx.stmt_block().stmt().size(); i++) {
            if (functionCtx.stmt_block().stmt(i).getClass().equals(BCCParser.NextContext.class)){
                twrowError("La palabra clave next debe estar dentro de un comando de iteracion");
                return null;
            }
            if (functionCtx.stmt_block().stmt(i).getClass().equals(BCCParser.BreakContext.class)){
                twrowError("La palabra clave break debe estar dentro de un comando de iteracion");
                return null;
            }
            if (functionCtx.stmt_block().stmt(i).getClass().equals(BCCParser.ReturnContext.class)){
                functionExecution = visitReturn((BCCParser.ReturnContext) functionCtx.stmt_block().stmt(i));
                break;
            }
            T stmt_return = visit(functionCtx.stmt_block().stmt(i));
            if(stmt_return!=null){
                functionExecution = stmt_return;
                break;
            };
        }


        //Se elimina el scope de la función
        scopes.remove(scopes.size()-1);

        //Se retorna lo devuelto luego de la ejecución de la función
        return functionExecution;


    }

    private void twrowError(String msg){
        throw new RuntimeException(msg);
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
        if(expresion.equals("true")){
            return true;
        }
        if(expresion.equals("false")){
            return true;
        }
        return false;
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
