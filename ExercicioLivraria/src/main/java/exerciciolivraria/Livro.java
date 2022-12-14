package exerciciolivraria;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + " Titulo do livro: " + titulo + "\n Autor: " + autor + "\n Total de páginas do livro: "
                + totPaginas + "\n Página atual: " + pagAtual + "\n O livro está aberto?" + aberto + "\n Leitor: "
                + leitor.getNome() + " idade do leitor: " + leitor.getIdade() + " sexo do leitor: " + leitor.getSexo()
                + "}";

    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear() {
        if (this.aberto == true) {
            Random folhear = new Random();
            int folhearPag = folhear.nextInt(this.totPaginas);
            System.out.println("O leitor folheou: " + folhearPag + " páginas do livro.");
        } else {
            System.out.println("O livro está fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true) {
            System.out.println("O Leitor estava na página: " + this.getPagAtual());
            this.pagAtual++;
            System.out.println("Avançou uma página e agora está na página: " + this.getPagAtual());
        } else {
            System.out.println("O livro está fechado!");
        }

    }

    @Override
    public void voltarPag() {
        if (this.aberto == true) {
            System.out.println("O Leitor estava na página: " + this.getPagAtual());
            this.pagAtual--;
            System.out.println("O leitor retornou uma página e agora está na página " + this.getPagAtual());
        } else {
            System.out.println("O livro está fechado!");
        }
    }
}
