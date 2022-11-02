/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playvideos;

/**
 *
 * @author sousu
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public int getTotAssistido(){
        return this.totAssistido;
    }
    
    public void setTotAssistido(int totassistido){
        this.totAssistido = totassistido;
    }
    
    public void  viuMaisUM(){
        System.out.println("O usuário " + this.nome + " olhou mais um vídeo!");
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}'; // Note que tu pode usar o + super.toStrong para pegar o toString da classe mãe!
    }
    
    
}
