package exercicios.controledeestacionamento.dominio;

public class ImprimirInformacoes {
    public void imprimirProprietario(String nome, String cpf, int anoNascimento) {
        System.out.println("Nome do proprietario: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Ano de Nascimento: " + anoNascimento);
    }
    public void imprimirVeiculo(String marca, String modelo, int ano, String placa, String cor) {
        System.out.println("Marca do veiculo: " + marca);
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Ano do veiculo: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
    }
}
