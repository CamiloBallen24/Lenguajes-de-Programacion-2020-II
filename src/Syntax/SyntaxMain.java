/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syntax;

import Syntax.GrammarServices.GrammarFirstsGenerator;
import Syntax.GrammarServices.GrammarNextsGenerator;
import Syntax.GrammarServices.GrammarPredictionGenerator;
import Syntax.GrammarServices.GrammarTools;
import Syntax.Models.Grammar;
import Syntax.Models.GrammarNoTerminal;
import Syntax.Models.GrammarRule;
import Syntax.Models.GrammarSymbol;
import Syntax.Models.GrammarTerminal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class SyntaxMain {
    public static void main(String[] args) {
        /*
            OJO:
            En este caso (a diferencia de la practica 01) la igualdad  es manejada por referencia en memoria
            y no por valor, esto facilita el trabajo pero luego traera un pequeño problema
        */
        
        
        GrammarNoTerminal S     = new GrammarNoTerminal("S");
        GrammarNoTerminal A     = new GrammarNoTerminal("A");
        GrammarNoTerminal B     = new GrammarNoTerminal("B");
        GrammarNoTerminal Bp    = new GrammarNoTerminal("Bp");
        GrammarNoTerminal C     = new GrammarNoTerminal("C");
        GrammarNoTerminal D     = new GrammarNoTerminal("D");
        GrammarNoTerminal E     = new GrammarNoTerminal("E");
        
        
        GrammarTerminal uno     = new GrammarTerminal("uno");
        GrammarTerminal dos     = new GrammarTerminal("dos");
        GrammarTerminal tres    = new GrammarTerminal("tres");
        GrammarTerminal cuatro  = new GrammarTerminal("cuatro");
        GrammarTerminal cinco   = new GrammarTerminal("cinco");
        GrammarTerminal seis   = new GrammarTerminal("seis");
        GrammarTerminal epsilon = new GrammarTerminal("epsilon");
        
        
        
        GrammarRule rule_01 = new GrammarRule(S, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{A,B,C})));
        GrammarRule rule_02 = new GrammarRule(S, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{D,E})));
        
        GrammarRule rule_03 = new GrammarRule(A, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{dos, B, tres})));
        GrammarRule rule_04 = new GrammarRule(A, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{epsilon})));
        
        GrammarRule rule_05 = new GrammarRule(B, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{Bp})));
        
        GrammarRule rule_06 = new GrammarRule(Bp, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{cuatro, C, cinco, Bp})));
        GrammarRule rule_07 = new GrammarRule(Bp, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{epsilon})));
        
        GrammarRule rule_08 = new GrammarRule(C, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{seis, A, B})));
        GrammarRule rule_09 = new GrammarRule(C, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{epsilon})));
        
        GrammarRule rule_10 = new GrammarRule(D, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{uno, A, E})));
        GrammarRule rule_11 = new GrammarRule(D, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{B})));
        
        GrammarRule rule_12 = new GrammarRule(E, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{tres})));
        
        
        ArrayList<GrammarRule> rules = new ArrayList<>();
        rules.add(rule_01);
        rules.add(rule_02);
        rules.add(rule_03);
        rules.add(rule_04);
        rules.add(rule_05);
        rules.add(rule_06);
        rules.add(rule_07);
        rules.add(rule_08);
        rules.add(rule_09);
        rules.add(rule_10);
        rules.add(rule_11);
        rules.add(rule_12);
        
        //Grammar
        Grammar gramatica_chida = new Grammar(rules, epsilon);
        HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> primeros = GrammarFirstsGenerator.getAllFirsts(gramatica_chida);
        HashMap<GrammarNoTerminal, HashSet<GrammarTerminal>> siguientes = GrammarNextsGenerator.getAllNexts(gramatica_chida);
        HashMap<GrammarRule, HashSet<GrammarTerminal>> predicciones = GrammarPredictionGenerator.getAllPredictions(gramatica_chida);
        HashSet<GrammarTerminal> primerosRegla = GrammarFirstsGenerator.findFirstExpression(gramatica_chida, new ArrayList<>(Arrays.asList(new GrammarSymbol[]{A,B,C})));
        
        System.out.println("Primeros de una sola regla:\n");
        for (GrammarTerminal grammarTerminal : primerosRegla) {
            System.out.println(grammarTerminal.name);
        }
        
        System.out.println("\n\nPrimeros de toda la gramática:\n");
        for (Map.Entry<GrammarNoTerminal, HashSet<GrammarTerminal>> entry : primeros.entrySet()) {
            GrammarNoTerminal key = entry.getKey();
            HashSet<GrammarTerminal> value = entry.getValue();
            
            System.out.print(key.name+ ":    ");
            for (GrammarTerminal grammarTerminal : value) {
                System.out.print(grammarTerminal.name + "   ");
            }
            System.out.println("");
        }
        
        System.out.println("\n\nSegundos de toda la gramática:\n");
        for (Map.Entry<GrammarNoTerminal, HashSet<GrammarTerminal>> entry : siguientes.entrySet()) {
            GrammarNoTerminal key = entry.getKey();
            HashSet<GrammarTerminal> value = entry.getValue();
            
            System.out.print(key.name+ ":    ");
            for (GrammarTerminal grammarTerminal : value) {
                System.out.print(grammarTerminal.name + "   ");
            }
            System.out.println("");
        }
        
        System.out.println("\n\n Predicciones de toda la gramática:\n");
        for (Map.Entry<GrammarRule, HashSet<GrammarTerminal>> entry : predicciones.entrySet()) {
            GrammarRule key = entry.getKey();
            HashSet<GrammarTerminal> value = entry.getValue();
            
            System.out.print(key.left_part.name + " -> " + ":    ");
            for (GrammarSymbol grammarSymbol : key.right_part) {
                System.out.print(grammarSymbol.name + "   ");
            }
            System.out.print(" | ");
            for (GrammarSymbol grammarTerminal : value) {
                System.out.print(grammarTerminal.name + "   ");
            }
            System.out.println("");
        }
  
    }
}
