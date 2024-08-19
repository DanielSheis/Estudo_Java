package aulasdevdojo.introducao;

public class Aula04LacosDeRepeticoes {
    public static void main(String[] args) {

        // Laço for
        for(int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        // Laço while
        int j = 1;

        while(true) {
            j *= 2;

            if(j == 8) {
                System.out.println("Achei o 8");
                break;
            }
        }

        // Laço do while
        int contador = 0;

        do {
            if(contador % 2 == 0) {
                System.out.println(contador+" é par");
            }
            /*else {
                System.out.println(contador+" é impar");
            }*/

            contador++;
        } while (contador < 10000);
    }
}
