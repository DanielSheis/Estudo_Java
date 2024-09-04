package aulasdevdojo.javacore.Iheranca.dominio.atividade;

public class Onitorrinco extends Mamifero{
    protected boolean botaOvo;
    protected boolean temVeneno;

    public Onitorrinco(String nome, String cor, int patas, boolean cauda, boolean botaOvo, boolean temVeneno) {
        super(nome, cor, patas, cauda);
        this.botaOvo = botaOvo;
        this.temVeneno = temVeneno;
    }

    public void imprimirAnimal() {
        super.imprimirAnimal();
        System.out.println("O animal bota ovo: " + this.botaOvo);
        System.out.println("O animal tem veneno: " + this.temVeneno);
    }
}
