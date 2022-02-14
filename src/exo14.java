public class exo14 {

    /* In: "kqowefvjpujuunukglmekjinmwuxfqmkjbgwrlfnfghudwuumbsvlpsncmuekqc" +
                "teswreekoyssiwctuaxyotapxplwpntcgojbgfqhtdwxizaygffnsxcs" +
                "eynctsspntujnytggwzgrwuunejuuqeapymekqhuiduxfpguytsmtffshnuocz" +
                "gmruweytrgkmeedctvrecfbdjqcuswvbpnlgoylskmtefvjjtwwmfmwpnmemtmhrspxf" +
                "sskffstnuoczgmdoeoyeekcpjrgpmurskhfrseiuevgoycwxizaygosaanydoeoyjlwunham" +
                "ebfelxyvlwnojnsiofrwucceswkvidgmucgocruwgnmaaffvnsiudekqhceucpfcmpvsudgav" +
                "emnymamvlfmaoyfntqcuafvfjnxklneiwcwodcculwriftwgmuswovmatnybuhtcocwfytnmgyt" +
                "qmkbbnlgfbtwojftwgntejkneedcldhwtvbuvgfbijg"

       Out: souventpoursamuserleshommesdequipageprennentdesalbatrosvastesoiseauxdesmersquisuivent
            indolentscompagnonsdevoyagelenavireglissantsurlesgouffresamersapeinelesontilsdeposess
            urlesplanchesquecesroisdelazurmaladroitsethonteuxlaissentpiteusementleursgrandesailes
            blanchescommedesavironstraineracotedeuxcevoyageurailecommeilestgaucheetveuleluinaguer
            esibeauquilestcomiqueetlaidlunagacesonbecavecunbrulegueulelautremimeenboitantlinfirme
            quivolaitlepoeteestsemblableauprincedesnueesquihantelatempeteetseritdelarcherbaudelai
            re  */

    public static String f(String s, int longueur) {

        String temp = "";
        String clef = "";

        char[] c = s.toCharArray();
        char[] f = new char[26];

        for(int i=0; i<26; i++) {
            f[i] = (char) ((char) i + 97);
        }

        /* On va regrouper la String en plusieurs découpe.
        *  Selon la longueur de la clef, on va récupérer chaque caractère et le mettre
        *  dans un tableau selon sa position dans la chaîne, le 1er tableau aura le 1er, le 6eme
        *  le 11eme... le deuxième aura le 2eme, le 7eme, le 12eme... pour une longueur de clef de 5.
        *  Après cela on va décaler la lettre trouver selon la langue utilisé. */
        for (int i=1; i <= longueur; i++) {
            for (int j=i-1; j < c.length; j+=longueur) {
                    temp += c[j];
            }
            int[] count;
            //System.out.println(temp);
            count = exo11.compte(temp);
            char max = max(count);
            //System.out.println(max);
            clef += shift(max);
            //System.out.println(clef);

            /*for (int k=0; k<26; k++) {
                System.out.print(f[k] + ": ");
                System.out.println(count[k]);
            }*/

            temp = "";
        }

        return exo4.f2(s, clef);
    }

    /* Récupère le caractère le plus trouvé. */
    private static char max (int[] count) {

        int max = 0;
        int maxIndex = 0;

        for (int i=0; i<count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }

        return (char) ((char) maxIndex + 97);
    }

    /* Permet de décaler le caractère trouvé le plus souvent dans un tableau de 4
    *  car la lettre la plus fréquente dans la langue française est le 'e'. */
    private static char shift (char c) {
        int x = c - 97;

        if (x-4 >= 0) {
            x = (x - 4);
        } else {
            x = (x - 4) + 26;
        }

        return (char) ((char) (x + 97));
    }
}
