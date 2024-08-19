package aulasdevdojo.javacore.Bintroducaometodos.testedominio;

import aulasdevdojo.javacore.Bintroducaometodos.dominio.SomarArrayComVarArgs;

public class SomarArrayComVarArgsTeste01 {
    public static void main(String[] args) {
        SomarArrayComVarArgs somarArrays = new SomarArrayComVarArgs();
        int[] num1 = {1, 2, 3, 4, 5};

        somarArrays.somarArray(num1);
        somarArrays.somarArrayVarArgs(1, 1, 2, 3, 4, 5, 6, 7);
    }
}
