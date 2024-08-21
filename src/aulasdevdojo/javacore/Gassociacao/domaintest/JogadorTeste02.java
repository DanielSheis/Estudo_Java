package aulasdevdojo.javacore.Gassociacao.domaintest;

import aulasdevdojo.javacore.Gassociacao.domain.Jogador;
import aulasdevdojo.javacore.Gassociacao.domain.Time;

// Associação 1 para muitos (ex: 1 time para vários jogadores)

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Robinho");
        Time time = new Time("Santos");

        jogador1.setTime(time);
        jogador1.imprime();

        jogador2.setTime(time);
        jogador2.imprime();

        jogador3.setTime(time);
        jogador3.imprime();
    }
}
