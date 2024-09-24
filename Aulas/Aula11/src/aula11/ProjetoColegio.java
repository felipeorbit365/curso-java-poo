package aula11;

public class ProjetoColegio {
    public static void main(String[] args) {
        Visitante visitanteUm = new Visitante();
        visitanteUm.setNome("Juvenal");
        visitanteUm.setIdade(22);
        visitanteUm.setSexo("M");
        // visitanteUm.fazerAniversario();

        Aluno alunoUm = new Aluno();
        alunoUm.setNome("Cláudio");
        alunoUm.setMatricula(1111);
        alunoUm.setCurso("Informática");
        alunoUm.setIdade(16);
        alunoUm.setSexo("M");
        // alunoUm.pagarMensalidade();

        Bolsista bolsistaUm = new Bolsista();
        bolsistaUm.setMatricula(1112);
        bolsistaUm.setNome("Jubileu");
        bolsistaUm.setBolsa(12.5f);
        bolsistaUm.setSexo("M");
        // bolsistaUm.pagarMensalidade();

        Professor professorUm = new Professor();
        professorUm.setEspecialidade("Programação");
        professorUm.setNome("Gustavo");
        professorUm.setSalario(5000);
        professorUm.setSexo("M");
        // professorUm.receberAumento();

        Tecnico tecnicoUm = new Tecnico();
        tecnicoUm.setRegistroProfissional(333);
        tecnicoUm.setNome("Felipe");
        tecnicoUm.setSexo("M");
        // tecnicoUm.praticar();

        System.out.println(visitanteUm.toString());
        System.out.println(alunoUm.toString());
        System.out.println(bolsistaUm.toString());
        System.out.println(professorUm.toString());
        System.out.println(tecnicoUm.toString());
    }
}
