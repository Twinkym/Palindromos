import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        String word1 = askForWord();
        String word2 = askForWord2();
        showWords(word1, word2);
        comparewords();
    }




    private static String askForWord() {
        System.out.println("Introdueix una paraula:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    private static String askForWord2() {
        System.out.println("Introdueix un altra paraula:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void showWords(String word1, String word2) {
        System.out.println("Primera paraula: " + word1 );
        System.out.println("Segona paraula: " + word2);
    }

    private static void comparewords() {

    }
}
