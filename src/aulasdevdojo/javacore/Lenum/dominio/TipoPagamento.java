package aulasdevdojo.javacore.Lenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1; // Desconto de 10%
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05; // Desconto de 5%
        }
    };

    public abstract double calcularDesconto(double valor); // Método abstract
}

