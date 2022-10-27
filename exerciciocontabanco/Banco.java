package exerciciocontabanco;
/**
 *
 * @author Jocimar
 */
public class Banco {

    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo:" + this.getTipoConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------------------");
        
    }
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
        this.setTipoConta(t); 
        this.setStatus(true);
        if ("corrente".equals(t)) {          
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
            System.out.println("O usuário escolheu uma conta corrente e ganhou 150R$ como bônus!");

        } else if ("poupanca".equals(t)) {
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
            System.out.println("O usuário escolheu uma conta poupança e ganhou 50R$ como bônus!");
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta não pode ser fechada, tem saldo.");
        } else if (this.saldo < 0) {
            System.out.println("Você tem débitos a conta não pode ser fechada");
        } else if (this.saldo == 0) {
            System.out.println("Conta fechada com sucesso!");
            this.setStatus(false);
        }
    }

    public void depositar(float valor) {
        if (status == true) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado na conta do: " + this.dono + " no valor de: " + valor);
        } else {
            System.out.println("Problema na conta, impossível depositar!");
        }
    }

    public void sacar(float valor) {
        if (status == true && saldo > 0) {
            saldo = saldo - valor;
            System.out.println("Saque realizado na conta do: " + this.dono + " no valor de: " + valor);
            if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
            }

        } else if (status == false || saldo <= 0) {
            System.out.println("Problema na conta, impossível sacar!");
        }
    }

    public void pagarMensalidade() {
        if (status == true && "corrente".equals(this.tipoConta)) {
            saldo = saldo - 12;
            System.out.println("Mensalidade de 12 reais");
        } else if (status == true && "poupanca".equals(this.tipoConta)) {
            saldo = saldo - 20;
            System.out.println("Mensalidade de 20 reais");

        }
    }
    
}
    