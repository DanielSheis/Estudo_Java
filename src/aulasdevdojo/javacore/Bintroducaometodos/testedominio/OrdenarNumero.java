package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.OrdenarListaDeNumero;

public class OrdenarNumero {
    public static void main(String[] args) {
        OrdenarListaDeNumero ordenarNumero = new OrdenarListaDeNumero();
        int[] listNumero = {10, 9, 3, 4, 7, 7, 0, -1, -89, 11};

        ordenarNumero.ordenarLista(listNumero);

        for (int i : listNumero) {
            System.out.println(i);
        }
    }
}
