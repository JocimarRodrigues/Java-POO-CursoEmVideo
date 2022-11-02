/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author sousu
 */
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; // Isso é o trabalhando vai receber o inverso. ! é NÃO; o trabalhando vai ficar == false
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public boolean isTrabalhando(){
        return this.trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }
    
    
   
}

