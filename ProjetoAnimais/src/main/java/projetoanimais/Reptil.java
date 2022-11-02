/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public class Reptil  extends Animal{
    
    private String corEscama;
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String corescama){
        this.corEscama = corescama;
    }
    
    
    

    @Override
    public void locomover() {
        System.out.println("O réptil está rastejando. ");
    }

    @Override
    public void alimentar() {
        System.out.println("O Réptil comeu um inseto.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O réptil emetiu um som ao entrar na água.");
    }
    
    @Override
    public void detalhes(){
         System.out.println("A cor da escama do reptil é: " + this.getCorEscama()+ ", a idade do réptil é: " + this.idade + ", o peso do réptil é: " + this.peso + ", a quantidade de membros do réptil é: " + this.membros);
    }
    
}
