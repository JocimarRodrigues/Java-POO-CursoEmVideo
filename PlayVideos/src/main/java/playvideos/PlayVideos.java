/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package playvideos;

/**
 *
 * @author sousu
 */
public class PlayVideos {

    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula de Javascript");
        video[1] = new Video("Aula de POO");
        video[2] = new Video("Aula de JAVA");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("John", 26, "M", "JJ");
        gafanhoto[1] = new Gafanhoto("Caroline", 24, "F", "carol2");
        
       //Visualizacao visualizacao = new Visualizacao(gafanhoto[0], video[1]); // Note pegou a classe Visualizacao e atribiu duas outras classes, que é o Gafanhoto 0 e o Video 1
       Visualizacao visualizacao[] = new Visualizacao[5];
       visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
       visualizacao[0].avaliar(); // Aqui foi o avaliar sem parametro irá receber "5"
       System.out.println(visualizacao[0].toString());
       visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]); 
       visualizacao[0].avaliar(87.0f); // Aqui a avaliação foi pela porcentagem do vídeo, no caso vai receber 8
        System.out.println(visualizacao[1].toString());
       
       //System.out.println(visualizacao.toString()); // Aqui vai me mostrar o Gafanhoto, e o filme que ele está assistindo!
        /*System.out.println("VÍDEOS\n------------------------------------------------");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------------------------------");
        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());*/
        
        
        
    }
}
