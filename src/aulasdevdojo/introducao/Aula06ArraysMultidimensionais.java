package aulasdevdojo.introducao;

public class Aula06ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[12][32];

        /* Usando o for */
        // Escrever os dias no array multidimensional
        System.out.println("Usando for normal para preencher e printar o array multidimensional:");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 1; j < dias[i].length; j++) {
                dias[i][j] = j;

                if (j == 28 && i == 1) {
                    break;
                } else if ((i == 3 || i == 5 || i == 8 || i == 10) && (j == 30)) {
                    break;
                }
            }
        }
        // Printar o array
        for (int i = 0; i < dias.length; i++) { // ≤ Usando for normal
            System.out.println(i + 1);
            for (int j = 1; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println(" ");
        }

        /* Usando o foreach */
        System.out.println(" ");
        int[][] notas = {{1, 4, 6, 7}, {10, 47, 81, 53}, {103, 621, 791, 931}};

        for (int[] indexBase : notas) {
            for (int i : indexBase) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        /* Maneiras de inicializar um array */
        int[][] array = new int[3][];

        int[] array2 = {1, 3, 5, 7, 9};

        array[0] = new int[3];
        array[1] = array2;
        array[2] = new int[]{0, 2, 4, 6, 8, 10};

        for (int[] indexBase : array) {
            for (int index : indexBase) {
                System.out.print(index + " ");
            }
            System.out.println(" ");
        }
    }
}
