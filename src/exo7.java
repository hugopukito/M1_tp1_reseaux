import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class exo7 {
    public static void f(Map<String, Integer> comb, String s) {

        char[] c = s.toCharArray();
        Map<String, ArrayList<Integer>> dists = new HashMap<>();

        for (String key : comb.keySet()) {
            var temp = distances(s, key);
            //System.out.println(distances(s, key));
            dists.put(key, temp.get(key));
        }

        diviseurs(dists);
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
            else {
                dist = lastIndex;
            }

            if (lastIndex != -1) {
                cpt++;
                lastIndex += findStr.length();
            }
        }
        return distanceMap;
    }

    private static boolean containsMap (Map<String,ArrayList<Integer>> comb, String s) {
        if (comb.containsKey(s)) {
            return true;
        }
        return false;
    }

    private static ArrayList<Integer> diviseurs (Map<String, ArrayList<Integer>> distance) {
        ArrayList<Integer> diviseurMap = null;

        for (Map.Entry m : distance.entrySet()) {
            System.out.println(m.getValue());
        }

        return diviseurMap;
    }
}
