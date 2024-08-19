package exercicios.controledeestacionamento.dominio;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String cor;

    public void init(String marca, String modelo, int ano, String placa, String cor) {
        if (marca == null || modelo == null || placa == null || cor == null) {
            return;
        }
        if (ano < 1600) {
            System.out.println("Ano invalido");
            return;
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}
