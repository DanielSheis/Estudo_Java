package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoDivisao = calculadora.dividirDoisNumero(20, 0);
        System.out.println("Resultado da divisão é: " + resultadoDivisao);

        calculadora.dividirDoisNumero2(10, 3);
    }
}
