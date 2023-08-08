package JavaW4.dayTwo;

import java.util.Scanner;

public class freeTimeOrWorkTime {
    public static void main(String[] aargs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check if your request is within out working times or not");
        String isWorkTime = sc.nextLine();

        int time = Integer.parseInt(isWorkTime);

        if ((time >= 8 && time < 12) || (time >= 13 && time <= 16)) {
            if (time <= 12) {
                System.out.println("We are in the office");
            } else {
                System.out.println("We are in the office");
            }

        } else if ((time == 12)) {
            System.out.println("We are on lunch break");

        } else {
            System.out.println("This is our free time");
        }
    }
}
