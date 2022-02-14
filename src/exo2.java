import java.util.Arrays;

public class exo2 {

    /* In:  Le soleil brille!
    *  Out: lesoleilbrille    */

    static String f(String text) {

        // On mets toute la String en minuscule
        text = text.toLowerCase();

        // on parcours la String et on enlève tout ce qui n'est pas une lettre minuscule
        for (String s : Arrays.asList("[^a-z]", " ")) {
            text = text.replaceAll(s, "");
        }

        return text;
    }
}
