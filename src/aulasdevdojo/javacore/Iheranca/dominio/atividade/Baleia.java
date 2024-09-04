package aulasdevdojo.javacore.Iheranca.dominio.atividade;

public class Baleia extends Mamifero{
    protected boolean aquatico;

    public Baleia(String nome, String cor, int patas, boolean cauda, boolean aquatico) {
        super(nome, cor, patas, cauda);
        this.aquatico = aquatico;
    }

    public void imprimirAnimal() {
        super.imprimirAnimal();
        System.out.println("É aquático: " + this.aquatico);
    }
}
