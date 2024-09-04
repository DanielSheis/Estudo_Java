package aulasdevdojo.javacore.Ninterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando arquivos");
    }

    @Override
    public void removeData() {
        System.out.println("Removendo arquivos");
    }

    @Override
    public void checkPermission() { // Default faz métodos não abstratos
        System.out.println("Checando permissões do servidos de arquivos");
    }
}
