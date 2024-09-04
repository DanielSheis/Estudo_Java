package aulasdevdojo.javacore.Opolimorfismo.dominio;

public class Celular extends Produto{
    public static final double TAXA_PRODUTO = 0.41;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double taxa() {
        return this.valor * TAXA_PRODUTO;
    }
}
