/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5listaduplamenteencadeada;

/**
 *
 * @author rafae
 */
public class Lista {

    private Nodo primeiro;
    private int quantidadeNodo = 0;

    public boolean ehVazia() {
        return quantidadeNodo == 0;
    }

    public void adicionarInicio(float valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        if (ehVazia()) {
            primeiro = novoNodo;
        } else {
            novoNodo.setProximo(primeiro);
            primeiro.setAnterior(novoNodo);
            primeiro = novoNodo;
        }
        quantidadeNodo++;
    }

    public void adicionarFinal(float valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        if (ehVazia()) {
            primeiro = novoNodo;
        } else {
            Nodo finalNodo = primeiro;
            while (finalNodo.getProximo() != null) {
                finalNodo = finalNodo.getProximo();
            }
            novoNodo.setAnterior(finalNodo);
            finalNodo.setProximo(novoNodo);
        }
        quantidadeNodo++;
    }

    public void adicionarDepois(Nodo nodoReferencia, float valor) {
        Nodo nodoPosterior = nodoReferencia.getProximo();

        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);

        novoNodo.setAnterior(nodoReferencia);
        novoNodo.setProximo(nodoPosterior);

        nodoReferencia.setProximo(novoNodo);

        if (nodoPosterior != null) {
            nodoPosterior.setAnterior(novoNodo);
        }
    }

    public void removerNodo(Nodo nodo) {
        if (primeiro == nodo) {
            primeiro = nodo.getProximo();
        } else {
            Nodo anterior = nodo.getAnterior();
            Nodo proximo = nodo.getProximo();
            anterior.setProximo(proximo);
            if (proximo != null) {
                proximo.setAnterior(anterior);
            }
        }
    }

    public Nodo obterNodo(float valor) {
        Nodo no = primeiro;
        for (int i = 1; i <= quantidadeNodo; i++) {
            if (no.getDado() == valor) {
                return no;
            } else {
                no = no.getProximo();
            }
        }
        return null;
    }

}
