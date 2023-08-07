package JavaW4.dayFour;

import java.util.Scanner;

public class leetspeak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] leetMap = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};
        String leetSpeakPhrase = "";

        System.out.println("Enter the phrase you would like to leet: ");
        String textToEncrypt = scanner.nextLine().toUpperCase();

        for (int i = 0; i < textToEncrypt.length(); i++) {
            char temp = textToEncrypt.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (temp == alphabet[j]) {
                    leetSpeakPhrase += leetMap[j];
                }
            }
        }
        System.out.println(leetSpeakPhrase);
    }
}
