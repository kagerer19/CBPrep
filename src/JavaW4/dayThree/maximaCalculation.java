package JavaW4.dayThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class maximaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputHistory = new ArrayList<>();

        String userInput;

        System.out.println("Provide me with numbers, anything you can think of!");

        while (!(userInput = scanner.next()).equalsIgnoreCase("q")) {
            int userNum = Integer.parseInt(userInput);
            userInputHistory.add(userNum);
            System.out.println("Provide me with numbers, anything you can think of!");
        }
        if (Collections.max(userInputHistory) > 0) {
            System.out.println("Your history " + userInputHistory + " Max number: " + Collections.max(userInputHistory));
        } else if(Collections.max(userInputHistory) < 0) {
            System.out.println("Your history " + userInputHistory + " Max number: " + Collections.min(userInputHistory));
        }
    }
}
