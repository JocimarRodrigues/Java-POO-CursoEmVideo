package exercicioluta;

public class ExercicioLuta {
    public static void main(String[] args){

       Cadastro lutador[] = new Cadastro[6]; 
       lutador[0] = new Cadastro("Pretty Boy", "França", 31, 68.9f, 1.75f, 11, 2, 1);
      
       lutador[1] = new Cadastro("Putscript", "Brasil", 29, 57.8f, 1.68f, 14, 2, 3);      
       
       lutador[2] = new Cadastro("Snapshadow", "EUA", 35, 80.9f, 1.65f, 12, 2, 1);
       
       lutador[3] = new Cadastro("Dead Code", "Austrália", 28, 81.6f, 1.93f, 13, 0, 2);
       
       lutador[4] = new Cadastro("UFOCobol", "Brasil", 37, 119.3f, 1.70f, 5, 4, 3);
       
       lutador[5] = new Cadastro("Nerdart", "EUA", 30, 105.7f, 1.81f, 12, 2, 4);
       
       Luta PrimeiraLuta = new Luta();
       PrimeiraLuta.marcarLuta(lutador[4], lutador[5]); 
       PrimeiraLuta.lutar();
       lutador[4].status();
       lutador[5].status();
    }
      
}
