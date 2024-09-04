package aulasdevdojo.javacore.Iheranca.dominioteste.atividade;

import aulasdevdojo.javacore.Iheranca.dominio.atividade.Baleia;
import aulasdevdojo.javacore.Iheranca.dominio.atividade.Onitorrinco;
import aulasdevdojo.javacore.Iheranca.dominio.atividade.Vaca;

public class Animals {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Vaca", "Malhada", 4, true);
        Baleia baleia = new Baleia("baleia", "Azul acizentado", 0, false, true);
        Onitorrinco onitorrinco = new Onitorrinco("onitorrinco", "Verde", 4, true, true, true);

        vaca.imprimirAnimal();
        System.out.println("--------------------------------");

        baleia.imprimirAnimal();
        System.out.println("--------------------------------");

        onitorrinco.imprimirAnimal();
        System.out.println("--------------------------------");
    }
}
