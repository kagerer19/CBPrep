package JavaW4.dayTwo;

import java.util.Scanner;

public class freeTimeOrWorkTime {
    public static void main(String[] aargs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check if your request is within out working times or not (Please use 24hr time.)");
        String isWorkTime = sc.nextLine();

        String[] timeArr = isWorkTime.split(":", 2);

        //Store the Hour and Min
        int workTimeHr = Integer.parseInt(timeArr[0]);
        int workTimeMin = Integer.parseInt(timeArr[1]);

        if (workTimeHr >= 8 && workTimeMin >= 30) {
            System.out.println("We are at the office");
        } else if(workTimeHr >= 12 && workTimeHr <= 13) {
            System.out.println("We are on our lunch break");
        } else if(workTimeHr < 15){
            System.out.println("We are at the office");
        } else {
            System.out.println("We are not here right now");
        }
    }
}
