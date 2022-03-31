/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimplesaluno;

/**
 *
 * @author rafae
 */
public class Aluno {
    private String ra;
    private String nome;
    private double nota1;
    private double nota2;
    
    public double calcularMedia(){
        return (nota1 + nota2)/2;
    }
    public String imprimir(){
        return "Ra: " + ra + "\nNome: " + nome + "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 + "\nMédia: " + calcularMedia();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
}
