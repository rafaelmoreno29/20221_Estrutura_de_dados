/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarvore;

/**
 *
 * @author rafae
 */
public interface Arvore {
    public NodoArvore pesquisa(int valor);
    public void inserir(int valor);
    public void remover(int valor);
    public void imprime_prefixado();
}
