package aulasdevdojo.javacore.Mclassesabstratas.dominio;

public class Cto extends Funcionario{

    public Cto(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "CTO{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
