public class exo11 {

    /* In: "PERTQUDCDJXESCWMPNLVMIQDIZTQFVXAKLRPICCPQSHZYDNCPWEAJWSZGCLMQNRDEOHCGEZTQ
            ZYHELEWAUQFROICWHQMYRRUFGBYQSEPVNEQCSEEQWEEAGDSZDCWEOHYDWQERLMFTCCQUNCPPQ
            SKPYFEQOIOHGPREERWIEFSDMXSYGEUELEHUSNLVGPMFVEIVXSUSJPWHIEYSNLCDWMCRTZMICY
            XMNMFZQASLZQCJPYDSTTKZEPZRECMYWOICYGUESIUGIRCEUTYTIZTJPWHIEYIETYYHUSOFIXE
            SCWHOGDMZSNLVQSQPYJSCAVQSQLMQNRLPQSRLMXLCCGAMKPGQLYLYDAGEHGERCIRAGEIZNMGI
            YBPP"

    *  Out: 0.046 */
    public static float f(String text) {

        text = exo2.f(text);

        /* var test = compte("aozfosndofmozigbmozaibgaoigkznfpgkxmsqfpknfknqsknfpanfnazkf");
        char[] c = new char[26];

        for(int i=0; i<26; i++) {
            c[i] = (char) ((char) i + 97);
        }

        for (int i=0; i<26; i++) {
            System.out.print(c[i] + ": ");
            System.out.println(test[i]);
        } */

        return coincidence(text);
    }

    /* Compte pour chaque lettre le nombre de fois qu'elle apparait dans un texte. */
    public static int[] compte(String text) {
        int[] occ = new int[26];

        for (int i = 0; i < text.length(); i++)
            occ[text.charAt(i) - (int)'a']++;

        return occ;
    }

    /* Calcul la probabilité de trouver deux lettres similaires dans un texte. */
    private static float coincidence(String text) {
        float ic;
        var occ = compte(text);
        float sum = 0;
        for (int j = 0; j < 26; j++) {
            sum += occ[j] * (occ[j] - 1);
        }
        ic = sum / (text.length() * (text.length() - 1));

        String s = String.valueOf(ic);
        s = String.format("%.3f", ic);
        s = s.replace(",", ".");

        return Float.parseFloat(s);
    }
}
