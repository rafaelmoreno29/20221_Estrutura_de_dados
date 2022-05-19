/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarvorebinaria;

/**
 *
 * @author rafae
 */
public class ArvoreBinaria implements IArvore{
    private NodoArvore raiz;
    
    public ArvoreBinaria(){
        raiz = null;
    }

    @Override
    public NodoArvore pesquisar(int valor) {
        NodoArvore resultado = pesquisaRecursiva(raiz,valor);
        return resultado;
    }

    @Override
    public void inserir(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir_prefixado() {
        prefixado(raiz);
    }

    private NodoArvore pesquisaRecursiva(NodoArvore raiz, int valor) {
        if(raiz != null){
            if(valor == raiz.getChave()){
                return raiz;
            }
            else if(valor < raiz.getChave()){
                return pesquisaRecursiva(raiz.getFilhoEsquerda(), valor);
            }
            else{
               return pesquisaRecursiva(raiz.getFilhoDireita(), valor); 
            }
        }
        return null;
    }

    private void prefixado(NodoArvore raiz) {
        if(raiz == null)
            return;
        System.out.println(raiz.getChave()+ " - ");
        
        prefixado(raiz.getFilhoEsquerda());
        prefixado(raiz.getFilhoDireita());        
    }
    
}
