package aulasdevdojo.introducao;

public class Aula04LacosDeRepeticoesExercicios {
    public static void main(String[] args) {
        float valorVeiculo = 45000;
        int valorParcelas = 1200;

        int i = 1;
        while (true) {
            valorVeiculo -= valorParcelas;

            if(valorVeiculo <= 0) {
                System.out.println("Você precisa pagar "+i+"X parcelas");
                System.out.println((valorVeiculo < 0 ? i-1 : i)+" parcelas de R$"+valorParcelas);

                if(valorVeiculo < 0) {
                    float restoDaParcela = valorVeiculo + valorParcelas;
                    System.out.println("E uma parcela de R$"+restoDaParcela);
                }
                break;
            }

            i++;
        }
    }
}
