package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class SomarArrayComVarArgs {
    public void somarArray(int[] numeros) { // Sem usar o Varargs
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Usando array normal: " + soma);
    }

    public void somarArrayVarArgs(int num1, int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Usando Varargs: " + (soma - num1));
    }
}
