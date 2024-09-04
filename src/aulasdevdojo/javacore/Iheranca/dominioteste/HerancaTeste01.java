package aulasdevdojo.javacore.Iheranca.dominioteste;

import aulasdevdojo.javacore.Iheranca.dominio.Endereco;
import aulasdevdojo.javacore.Iheranca.dominio.Funcionario;
import aulasdevdojo.javacore.Iheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua muito dinheiro");
        endereco.setNumero(32);
        endereco.setCep("1313-32");

        Pessoa pessoa = new Pessoa("Daniel Miranda");
        pessoa.setCpf("111111111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println();

        Funcionario funcionario = new Funcionario("Daniel Miranda Soares");
        funcionario.setCpf("12346789012");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(25000);

        funcionario.imprime();
        funcionario.salarioPagamento();
    }
}
