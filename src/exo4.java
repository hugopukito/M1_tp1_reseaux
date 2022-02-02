public class exo4 {
    public exo4(String text, String clef) {

        String finalText = "";

        text.replaceAll(" ", "");
        clef.replaceAll(" ", "");

        char[] a = text.toCharArray();
        char[] b = clef.toCharArray();

        if (text.length() == clef.length()) {

            for (int i = 0; i < a.length; i++){
                finalText += convertLetter(a[i],b[i]);
            }
        }
        System.out.println(finalText);
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
