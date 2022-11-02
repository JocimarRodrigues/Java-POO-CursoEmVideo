/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public class Mamifero extends Animal{
    private String corPelo;
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String corpelo){
        this.corPelo = corpelo;
    }
 
    

    @Override
    public void locomover() {
        System.out.println("O mamifero está correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("O mamifero está mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamifero está emetindo um som!");
    }
    
    @Override
    public void  detalhes(){
        System.out.println("A cor do pelo do mamifero é: " + this.getCorPelo() + ", a idade do mamifero é: " + this.idade + ", o peso do mamifero é: " + this.peso + ", a quantidade de membros do mamifero é: " + this.membros);
    }
    
}
