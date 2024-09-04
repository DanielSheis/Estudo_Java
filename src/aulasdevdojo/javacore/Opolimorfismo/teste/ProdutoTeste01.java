package aulasdevdojo.javacore.Opolimorfismo.teste;

import aulasdevdojo.javacore.Opolimorfismo.dominio.Celular;
import aulasdevdojo.javacore.Opolimorfismo.dominio.Computador;
import aulasdevdojo.javacore.Opolimorfismo.servico.CalcularTaxasProdutos;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo plus I7", 15000);
        Celular celular = new Celular("Poco m3", 2500);

        CalcularTaxasProdutos.calcularComputador(computador);

        System.out.println("-------------------------");

        CalcularTaxasProdutos.calcularCelular(celular);
    }
}
