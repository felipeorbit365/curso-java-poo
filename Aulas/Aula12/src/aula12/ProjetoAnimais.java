package aula12;

public class ProjetoAnimais {
    public static void main(String[] args) {
        Mamifero mamiferoUm = new Mamifero();
        Canguru canguruUm = new Canguru();
        Ave aveUm = new Ave();

        mamiferoUm.locomover();
        canguruUm.locomover();
        aveUm.locomover();
    }
}
