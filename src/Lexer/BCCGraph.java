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
        State initial = new State("initial", null);
        this.initial_state =initial;
        
        
        
        
        //Creando estados
        State indefinido_01 = new State("indefinido_01", null);
        State identificador = new State("identificador", "id_tk");
        State number = new State("number", "number_tk");
        
        
        
        //Creando conexiones 
        Connection connection_initial_indefinido_01 = new Connection(initial, indefinido_01, new Character[]{'A', 'B'});
        Connection connection_initial_number = new Connection(initial, number, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        Connection connection_indefinido_01_indefinido_01 = new Connection(indefinido_01, indefinido_01, new Character[]{'A', 'B'});
        Connection connection_indefinido_01_identificador = new Connection(indefinido_01, identificador, new Character[]{'0', '1', '2', '3', '4', '5', '7', '8', '9'});
        
        
        
        
        //Anadir todos los estados a la lista
        this.states.add(initial);
        this.states.add(indefinido_01);
        this.states.add(identificador);
        this.states.add(number);
        
        //Anadiendo conexiones
        this.connections.add(connection_initial_indefinido_01);
        this.connections.add(connection_initial_number);
        this.connections.add(connection_indefinido_01_indefinido_01);
        this.connections.add(connection_indefinido_01_identificador);
        
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
