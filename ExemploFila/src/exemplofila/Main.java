/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplofila;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
       
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.enfileirar(50);
        System.out.println(fila.imprimir());
        
        fila.desenfileirar();
        System.out.println(fila.imprimir());
        fila.desenfileirar();
        System.out.println(fila.imprimir());
        fila.desenfileirar();
        System.out.println(fila.imprimir());
        
        //Exemplo fila com coleção do java
        Queue<Integer> filaJava = new LinkedList<>();
        filaJava.add(40);
        filaJava.add(50);
        filaJava.add(60);
        for(Integer f : filaJava){
            System.out.print(f+ ", ");           
        }
        System.out.println();
        filaJava.remove();
        for(Integer f : filaJava){
            System.out.print(f+ ", ");
             
        }
        System.out.println();
        filaJava.remove();
        for(Integer f : filaJava){
            System.out.print(f+ ", ");
             
        }
        System.out.println();
        filaJava.remove();
        for(Integer f : filaJava){
            System.out.print(f+ ", ");
        }
    }
    
}
