/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarvorebinaria;

/**
 *
 * @author rafae
 */
public class NodoArvore {
    private NodoArvore filhoEsquerda;
    private int chave;
    private NodoArvore filhoDireita;

    public NodoArvore(int chave) {
        this.chave = chave;
        filhoEsquerda = null;
        filhoDireita = null;
    }

    public NodoArvore getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(NodoArvore filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NodoArvore getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(NodoArvore filhoDireita) {
        this.filhoDireita = filhoDireita;
    }
    
         
}
