package aulasdevdojo.javacore.Gassociacao.domain;

public class Curso {
    private String nome;
    private final String[] cursos = {"POO", "Java", "Python", "Algoritmos"};
    private Aluno[] alunos;

    public Curso(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (alunos == null) return;

        System.out.print("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print("[" + aluno.getNome() + "] ");
        }
    }

    // Get e Set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getCursos() {
        return this.cursos;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
