package projetoanimais;

public class ProjetoAnimais {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        mamifero.setCorPelo("Branco");
        mamifero.setIdade(5);
        mamifero.setMembros(4);
        mamifero.setPeso(10.5f);
        mamifero.alimentar();
        mamifero.emitirSom();
        mamifero.locomover();
        mamifero.detalhes();

        Reptil lagarto = new Reptil();
        lagarto.setCorEscama("Verde");
        lagarto.setIdade(2);
        lagarto.setMembros(4);
        lagarto.setPeso(0.500f);
        lagarto.alimentar();
        lagarto.emitirSom();
        lagarto.locomover();
        lagarto.detalhes();

        Peixe lambari = new Peixe();
        lambari.setCorEscama("Amarela");
        lambari.setIdade(1);
        lambari.setMembros(1);
        lambari.setPeso(0.100f);
        lambari.locomover();
        lambari.emitirSom();
        lambari.soltarBolha();
        lambari.alimentar();
        lambari.detalhes();

        Ave passaro = new Ave();
        passaro.setCorPena("Branca");
        passaro.setIdade(8);
        passaro.setMembros(2);
        passaro.setPeso(2);
        passaro.fazerNinho();
        passaro.locomover();
        passaro.emitirSom();
        passaro.alimentar();
        passaro.detalhes();

        Canguru canguru = new Canguru();
        canguru.setCorPelo("Marrom");
        canguru.setIdade(8);
        canguru.setMembros(4);
        canguru.setPeso(40.0f);
        canguru.alimentar();
        canguru.usarBolsa();
        canguru.detalhes();

        Cachorro fila = new Cachorro();
        fila.setIdade(9);
        fila.setCorPelo("Listrado");
        fila.setMembros(4);
        fila.setPeso(10f);
        fila.emitirSom();
        fila.abanarRabo();
        fila.alimentar();
        fila.enterrarOsso();
        fila.emitirSom();
        fila.detalhes();

        Cobra cobra = new Cobra();
        cobra.setIdade(3);
        cobra.setMembros(0);
        cobra.setPeso(3);
        cobra.setCorEscama("Preta");
        cobra.alimentar();
        cobra.emitirSom();
        cobra.detalhes();

    }
}
