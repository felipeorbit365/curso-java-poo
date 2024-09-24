package aula05resolucaoGuanabara;
// Resolução do Guanabara
public class Banco {
    public static void main(String[] args) {
        ContaBanco clienteUm = new ContaBanco();
        clienteUm.setNumConta(1111);
        clienteUm.setDono("Felipe");
        clienteUm.abrirConta("CC");

        ContaBanco clienteDois = new ContaBanco();
        clienteDois.setNumConta(2222);
        clienteDois.setDono("Patricia");
        clienteDois.abrirConta("CP");

        clienteUm.depositar(100);
        clienteUm.pagarMensal();

        clienteDois.depositar(500);
        clienteDois.sacar(100);

        clienteUm.estadoAtual();
        clienteDois.estadoAtual();
    }
}