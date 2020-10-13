package Syntax.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GrammarReader {
    enum lectura{InitialNoTerminal,NoTerminals,EpsilonTerminal,Terminals,Rules,Error}
    
    private String initialNoTerminal;
    private ArrayList<String> noTerminals;
    private String epsilonTerminal;
    private ArrayList<String> terminals;
    private Hashtable<String, ArrayList<ArrayList<String>>> rules;
    
    private String url_file;
    
    public GrammarReader(){
        this.initialNoTerminal = null;
        noTerminals = new ArrayList<>();
        epsilonTerminal = null;
        terminals = new ArrayList<>();
        rules = new Hashtable<>();
        
        this.url_file = "src//Files//gramatica.txt";
        
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
        
        /*System.out.println("-----------------------------");
        System.out.println(initialNoTerminal);
        System.out.println("-----------------------------");
        
        for(int i=0; i<noTerminals.size(); i++){
            System.out.println(noTerminals.get(i));
        }
        
        System.out.println("-----------------------------");
        System.out.println(epsilonTerminal);
        System.out.println("-----------------------------");
        
        for(int i=0; i<terminals.size(); i++){
            System.out.println(terminals.get(i));
        }
        
        System.out.println("-----------------------------");
        for (Map.Entry<String, ArrayList<ArrayList<String>>> entry : rules.entrySet()) {
            for (ArrayList<String> rule : entry.getValue()) {
                System.out.print(entry.getKey() + " -> ");
                for (String symbol : rule) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        }
        System.out.println("-----------------------------");*/
    }
}
