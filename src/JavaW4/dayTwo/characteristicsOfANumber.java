package JavaW4.dayTwo;

import java.util.Random;
import java.util.Scanner;

public class characteristicsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int luckyNumber = rand.nextInt(100);

        System.out.println("Pick a number: ");
        double numberToRead = sc.nextDouble();


        //Compare user num to lucky num
        System.out.println("-----------------------------------------");
        if (luckyNumber == numberToRead) {
            System.out.println("Your number is equal to the lucky number WOW!");
        } else {
            System.out.println("This is your lucky Number: " + luckyNumber);
        }


        //*********
        //Is round number
        System.out.println("-----------------------------------------");
        if (numberToRead % 1 == 0) {
            if (numberToRead % 2 == 0) {
                System.out.println("This number is round");
            } else {
                System.out.println("This is not a round number");
            }
        }

        // check if number is even
        System.out.println("-----------------------------------------");
        if (numberToRead % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is a odd number");
        }


        //*********
        //check is number has two digits
        System.out.println("-----------------------------------------");
        if (numberToRead >= 10 && numberToRead < 100) {
            System.out.println("It has two digits");
        }
        System.out.println();
    }
}
