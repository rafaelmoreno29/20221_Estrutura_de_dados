/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author rafae
 */
public class JavaApplication23 {

     static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

	// teste do programa. Imprime os 30 primeiros termos
	for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + fibo(i) + "\t");
        }

    }
    
}
