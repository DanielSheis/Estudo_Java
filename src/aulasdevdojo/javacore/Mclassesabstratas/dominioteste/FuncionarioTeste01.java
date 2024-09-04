package aulasdevdojo.javacore.Mclassesabstratas.dominioteste;

import aulasdevdojo.javacore.Mclassesabstratas.dominio.Cto;
import aulasdevdojo.javacore.Mclassesabstratas.dominio.Desenvolvedor;
import aulasdevdojo.javacore.Mclassesabstratas.dominio.RelancaoHumana;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Cto cto = new Cto("Luffy", 40000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Franky", 23000);
        RelancaoHumana rh = new RelancaoHumana("Robin", 9000);

        System.out.println(cto);
        System.out.println(desenvolvedor);
        System.out.println(rh);

        System.out.println();

        cto.imprime();
        desenvolvedor.imprime();
        rh.imprime();
    }
}
