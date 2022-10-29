/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exerciciolivraria;

/**
 *
 * @author sousu
 */
public class ExercicioLivraria {

    public static void main(String[] args) {    
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];
        
        pessoa[0] = new Pessoa("John", 26, "Masculino");
        pessoa[1] = new Pessoa ("Maria", 25, "Feminino");
        
        livro[0] = new Livro("Game of Thrones", "Martin", 400, 50, pessoa[0]);
        livro[1] = new Livro ("Harry Potter", "J.K. Rownling", 800, 120, pessoa[1]);
        livro[2] = new Livro ("O Nome do Vento", "Patrick Rothfuss", 656, 700, pessoa[0]);
        System.out.println(livro[0].detalhes());
        livro[2].abrir();
        livro[2].avancarPag();
        livro[2].voltarPag();
        System.out.println(livro[2].detalhes());
        
        
        /*Livro leitor1 = new Livro("Got", "Martin", 200, 50, "John");
        System.out.println(leitor1.detalhes());
        leitor1.abrir();
        leitor1.folhear();
        leitor1.avancarPag();
        leitor1.voltarPag();
        }*/
            
        
    
}
}