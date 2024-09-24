package aula13;

public class ProjetoAnimais {
    public static void main(String[] args) {
        Cachorro cachorroUm = new Cachorro();

        cachorroUm.reagir("Olá");

        cachorroUm.reagir(19,0);

        cachorroUm.reagir(true);
        cachorroUm.reagir(false);

        cachorroUm.reagir(2, 12.5f);
        cachorroUm.reagir(2, 4.5f);
    }
}
