public class exo3 {

    // fonction de chiffrement

    /* In: 'z', 'b'
    *  Out:  'a'    */
    static char f(char a, char b) {

        // On enlève la valeur ascii de nos deux caractères
        int x = a - 97;
        int y = b - 97;

        /*  Si l'addition des deux caractères dépasse la longueur
            de l'alphabet, on revient au début avec un modulo.    */
        x = (x + y) % 26;


        // Puis on peut récupérer la valeur entière et la caster en char.
        char c = (char) ((char) (x + 97));

        return c;
    }

    // fonction de déchiffrement

    /* In: 'a', 'b'
     *  Out:  'z'    */
    static char f2(char a, char b) {

        int x = a - 97;
        int y = b - 97;

        /*  Cette fois on vérifie que la soustraction du déchiffrement ne tombe
            pas en dessous de 0, si c'est le cas on repars de la fin de l'alphabet. */
        if (x-y >= 0) {
            x = (x - y);
        } else {
            x = (x - y) + 26;
        }

        char c = (char) ((char) (x + 97));

        return c;
    }
}
