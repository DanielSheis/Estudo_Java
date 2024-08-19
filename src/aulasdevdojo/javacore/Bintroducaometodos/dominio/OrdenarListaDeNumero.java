package aulasdevdojo.javacore.Bintroducaometodos.dominio;

public class OrdenarListaDeNumero {
    public void ordenarLista(int[] listaNumero) {

        for (int i = 0; i < listaNumero.length; i++) {
            int numeroTemp = listaNumero[i];

            for (int j = i + 1; j < listaNumero.length; j++) {
                if (numeroTemp > listaNumero[j]) {
                    listaNumero[i] = listaNumero[j];
                    listaNumero[j] = numeroTemp;
                    numeroTemp = listaNumero[i];
                }
            }
        }
    }
}
