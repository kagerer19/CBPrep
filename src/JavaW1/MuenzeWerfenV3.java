package JavaW1;

import java.util.Scanner;
import java.util.Random;

public class MuenzeWerfenV3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        boolean coin;

        int kopf = 0;
        int zahl = 0;
        int werfen = 0;


        do {
            System.out.println("Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?");
            werfen = sc.nextInt();
        } while (werfen < 1 || werfen > 10 || werfen % 2 == 0);

        for (int i = 1; i <= werfen; i++) {
            coin = random.nextBoolean();
            if (coin) {
                System.out.println("Werfe Münze… Kopf!");
                kopf++;
            } else {
                System.out.println("Werfe Münze… Zahl!");
                zahl++;
            }
        }

        System.out.println("Summe Kopf: " + kopf);
        System.out.println("Summe zahl: " + zahl);

        if (kopf > zahl) {
            System.out.println("Ich bekomme das Ticket.");
        } else if (kopf < zahl) {
            System.out.println("Stefan bekommen das Ticket.");
        } else {
            System.out.println("kein Gewinner, es ist unentschieden");
        }
    }
}