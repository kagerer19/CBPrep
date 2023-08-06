package JavaW1;

import java.util.Scanner;

public class BetrunkenV1 {
    public static void main(String[] args) {


        int Beer = 9;
        int Shots = 0;

        if (Beer == 0 && Shots == 0) {
            System.out.println("gar nicht betrunken");
        } else if (Beer + Shots <= 2 ) {
            System.out.println("leicht betrunken");
        } else if (Beer <= 6 && Shots <= 0 ) {
            System.out.println("Du bist betrunken.");
        } else {
            System.out.println("Hoffnungslos betrunken");
        }
    }
}
