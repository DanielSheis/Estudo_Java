package aulasdevdojo.javacore.Csobrecargametodo.testedominio;

import aulasdevdojo.javacore.Csobrecargametodo.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Charlotte", "Mistério", 12, 1);
        anime.imprime();
    }
}
