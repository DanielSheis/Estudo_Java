package aulasdevdojo.introducao;

public class Aula03EstruturasCondicionaisExercicios {
    public static void main(String[] args) {

        // Primeira atividade usando if, else e else if
        float salario = 25340;
        float juros;

        if(salario <= 34712.00) {
            juros = 9.70F;
        }
        else if(salario >= 34713.00 && salario <= 68507.00) {
            juros = 37.35F;
        }
        else {
            juros = 49.50F;
        }

        float resultado = (salario * juros) / 100;

        System.out.println("Seu juros sobre o salario é de "+juros+"%, seu imposto é de R$"+resultado);

        // Segunda atividade usando switch
        byte dia = 3;

        switch(dia) {
            case 1, 7:
                System.out.println("Fim de semana");
                break;
            case 2, 3, 4, 5, 6 :
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
