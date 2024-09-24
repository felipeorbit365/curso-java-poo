package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Aluno pessoaDois = new Aluno();
        Professor pessoaTres = new Professor();
        Funcionario pessoaQuatro = new Funcionario();

        pessoaUm.setNome("Pedro");
        pessoaDois.setNome("Maria");
        pessoaTres.setNome("Cláudio");
        pessoaQuatro.setNome("Fabiana");

        pessoaDois.setIdade(18);

        pessoaUm.setSexo("Masculino");
        pessoaQuatro.setSexo("Feminino");

        pessoaDois.setCurso("Informática");
        pessoaTres.setSalario(2500.75f);
        pessoaQuatro.setSetor("Estoque");

        System.out.println(pessoaUm.toString());
        System.out.println(pessoaDois.toString());
        System.out.println(pessoaTres.toString());
        System.out.println(pessoaQuatro.toString());
    }
}
