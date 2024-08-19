package exercicios.controledeestacionamento.dominio;

public class Proprietario {
    private String nome;
    private String cpf;
    private int anoNascimento;

    public void init(String nome, String cpf, int anoNascimento) {
        if (nome == null || cpf == null) {
            System.out.println("Nome e/ou CPF inválido");
            return;
        }
        if (anoNascimento < 0) {
            System.out.println("Idade inválida");
            return;
        }

        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
}
