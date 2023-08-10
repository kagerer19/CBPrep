package JavaW4.dayFour;

import java.util.HashMap;
import java.util.Scanner;
public class leetSpeakV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Character> leetMap = new HashMap<>();

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] leetChars = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};
        StringBuilder leetSpeakPhrase = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            leetMap.put(alphabet[i], leetChars[i]);
        }

        System.out.println("Enter the phrase you would like to leet: ");
        String textToEncrypt = scanner.nextLine().toUpperCase();

        for (int i = 0; i < textToEncrypt.length(); i++) {
            char temp = textToEncrypt.charAt(i);
            if (leetMap.containsKey(temp)) {
                leetSpeakPhrase.append(leetMap.get(temp));
            } else {
                leetSpeakPhrase.append(temp);
            }
        }
        System.out.println(leetSpeakPhrase);
    }
}
