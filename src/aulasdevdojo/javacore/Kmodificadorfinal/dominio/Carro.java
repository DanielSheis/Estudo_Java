package aulasdevdojo.javacore.Kmodificadorfinal.dominio;

public class Carro {
    private String nome;
    private static final double velocidadeLimite = 250;
    private final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println("Veiculo: " + this.nome);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
