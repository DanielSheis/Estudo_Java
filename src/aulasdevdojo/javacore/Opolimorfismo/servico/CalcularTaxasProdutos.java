package aulasdevdojo.javacore.Opolimorfismo.servico;

import aulasdevdojo.javacore.Opolimorfismo.dominio.Celular;
import aulasdevdojo.javacore.Opolimorfismo.dominio.Computador;

public class CalcularTaxasProdutos {
    public static void calcularComputador(Computador computador) {
        double valorComputadorComTaxa = computador.getValor() + computador.taxa();

        System.out.println("Relatorio computador");
        System.out.println("Nome: " + computador.getNome());
        System.out.println("Valor: R$" + computador.getValor());
        System.out.println("Taxa a pagar: R$" + computador.taxa());
        System.out.println("Valor total: R$" + valorComputadorComTaxa);
    }

    public static void calcularCelular(Celular celular) {
        double valorCelularComTaxa = celular.getValor() + celular.taxa();

        System.out.println("Relatorio celular");
        System.out.println("Nome: " + celular.getNome());
        System.out.println("Valor: R$" + celular.getValor());
        System.out.println("Taxa a pagar: R$" + celular.taxa());
        System.out.println("Valor total: R$" + valorCelularComTaxa);
    }
}
