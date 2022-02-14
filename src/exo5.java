public class exo5 {

    /* In:
       saisir le texte:
       tftt
       saisir la clef:
       abb

       Out:
       test */
    static String f(){
        String text = exo1.f(true);
        String clef = exo1.f(false);

        return exo4.f2(text, clef);
    }
}
