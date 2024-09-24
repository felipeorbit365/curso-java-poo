package aula05minhaResolucao;
// Minha resolução do exercício
import java.util.Scanner;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(boolean status, double saldo) {
        this.status = status;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    Scanner teclado = new Scanner(System.in);

    public void abrirConta() {
        this.setStatus(true);
        String respostaTipo;

        do {
            System.out.print("Digite o tipo da conta [CC para Conta-Corrente ou CP para Conta-Poupança]: ");
            respostaTipo = teclado.nextLine();

            if (respostaTipo.equalsIgnoreCase("CC")) {
                this.setTipo("Conta-Corrente");
                this.setSaldo(50);
            } else if (respostaTipo.equalsIgnoreCase("CP")) {
                this.setTipo("Conta-Poupança");
                this.setSaldo(150);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!respostaTipo.equalsIgnoreCase("CC") && !respostaTipo.equalsIgnoreCase("CP"));

        System.out.print("Digite seu nome completo como titular da conta: ");
        this.setDono(teclado.nextLine());

        System.out.print("Digite o número para identificação da sua conta: ");
        this.setNumConta(teclado.nextLine());

        System.out.println("Conta aberta com sucesso.");
    }


    public void fecharConta() {
        if ((this.getSaldo() == 0) && (this.isStatus())) {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso.");
        } else if (!this.isStatus()) {
            System.out.println("Você não possui conta no banco para fechar.");
        } else if (this.getSaldo() > 0) {
            System.out.printf("Você tem saldo de R$%.2f na conta. Saque todo o valor para poder fechá-la.\n",
                    this.getSaldo());
        } else {
            System.out.printf("Você possui débitos na conta. Deposite o valor de R$%.2f para poder fechá-la.\n",
                    this.getSaldo());
        }
    }

    public void depositar() {
        if (this.isStatus()) {
            System.out.print("Insira o valor do depósito que deseja realizar: R$");
            double valorDeposito = teclado.nextDouble();
            System.out.printf("Depósito de R$%.2f realizado com sucesso.\n", valorDeposito);
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.printf("Seu saldo atual é: R$%.2f\n", this.getSaldo());
        } else {
            System.out.println("Você ainda não possui uma conta no banco. Abra uma para realizar depósitos.");
        }
    }

    public void sacar() {
        if (this.isStatus()) {
            System.out.print("Insira o valor do saque que deseja realizar: R$");
            double valorSaque = teclado.nextDouble();
            if (this.getSaldo() < valorSaque) {
                System.out.printf("Seu saldo é de R$%.2f. Você não pode realizar um saque nesse valor.\n",
                        this.getSaldo());
            } else {
                System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valorSaque);
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.printf("Seu saldo atual é: R$%.2f\n", this.getSaldo());
            }
        } else {
            System.out.println("Você ainda não possui conta no banco. Abra uma para realizar saques.");
        }
    }

    public void pagarMensal() {
        if (this.isStatus()) {
            System.out.println("O valor referente ao custo da mensalidade será descontado.");
            if (this.getTipo().equals("Conta-Corrente")) {
                System.out.println("Custo da mensalidade para Conta-Corrente: R$12.OO");
                this.setSaldo(this.getSaldo() - 12);
                System.out.printf("Seu saldo atual é: R$%.2f\n", this.getSaldo());
            } else if (this.getTipo().equals("Conta-Poupança")) {
                System.out.println("Custo da mensalidade para Conta-Poupança: R$20.OO");
                this.setSaldo(this.getSaldo() - 20);
                System.out.printf("Seu saldo atual é: R$%.2f\n", this.getSaldo());
            }
        } else {
            System.out.println("Você ainda não possui conta no banco. Abra uma para ter todos os benefícios.");
        }
    }

    public void mostrarInformacoes() {
        if (this.isStatus()) {
            System.out.println("Tipo de conta: " + this.getTipo());
            System.out.println("Nome do dono da conta: " + this.getDono());
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.printf("Saldo total da conta: R$%.2f\n", this.getSaldo());
        } else {
            System.out.println("Nenhuma conta foi registrada no sistema ainda. Registre para mostrar informações.");
        }
    }
}