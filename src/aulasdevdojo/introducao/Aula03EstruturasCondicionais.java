package aulasdevdojo.introducao;

public class Aula03EstruturasCondicionais {
    public static void main(String[] args) {

        // Operador ternario
        System.out.println(10 > 11 ? "SIM" : "NÃO");

        // if, else e else if
        int idade = 14;
        if(idade < 15) {
            System.out.println("Categoria infantil");
        }
        else if(idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        }
        else {
            System.out.println("Categoria adulta");
        }

        // Switch
        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana não identificado");
                break;
        }
    }
}
