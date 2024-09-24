package Aula14;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de Java POO");
        v[1] = new Video("Aula 1 de Python");
        v[2] = new Video("Aula 1 de HTML5 e CSS3");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Felipe", 21, "M", "feliperfo");
        g[1] = new Gafanhoto("Murilo", 22, "M", "murilor");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Felipe assiste HTML5 e CSS3
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); // Felipe assiste Python
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

        /*
        System.out.println("--- VÍDEOS ---");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("--- GAFANHOTOS ---");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
         */
    }
}
