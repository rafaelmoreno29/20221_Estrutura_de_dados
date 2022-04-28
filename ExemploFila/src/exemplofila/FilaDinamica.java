/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplofila;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class FilaDinamica {
     private ArrayList<Integer> elementos = new ArrayList<>();
    
    public void enfileirar(int valor){       
        elementos.add(valor);
    }
    public void desenfileirar(){
        elementos.remove(0);
    }
    public String imprimir(){
        String fila = "[";
        for(int i =0; i < elementos.size(); i++){
            if(elementos.get(i) != null){
                fila += elementos.get(i) + ", ";
            }
        }
        if(fila.length() > 1)
            fila = fila.substring(0, fila.lastIndexOf(", "));
        fila += "]";
        return fila;
    }
}
