package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.Estudante;
import aulasdevdojo.javacore.Bintroducaometodos.dominio.Imprimir;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.name = "Luffy";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.name = "Boa Rancock";
        estudante2.idade = 23;
        estudante2.sexo = 'F';


        imprimir.imprimir(estudante1);

        System.out.println("--------------------");

        imprimir.imprimir(estudante2);
    }
}
