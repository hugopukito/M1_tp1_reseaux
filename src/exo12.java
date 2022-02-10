public class exo12 {
    public static float f(float ioc) {
        float frenchIndice = (float) 0.074;
        float iocAlphabet = (float) 0.038;

        return (frenchIndice-iocAlphabet)/(ioc-iocAlphabet);
    }
}
