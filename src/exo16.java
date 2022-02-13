import java.util.ArrayList;

public class exo16 {
    public static ArrayList<String> f(String s, String word) {
        char[] c = s.toCharArray();
        ArrayList<String> clef = new ArrayList<>();

        for (int i=0; i < c.length && i+word.length() <= c.length; i++) {
            String temp = "";
            clef.add(exo15.f(s, word, i));
        }

        return clef;
    }
}
