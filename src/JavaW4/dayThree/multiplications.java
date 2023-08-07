package JavaW4.dayThree;

import java.util.Scanner;

public class multiplications {
    public static void main(String [] args) {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println("Pick your times table number: ");
        int rowNumber = sc.nextInt ();

        System.out.println("You chose the " + rowNumber + " times table");

        for(int i = 1; i <= 10; i++){
            System.out.println(i + "*" + rowNumber + "=" + (i * rowNumber));

        }
    }
}
