package exercicios.controledeestacionamento.aplicativo;

import exercicios.controledeestacionamento.dominio.ImprimirInformacoes;
import exercicios.controledeestacionamento.dominio.Proprietario;
import exercicios.controledeestacionamento.dominio.Veiculo;

public class AppEstacionamento {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario();
        Veiculo veiculo = new Veiculo();
        ImprimirInformacoes imprimir = new ImprimirInformacoes();

        proprietario.init("Daniel Miranda Soares", "123.456.789-01", 2001);
        veiculo.init("Aston Martin","DBS", 2024, "PAZ3D21", "Preto");

        imprimir.imprimirProprietario(proprietario.getNome(), proprietario.getCpf(), proprietario.getAnoNascimento());
        System.out.println("-------------------------");
        imprimir.imprimirVeiculo(veiculo.getMarca(), veiculo.getModelo(), veiculo.getAno(), veiculo.getPlaca(), veiculo.getCor());
    }
}
