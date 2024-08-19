package exercicios.controledeestacionamento.aplicativo;

import exercicios.controledeestacionamento.dominio.ImprimirInformacoes;
import exercicios.controledeestacionamento.dominio.Proprietario;

public class teste {
    public static void main(String[] args) {
        Proprietario[] proprietario = new Proprietario[5];
        ImprimirInformacoes imprimir = new ImprimirInformacoes();

        for (int i = 0; i < 5; i++) {
            proprietario[i] = new Proprietario();
        }

        proprietario[0].init("Daniel Miranda Soares", "123.456.789-01", 2001);
        proprietario[1].init("Thatiane Maria Russo", "123.789.456-01", 1994);
        proprietario[2].init("Mariana talita cruz", "321.456.789-10", 2030);
        proprietario[3].init("Sophie Miranda Soares", "012.345.678-91", 1999);
        proprietario[4].init("Isabell karina souza", "000.111.222-33", 2003);

        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------------------------------------------------");
            imprimir.imprimirProprietario(proprietario[i].getNome(), proprietario[i].getCpf(), proprietario[i].getAnoNascimento());
            System.out.println("-------------------------------------------------------------");
        }
    }
}
