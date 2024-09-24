package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("--- DETALHES DO LIVRO ---");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Nome do leitor: " + this.leitor.getNome());
        System.out.println("Idade do leitor: " + this.leitor.getIdade());
        System.out.println("Sexo do leitor: " + this.leitor.getSexo());
    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.aberto = true;
        } else {
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.aberto = false;
        } else {
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhear(int numeroPagina) {
        if (numeroPagina > this.totalPaginas) {
            this.setPaginaAtual(0);
            // Não é possível folhear até uma página que seja acima do número de páginas que o livro tem
        } else {
            this.setPaginaAtual(numeroPagina);
        }
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("O livro está fechado. Abra para voltar página.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("O livro está fechado. Abra para voltar página.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
