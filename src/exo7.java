import java.util.*;

public class exo7 {

    /*  In: "kqowefvjpujuunukglmekjinmwuxfqmkjbgwrlfnfghudwuumbsvlpsncmuekqc" +
                "teswreekoyssiwctuaxyotapxplwpntcgojbgfqhtdwxizaygffnsxcs" +
                "eynctsspntujnytggwzgrwuunejuuqeapymekqhuiduxfpguytsmtffshnuocz" +
                "gmruweytrgkmeedctvrecfbdjqcuswvbpnlgoylskmtefvjjtwwmfmwpnmemtmhrspxf" +
                "sskffstnuoczgmdoeoyeekcpjrgpmurskhfrseiuevgoycwxizaygosaanydoeoyjlwunham" +
                "ebfelxyvlwnojnsiofrwucceswkvidgmucgocruwgnmaaffvnsiudekqhceucpfcmpvsudgav" +
                "emnymamvlfmaoyfntqcuafvfjnxklneiwcwodcculwriftwgmuswovmatnybuhtcocwfytnmgyt" +
                "qmkbbnlgfbtwojftwgntejkneedcldhwtvbuvgfbijg"

    *   Out: 65 divisible par [1, 5, 13]
        130 divisible par [1, 2, 5, 10, 13, 26]
        35 divisible par [1, 5, 7]
        260 divisible par [1, 2, 4, 5, 10, 13, 20, 26, 52, 65]
        135 divisible par [1, 3, 5, 9, 15, 27, 45]
        200 divisible par [1, 2, 4, 5, 8, 10, 20, 25, 40, 50]
        75 divisible par [1, 3, 5, 15, 25]
        235 divisible par [1, 5, 47]
        300 divisible par [1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 25, 30, 50, 60, 75, 100]
        45 divisible par [1, 3, 5, 9, 15]
        205 divisible par [1, 5, 41]
        175 divisible par [1, 5, 7, 25, 35]
        80 divisible par [1, 2, 4, 5, 8, 10, 16, 20]
        145 divisible par [1, 5, 29]
        280 divisible par [1, 2, 4, 5, 7, 8, 10, 14, 20, 28, 35, 40, 56, 70]
        440 divisible par [1, 2, 4, 5, 8, 10, 11, 20, 22, 40, 44, 55, 88, 110]
        90 divisible par [1, 2, 3, 5, 6, 9, 10, 15, 18, 30]
        220 divisible par [1, 2, 4, 5, 10, 11, 20, 22, 44, 55]
        125 divisible par [1, 5, 25]
        190 divisible par [1, 2, 5, 10, 19, 38]
        30 divisible par [1, 2, 3, 5, 6, 10]
        350 divisible par [1, 2, 5, 7, 10, 14, 25, 35, 50, 70]
        95 divisible par [1, 5, 19]

        longueur clef trouvée: 5 */
    public static int f(Map<String, Integer> comb, String s) {

        char[] c = s.toCharArray();

        /* On va créer une map qui va mapper une séquence avec une liste de distances.
        *  Donc on va mapper une String avec une liste d'entiers. */
        Map<String, ArrayList<Integer>> dists = new HashMap<>();

        /* Pour chaque ligne de notre map de l'exo6, on va calculers les distances
        *  entre chaque séquence. */
        for (String key : comb.keySet()) {
            var temp = distances(s, key);
            //System.out.println(distances(s, key));

            // On ajoute la liste des distance pour chaque séquence dans notre map.
            dists.put(key, temp.get(key));
        }

        // on récupère la longueur de la clef.
        int longueur = 0;

        try {
            longueur = diviseurs(dists);
        } catch (Exception e) {
            System.out.println("Pas de diviseur commun trouvé pour la longueur de la clef");
        }

        //System.out.println("longueur clef trouvée: " + longueur);

        return longueur;
    }

    /* Renvoie une map avec pour chaque séquence sa liste de distances. */
    private static Map<String, ArrayList<Integer>> distances (String str, String findStr) {

        int lastIndex = 0;
        int dist = 0;
        int cpt = 0;

        /* Permet de stocker la liste des distances entre les séquences. */
        ArrayList<Integer> buffer = new ArrayList<>();

        /* Permet de stocker le mappage des séquences avec la ou leurs distances. */
        Map<String, ArrayList<Integer>> distanceMap = new HashMap<>();

        /* On parcours La string avec la séquence recherchée. */
        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            /* Quand on a trouvé au moins 1 fois la séquence on va garder
            *  la distance entre elle-même et la prochaine trouvée et l'ajouter à notre
            *  liste distance puis l'ajouter à notre map pour cette séquence avec toutes
            *  ses distances. */
            if (cpt >= 1 && lastIndex != -1) {
                dist = lastIndex - dist;
                buffer.add(dist);
                distanceMap.put(findStr,buffer);
            }

            dist = lastIndex;

            if (lastIndex != -1) {
                cpt++;
                lastIndex += findStr.length();
            }
        }

        return distanceMap;
    }

    // Permet de savoir si une séquence est dans la map.
    private static boolean containsMap (Map<String,ArrayList<Integer>> comb, String s) {
        if (comb.containsKey(s)) {
            return true;
        }
        return false;
    }

    /* Renvoie la longueur de la clef en gardant l'intersection de tous nos diviseurs
    *  pour chaque listes de distances. (la valeur présente dans toutes nos listes
    *  de diviseurs sera la longueur de la clef). */
    private static int diviseurs (Map<String, ArrayList<Integer>> distance) {

        /* Liste simple d'entier qui correspond à des diviseurs. */
        ArrayList<Integer> diviseurMap = new ArrayList<>();

        /* Stocke pour chaque distance une liste de diviseurs. */
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        /* Stocke la distance avec le plus grand nombre de diviseurs. */
        Map.Entry<Integer, ArrayList<Integer>> maxEntry = null;

        int maxSize = 0;
        int n = 0;

        /* Boucle qui copie la map pris en paramètre dans une autre map */
        for (Map.Entry m : distance.entrySet()) {
            for (int e : (ArrayList<Integer>) m.getValue()) {
                map.put(e, diviseurMap);
            }
        }

        /* Boucle qui va remettre à 0 notre liste de diviseurs et calculer
        *  tous les diviseurs possibles pour chaque distance. */
        for (Integer key : map.keySet()) {
            diviseurMap = new ArrayList<>();
            n = key;
            for (int i=1; i < n/2; i++) {
                if (n % i == 0) {
                    diviseurMap.add(i);
                    map.put(key, diviseurMap);
                }
            }
        }

        /* Récupère la ligne de la distance qui a le plus grand nombre de diviseurs. */
        for (Map.Entry m : map.entrySet()) {
            //System.out.println(m.getKey() + " divisible par " + m.getValue());
            var k = ((ArrayList<Integer>) m.getValue()).size();
            if (maxSize == 0 || k > maxSize)
            {
                maxSize = k;
                maxEntry = m;
            }
        }

        var tempMax = maxEntry.getValue();
        var sizeTempMax = tempMax.size();

        /* Fais l'intersection entre tous nos diviseurs par distance et va donc garder
        *  le diviseur commun. */
        for (int i=0; i<sizeTempMax; i++) {
            for (Map.Entry m : map.entrySet()) {
                var temp = (ArrayList<Integer>) m.getValue();
                tempMax.retainAll(temp);
            }
        }

        /* Enlève la valeur '1' à nos diviseurs commun. */
        tempMax.remove(new Integer(1));

        return tempMax.get(0);
    }
}
