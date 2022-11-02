package projetoanimais;

public class PeixeDourado extends Peixe{
     @Override
    public void locomover() {
        System.out.println("O peixe dourado está nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe dourado comeu uma alga");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Peixe dourado não emetiu som. ");
    }
    
    @Override
    public void detalhes(){
         System.out.println("A cor da escama do peixe dourado é: " + this.getCorEscama() + ", a idade do peixe dourado é: " + this.idade + ", o peso do peixe dourado é: " + this.peso + ", a quantidade de membros do peixe dourado é: " + this.membros);
    }
    
    
}
