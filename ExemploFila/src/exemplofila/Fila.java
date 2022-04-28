/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplofila;

/**
 *
 * @author rafae
 */
public class Fila {
    private Integer[] elementos;
    
    public void setTamanho(int tamanho){
        elementos = new Integer[tamanho];
    }
    
    public void enfileirar(int valor){
        int ultimoElemento = 0;
        for(Integer elemento : elementos){
            if(elemento != null)
                ultimoElemento++;
        }
        elementos[ultimoElemento] = valor;
    }
    public void desenfileirar(){
        int cont =0;
        elementos[0] = null;
        
        Integer[] aux = new Integer[elementos.length];
        for(Integer elemento : elementos){
            if(elemento != null){
                aux[cont] = elemento;
                cont++;
            }
        }
        elementos = aux;
    }
    public String imprimir(){
        String fila = "[";
        for(int i =0; i < elementos.length; i++){
            if(elementos[i] != null){
                fila += elementos[i] + ", ";
            }
        }
        if(fila.length() > 1)
            fila = fila.substring(0, fila.lastIndexOf(", "));
        fila += "]";
        return fila;
    }
}
