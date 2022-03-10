package exemplovetor;

import javax.swing.JOptionPane;

public class ExemploVetor {

    public static void main(String[] args) {
        int v[] = new int[10];
        int totalPar=0, totalImpar =0;
        
        for(int i =0; i < v.length; i++){
            v[i] = i + 1;
            
            if(i % 2 == 0)
                totalPar += v[i];
            else
                totalImpar += v[i];
        }
        JOptionPane.showMessageDialog(null, "Par: " + totalPar 
                                            + "\nImpar: " + totalImpar);
    }
    
}
