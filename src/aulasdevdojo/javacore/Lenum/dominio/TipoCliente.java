package aulasdevdojo.javacore.Lenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALOR;
    private final String NOME_RELATORIO;

    TipoCliente(int VALOR, String NOME_RELATORIO) {
        this.VALOR = VALOR;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

    public static TipoCliente buscaClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return NOME_RELATORIO;
    }
}
