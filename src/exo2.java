import java.util.Arrays;

public class exo2 {

    static String f(String text) {
        text = text.toLowerCase();
        for (String s : Arrays.asList("[^a-z]", " ")) {
            text = text.replaceAll(s, "");
        }

        return text;
    }
}
