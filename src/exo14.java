public class exo14 {

    static float[] alphabet = {
            9.42F, 1.02F, 2.64F, 3.39F, 15.87F, 0.95F, 1.04F, 0.77F, 8.41F, 0.89F, 0.00F, 5.34F, 3.24F,
            7.15F, 5.14F, 2.86F, 1.06F, 6.46F, 7.90F, 7.26F, 6.24F, 2.15F, 0.00F, 0.30F, 0.24F, 0.32F
    };

    public static String f(String s, int longueur) {

        char[] c = s.toCharArray();

        for (int i=1; i <= longueur; i++) {
            for (int j=i-1; j < c.length; j+=longueur) {
                try{
                    System.out.print(c[j]);
                } catch (Exception e) {

                }
            }
            System.out.println();
        }

        return "";
    }
}
