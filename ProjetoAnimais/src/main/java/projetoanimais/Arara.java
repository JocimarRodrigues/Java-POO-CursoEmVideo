package projetoanimais;

public class Arara extends Ave{
    @Override
    public void locomover() {
        System.out.println("A arara está voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("A arara comeu um peixe. ");
    }

    @Override
    public void emitirSom() {
        System.out.println("A arara está emetindo um  som de bater asas.");
    }
    
    @Override
    public void detalhes(){
         System.out.println("A cor da pena da arara é: " + this.getCorPena() + ", a idade da arara é: " + this.idade + ", o peso da arara é: " + this.peso + ", a quantidade de membros da arara é: " + this.membros);
    }
    
}
