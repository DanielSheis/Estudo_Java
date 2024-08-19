package aulasdevdojo.javacore.Aintroducaoclasses.testedominio;

// Chamando o dominio
import aulasdevdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Daniel Miranda Soares";
        estudante.idade = 23;
        estudante.sexo = 'M';
        estudante.email = "DanielDev@gmail.com";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.email);
    }
}
