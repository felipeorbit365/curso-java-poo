package aula09;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];

        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Felipe", 21, "Masculino");

        pessoas[1] = new Pessoa("Patricia",46, "Feminino");

        pessoas[2] = new Pessoa("Andréia", 19, "Feminino");

        livros[0] = new Livro("Jogos Vorazes", "Suzanne Collins", 390, pessoas[0]);

        livros[1] = new Livro("Law & Order", "Olivia Benson", 450, pessoas[1]);

        livros[2] = new Livro("A História do Futebol", "Ronaldo Nazário", 230, pessoas[2]);

        livros[0].abrir();
        livros[0].folhear(332);
        livros[0].avancarPagina();
        livros[0].detalhes();
    }
}
