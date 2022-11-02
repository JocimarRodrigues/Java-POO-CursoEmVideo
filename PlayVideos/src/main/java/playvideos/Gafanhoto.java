package playvideos;

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
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
