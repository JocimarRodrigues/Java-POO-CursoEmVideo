/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public class Tartaruga extends Reptil{
    @Override
    public void locomover(){
        System.out.println("A tarturaga  se move  lentamente!");
    }
    
    @Override
    public void alimentar(){
        System.out.println("A tarturuga comeu um peixe.");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("a Tartaruga está emetindo um som!");
    }
    
    @Override
    public void  detalhes(){
        System.out.println("A cor da escama da tartaruga é: " + this.getCorEscama()+ ", a idade da tartaruga é: " + this.idade + ", o peso da tartaruga é: " + this.peso + ", a quantidade de membros da tartaruga é: " + this.membros);
 }
}
