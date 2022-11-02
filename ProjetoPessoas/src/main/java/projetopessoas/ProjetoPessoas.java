/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package projetopessoas;

/**
 *
 * @author sousu
 */
public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno(); // Prestar atenção aqui, tu coloca a subclasse e não a classe; senão dá erro!
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();
        
        pessoa1.setNome("John");
        pessoa1.setSexo("Masculino");
        pessoa1.setIdade(26);
        
        pessoa2.setNome("Carol");
        pessoa2.setIdade(23);
        pessoa3.setSexo("Feminino");
        
        pessoa3.setNome("Cláudio");
        pessoa3.setIdade(35);
        pessoa3.setSexo("Masculino");
        
        pessoa4.setNome("Maria");
        pessoa4.setIdade(45);
        pessoa4.setSexo("Feminino");
        
        
        pessoa3.receberAumento(550.20f);
        
        System.out.println(pessoa1.toString()); // Aqui é para retornar a string q tá dentro da classe mãe
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}
