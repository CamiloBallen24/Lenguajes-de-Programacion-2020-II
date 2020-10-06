package Lexer.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class BCCGraphReader {
    enum lectura{Estados,Conexiones,Referencias,Error}
    
    public ArrayList<String[]> estados;
    public ArrayList<String[]> conexiones;
    public Hashtable<String, ArrayList<Character>> referencias;
    
    public String url_file;
    
    public BCCGraphReader(){
        this.estados     = new ArrayList<>();
        this.conexiones  = new ArrayList<>();
        this.referencias = new Hashtable<>();
        
        this.url_file = "src/prueba.txt";
        
        this.readerFile();
    }
        
    
    private void readerFile(){
       try{
            Scanner lector = new Scanner(new File("src//Files//prueba.txt"));
            lectura leyendo = lectura.Error;
            while(lector.hasNextLine()){
                String line = lector.nextLine();
                switch(line){
                    case "#Estados":
                        leyendo = lectura.Estados;
                        break;
                    case "#Conexiones":
                        leyendo = lectura.Conexiones;
                        break;
                    case "#Referencias":
                        leyendo = lectura.Referencias;
                        break;
                        
                    default:
                        switch(leyendo){
                            case Estados:
                                if(line.split(" ").length==1) continue;
                                String[] estado = line.split(" ");
                                if(estado.length != 4) throw new FileNotFoundException("Hubo un error en la lectura de estados");
                                this.estados.add(estado);
                                break;
                                
                            case Conexiones:
                                if(line.split(" ").length==1) continue;
                                String[] conexion = line.split(" ");
                                if(conexion.length != 3) throw new FileNotFoundException("Hubo un error en la lectura de conexiones");
                                this.conexiones.add(conexion);
                                break;
                                
                            case Referencias:
                                if(line.split(":").length==1) continue;
                                else if(line.split(":").length>2) throw new FileNotFoundException("Hubo un error en la lectura de referencias");
                                String referencia = line.split(":")[0];
                                ArrayList<Character> characters = new ArrayList<>();
                                for (String caracter_string : (line.split(":")[1]).split(",")) characters.add(caracter_string.charAt(0));
                                this.referencias.put(referencia, characters);
                                break;
                                
                            default:
                                throw new FileNotFoundException("Hubo un error en la lectura del archivo de análisis sintáctico");
                        }       
                }
            }
        }catch(FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } 
    }
    
    
}
