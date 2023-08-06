package JavaW1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaschenrechnerV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println("Gib die erste Zahl ein");
        int a = sc.nextInt();

        System.out.println("Gib die zweite Zahl ein");
        int b = sc.nextInt();

        System.out.println("Gib den Operator (+, -, *, /, %) ein:");
        sc.nextLine();

        char operator = sc.nextLine().charAt(0);


        switch (operator) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;

            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;

            case '*':
                System.out.println(a + "+" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "+" + b + "=" + ((double)a / b));
                break;

            case '%':
                System.out.println(a + "+" + b + "=" + (a % b));
                break;

            default:
                System.out.println("--");

        }
    }

    public static class KinoV2 {
        public static void main(String[] args) {
            double money;
            int choice;
            int chosenIndex;
            int availableSeats;
            double totalCost;



            String[][] movies = {
                    {"Batman ", "20:15", "1", "available", "Room 1"},
                    {"Matrix ", "22:00", "3", "available", "Room 2"},
                    {"Matrix2", "17:00", "2", "booked", "Room 3"},
                    {"Matrix3", "17:00", "2", "booked", "Room 4"}
            };

            ArrayList<Integer> chosenMovies = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("How much money do you have? ");
            money = Double.parseDouble(scanner.nextLine());

            while (true) {
                // Display movies
                System.out.println("Film number \tFilm name\t\tTime\tRemaining places \tRoom");
                System.out.println("--------------------------------------------------------------");
                for (int i = 0; i < movies.length; i++) {
                    System.out.printf("%d.\t\t\t%-10s\t\t%-10s\t%-7s\t%-7s\t%-10s%n", i + 1, movies[i][0], movies[i][1], movies[i][2], movies[i][3], movies[i][4]);
                }
                System.out.println("--------------------------------------------------------------");

                System.out.println("Which (not fully booked) film would you like to see? (0 to cancel) ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) {
                    break;
                } else if (choice < 1 || choice > movies.length) {
                    System.out.println("Invalid choice. Please select a valid film number.");
                    continue;
                }

                chosenIndex = choice - 1;
                if (!movies[chosenIndex][3].equals("available")) {
                    System.out.println("Sorry, the selected film is booked. Please choose another film.");
                    continue;
                }

                availableSeats = Integer.parseInt(movies[chosenIndex][2]);
                System.out.printf("There are still %d tickets available for €15 each. How many would you like to buy? %n", availableSeats);
                int ticketsToBuy = Integer.parseInt(scanner.nextLine());

                if (ticketsToBuy > availableSeats) {
                    System.out.println("Not enough seats available. Please choose a lower number of tickets.");
                    continue;
                }

                totalCost = ticketsToBuy * 15;
                if (totalCost > money) {
                    System.out.println("Sorry, you don't have enough money to buy these tickets.");
                    continue;
                }

                money -= totalCost;
                availableSeats -= ticketsToBuy;
                movies[chosenIndex][2] = String.valueOf(availableSeats);
                if (availableSeats == 0) {
                    movies[chosenIndex][3] = "booked";
                }

                chosenMovies.add(choice);
                System.out.printf("You buy %d tickets for %.2f€ and now have %.1f€%n", ticketsToBuy, totalCost, money);
            }

            System.out.println("Thank you for using the cinema program!");
            System.out.printf("Remaining balance %,.2f€ %n", money);
            System.out.println("Movies you bought: " + chosenMovies.toString());
        }
    }
}
