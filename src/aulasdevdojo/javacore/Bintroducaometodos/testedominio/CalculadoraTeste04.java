package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] listNum = {10, 7, 8, 9, 2};

        calculadora.teste(listNum, 999);
        System.out.println(listNum[0]);
    }
}