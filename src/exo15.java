public class exo15 {

    /* In: "BILKO PFFGM LTWOE WJCFD SHKWO NKSEO VUSGR LWHGW FNVKW GGGFN RFHYJ VSGRF RIEKD CCGBH RYSXV KDIJA HCFFG YEFSG ZWG",
            "attaque",
             24
    *  Out: oursour */
    public static String f(String s, String word, int pos) {
        char[] c = s.toCharArray();
        String temp = "";

        for (int i=pos; i<word.length()+pos; i++) {
            temp += c[i];
        }

        s = exo4.f2(temp, word);

        return s;
    }
}
