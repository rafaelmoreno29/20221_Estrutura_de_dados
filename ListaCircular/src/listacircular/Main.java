/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular;

import java.util.Random;

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
        Lista lista = new Lista();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);

        Random r = new Random();
        int num = 3;
        
        while(lista.getQuantidadeNodo() > 1){
            int cont = 1;
            while(cont < num){
                lista.proximo();
                cont++;
            }
            System.out.println(lista.getCursor().getProximo().getDado());
            lista.excluir();
        }
        System.err.println("Escapou: " + lista.getCursor().getDado());


        /*
        Nodo cursorInicial = lista.getCursor();
        
        do{
            System.out.print(lista.getCursor().getDado() + " ");
            lista.proximo();
        }while(cursorInicial != lista.getCursor());

         
        Nodo cursorInicial = lista.getCursor();
        do {
            lista.proximo();
            System.out.print(lista.getCursor().getDado() + " ");
        } while (cursorInicial != lista.getCursor());
*/
    }

}
