package JavaW4.dayThree;

import java.util.Random;
import java.util.Scanner;

public class caesarChiffre {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);


        //encryption
        int key = r.nextInt(1, 26);

        System.out.println("Enter something you would like to encrypt: ");
        String textToEncrypt = scanner.nextLine();

        char[] chars = textToEncrypt.toCharArray();

        System.out.println("Your encrypted message is safe with us!");
        System.out.println("---------------------------------------->");
        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                c += key;
                if (c > 'z') {
                    c -= 26;
                }
            } else if (c >= 'A' && c <= 'Z') {
                c += key;
                if (c > 'Z') {
                    c -= 26;
                }
            }
            System.out.print(c);
        }
        System.out.println("\n---------------------------------------->");
    }
}
