package JavaW2;

import java.security.PublicKey;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class KinoVerwaltungV1 {
    public static void main(String[] args) {
        String[][] filmInfo = filmBoard();

        double usersMoney;
        int usersChoice;
        int filmIndex;
        int availableSeats;
        double totalCost;
        int ticketsToBuy;

        ArrayList<Integer> movieHistory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("How much money do you have? ");
        usersMoney = Double.parseDouble(scanner.nextLine());

        while (true) {
            showScreen(filmInfo);

            System.out.println("Which (not fully booked) film would you like to see? (0 to cancel) ");
            usersChoice = Integer.parseInt(scanner.nextLine());

            if (usersChoice == 0) {
                break;
            } else if (usersChoice < 1 || usersChoice > filmInfo.length) {
                System.out.println("Invalid choice. Please select a valid film.");
                continue;
            }

            filmIndex = usersChoice - 1;
            if (!filmInfo[filmIndex][3].equals("available")) {
                System.out.println("Sorry, this film is booked. Please choose another");
                continue;
            }

            availableSeats = Integer.parseInt(filmInfo[filmIndex][2]);
            System.out.printf("There are still %d tickets available for €15 each. How many would you like to buy? %n", availableSeats);
            ticketsToBuy = Integer.parseInt(scanner.nextLine());

            if (ticketsToBuy > availableSeats) {
                System.out.println("Not enough seats.");
                continue;
            }

            totalCost = ticketsToBuy * 15;
            if (totalCost > usersMoney) {
                System.out.println("Sorry, you don't have enough money");
                continue;
            }

            usersMoney -= totalCost;
            availableSeats -= ticketsToBuy;
            filmInfo[filmIndex][2] = String.valueOf(availableSeats);
            if (availableSeats == 0) {
                filmInfo[filmIndex][3] = "booked";
            }

            movieHistory.add(usersChoice);
            System.out.printf("You buy %d tickets for %.2f€ and now have %.1f%n", ticketsToBuy, totalCost, usersMoney);
        }

        System.out.println("Thank you for using IMAX");
        System.out.printf("Remaining balance %,.2f€ %n", usersMoney);
        System.out.println("Movies you bought: " + movieHistory);
    }
    public static String[][] filmBoard() {
        return new String[][]{
                {"Batman ", "20:15", "1", "available", "Room 1"},
                {"Matrix ", "22:00", "3", "available", "Room 2"},
                {"Matrix2", "17:00", "0", "booked   ", "Room 3"},
                {"Matrix3", "17:00", "0", "booked   ", "Room 4"},
                {"Matrix3", "17:00", "0", "booked   ", "Room 4"}
        };
    }

    public static void showScreen(String[][] filmInfo) {
        System.out.println("Film number \tFilm name\t\tTime\tRemaining places \tRoom");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < filmInfo.length; i++) {
            System.out.printf("%d.\t\t\t%-10s\t\t%-10s\t%-7s\t%-7s\t%-10s%n", i + 1, filmInfo[i][0], filmInfo[i][1], filmInfo[i][2], filmInfo[i][3], filmInfo[i][4]);
        }
        System.out.println("--------------------------------------------------------------");
    }
}



