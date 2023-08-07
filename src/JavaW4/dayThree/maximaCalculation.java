package JavaW4.dayThree;

import java.util.ArrayList;
import java.util.Scanner;

public class maximaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputHistory = new ArrayList<>();

        int sum = 0;
        String userInput;

        System.out.println("Provide me with numbers, anything you can think of!");

        while (!(userInput = scanner.next()).equalsIgnoreCase("q")) {
            int userNum = Integer.parseInt(userInput);
            userInputHistory.add(userNum);
            sum += userNum;
            System.out.println("Provide me with numbers, anything you can think of!");
        }

        System.out.println("Sum of " + userInputHistory + " Total: " + sum);
    }
}
