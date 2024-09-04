package aulasdevdojo.javacore.Mclassesabstratas.dominio;

public class RelancaoHumana extends Funcionario{
    public RelancaoHumana(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "RH{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
