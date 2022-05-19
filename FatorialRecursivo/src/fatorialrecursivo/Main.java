/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorialrecursivo;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("=" + fatorial(5));
        //System.out.println(pot(2, 3));
        System.out.println(fibonacci(7));
    }

    public static int fatorial(int n) {
        if (n > 0) {
            System.out.print(n + "*");
            return n * fatorial(n - 1);
        }
        System.out.print("1");
        return 1;
    }

    public static int pot(int base, int n) {
        if (n == 0) {
            return 1;

        } else {
            return base * pot(base, n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

}
