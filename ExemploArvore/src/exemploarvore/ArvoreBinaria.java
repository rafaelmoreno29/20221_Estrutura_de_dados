/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarvore;

/**
 *
 * @author rafae
 */
public class ArvoreBinaria implements Arvore {

    private NodoArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    @Override
    public NodoArvore pesquisa(int valor) {
        NodoArvore nodoResultado = pesquisaRecursivo(raiz, valor);
        return nodoResultado;
    }

    @Override
    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new NodoArvore(valor);
        } else {
            insere(raiz, valor);
        }
    }

    @Override
    public void remover(int valor) {
        NodoArvore nodo = pesquisa(valor);
        if (nodo == null) {
            System.out.println("O valor " + valor + " não está na árvore.");
        } else if (nodo.getFilhoEsquerda() == null && nodo.getFilhoDireita() == null) {
            removeFolha(nodo);
        } else if (nodo.getFilhoEsquerda() != null && nodo.getFilhoDireita() != null) {
            removeDoisFilhos(nodo);
        } else {
            removeUmFilho(nodo);
        }
    }

    @Override
    public void imprime_prefixado() {
        prefixado(raiz);
    }

    private NodoArvore pesquisaRecursivo(NodoArvore raiz, int valor) {
        if (raiz != null) {
            if (valor == raiz.getChave()) {
                return raiz;
            } else if (valor < raiz.getChave()) {
                return pesquisaRecursivo(raiz.getFilhoEsquerda(), valor);
            } else {
                return pesquisaRecursivo(raiz.getFilhoDireita(), valor);
            }
        }
        return null;
    }

    private void prefixado(NodoArvore raiz) {
        if (raiz == null) {
            return;
        }
        System.out.println(raiz.getChave() + " ");

        prefixado(raiz.getFilhoEsquerda());
        prefixado(raiz.getFilhoDireita());
    }

    private void insere(NodoArvore raiz, int valor) {
        if (valor < raiz.getChave()) {
            if (raiz.getFilhoEsquerda() == null) {
                NodoArvore novoNodo = new NodoArvore(valor);
                raiz.setFilhoEsquerda(novoNodo);
            } else {
                insere(raiz.getFilhoEsquerda(), valor);
            }
        } else if (valor > raiz.getChave()) {
            if (raiz.getFilhoDireita() == null) {
                NodoArvore novoNodo = new NodoArvore(valor);
                raiz.setFilhoDireita(novoNodo);
            } else {
                insere(raiz.getFilhoDireita(), valor);
            }
        }
    }

    private NodoArvore buscaPai(NodoArvore raiz, int valor) {
        if (raiz != null) {
            if (valor < raiz.getChave()) {
                if (raiz.getFilhoEsquerda() != null && raiz.getFilhoEsquerda().getChave() == valor) {
                    return raiz;
                } else {
                    return buscaPai(raiz.getFilhoEsquerda(), valor);
                }
            } else if (valor > raiz.getChave()) {
                if (raiz.getFilhoDireita() != null && raiz.getFilhoDireita().getChave() == valor) {
                    return raiz;
                } else {
                    return buscaPai(raiz.getFilhoDireita(), valor);
                }
            }
        }
        return null;
    }

    private void removeFolha(NodoArvore nodo) {
        NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
        if (pai == null) {
            this.raiz = null;
        } else if (pai.getFilhoEsquerda() != null && pai.getFilhoEsquerda() == nodo) {
            pai.setFilhoEsquerda(null);
        } else {
            pai.setFilhoDireita(null);
        }
    }

    private void removeDoisFilhos(NodoArvore nodo) {
        NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
        NodoArvore max = max(nodo.getFilhoEsquerda());
        NodoArvore paiMax = buscaPai(nodo, max.getChave());
        nodo.setChave(max.getChave());
        if (max.getFilhoEsquerda() == null) {
            if (paiMax == nodo) {
                paiMax.setFilhoEsquerda(null);
            } else {
                paiMax.setFilhoDireita(null);
            }
        } else {
            paiMax.setFilhoDireita(max.getFilhoEsquerda());
        }
    }

    private void removeUmFilho(NodoArvore nodo) {
        NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
        if (pai == null) {
            if (nodo.getFilhoEsquerda() != null) {
                this.raiz = nodo.getFilhoEsquerda();
            } else {
                this.raiz = nodo.getFilhoDireita();
            }
        } else if (nodo.getFilhoEsquerda() != null) {
            if (pai.getFilhoEsquerda() == nodo) {
                pai.setFilhoEsquerda(nodo.getFilhoEsquerda());
            } else {
                pai.setFilhoDireita(nodo.getFilhoEsquerda());
            }
        } else if (nodo.getFilhoDireita() != null) {
            if (pai.getFilhoEsquerda() == nodo) {
                pai.setFilhoEsquerda(nodo.getFilhoDireita());
            } else {
                pai.setFilhoDireita(nodo.getFilhoDireita());
            }
        }
    }

    private NodoArvore max(NodoArvore raiz) {
        if (raiz.getFilhoDireita() == null) {
            return raiz;
        } else {
            return max(raiz.getFilhoDireita());
        }
    }

}
