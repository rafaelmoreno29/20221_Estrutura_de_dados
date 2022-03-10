/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m = new int[4][3];
        int cont = 1;
        int somaPar = 0, somaImpar = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = cont;
                cont++;

                if (i % 2 == 0 && j % 2 == 0) {
                    somaPar += m[i][j];
                } else if (i % 2 != 0 && j % 2 != 0) {
                    somaImpar += m[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Par: " + somaPar+
                "\nImpar: " + somaImpar);
    }

}
