import java.util.HashMap;
import java.util.Map;

public class exo6 {
    public static void f(){
        String s = "abcdefghijklmnopqrstuvwxyzabcdmnoabc";
        char[] c = s.toCharArray();

        Map<String,Integer> comb = new HashMap<>();

        for (int i=3; i <= s.length()/2; i++) {
            for (int j=0; j<s.length(); j++){
                String temp = "";
                for (int k=j; k<i+j && k<s.length(); k++) {
                    temp += c[k];
                }
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

        for (Map.Entry entry : comb.entrySet())
        {
            System.out.println(entry.getKey() + " trouvé " + entry.getValue() + " fois");
        }
    }

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

    private static boolean containsMap (Map<String,Integer> comb, String s) {
        if (comb.containsKey(s)) {
            return true;
        }
        return false;
    }
}
