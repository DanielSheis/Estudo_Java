package aulasdevdojo.javacore.Lenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoDia diaCompra;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoDia diaCompra, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.diaCompra = diaCompra;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoClienteRelatorio=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                ", diaCompra=" + diaCompra.getDIA_RELATORIO() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
