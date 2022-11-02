package playvideos;

public class PlayVideos {

    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula de Javascript");
        video[1] = new Video("Aula de POO");
        video[2] = new Video("Aula de JAVA");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("John", 26, "M", "JJ");
        gafanhoto[1] = new Gafanhoto("Caroline", 24, "F", "carol2");
        
       
       Visualizacao visualizacao[] = new Visualizacao[5];
       visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
       visualizacao[0].avaliar(); // Aqui foi o avaliar sem parametro irá receber "5"
       System.out.println(visualizacao[0].toString());
       visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]); 
       visualizacao[0].avaliar(87.0f); // Aqui a avaliação foi pela porcentagem do vídeo, no caso vai receber 8
       System.out.println(visualizacao[1].toString());
                              
    }
}
