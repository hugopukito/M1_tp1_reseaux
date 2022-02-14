import java.util.HashMap;
import java.util.Map;

public class exo6 {

    /* In: "abcdefghijklmnopqrstuvwxyzabcdmnoabc"
    *  Out: bcd trouvé 2 fois
            abc trouvé 3 fois
            mno trouvé 2 fois
            abcd trouvé 2 fois */

    public static Map<String,Integer> f(String s){

        // Comme avant, on convertit notre String en tableau de char.
        char[] c = s.toCharArray();

        /* On va vouloir mapper chaque String à un entier,
        *  ici, chaque séquences de 3 lettres ou plus au nombre de fois
        *  qu'elle apparait. */
        Map<String,Integer> comb = new HashMap<>();

        /* On va vouloir partir d'une longueur d'occurence de 3
        *  jusqu'à la moitié de notre string, on ne peut pas retrouver
        *  "abcd" dans "efg" avec pour String "abdcefg". */
        for (int i=3; i <= s.length()/2; i++) {

            /* Ici on va parcourir notre String. */
            for (int j=0; j<s.length(); j++){
                String temp = "";

                /* On pars du caractère de la boucle précèdente pour ne pas
                *  repasser dans la String et on s'arrête à la taille de notre i. */
                for (int k=j; k<i+j && k<s.length(); k++) {
                    temp += c[k];
                }

                /* On va compter le nombre de fois que l'on trouve notre séquence dans la String,
                *  puis on ne garde que les séquences qui apparaissent au moins deux fois.
                *  On va remplir notre map avec toutes les séquences trouvées, si la séquence existe
                *  déjà dans la map, on incrémente son compteur, sinon on l'ajoute. */
                if (temp.length() == i) {
                    int cpt = count(s, temp);
                    if (cpt > 1) {
                        if (containsMap(comb, temp)) {
                            int l = comb.get(temp);
                            comb.replace(temp, l + 1);
                        }
                        else {
                            comb.put(temp,1);
                        }
                    }
                }
            }
        }
        //print(comb);
        return comb;
    }

    // Compte le nombre d'occurence d'une String dans une autre.
    private static int count (String str, String findStr) {
        int lastIndex = 0;
        int cpt = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                cpt++;
                lastIndex += findStr.length();
            }
        }
        return cpt;
    }

    // Permet de savoir si une séquence est dans la map.
    private static boolean containsMap (Map<String,Integer> comb, String s) {
        if (comb.containsKey(s)) {
            return true;
        }
        return false;
    }

    // Affichage des séquences.
    private static void print (Map<String,Integer> comb) {
        for (Map.Entry entry : comb.entrySet())
        {
            System.out.println(entry.getKey() + " trouvé " + entry.getValue() + " fois");
        }
    }
}
