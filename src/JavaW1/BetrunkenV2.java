package JavaW1;

import java.util.Scanner;

public class BetrunkenV2 {
    public static void main(String[] args) {
        boolean license = true;
        int age = 17;
        int beer = 9;
        int shots = 0;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Wie alt bist du?");
        age = sc.nextInt();

        System.out.println("Hast du deinen Führerschein dabei?");
        license = sc.nextBoolean();

        System.out.println("Wie viel Bier hast du getrunken?");
        beer = sc.nextInt();

        System.out.println("Wie viel Shots hast du getrunken?");
        shots = sc.nextInt();


        if (beer + shots == 0 && license == true && age >= 17) {
            System.out.println("Du darfst Auto fahren");
        } else if (beer + shots <= 2 && license == true && age >= 19) {
            System.out.println("Du darfst Auto fahren");
        } else {
            System.out.println("Du bist zu jung, du darfst nicht fahren.");
        }
    }
}
