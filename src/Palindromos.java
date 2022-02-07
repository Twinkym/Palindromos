import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        String word1 = askForWord();
        String reversedWord = reverseString(word1);
        showWords(word1);
        compareWords(word1, reversedWord);
    }

    private static String askForWord() {
        System.out.println("Introdueix una paraula:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    private static void showWords(String word1) {
        System.out.println("Paraula: " + word1 );
    }

    private static String reverseString(String word1) {
        String reversedWord = new StringBuilder(word1).reverse().toString();
        return reversedWord;
    }

    private static String compareWords(String word1, String reversedword) {
        if ( word1.equalsIgnoreCase(reversedword)){
            System.out.println("Aquesta paraula es un palindrom!!!!");

        }else{
            System.out.println("Aquesta paraula no es palindrom!!!!");
        }
        return "Gracias por participar";
    }
}
