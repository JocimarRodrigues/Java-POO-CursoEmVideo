package exerciciolivraria;

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
        
            
        
    
}
}