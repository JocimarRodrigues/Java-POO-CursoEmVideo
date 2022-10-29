package exerciciocontabanco;

public class ExercicioContaBanco {

    public static void main(String[] args) {
        Banco conta1 = new Banco();
        conta1.numConta = 543;
        conta1.abrirConta("corrente");
        conta1.depositar(10);
        conta1.sacar(10);
        conta1.pagarMensalidade();

    }
}
