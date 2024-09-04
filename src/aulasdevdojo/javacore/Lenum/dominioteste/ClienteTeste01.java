package aulasdevdojo.javacore.Lenum.dominioteste;

import aulasdevdojo.javacore.Lenum.dominio.Cliente;
import aulasdevdojo.javacore.Lenum.dominio.TipoCliente;
import aulasdevdojo.javacore.Lenum.dominio.TipoDia;
import aulasdevdojo.javacore.Lenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA, TipoDia.SEGUNDA_FEIRA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Shikamaru", TipoCliente.PESSOA_JURIDICA, TipoDia.SABADO, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("Desconto de R$" + TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println("Desconto de R$" + TipoPagamento.CREDITO.calcularDesconto(1000));

        TipoCliente clienteBusca = TipoCliente.buscaClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(clienteBusca);

        TipoCliente clienteBusca2 = TipoCliente.buscaClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(clienteBusca2);

        if ("Daniel".equalsIgnoreCase("daniel")) {
            System.out.println("Palavras iguais");
        }
        else {
            System.out.println("Palavras diferentes");
        }
    }
}
