package aulasdevdojo.javacore.Opolimorfismo.dominio;

public class Computador extends Produto{
    public static final double TAXA_PRODUTO = 0.61;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double taxa() {
        return this.valor * TAXA_PRODUTO;
    }
}
