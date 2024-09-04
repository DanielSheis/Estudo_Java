package aulasdevdojo.javacore.Kmodificadorfinal.dominioteste;

import aulasdevdojo.javacore.Kmodificadorfinal.dominio.Carro;
import aulasdevdojo.javacore.Kmodificadorfinal.dominio.Comprador;
import aulasdevdojo.javacore.Kmodificadorfinal.dominio.Lamborghini;

public final class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Lamborghini lamborghini = new Lamborghini("Veneno Roadster");

        carro.getCOMPRADOR().setNome("Daniel Miranda");
        System.out.println(carro.getCOMPRADOR());
        lamborghini.imprime();
    }
}
