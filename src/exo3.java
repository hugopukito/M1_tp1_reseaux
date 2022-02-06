public class exo3 {

    // fonction de chiffrement
    static char f(char a, char b) {

        int x = a - 97;
        int y = b - 97;

        x = (x + y) % 26;

        char c = (char) ((char) (x + 97));

        return c;
    }

    // fonction de déchiffrement
    static char f2(char a, char b) {

        int x = a - 97;
        int y = b - 97;

        if (x-y >= 0) {
            x = (x - y);
        } else {
            x = (x - y) + 26;
        }

        char c = (char) ((char) (x + 97));

        return c;
    }
}
