package aulasdevdojo.javacore.Ninterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados");
    }

    @Override
    public void removeData() {
        System.out.println("Removendo dados");
    }

    @Override
    public void checkPermission() { // Default faz métodos não abstratos
        System.out.println("Checando permissões do servidos de dados");
    }
}
