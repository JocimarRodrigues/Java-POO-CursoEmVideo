/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciocontabanco;

/**
 *
 * @author sousu
 */
public class Banco {

    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        saldo = 0;
        status = false;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numeroDaConta) {
        this.numConta = numeroDaConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipo) {
        this.tipoConta = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipoConta(t); // Note que tu SEMPRE precisa usar o "this"
        this.setStatus(true);
        if (t == "corrente") {
            //this.saldo = 50;  Aqui tu mexe diretamente no atributo
            this.setSaldo(150); // Aqui tu vai mexer no método; DAR PREFERENCIA PRA ESSE

        } else if (t == "poupanca") {
            //this.saldo = 150; Aqui tu mexe diretamente no atributo
            this.setSaldo(50);
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta não pode ser fechada, tem saldo.");
        } else if (this.saldo < 0) {
            System.out.println("Você tem débitos a conta não pode ser fechada");
        } else if (this.saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor) {
       if(status == true){
           saldo = saldo + valor;
           System.out.println("O valor na conta é: " + this.saldo);
       } else {
           System.out.println("Problema na conta, impossível depositar!");
       }
    }
    
    public void sacar(float valor){
        if(status == true && saldo > 0){
            saldo = saldo - valor;
            if (valor > saldo){
                System.out.println("Saldo insuficiente!");
            } else {
                System.out.println("Saque no valor de: " + valor + " o novo saldo é: " + this.saldo);
            }
            
        } else if (status == false || saldo <= 0){
            System.out.println("Problema na conta, impossível sacar!");
        }
    }

    public void pagarMensalidade(){
        if (status == true && this.tipoConta == "corrente"){
            saldo = saldo - 12;
            System.out.println("A mensalidade no valor de 12 reais foi paga! O novo saldo é: " + this.saldo);
        } else if (status == true && this.tipoConta == "poupanca"){
            saldo = saldo - 20;
            System.out.println("A mensalidade no valor de 20 reais foi paga! O novo saldo é: " + this.saldo);
        }
    }
}
