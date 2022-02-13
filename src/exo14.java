public class exo14 {

    public static String f(String s, int longueur) {

        String temp = "";
        String clef = "";
        char[] c = s.toCharArray();
        char[] f = new char[26];

        for(int i=0; i<26; i++) {
            f[i] = (char) ((char) i + 97);
        }

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
