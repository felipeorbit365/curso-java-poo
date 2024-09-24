package aula05resolucaoGuanabara;
// Resolução do Guanabara
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos Personalizados
    public void estadoAtual() {
        System.out.println("----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String tipoConta) {
        this.setTipo(tipoConta);
        this.setStatus(true);
        if (tipoConta.equals("CC")) {
            this.setSaldo(50);
        } else if (tipoConta.equals("CP")) {
            this.setSaldo(150);
        } else {
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada. Saque todo o saldo antes.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada. Pague seus débitos antes.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valorDeposito) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float valorSaque) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar em uma conta fechada.");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada.");
        }
    }

    // Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}