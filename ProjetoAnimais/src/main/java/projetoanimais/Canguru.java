package projetoanimais;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
            System.out.println("O canguro tem uma bolsa.");
    }
    
    @Override
    public void locomover(){
        System.out.println("O canguro está pulando.");
    }
    
    @Override
    public void detalhes(){
        System.out.println("A cor do pelo do Canguru é: " + this.getCorPelo() + ", a idade do Canguru é: " + this.idade + ", o peso do Canguru é: " + this.peso + ", a quantidade de membros do Canguru é: " + this.membros);
    }
    
    @Override
    public void alimentar(){
        System.out.println("O canguru está comendo folhas.");
    }
}
