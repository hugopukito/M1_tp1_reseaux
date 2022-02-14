import java.util.Arrays;

public class exo4 {

    // fonction de chiffrement

    /* In: "test", "abb"
    *  Out: "tftt"       */
    static String f(String text, String clef) {

        String finalText = "";

        // On s'assure que notre texte et la clef sont que des lettres minuscules.
        text = exo2.f(text);
        clef = exo2.f(clef);

        // On transforme nos String en tableau de char.
        char[] a = text.toCharArray();
        char[] b = clef.toCharArray();

        /* Pour chaque char on le chiffre avec la lettre correspondante.
        *  Si la taille de la clef est plus petite que celle du texte,
        *  on va repartir au début de la clef avec un modulo. */
        for (int i = 0; i < a.length; i++){
            finalText += exo3.f(a[i],b[i%(b.length)]);
        }

        /*System.out.println("texte: " + text);
        System.out.println("clef: " + clef);
        System.out.println("texte chiffré: " + finalText);*/

        return finalText;
    }

    // fonction de déchiffrement

    /* In: "tftt", "abb"
     *  Out: "test"       */
    static String f2(String text, String clef) {

        String finalText = "";

        text = exo2.f(text);
        clef = exo2.f(clef);

        char[] a = text.toCharArray();
        char[] b = clef.toCharArray();

        for (int i = 0; i < a.length; i++){
            finalText += exo3.f2(a[i],b[i%(b.length)]);
        }

        /*System.out.println("texte chiffré: " + text);
        System.out.println("clef: " + clef);
        System.out.println("texte déchiffré: " + finalText);*/

        return finalText;
    }
}
