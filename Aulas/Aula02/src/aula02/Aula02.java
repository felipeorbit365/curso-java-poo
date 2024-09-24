package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta(); // Instancia o objeto
        canetaUm.cor = "Azul";
        canetaUm.ponta = 0.5f;

        canetaUm.tampar();
        canetaUm.status();
        canetaUm.rabiscar();

        System.out.println("---");

        Caneta canetaDois = new Caneta();
        canetaDois.modelo = "Hostnet";
        canetaDois.cor = "Preta";

        canetaDois.destampar();
        canetaDois.status();
        canetaDois.rabiscar();
    }
}
