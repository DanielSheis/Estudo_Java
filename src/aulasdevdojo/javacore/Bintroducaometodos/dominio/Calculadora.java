package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public int numero1;
    public int numero2;

    public void somarDoisNumero() {
        System.out.println(numero1 + numero2);
    }

    public void subtrairDoisNumero() {
        System.out.println(numero1 - numero2);
    }

    public void multiplicarDoisNumero(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumero(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void dividirDoisNumero2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; // Esse tipo de return só funciona em tipo void
        }
        System.out.println("O resultado da divisão é: " + (num1 / num2));
    }

    public void teste(int[] listaNum, int num) {
        listaNum[0] = num;
        System.out.println(listaNum[0]);
    }
}
