package aulasdevdojo.javacore.Gassociacao.domaintest.atividadedomaintest;

/*
Regra do négocio:
Um aluno poderá estar em apenas um seminário
Um seminário pode ter nenhum ou vários estudantes
Um professor poderá ter vários seminários
um seminário deve ter um local
 */

import aulasdevdojo.javacore.Gassociacao.domain.atividadedomain.Aluno;
import aulasdevdojo.javacore.Gassociacao.domain.atividadedomain.Local;
import aulasdevdojo.javacore.Gassociacao.domain.atividadedomain.Professor;
import aulasdevdojo.javacore.Gassociacao.domain.atividadedomain.Seminario;

public class SeminarioAtividade {
    public static void main(String[] args) {
        Local local = new Local("Rua Armando Briga N°143");
        Seminario seminario1 = new Seminario("Como matar bugs?", local);
        Seminario seminario2 = new Seminario("DevDojo", local);
        Seminario seminario3 = new Seminario("DEV++", local);
        Seminario[] seminarios = {seminario1, seminario2, seminario3};

        Professor professor1 = new Professor("Carlos Almondega", "Analises de sistemas", seminarios);
        Professor professor2 = new Professor("Patricia alastor", "Engenheira de Software", new Seminario[]{seminario1, seminario3});

        Aluno aluno1 = new Aluno("Daniel Miranda", 23, seminario1);
        Aluno aluno2 = new Aluno("Roberto Malaquias", 19, seminario3);
        Aluno aluno3 = new Aluno("Daniely D'Nobrega", 35, seminario2);
        Aluno aluno4 = new Aluno("Thatiane", 30, seminario2);

        Aluno[] alunos = {aluno3, aluno4};

        seminario1.setAlunos(new Aluno[]{aluno1});
        seminario2.setAlunos(alunos);
        seminario3.setAlunos(new Aluno[]{aluno2});

        System.out.println("------- Seminarios -------");
        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();

        System.out.println("\n\n------- Professor -------");
        professor1.imprime();
        professor2.imprime();

        System.out.println("\n\n------- Alunos -------");
        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        aluno4.imprime();
    }
}
