import java.util.*;

public class exo7 {
    public static void f(Map<String, Integer> comb, String s) {

        char[] c = s.toCharArray();
        Map<String, ArrayList<Integer>> dists = new HashMap<>();

        for (String key : comb.keySet()) {
            var temp = distances(s, key);
            System.out.println(distances(s, key));
            dists.put(key, temp.get(key));
        }

        System.out.println(diviseurs(dists));
    }

    private static Map<String, ArrayList<Integer>> distances (String str, String findStr) {
        int lastIndex = 0;
        int dist = 0;
        int cpt = 0;
        ArrayList<Integer> buffer = new ArrayList<>();
        Map<String, ArrayList<Integer>> distanceMap = new HashMap<>();

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

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

        /*while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                cpt++;
                lastIndex += findStr.length();
            }
        }*/

        return distanceMap;
    }

    private static boolean containsMap (Map<String,ArrayList<Integer>> comb, String s) {
        if (comb.containsKey(s)) {
            return true;
        }
        return false;
    }

    private static int diviseurs (Map<String, ArrayList<Integer>> distance) {
        ArrayList<Integer> diviseurMap = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Map.Entry<Integer, ArrayList<Integer>> maxEntry = null;
        int maxSize = 0;
        int n = 0;

        for (Map.Entry m : distance.entrySet()) {
            for (int e : (ArrayList<Integer>) m.getValue()) {
                map.put(e, diviseurMap);
            }
        }

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

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " divisible par " + m.getValue());
            var k = ((ArrayList<Integer>) m.getValue()).size();
            if (maxSize == 0 || k > maxSize)
            {
                maxSize = k;
                maxEntry = m;
            }
        }

        var tempMax = maxEntry.getValue();
        var sizeTempMax = tempMax.size();

        for (int i=0; i<sizeTempMax; i++) {
            for (Map.Entry m : map.entrySet()) {
                var temp = (ArrayList<Integer>) m.getValue();
                tempMax.retainAll(temp);
            }
        }

        for (Integer i : tempMax) {
            System.out.println(i);
        }

        return 0;
    }
}
