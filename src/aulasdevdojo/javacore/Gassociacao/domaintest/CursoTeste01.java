package aulasdevdojo.javacore.Gassociacao.domaintest;

import aulasdevdojo.javacore.Gassociacao.domain.Aluno;
import aulasdevdojo.javacore.Gassociacao.domain.Curso;

public class CursoTeste01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Roberto");
        Aluno aluno2 = new Aluno("Camile");
        Aluno aluno3 = new Aluno("Daniel");
        Aluno aluno4 = new Aluno("Thatiane");
        Curso curso = new Curso("Dev++");

        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4};
        curso.setAlunos(alunos);

        aluno1.setCurso(curso);
        aluno2.setCurso(curso);
        aluno3.setCurso(curso);
        aluno4.setCurso(curso);

        System.out.println("------- Curso -------");
        curso.imprime();

        System.out.println("\n------- Alunos -------");
        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        aluno4.imprime();
    }
}
