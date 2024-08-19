package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Coelhão");
        pessoa.setIdade(25);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
