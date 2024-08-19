package aulasdevdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private int temporadas;

    public Anime(String nome, String genero, int episodios, int temporadas) { // ≤ Isso é um construtor
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.temporadas = temporadas;
    }

    public Anime() { // ≤ Sobrecarga de construtores

    }

//    public void init(String nome, String genero) {
//        this.nome = nome;
//        this.genero = genero;
//    }
//
//    public void init(String nome, String genero, int episodios, int temporadas) {
//        this.init(nome, genero);
//
//        this.episodios = episodios;
//        this.temporadas = temporadas;
//    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.temporadas);
    }
}
