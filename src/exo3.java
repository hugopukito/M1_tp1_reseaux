public class exo3 {
    static char f(char a, char b) {

        int x = a - 97;
        int y = b - 97;

        x = (x + y) % 26;

        char c = (char) ((char) (x + 97));

        return c;
    }
}
