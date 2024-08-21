package aulasdevdojo.javacore.Fmodificadorstatic.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static { // Bloco de inicialização estático
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        System.out.println();
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
