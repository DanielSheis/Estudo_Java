package aulasdevdojo.javacore.Gassociacao.domaintest;

import aulasdevdojo.javacore.Gassociacao.domain.Escola;
import aulasdevdojo.javacore.Gassociacao.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Tsunade Sensei");
        Professor professor3 = new Professor("Jiraya Sensei");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
