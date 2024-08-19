package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Preenchendo atributo
        calculadora.numero1 = 20;
        calculadora.numero2 = 7;

        // Executando métodos
        System.out.print("A soma entre " + calculadora.numero1 + " e " + calculadora.numero2 + " é ");
        calculadora.somarDoisNumero();
        System.out.println("------------------------");
        System.out.print("A subtração entre " + calculadora.numero1 + " e " + calculadora.numero2 + " é ");
        calculadora.subtrairDoisNumero();
    }
}
