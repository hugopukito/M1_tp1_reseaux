import java.util.Scanner;

public class exo1 {
    static String f(boolean a) {
        String text = "";
        Scanner sc = new Scanner(System.in);
        if (a){
            System.out.println("saisir le texte: ");
        }
        else{
            System.out.println("saisir la clef: ");
        }

        text = sc.nextLine();

        return text;
    }
}
