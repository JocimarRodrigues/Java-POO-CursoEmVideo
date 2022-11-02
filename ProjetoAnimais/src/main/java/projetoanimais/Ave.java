package projetoanimais;

public class Ave extends Animal{
    
    private String corPena;
    
    public String getCorPena(){
        return this.corPena;
    }
    
    public void setCorPena(String corpena){
        this.corPena = corpena;
    }
    
    public void fazerNinho(){
        System.out.println("A Ave fez um ninho.");
    }

    @Override
    public void locomover() {
        System.out.println("A ave está voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("A ave comeu um peixe. ");
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave está emetindo um  som de bater asas.");
    }
    
    @Override
    public void detalhes(){
         System.out.println("A cor da pena da ave é: " + this.getCorPena() + ", a idade da ave é: " + this.idade + ", o peso da ave é: " + this.peso + ", a quantidade de membros da ave é: " + this.membros);
    }
    
}
