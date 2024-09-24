package aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta();

        canetaUm.modelo = "BIC Cristal";
        canetaUm.cor = "Azul";
        // canetaUm.ponta = 0.5f; --- Não funciona, pois é private
        canetaUm.carga = 80;
        // canetaUm.tampada = false; --- Não funciona, pois é private

        canetaUm.tampar();

        canetaUm.status();

        canetaUm.rabiscar();
    }
}
