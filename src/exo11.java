public class exo11 {
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
        }*/

        return coincidence(text);
    }

    public static int[] compte(String ligne) {
        int[] occ = new int[26];

        for (int i = 0; i < ligne.length(); i++)
            occ[ligne.charAt(i) - (int)'a']++;

        return occ;
    }

    private static float coincidence(String ligne) {
        float ic;
        var occ = compte(ligne);
        float sum = 0;
        for (int j = 0; j < 26; j++) {
            sum += occ[j] * (occ[j] - 1);
        }
        ic = sum / (ligne.length() * (ligne.length() - 1));

        String s = String.valueOf(ic);
        s = String.format("%.3f", ic);
        s = s.replace(",", ".");

        return Float.parseFloat(s);
    }
}
