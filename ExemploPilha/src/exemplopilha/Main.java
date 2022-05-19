/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack pilha1 = new Stack();
        
        pilha1.push("Entrada1");
        pilha1.push("Entrada2");
        pilha1.push("Entrada3");
        
        System.out.println(pilha1.pop());
        System.out.println(pilha1.peek());
        System.out.println(pilha1.empty());
        System.out.println(pilha1.size());
                
        System.out.println(pilha1.search("Entrada2"));
        
        for (Object x  : pilha1) {
            System.out.println(x);
        }
        
        Queue<Integer> lista = new LinkedList<>();
    }
    
}
