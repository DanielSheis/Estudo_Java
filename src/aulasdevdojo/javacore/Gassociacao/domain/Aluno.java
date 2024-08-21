package aulasdevdojo.javacore.Gassociacao.domain;

public class Aluno {
    private String nome;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome do curso: " + curso.getNome());

        System.out.print("Cursos: ");
        for (String curso : curso.getCursos()) { //***
            System.out.print("[" + curso + "] ");
        }
        System.out.println("\n------------------------------------------");
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
