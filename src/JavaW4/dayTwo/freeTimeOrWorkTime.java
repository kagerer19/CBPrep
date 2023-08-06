package JavaW4.dayTwo;

import java.util.Scanner;

public class freeTimeOrWorkTime {
    public static void main(String [] aargs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check if your request is within out working times or not (Please use 24hr time.)");
        double isWorkTime = sc.nextDouble();

        if (isWorkTime < 13.60 && isWorkTime > 12.60) {
            System.out.println("This is lunch time for us");
        } else {
            System.out.println("This is not a very good time");
        }

    }
}
