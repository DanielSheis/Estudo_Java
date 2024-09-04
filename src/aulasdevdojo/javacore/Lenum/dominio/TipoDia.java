package aulasdevdojo.javacore.Lenum.dominio;

public enum TipoDia {
    SEGUNDA_FEIRA("Segunda Feira"),
    TERCA_FEIRA("Terça Feira"),
    QUARTA_FEIRA("Quarta Feira"),
    QUINTA_FEIRA("Quinta Feira"),
    SEXTA_FEIRA("Sexta Feira"),
    SABADO("Sabado"),
    DOMINGO("Domingo");

    private final String DIA_RELATORIO;

    TipoDia(String DIA_RELATORIO) {
        this.DIA_RELATORIO = DIA_RELATORIO;
    }

    public String getDIA_RELATORIO() {
        return DIA_RELATORIO;
    }
}
