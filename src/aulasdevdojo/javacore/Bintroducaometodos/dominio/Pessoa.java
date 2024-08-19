package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    // Sets dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Gets dos atributos
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
}
