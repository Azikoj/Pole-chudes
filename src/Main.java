import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String soz = "ZHONY";
        char[] word = soz.toCharArray();
        String letter = "";
        char[] lengthOfWord = new char[word.length];
        for (int i = 0; i < lengthOfWord.length; i++) {
            lengthOfWord[i] = '_';
        }
        int chance = 3;

        while(chance > 0) {
            System.out.println("\nThis is your word\"YOU HAVE THREE CHANCES TO GUESS EACH LETTER\"");
            System.out.println(lengthOfWord);
            System.out.print("Guess the letter: ");
            letter = input.next();

            if (soz.contains(letter.toLowerCase()) || soz.contains(letter.toUpperCase())) {
                for (int i = 0; i < soz.length(); i++) {
                    if (soz.charAt(i) == letter.toUpperCase().charAt(0)) {
                        lengthOfWord[i] = letter.toUpperCase().charAt(0);
                    }
                }
                System.out.println("Your guess is RIGHT");
            }
            else {
                chance--;
                System.out.println("Your Guess Is WRONG");
                if (chance == 0) {
                    System.out.println("You have no more chance" + "\nThe word was " + soz);
                    break;
                }else {
                    System.out.println("You have " + chance + " more chances");
                }
            }
        }
    }
}
