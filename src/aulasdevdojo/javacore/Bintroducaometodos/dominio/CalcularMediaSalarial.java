package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class CalcularMediaSalarial {
    public double mediaSalarial(double[] salario) {
        if (salario == null) {
            return 0.0;
        }

        double soma = 0;

        for (double i : salario) {
            soma += i;
        }

        return soma / salario.length;
    }
}
