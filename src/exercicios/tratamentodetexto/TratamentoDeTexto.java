package exercicios.tratamentodetexto;

/*
 [] Apaga que tiver dentro
 */

public class TratamentoDeTexto {
    public static void main(String[] args) {
        String texto = "Daniel [Miranda] Soares\0";

        int i = 0;
        while (texto.charAt(i) != '\0') {

            i++;
        }

        System.out.println(i);
    }
}
