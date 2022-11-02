/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimais;

/**
 *
 * @author sousu
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("O cachorro enterrou um osso.");
    }
    
    public void abanarRabo(){
        System.out.println("O cachorro abanou o rabo.");
    }
    
    @Override
    public void detalhes(){
        System.out.println("A cor do pelo do cachorro é: " + this.getCorPelo() + ", a idade do cachorro é: " + this.idade + ", o peso do cachorro é: " + this.peso + ", a quantidade de membros do cachorro é: " + this.membros);
    }
    
    @Override
    public void alimentar(){
        System.out.println("O cachorro está comendo ração.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo.");
    }
}
