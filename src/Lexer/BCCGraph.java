package Lexer;
import java.util.HashMap;
import java.util.ArrayList; 

import Lexer.State;

import Lexer.Connection;
import java.util.Arrays;

public class BCCGraph {
    
    public static State initial_state;
    public static ArrayList<State> states;
    public static ArrayList<Connection> connections;
    
    static{
        //Lista de estados
        states = new ArrayList<State>();
        
        //Lista de Conexiones
        connections = new ArrayList<Connection>();
        
        //Definiendo el estado inicial
        State state_initial = new State("initial", null, false, false);
        initial_state = state_initial;
        
        //Creando estados  - new State(type_state, token_associate, is_valide)
        State state_indefinido_01        =   new State("indefinido_01", "id", true, false);
        State state_identificador_num    =   new State("identificador", "id", true, false);
        State state_number               =   new State("number", "tk_num", true, true);
        State state_number_decimal       =   new State("number_decimal", "tk_num", true, true);
        State state_invalido_01          =   new State("invalido_01", null, false, false);
        State state_left_square_bracket  =   new State("left_square_bracket", "tk_llave_izq", true, false);
        State state_right_square_bracket =   new State("right_square_bracket", "tk_llave_der", true, false);
        State state_left_bracket =   new State("left_bracket", "tk_par_izq", true, false);
        State state_right_bracket =   new State("right_bracket", "tk_par_der", true, false);
        State state_comma =   new State("comma", "tk_coma", true, false);
        State state_semicolon =   new State("semicolon", "tk_puntoycoma", true, false);
        State state_invalido_02          =   new State("invalido_02", null, false, false);
        State state_function          =   new State("function", "fid", true, true);
        State state_invalido_03          =   new State("invalido_03", null, false, false);
        State state_igualdad                 =   new State("igualdad", "tk_igualdad", true, false);
        State state_invalido_04          =   new State("invalido_04", null, false, false);
        State state_diferente                 =   new State("diferente", "tk_diferente", true, false);
        State state_menor                 =   new State("menor", "tk_menor", true, false);
        State state_menor_igual                 =   new State("menor_igual", "tk_menor_igual", true, false);
        State state_mayor                 =   new State("mayor", "tk_mayor", true, false);
        State state_mayor_igual                 =   new State("mayor_igual", "tk_mayor_igual", true, false);
        State state_mas                 =   new State("mas", "tk_mas", true, false);
        State state_sum_asignacion                 =   new State("sum_asignacion", "tk_sum_asig", true, false);
        State state_incremento            =   new State("incremento", "tk_incremento", true, false);
        State state_menos                 =   new State("menos", "tk_menos", true, false);
        State state_decremento            =   new State("decremento", "tk_decremento", true, false);
        State state_res_asignacion                 =   new State("res_asignacion", "tk_res_asig", true, false);
        State state_dos_puntos          = new State("dos_puntos", "tk_dospuntos", true, false);
        State state_asignacion          = new State("asignacion", "tk_asignacion", true, false);
        State state_multiplicacion          = new State("multiplicacion", "tk_mul", true, false);
        State state_mul_asignacion          = new State("mul_asignacion", "tk_mul_asig", true, false);
        State state_division          = new State("division", "tk_div", true, false);
        State state_div_asignacion          = new State("div_asignacion", "tk_div_asig", true, false);
        State state_modulo          = new State("modulo", "tk_mod", true, false);
        State state_mod_asignacion          = new State("mod_asignacion", "tk_mod_asig", true, false);
               
        //Creando conexiones - new Connection(initial_state, initial_state, chars_options)
        
        Connection connection_initial_initial              = new Connection(initial_state, initial_state, new Character[]{' ', '#', '\n', '\t'});
        Connection connection_initial_indefinido_01        = new Connection(state_initial, state_indefinido_01, new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});
        Connection connection_initial_number               = new Connection(state_initial, state_number, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        Connection connection_initial_left_square_bracket  = new Connection(state_initial, state_left_square_bracket, new Character[]{'{'});
        Connection connection_initial_right_square_bracket = new Connection(state_initial, state_right_square_bracket, new Character[]{'}'});
        Connection connection_initial_left_bracket         = new Connection(state_initial, state_left_bracket, new Character[]{'('});
        Connection connection_initial_right_bracket         = new Connection(state_initial, state_right_bracket, new Character[]{')'});
        Connection connection_initial_comma                 = new Connection(state_initial, state_comma, new Character[]{','});
        Connection connection_semicolon                 = new Connection(state_initial, state_semicolon, new Character[]{';'});
        Connection connection_initial_invalido_02                 = new Connection(state_initial, state_invalido_02, new Character[]{'@'});
        Connection connection_initial_invalido_03                 = new Connection(state_initial, state_invalido_03, new Character[]{'='});
        Connection connection_initial_invalido_04                 = new Connection(state_initial, state_invalido_04, new Character[]{'!'});
        Connection connection_initial_menor                 = new Connection(state_initial, state_menor, new Character[]{'<'});
        Connection connection_menor_menor_igual            = new Connection(state_menor, state_menor_igual, new Character[]{'='});
        Connection connection_initial_mayor                 = new Connection(state_initial, state_mayor, new Character[]{'>'});
        Connection connection_mayor_mayor_igual            = new Connection(state_mayor, state_mayor_igual, new Character[]{'='});
        Connection connection_initial_mas                 = new Connection(state_initial, state_mas, new Character[]{'+'});
        Connection connection_initial_menos                 = new Connection(state_initial, state_menos, new Character[]{'-'});
        Connection connection_initial_dos_puntos                 = new Connection(state_initial, state_dos_puntos, new Character[]{':'});
        Connection connection_initial_multiplicacion                 = new Connection(state_initial, state_multiplicacion, new Character[]{'*'});
        Connection connection_multiplicacion_mul_asignacion                 = new Connection(state_multiplicacion, state_mul_asignacion, new Character[]{'='});
        Connection connection_initial_division                 = new Connection(state_initial, state_division, new Character[]{'/'});
        Connection connection_division_div_asignacion                 = new Connection(state_division, state_div_asignacion, new Character[]{'='});
        Connection connection_initial_modulo                 = new Connection(state_initial, state_modulo, new Character[]{'%'});
        Connection connection_modulo_mod_asignacion                 = new Connection(state_modulo, state_mod_asignacion, new Character[]{'='});

        Connection connection_indefinido_01_indefinido_01  = new Connection(state_indefinido_01, state_indefinido_01, new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});
        Connection connection_indefinido_01_identificador  = new Connection(state_indefinido_01, state_identificador_num, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_identificador_num_identificador_num = new Connection(state_identificador_num, state_identificador_num, new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '7', '8', '9' });
        
        Connection connection_number_number         = new Connection(state_number, state_number, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        Connection connection_number_invalido_01    = new Connection(state_number, state_invalido_01 , new Character[]{'.'});
        
        Connection connection_invalido_01_number_decimal = new Connection(state_invalido_01, state_number_decimal, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_invalido_02_function = new Connection(state_invalido_02, state_function, new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});

        Connection connection_invalido_03_igualdad = new Connection(state_invalido_03, state_igualdad, new Character[]{'='});

        Connection connection_invalido_04_diferente = new Connection(state_invalido_04, state_diferente, new Character[]{'='});

        Connection connection_number_decimal_number_decimal = new Connection(state_number_decimal, state_number_decimal, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_function_function = new Connection(state_function, state_function, new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '7', '8', '9' });

        Connection connection_mas_sum_asignacion = new Connection(state_mas, state_sum_asignacion, new Character[]{'='});
        Connection connection_mas_increment = new Connection(state_mas, state_incremento, new Character[]{'+'});
        
        Connection connection_menos_res_asignacion = new Connection(state_menos, state_res_asignacion, new Character[]{'='});
        Connection connection_menos_decremento = new Connection(state_menos, state_decremento, new Character[]{'-'});
        
        Connection connection_dos_puntos_asignacion = new Connection(state_dos_puntos, state_asignacion, new Character[]{'='});

        //Anadir todos los estados a la lista
        states.add(state_initial);
        states.add(state_indefinido_01);
        states.add(state_identificador_num);
        states.add(state_number);
        states.add(state_invalido_01);
        states.add(state_left_square_bracket);
        states.add(state_right_square_bracket);
        states.add(state_number_decimal);
        states.add(state_right_bracket);
        states.add(state_comma);
        states.add(state_left_bracket);
        states.add(state_semicolon);
        states.add(state_mas);
        states.add(state_incremento);
        states.add(state_invalido_02);
        states.add(state_function);
        states.add(state_invalido_03);
        states.add(state_igualdad);
        states.add(state_invalido_04);
        states.add(state_diferente);
        states.add(state_menor);
        states.add(state_menor_igual);
        states.add(state_mayor);
        states.add(state_mayor_igual);
        states.add(state_sum_asignacion);
        states.add(state_menos);
        states.add(state_decremento);
        states.add(state_res_asignacion);
        states.add(state_dos_puntos);
        states.add(state_asignacion);
        states.add(state_multiplicacion);
        states.add(state_mul_asignacion);
        states.add(state_division);
        states.add(state_div_asignacion);
        states.add(state_modulo);
        states.add(state_mod_asignacion);
        
        //Anadiendo conexiones
        connections.add(connection_initial_initial);
        connections.add(connection_initial_indefinido_01);
        connections.add(connection_initial_number);
        connections.add(connection_initial_left_square_bracket);
        connections.add(connection_initial_right_square_bracket);
        connections.add(connection_initial_mas);
        connections.add(connection_initial_left_bracket);
        connections.add(connection_initial_right_bracket);
        connections.add(connection_initial_comma);
        connections.add(connection_semicolon);
        connections.add(connection_initial_invalido_02);
        connections.add(connection_initial_invalido_03);
        connections.add(connection_initial_invalido_04);
        connections.add(connection_initial_menor);
        connections.add(connection_initial_mayor);
        connections.add(connection_initial_menos);
        connections.add(connection_initial_dos_puntos);
        connections.add(connection_initial_multiplicacion);
        connections.add(connection_initial_division);
        connections.add(connection_initial_modulo);
        
        connections.add(connection_indefinido_01_indefinido_01);
        connections.add(connection_indefinido_01_identificador);
        
        connections.add(connection_identificador_num_identificador_num);
        
        connections.add(connection_number_invalido_01);
        connections.add(connection_number_number);
        
        connections.add(connection_invalido_01_number_decimal);

        connections.add(connection_invalido_02_function);

        connections.add(connection_invalido_03_igualdad);

        connections.add(connection_invalido_04_diferente);

        connections.add(connection_function_function);

        connections.add(connection_menor_menor_igual);

        connections.add(connection_mayor_mayor_igual);
        
        connections.add(connection_mas_increment);
        connections.add(connection_mas_sum_asignacion);

        connections.add(connection_menos_res_asignacion);
        connections.add(connection_menos_decremento);
        
        connections.add(connection_number_decimal_number_decimal);
        
        connections.add(connection_dos_puntos_asignacion);

        connections.add(connection_multiplicacion_mul_asignacion);

        connections.add(connection_division_div_asignacion);

        connections.add(connection_modulo_mod_asignacion);
    }
    
    
    public static ArrayList<Connection> connectionsByState(State state){
        ArrayList<Connection> selected_connections = new ArrayList<Connection>();
        
        for(Connection connection : connections) {
            if(connection.origin_state.type_state.equals(state.type_state)){
                selected_connections.add(connection);
            }
        }
        
        return selected_connections;
    }
    
}
