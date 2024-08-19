package aulasdevdojo.javacore.Eblocosinicializacao.dominioteste;

import aulasdevdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodios : anime.getEpisodios()) {
            if (episodios == 51) {
                System.out.println();
            }

            System.out.print(episodios + " ");
        }
    }
}
