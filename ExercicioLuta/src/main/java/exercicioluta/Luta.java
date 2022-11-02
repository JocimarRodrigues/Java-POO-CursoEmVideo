package exercicioluta;

import java.util.Random;

public class Luta {
    private Cadastro desafiado; 
    private Cadastro desafiante;
    private int rounds;
    private boolean aprovada;

    public Cadastro getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Cadastro desafiado){
        this.desafiado = desafiado;
    }
    
    public Cadastro getDesafiante(){
        return desafiante;
    }
    
    public void setDesafiante(Cadastro desafiante){
        this.desafiante = desafiante;
    }
    
    public int getRounds(){
        return rounds;
    }
    
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    
    public boolean isAprovada(){
        return this.aprovada;
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    

    public void marcarLuta(Cadastro lutador1, Cadastro lutador2){ 
          if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
          } else {
              this.aprovada = false;
              this.desafiado = null;
              this.desafiante = null;
          }
        
    }
    
    public void lutar(){
        if (this.aprovada) {
           this.desafiado.apresentar();
            System.out.println("### DESAFIADO ###");
           this.desafiante.apresentar();
            System.out.println("### DESAFIANTE ###");
            
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3); 
            System.out.println("============RESULTADO DA LUTA==============");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Desafiado Vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante Vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
        }
            System.out.println("===========================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}
