package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public void imprimirInformacaoFuncionario() {
        CalcularMediaSalarial calcular = new CalcularMediaSalarial();

        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salario == null) {
            System.out.println("Falta preencher campo salario");
            return;
        }

        System.out.println(calcular.mediaSalarial(this.salario));
    }

    // Sets

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("Nome invalido");
            return;
        }

        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida");
            return;
        }

        this.idade = idade;
    }
    public void setSalario(double[] salario) {
        for (double valor : salario) {
            if (valor < 0) {
                System.out.println("Salario invalido");
                return;
            }
        }

        this.salario = salario;
    }

    // Get
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public double[] getSalario() {
        return this.salario;
    }
    public double getMedia() {
        CalcularMediaSalarial calcular = new CalcularMediaSalarial();

        return calcular.mediaSalarial(this.salario);
    }
}
