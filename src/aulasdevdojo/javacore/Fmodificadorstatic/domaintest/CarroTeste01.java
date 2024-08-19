package aulasdevdojo.javacore.Fmodificadorstatic.domaintest;

import aulasdevdojo.javacore.Fmodificadorstatic.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Uno", 500);
        Carro c2 = new Carro("Up Tsi", 400);
        Carro c3 = new Carro("Fusca", 350);

        Carro.velocidadeLimite = 180;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}