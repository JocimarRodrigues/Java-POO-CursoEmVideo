package exerciciocontabanco;

/**
 *
 * @author Jocimar
 */
public class ExercicioContaBanco {

    public static void main(String[] args) {
        Banco conta1 = new Banco();
        conta1.setNumConta(423);
        conta1.setDono("John");
        conta1.abrirConta("corrente");
        conta1.depositar(400);
        conta1.pagarMensalidade();
        conta1.estadoAtual();

        Banco conta2 = new Banco();
        conta2.setNumConta(521);
        conta2.setDono("Caroline");
        conta2.abrirConta("poupanca");
        conta2.depositar(200);
        conta2.pagarMensalidade();
        conta2.estadoAtual();
        
    }
}
