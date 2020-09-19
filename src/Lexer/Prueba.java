package Lexer;

public class Prueba {
    public static void main(String[] args) {
        Reader prueba = new Reader("D:\\Desktop\\Prueba.txt");
        
        char a = '0'; 
        
        a = prueba.prevChar();
        System.out.println(a + " " + prueba.line + " " + prueba.column);
        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println(a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        System.out.println((int)a + " " + prueba.line + " " + prueba.column);        
        a = prueba.nextLine();
        
    }
}
