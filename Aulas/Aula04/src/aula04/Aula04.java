package aula04;
// Versão feita manualmente
public class Aula04 {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta("BIC", 0.7f, "Preto");
        canetaUm.status();

        Caneta canetaDois = new Caneta("Stabilo", 0.3f, "Vermelho");
        canetaDois.status();
    }
}