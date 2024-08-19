package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class LerNomeImprimirNome {
    public String nomeForaDaClasse;

    public void imprimirNome(String nome) {
        this.nomeForaDaClasse = nome;

        System.out.println(this.nomeForaDaClasse);
    }
}
