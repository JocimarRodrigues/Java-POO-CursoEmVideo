package exercicioluta;

import java.util.ArrayList;

public class Cadastro implements Dados{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    public Cadastro(String nome,String nacionalidade,int idade, float peso, float altura,int vitorias,int derrotas,int empates){
        this.nome = nome; 
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public float getPeso(){
        return this.peso;
        
    }
    
    public float getAltura(){
        return this.altura;
        
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){ 
        if (this.peso < 52.2){
            this.categoria = "Inválido, abaixo do peso mínimo para lutar!";
        } else if (this.peso <= 70.3){
            this.categoria = "leve";
        } else if (this.peso <= 83.9){
            this.categoria = "médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }  
    

    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    
    public int getEmpates(){
        return this.empates;
    }
    
    public void setEmpates(int empates){
        this.empates = empates;
    }
    
    
    @Override
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Nacionalidade do lutador: " + this.getNacionalidade());
        System.out.println("Idade do lutador: " + this.getIdade());
        System.out.println("Peso do lutador: " + this.getPeso());
        System.out.println("Categoria do lutador: " + this.getCategoria());
        System.out.println("Vitórias do lutador: " + this.getVitorias());
        System.out.println("Empates do lutador: " + this.getEmpates());
        System.out.println("Derrotas do lutador: " + this.getDerrotas());
        
        
    }
    
    @Override
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    @Override
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    @Override
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    @Override
    public void status(){
        System.out.println("Nome:" + this.getNome() + " peso: " + this.getCategoria() + " vitórias: " + this.getVitorias() + " derrotas: " + this.getDerrotas() + " empates: " + this.getEmpates());
    }
    
    
}
