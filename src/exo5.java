public class exo5 {

    static void f(){
        String text = exo1.f(true);
        String clef = exo1.f(false);

        //chiffrement
        /*exo4.f(text, clef);*/

        // déchiffrement
        exo4.f2(text, clef);
    }
}
