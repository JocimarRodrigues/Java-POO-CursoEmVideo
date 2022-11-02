/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playvideos;

/**
 *
 * @author sousu
 */
public class Visualizacao {
    private Gafanhoto espectador; // Note que aqui tu está fazendo agraração da classe Gafanhoto
    private Video filme; // Note que aqui tu está fazendo agraração da classe Video

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); // Aqui na agregação tu está atribuindo + 1 diretamente ao total de videos assistidos pelo gafanhoto!
        this.filme.setViews(this.filme.getViews() + 1); // Aqui tu está atribuindo +1 ao total de views do vídeo!
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    
    public void avaliar(){ // Aqui está a sobreposição de sobrecarga
        this.filme.setAvalaicao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvalaicao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvalaicao(tot);
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
