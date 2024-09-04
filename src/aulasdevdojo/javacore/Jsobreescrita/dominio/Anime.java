package aulasdevdojo.javacore.Jsobreescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
