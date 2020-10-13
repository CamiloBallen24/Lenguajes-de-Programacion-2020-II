package Syntax.Reader;

import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import Syntax.Models.GrammarTerminal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GrammarReader {
    enum lectura{InitialNoTerminal,NoTerminals,EpsilonTerminal,FinCadenaTerminal,Terminals,Rules,Error}
    
    private String initialNoTerminal;
    private ArrayList<String> noTerminals;
    private String epsilonTerminal;
    private String finCadena;
    private ArrayList<String> terminals;
    private Hashtable<String, ArrayList<ArrayList<String>>> rules;
    
    private String url_file;
    
    public GrammarReader(String ulr_file){
        this.initialNoTerminal = null;
        this.noTerminals = new ArrayList<>();
        this.epsilonTerminal = null;
        this.finCadena = null;
        this.terminals = new ArrayList<>();
        this.rules = new Hashtable<>();
        
        this.url_file = ulr_file;
        
        this.readerFile();
    }
    
    private void readerFile(){
        try{
            Scanner lector = new Scanner(new File(url_file));
            lectura leyendo = lectura.Error;
            while(lector.hasNextLine()){
                String line = lector.nextLine();
                switch(line){
                    case "No Terminal Inicial":
                        leyendo = lectura.InitialNoTerminal;
                        break;
                    case "No terminales":
                        leyendo = lectura.NoTerminals;
                        break;
                    case "Terminal Epsilon":
                        leyendo = lectura.EpsilonTerminal;
                        break;
                    case "Terminal Fin de Cadena":
                        leyendo = lectura.FinCadenaTerminal;
                        break;
                    case "Terminales":
                        leyendo = lectura.Terminals;
                        break;
                    case "Reglas":
                        leyendo = lectura.Rules;
                        break;
                    default:
                        switch(leyendo){
                            case InitialNoTerminal:
                                if(!line.equals(""))
                                    initialNoTerminal = line;
                                break;
                            case NoTerminals:
                                if(!line.equals(""))
                                    noTerminals.add(line);
                                break;
                            case EpsilonTerminal:
                                if(!line.equals(""))
                                    epsilonTerminal = line;
                                break;
                            case FinCadenaTerminal:
                                if(!line.equals(""))
                                    finCadena = line;
                                break;
                            case Terminals:
                                if(!line.equals(""))
                                    terminals.add(line);
                                break;
                            case Rules:
                                if(line.split("\t->\t").length==1)
                                    continue;
                                else if(line.split("\t->\t").length>2) 
                                    throw new FileNotFoundException("Hubo un error en la lectura de las reglas");
                                String leftPart = line.split("\t->\t")[0];
                                ArrayList<ArrayList<String>> ActualRules = rules.get(leftPart);
                                ArrayList<String> rightPart = new ArrayList<>(Arrays.asList((line.split("\t->\t")[1]).split(" ")));
                                
                                if(ActualRules==null){
                                    rules.put(leftPart, new ArrayList<ArrayList<String>>(){{add(rightPart);}});
                                }else{
                                    ActualRules.add(rightPart);
                                    rules.put(leftPart, ActualRules);
                                }
                                break;
                            default:
                                throw new FileNotFoundException("Hubo un error en la lectura de la gramática");
                        }       
                }
            }
        }catch(FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        

        
//        System.out.println("-----------------------------");
//        System.out.println(initialNoTerminal);
//        System.out.println("-----------------------------");
//        
//        for(int i=0; i<noTerminals.size(); i++){
//            System.out.println(noTerminals.get(i));
//        }
//        
//        System.out.println("-----------------------------");
//        System.out.println(epsilonTerminal);
//        System.out.println("-----------------------------");
//        
//        for(int i=0; i<terminals.size(); i++){
//            System.out.println(terminals.get(i));
//        }
//        
//        System.out.println("-----------------------------");
//        for (Map.Entry<String, ArrayList<ArrayList<String>>> entry : rules.entrySet()) {
//            for (ArrayList<String> rule : entry.getValue()) {
//                System.out.print(entry.getKey() + " -> ");
//                for (String symbol : rule) {
//                    System.out.print(symbol + " ");
//                }
//                System.out.println();
//            }
//        }
//        System.out.println("-----------------------------");
    }
    
    
    public Grammar getGrammar(){
        
        //Guarda todos los symbolos es este diccionario
        HashMap<String, GrammarSymbol> symbols = new HashMap<>();
        
        //Guarda el epsiolon y el no terminal inicial
        symbols.put(this.initialNoTerminal, new GrammarNoTerminal(this.initialNoTerminal));
        symbols.put(this.epsilonTerminal, new GrammarTerminal(this.epsilonTerminal));
        symbols.put(this.finCadena, new GrammarTerminal(this.finCadena));
        
        //Guarda los no terminales
        for (String noTerminal : this.noTerminals) 
            symbols.put(noTerminal, new GrammarNoTerminal(noTerminal));
        
        //guarda los terminales
        for (String terminal : this.terminals) 
            symbols.put(terminal, new GrammarTerminal(terminal));
        
        
        //Guarda las reglas
        ArrayList<GrammarRule> grammar_rules = new ArrayList<GrammarRule>();
        
        //Recorre las reglas para cada terminal
        for (Map.Entry<String, ArrayList<ArrayList<String>>> entry : this.rules.entrySet()) {
            String left_part_string = entry.getKey();
            GrammarNoTerminal left_part_symbol = (GrammarNoTerminal) symbols.get(left_part_string);
            
            //guarda la reglas del terminal actual una por una
            for (ArrayList<String> right_part_strings : entry.getValue()) {
                ArrayList<GrammarSymbol> right_part_symbols = new ArrayList<>();
                
                for (String right_part_string : right_part_strings) {
                    right_part_symbols.add(symbols.get(right_part_string));
                }
                
                grammar_rules.add(new GrammarRule(left_part_symbol, right_part_symbols));
            }
            
            
        }
        
        return new Grammar(grammar_rules, (GrammarTerminal)symbols.get(this.epsilonTerminal), (GrammarNoTerminal)symbols.get(this.initialNoTerminal), (GrammarTerminal) symbols.get(this.finCadena));
                
    }
}
