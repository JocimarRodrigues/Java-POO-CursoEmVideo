/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros; //Membros do corpo, não do grupo. 
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getMembros(){
        return this.membros;
    }
    
    public void setMembros(int membros){
        this.membros = membros;
    }
    
    public abstract void locomover(); // Métodos abstratos não podem conter corpo no programa principal!; Não podem conter BLOCOS!
    public abstract void alimentar();
    public abstract void emitirSom();
    public abstract void detalhes();
        
    }
    


       


