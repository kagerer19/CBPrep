package JavaW3;

import java.util.Scanner;

public class RPGV1 {
    public static void main(String[] args) {
        String[][] choices = {
                // {parentID, ID, choiceTxt, resultTxt, moveToID }
                {"-1", "0", "", "You are standing in a bar."},

                {"0", "1", "Go into the wild", "You have arrived in the wild.", "1"},
                {"0", "2", "Have a drink", "You're enjoying a drink", "0"},

                {"1", "3", "Fight the monster", "The monster is a tough opponent, but you defeat it.", "1"},
                {"1", "4", "Run from the monster", "You run like a coward back to the bar.", "0"},
        };

        Scanner sc = new Scanner(System.in);
        int selections = 0;
        String resultText = choices[selections][3];

        do {
            System.out.println();
            System.out.println(resultText);
            System.out.println("----------------------------------------------------");
            for (String[] choice : choices) {
                int parentID = Integer.parseInt(choice[0]);
                if (parentID == selections) {
                    System.out.printf("%s  %s \n", choice[1], choice[2]);
                }
            }
            System.out.println("----------------------------------------------------");

            System.out.println();
            System.out.println("What would you like to do?");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid choice number.");
                sc.next();
            }
            int input = sc.nextInt();

            boolean validChoice = false;
            for (String[] choice : choices) {
                int parentID = Integer.parseInt(choice[0]);
                int ID = Integer.parseInt(choice[1]);
                if (parentID == selections && ID == input) {
                    validChoice = true;
                    resultText = choice[3];
                    if (choice.length == 5) {
                        selections = Integer.parseInt(choice[4]);
                        break;
                    }
                }
            }

            if (!validChoice) {
                System.out.println("Invalid choice. Please enter a valid choice number.");
            } else {
                System.out.println(resultText);
            }
        } while (true);
    }
}
