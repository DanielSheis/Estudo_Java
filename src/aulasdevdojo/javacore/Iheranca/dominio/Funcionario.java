package aulasdevdojo.javacore.Iheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Bloco de inicialização estático subclasse (classe filha)");
    }

    {
        System.out.println("Bloco de inicialização subclasse (classe filha)");
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void salarioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o pagamento de R$" + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
