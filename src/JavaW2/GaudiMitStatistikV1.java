package JavaW2;

import java.util.ArrayList;

public class GaudiMitStatistikV1 {
    public static void main(String args[]) {
        int capitalLetters = 0;
        int lowerCaseLetter = 0;
        int numbers = 0;
        int otherCharacters = 0;

        char[] chars = "Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!".toCharArray();

        // change String to array of chr to check uppercase, lowercase and other



        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                capitalLetters++;
            } else if (Character.isLowerCase(chars[i])) {
                lowerCaseLetter++;
            } else if (Character.isDigit(chars[i])) {
                numbers++;
            } else {
                otherCharacters++;
            }
        }

        otherCharacters =  chars.length - capitalLetters - lowerCaseLetter - numbers;

        // Output
        System.out.println("Großbuchstaben: " + capitalLetters);
        System.out.println("Kleinbuchstaben: " + lowerCaseLetter);
        System.out.println("Sonstige Zeichen: " + otherCharacters);
        System.out.println("Zahlen: " + numbers);
    }
}
