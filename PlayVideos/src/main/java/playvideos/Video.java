/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playvideos;

/**
 *
 * @author sousu
 */
public class Video  implements AcoesVideo  {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvalaicao(int avalicao) {
        int nova;
        nova  = (this.avaliacao + avalicao)/this.views;     
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    
    @Override
    public void play() {
    this.reproduzindo = true;
    this.views++;
        System.out.println("O vídeo está reproduzindo!");
    
    }

    @Override
    public void pause() {
       this.reproduzindo = false;
         System.out.println("O vídeo foi pausado.");
    }

    @Override
    public void like() {
        this.curtidas++;
        this.avaliacao++;
        
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
