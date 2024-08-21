package aulasdevdojo.javacore.Gassociacao.domaintest;

import aulasdevdojo.javacore.Gassociacao.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
