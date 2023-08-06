package JavaW1;

import java.util.Scanner;

public class EinMalEinsV3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die Rowzahl ein");
        int rowNumber = sc.nextInt();
        System.out.println("Gib die column ein");
        int colNumber = sc.nextInt();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= colNumber; j++) {
                System.out.println(j + "*" + i + "=" + (i * j));
            }
        }
    }
}
