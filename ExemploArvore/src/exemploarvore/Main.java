/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarvore;

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
        
        ArvoreBinaria arv = new ArvoreBinaria();
        arv.inserir(5);
        arv.inserir(3);
        arv.inserir(2);
        arv.inserir(4);
        arv.inserir(8);
        arv.inserir(6);
        arv.inserir(7);
        
        //arv.imprime_prefixado();
        System.out.println("REMOVER 7");
        arv.remover(7);
        arv.imprime_prefixado();
        
        System.out.println("REMOVER 8");
        arv.remover(8);
        arv.imprime_prefixado();
        
        System.out.println("REMOVER 3");
        arv.remover(3);
        arv.imprime_prefixado();
    }
    
}
