package aulasdevdojo.javacore.Gassociacao.domain.atividadedomain;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    // Get's e Set's
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
