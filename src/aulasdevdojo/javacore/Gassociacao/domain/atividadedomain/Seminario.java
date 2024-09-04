package aulasdevdojo.javacore.Gassociacao.domain.atividadedomain;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + this.local.getEndereco());
        if (alunos == null) {
            System.out.println("\n-------------------------------------------");
            return;
        }

        System.out.print("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print("[" + aluno.getNome() + "]");
        }
        System.out.println("\n-------------------------------------------");
    }

    // Get's e Set's
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
