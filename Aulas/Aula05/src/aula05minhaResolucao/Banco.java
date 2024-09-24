package aula05minhaResolucao;
// Minha resolução do exercício
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        ContaBanco contaCliente = new ContaBanco(false, 0);

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("--- BANCO ---");
            System.out.println("Digite o número correspondente ao que deseja realizar.");
            System.out.println("1. Abrir conta");
            System.out.println("2. Fechar conta");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar saque");
            System.out.println("5. Fazer pagamento da mensalidade");
            System.out.println("6. Mostrar informações da conta");
            System.out.println("7. Sair do sistema");
            System.out.print("Escolha sua opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    contaCliente.abrirConta();
                    break;
                case 2:
                    contaCliente.fecharConta();
                    break;
                case 3:
                    contaCliente.depositar();
                    break;
                case 4:
                    contaCliente.sacar();
                    break;
                case 5:
                    contaCliente.pagarMensal();
                    break;
                case 6:
                    contaCliente.mostrarInformacoes();
                    break;
                case 7:
                    System.out.println("Muito obrigado! Saindo...");
                    break;
            }
        } while (opcao != 7);

        teclado.close();
    }

}
