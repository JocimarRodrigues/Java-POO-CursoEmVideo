package projetoanimais;

public class Cobra extends Reptil{
    @Override
    public void detalhes(){
        System.out.println("A cor da escama da cobra  é: " + this.getCorEscama()+ ", a idade da cobra é: " + this.idade + ", o peso da cobra é: " + this.peso + ", a quantidade de membros da cobra é: " + this.membros);
    }
    
    @Override
    public void locomover(){
        System.out.println("A cobra está rastejando.");
    }
    
    @Override
    public void alimentar(){
        System.out.println("A cobra comeu um inseto.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("A cobra emitiu um som ao atacar o inseto.");
    }
}
