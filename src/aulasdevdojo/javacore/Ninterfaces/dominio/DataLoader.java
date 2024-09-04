package aulasdevdojo.javacore.Ninterfaces.dominio;

public interface DataLoader {
    int LIMIT_DATA = 99; // Atributos são estáticos e públicos

    void load(); // Os métodos são publico e abstratos por padrão

    default void checkPermission() { // Default faz métodos não abstratos
        System.out.println("Checando permissões do servidor");
    }

    static void showLIMIT_DATA() {
        System.out.println("Limite de dados: " + DataLoader.LIMIT_DATA);
    }
}
