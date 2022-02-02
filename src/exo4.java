public class exo4 {
    public exo4(String text, String clef) {

        text.replaceAll(" ", "");
        clef.replaceAll(" ", "");

        if (text.length() == clef.length()) {

            for (String i : text){

            }
        }
    }

    public String convertLetter(char a, char b) {
        // a 97 et z 122

        int x = a - 97;
        int y = b - 97;

        x = (x + y) % 26;

        char c = (char) ((char) (x + 97));
        return String.valueOf(c);
    }
}
