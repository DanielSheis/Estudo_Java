package aulasdevdojo.javacore.Iheranca.dominio.atividade;

public class Mamifero {
    protected String nome;
    protected String cor;
    protected int patas;
    protected boolean cauda;

    public Mamifero(String nome, String cor, int patas, boolean cauda) {
        this.nome = nome;
        this.cor = cor;
        this.patas = patas;
        this.cauda = cauda;
    }

    public void comer() {
        System.out.println("A(o)" + this.nome + " esta comendo");
    }

    public void amamentar() {
        System.out.println("A(o)" + this.nome + " esta amamentando");
    }

    public void imprimirAnimal() {
        System.out.println("Nome do animal: " + this.nome);
        System.out.println("Cor do animal: " + this.cor);
        System.out.println("Quantas patas tem o animal: " + this.patas);
        System.out.println("Animal tem cauda: " + this.cauda);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isCauda() {
        return cauda;
    }

    public void setCauda(boolean cauda) {
        this.cauda = cauda;
    }
}
