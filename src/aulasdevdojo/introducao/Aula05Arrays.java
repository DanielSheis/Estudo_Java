package aulasdevdojo.introducao;

public class Aula05Arrays {
    public static void main(String[] args) {
        // Tipos de  referencias como arrays e Strings pode receber o valor null
        int[] idade = {13, 28, 35};

        String[] nomes = {"Daniel", "Caua", "Matheus"};

        // para declarar um array vazio, voce precisa determinar o tamanho dele criando um novo objeto do tipo dele
        char[] letras = new char[3]; // <--
        letras[0] = 'a';
        letras[1] = 'b';
        letras[2] = 'c';

        System.out.println(idade[0]);

        int i = 0;
        while(i < nomes.length) {
            System.out.println("Olá "+nomes[i]);
            i++;
        }

        i = 0;
        while(i < letras.length) {
            System.out.print(letras[i]+" ");
            i++;
        }

        System.out.println(" ");

        // Usando foreach

        double[] notasEscolar = {2, 4.4, 6, 7, 10};

        for(double valorReferencia:notasEscolar) {
            System.out.print("["+valorReferencia+"] ");
        }
    }
}
