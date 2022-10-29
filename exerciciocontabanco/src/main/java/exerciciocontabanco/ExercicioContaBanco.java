/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exerciciocontabanco;

/**
 *
 * @author sousu
 */
public class ExercicioContaBanco {

    public static void main(String[] args) {
         Banco conta1 = new Banco();
        conta1.numConta = 543;
        conta1.abrirConta("corrente");
        conta1.depositar(10);
        conta1.sacar(10);
        conta1.pagarMensalidade();

        //conta1.fecharConta();



    }
}
