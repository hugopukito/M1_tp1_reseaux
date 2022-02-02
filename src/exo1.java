import java.util.Scanner;

public class exo1 {
    String text = "";

    public exo1() {
        this.text = text;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir du texte");
        text = sc.nextLine();
        System.out.println(text);
    }
}
