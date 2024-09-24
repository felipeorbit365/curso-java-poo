package aula06;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.maisVolume();
        controle.play();
        controle.abrirMenu();
        controle.fecharMenu();
    }
}