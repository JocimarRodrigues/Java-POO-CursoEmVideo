/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author sousu
 */
public class Aluno extends Pessoa { //Esse extends irá fazer essa classe Aluno virar uma subclasse/filha da classe Pessoa.
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
