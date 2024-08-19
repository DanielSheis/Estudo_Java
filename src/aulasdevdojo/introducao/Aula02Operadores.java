package aulasdevdojo.introducao;

public class Aula02Operadores  {
    public static void main(String[] args) {
        // + - / *
        int numeroUm = 3;
        int numeroDois = 5;

        System.out.println(numeroUm + numeroDois);
        // Se o compilador identificar um tipo de string primeiro, o + não é mais operador
        System.out.println("diferente: "+numeroDois+numeroUm);

        // %
        double resto = numeroUm % (double) numeroDois;
        System.out.println(resto);

        // < > <= >= !=
        boolean teste = 10 > 20;
        System.out.println(teste);

        // && (AND) || (OR)
        
    }
}
