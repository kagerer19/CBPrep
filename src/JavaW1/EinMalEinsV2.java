package JavaW1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class EinMalEinsV2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.println("Welche Reihe soll ausgegeben werden?");
        int value = 1;
        int rowNumber = sc.nextInt ();
        System.out.println(value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
        System.out.println(++value + "x" + rowNumber + "=" + (value * rowNumber));
    }
}
