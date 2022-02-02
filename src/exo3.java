public class exo3 {
    public exo3(char a, char b) {
        // a 97 et z 122

        int x = a - 97;
        int y = b - 97;

        x = (x + y) % 26;

        char c = (char) ((char) (x + 97));
        System.out.println(c);
    }
}
