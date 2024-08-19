package aulasdevdojo.javacore.Dconstrutores.testedominio;

import aulasdevdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Charlotte", "Mistério", 12, 1);
        Anime anime1 = new Anime();

//        anime.init("Charlotte", "Mistério", 12, 1);
        anime.imprime();
        System.out.println("---------------");
        anime1.imprime();
    }
}
