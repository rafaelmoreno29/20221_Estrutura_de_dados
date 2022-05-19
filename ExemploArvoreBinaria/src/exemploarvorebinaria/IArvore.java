/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarvorebinaria;

/**
 *
 * @author rafae
 */
public interface IArvore {
    public NodoArvore pesquisar(int valor);
    public void inserir(int valor);
    public void remover(int valor);
    public void imprimir_prefixado();
}
