package aulasdevdojo.javacore.Ninterfaces.dominioteste;

import aulasdevdojo.javacore.Ninterfaces.dominio.DataLoader;
import aulasdevdojo.javacore.Ninterfaces.dominio.DataBaseLoader;
import aulasdevdojo.javacore.Ninterfaces.dominio.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        System.out.println();

        dataBaseLoader.removeData();
        fileLoader.removeData();

        System.out.println();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println();

        DataLoader.showLIMIT_DATA();
    }
}
