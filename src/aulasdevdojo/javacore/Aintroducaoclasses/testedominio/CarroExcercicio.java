package aulasdevdojo.javacore.Aintroducaoclasses.testedominio;

import aulasdevdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExcercicio {
    public static void main(String[] args) {
        Carro carroNovo = new Carro();
        Carro carroVelho = new Carro();

        carroNovo.ano = 2024;
        carroNovo.modelo = "BDS";
        carroNovo.marca = "Aston Martins";
        carroNovo.cor = "Preto";

        carroVelho.ano = 1962;
        carroVelho.modelo = "Cobra 427";
        carroVelho.marca = "Carroll Shelby";
        carroVelho.cor = "Azul escuro";

        System.out.println("------------Carro Novo---------------");
        System.out.println("Marca: " + carroNovo.marca + "\nModelo: " + carroNovo.modelo + "\nAno: " + carroNovo.ano + "\nCor: " + carroNovo.cor);
        System.out.println("------------Carro Velho-------------");
        System.out.println("Marca: " + carroVelho.marca + "\nModelo: " + carroVelho.modelo + "\nAno: " + carroVelho.ano + "\nCor: " + carroVelho.cor);
        System.out.println("------------------------------------");
    }
}
