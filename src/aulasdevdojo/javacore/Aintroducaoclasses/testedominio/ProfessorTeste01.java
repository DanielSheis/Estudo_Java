package aulasdevdojo.javacore.Aintroducaoclasses.testedominio;

import aulasdevdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Albertino Esteino";
        professor.idade = 323;
        professor.sexo = 'M';
        professor.email = "AlbertionoEsteinoSeniorDev@gmail.com";

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nanos Sexo: " + professor.sexo + "\nEmail: " + professor.email);
    }
}
