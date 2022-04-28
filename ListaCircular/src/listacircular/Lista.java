/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacircular;

/**
 *
 * @author rafae
 */
public class Lista {

    private Nodo cursor;
    private int quantidadeNodo;

    public int getQuantidadeNodo() {
        return quantidadeNodo;
    }

    public void setQuantidadeNodo(int quantidadeNodo) {
        this.quantidadeNodo = quantidadeNodo;
    }
    
    public Nodo getCursor() {
        return cursor;
    }

    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void proximo() {
        cursor = cursor.getProximo();
    }

    public void inserir(float valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        if (this.cursor == null) {
            this.cursor = novoNodo;
            this.cursor.setProximo(this.cursor);
        } else {
            Nodo proximo = cursor.getProximo();
            cursor.setProximo(novoNodo);
            novoNodo.setProximo(proximo);
            
            cursor = novoNodo;
        }
        quantidadeNodo++;
    }

    public void excluir() {
        if (cursor == null) {
            return;
        } else if (cursor == cursor.getProximo()) {
            cursor = null;
        } else {
            Nodo nodoExcluir = cursor.getProximo();
            cursor.setProximo(nodoExcluir.getProximo());
        }
        quantidadeNodo--;
    }

}
