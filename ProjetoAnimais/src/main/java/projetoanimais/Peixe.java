/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public class Peixe extends Animal{
    
    private String corEscama;
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String corescama){
        this.corEscama = corescama;
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
    }
    

    @Override
    public void locomover() {
        System.out.println("O peixe está nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe comeu uma alga");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Peixe não emetiu som. ");
    }
    
    @Override
    public void detalhes(){
         System.out.println("A cor da escama do peixe é: " + this.getCorEscama() + ", a idade do peixe é: " + this.idade + ", o peso do peixe é: " + this.peso + ", a quantidade de membros do peixe é: " + this.membros);
    }
    
}
