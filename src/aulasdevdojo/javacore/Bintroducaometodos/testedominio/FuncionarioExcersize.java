package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExcersize {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        double[] arraySalario = {14303.65, 15783.99, 25999.21};

        funcionario.setNome("Daniel Miranda Soares");
        funcionario.setIdade(23);
        funcionario.setSalario(arraySalario);

        funcionario.imprimirInformacaoFuncionario();

        System.out.println(funcionario.getMedia());
    }
}
