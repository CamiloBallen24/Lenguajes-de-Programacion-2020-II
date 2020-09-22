package Lexer;
import java.util.HashMap;
import java.util.ArrayList; 

import Lexer.State;

import Lexer.Connection;
import java.util.Arrays;

public class BCCGraph {    
    public State initial_state;
    public ArrayList<State> states;
    public ArrayList<Connection> connections;
    
    
    
    
    public BCCGraph(){
        //Lista de estados
        this.states = new ArrayList<State>();
        
        //Lista de Conexiones
        this.connections = new ArrayList<Connection>();
        
        
        //Definiendo el estado inicial
        State state_initial = new State("initial", null, false);
        this.initial_state =state_initial;
        
        
        
        
        //Creando estados  - new State(type_state, token_associate, is_valide)
        State state_indefinido_01   =   new State("indefinido_01", null, true);
        State state_identificador   =   new State("identificador", "id_tk", true);
        State state_number          =   new State("number", "number_tk", true);
        State state_number_decimal  =   new State("number_decimal", "number_tk", true);
        State state_invalido_01     =   new State("invalido_01", null, false);
        State state_suma            =   new State("suma", "tk_suma", true);
        State state_increment       =   new State("increment", "tk_inc", true);
        
        
        
        //Creando conexiones - new Connection(initial_state, initial_state, chars_options)
        
        Connection connection_initial_initial       = new Connection(initial_state, initial_state, new Character[]{' ', '#', '\n', '\t'});
        Connection connection_initial_indefinido_01 = new Connection(state_initial, state_indefinido_01, new Character[]{'A', 'B', 'C', 'D', 'E'});
        Connection connection_initial_number        = new Connection(state_initial, state_number, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        Connection connection_initial_suma          = new Connection(state_initial, state_suma, new Character[]{'+'});
        
        Connection connection_indefinido_01_indefinido_01 = new Connection(state_indefinido_01, state_indefinido_01, new Character[]{'A', 'B', 'C', 'D', 'E'});
        Connection connection_indefinido_01_identificador = new Connection(state_indefinido_01, state_identificador, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_identificador_identificador = new Connection(state_identificador, state_identificador, new Character[]{'A', 'B', 'C', 'D', 'E','0', '1', '2', '3', '4', '5', '7', '8', '9' });
        
        Connection connection_number_number         = new Connection(state_number, state_number, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        Connection connection_number_invalido_01    = new Connection(state_number, state_invalido_01 , new Character[]{'.'});
        
        Connection connection_invalido_01_number_decimal =new Connection(state_invalido_01, state_number_decimal, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_number_decimal_number_decimal = new Connection(state_number_decimal, state_number_decimal, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_suma_increment = new Connection(state_suma, state_increment, new Character[]{'+'});
        
        //Anadir todos los estados a la lista
        this.states.add(state_initial);
        this.states.add(state_indefinido_01);
        this.states.add(state_identificador);
        this.states.add(state_number);
        this.states.add(state_invalido_01);
        this.states.add(state_number_decimal);
        this.states.add(state_suma);
        this.states.add(state_increment);
        
        
        //Anadiendo conexiones
        this.connections.add(connection_initial_initial);
        this.connections.add(connection_initial_indefinido_01);
        this.connections.add(connection_initial_number);
        this.connections.add(connection_initial_suma);
        
        this.connections.add(connection_indefinido_01_indefinido_01);
        this.connections.add(connection_indefinido_01_identificador);
        
        this.connections.add(connection_identificador_identificador);
        
        this.connections.add(connection_number_invalido_01);
        this.connections.add(connection_number_number);
        
        this.connections.add(connection_invalido_01_number_decimal);
        
        this.connections.add(connection_suma_increment);
        
        this.connections.add(connection_number_decimal_number_decimal);
    }
    
    
    public ArrayList<Connection> connectionsByState(State state){
        ArrayList<Connection> selected_connections = new ArrayList<Connection>();
        
        for(Connection connection : this.connections) {
            if(connection.origin_state.type_state.equals(state.type_state)){
                selected_connections.add(connection);
            }
        }
        
        return selected_connections;
    }
    
    
    
}