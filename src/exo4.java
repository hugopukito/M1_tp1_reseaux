import java.util.Arrays;

public class exo4 {
    static void f(String text, String clef) {

        String finalText = "";

        text = exo2.f(text);
        clef = exo2.f(clef);

        char[] a = text.toCharArray();
        char[] b = clef.toCharArray();

        for (int i = 0; i < a.length; i++){
            finalText += exo3.f(a[i],b[i%(b.length)]);
        }

        System.out.println("texte: " + text);
        System.out.println("clef: " + clef);
        System.out.println("texte chiffré: " + finalText);
    }
}
