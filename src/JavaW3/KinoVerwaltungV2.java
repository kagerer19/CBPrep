package JavaW3;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class KinoVerwaltungV2 {
    public static void main(String[] args) {
        String[][] filmInfo = filmBoard();
        String[][] snackInfo = snackBoard();

        double usersMoney;
        double totalCost;
        int usersChoice;
        int usersMenuChoice;
        int snackIndex;
        int filmIndex;
        int availableSnacks;
        int availableSeats;
        int snacksToBuy;
        int ticketsToBuy;

        ArrayList<Integer> snackHistory = new ArrayList<>();
        ArrayList<Integer> movieHistory = new ArrayList<>();
        ArrayList<String> snackInventory = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you have? ");
        usersMoney = Double.parseDouble(scanner.nextLine());


        boolean running = true;
        while (running) {
            //Cinema MENU
            System.out.printf("Welcome to IM3AX MENU!, You Still have %s€ left%n", usersMoney);
            System.out.println("--------------------------------------------------------------");
            showCinemaMenu(menu());


            System.out.println("Where to next?");
            usersMenuChoice = Integer.parseInt(scanner.nextLine());


            switch (usersMenuChoice) {
                //Buy a Cinema ticket
                case 1:
                    do {
                        showScreen(filmInfo);
                        do {
                            System.out.println("Which (not fully booked) film would you like to see? (0 to cancel) ");
                            usersChoice = Integer.parseInt(scanner.nextLine());

                            if (usersChoice < 1 || usersChoice > filmInfo.length) {
                                System.out.println("Invalid choice. Please select a valid film.");
                            }
                        } while (usersChoice < 0 || usersChoice > filmInfo.length);
//

                        filmIndex = usersChoice -1;
                        if (usersChoice == 0) {
                            System.out.println("Cancel");
                        } else if (!filmInfo[filmIndex][3].equals("available")) {
                            System.out.println("Sorry, this film is booked. Please choose another");
                        } else {
                            availableSeats = Integer.parseInt(filmInfo[filmIndex][2]);
                            System.out.printf("There are still %d tickets available for €15 each. How many would you like to buy? %n", availableSeats);
                            ticketsToBuy = Integer.parseInt(scanner.nextLine());
                            totalCost = ticketsToBuy * 15;
                            if (ticketsToBuy > availableSeats) {
                                System.out.println("Not enough seats.");
                            } else if (totalCost > usersMoney) {
                                System.out.println("Sorry, you don't have enough money");
                            } else {
                                usersMoney -= totalCost;
                                availableSeats -= ticketsToBuy;
                                filmInfo[filmIndex][2] = String.valueOf(availableSeats);
                                if (availableSeats == 0) {
                                    filmInfo[filmIndex][3] = "booked";
                                }

                                for (int i = 0; i < ticketsToBuy; i++) {
                                    movieHistory.add(usersChoice);

                                }

                                System.out.printf("You buy %d tickets for %.2f€ and now have %.1f%n", ticketsToBuy, totalCost, usersMoney);
                                System.out.println("Movies you bought: " + movieHistory);
                            }
                        }
                    } while (usersChoice != 0);
                    break;

                case 2:
                    //Buy from Snack Machine
                    showSnacks(snackInfo);
                    do {
                        System.out.println("Which (existing) snack would you like to buy? (0 to cancel)");
                        usersChoice = Integer.parseInt(scanner.nextLine());

                        if (usersChoice < 1 || usersChoice > snackInfo.length) {
                            System.out.println("Invalid choice. Please select a valid Snack.");
                        }
                    } while (usersChoice < 0 || usersChoice > snackInfo.length);

                    snackIndex = usersChoice - 1;
                    if (usersChoice == 0) {
                        System.out.println("Cancel");
                    } else if (snackBoard()[snackIndex][3].equals("out-of-stock")) {
                        System.out.println("Sorry, this snack is out of stock. Please choose another");
                    } else {
                        availableSnacks = Integer.parseInt(snackInfo[snackIndex][2]);
                        System.out.printf("There are still %d %ss available for %s each. How many would you like to buy? %n ", availableSnacks, snackInfo[snackIndex][0], snackInfo[snackIndex][1]);
                        snacksToBuy = Integer.parseInt(scanner.nextLine());
                        totalCost = snacksToBuy * Double.parseDouble(snackInfo[snackIndex][1]);
                        if (snacksToBuy > availableSnacks) {
                            System.out.println("Sorry this is out of stock.");
                        } else if (totalCost > usersMoney) {
                            System.out.println("Sorry, you don't have enough money");
                        } else {
                            usersMoney -= totalCost;
                            availableSnacks -= snacksToBuy;
                            snackInfo[snackIndex][2] = String.valueOf(availableSnacks);
                            if (availableSnacks == 0) {
                                snackInfo[snackIndex][3] = "out-of-stock";
                            }

                            for (int i = 0; i < snacksToBuy; i++) {
                                snackHistory.add(usersChoice);
                                snackInventory.add(snackInfo[snackIndex][0]);
                            }
                            System.out.printf("You bought %d %s for %s€ each, and now have %.1f€ left %n", snacksToBuy, snackInfo[snackIndex][0], snackInfo[snackIndex][1], usersMoney);
                        }
                    }
                    break;

                case 3:
                    //Watch Film
                    do {

                        System.out.println("Movies you bought: " + movieHistory);

                        System.out.println("Which movie (for which you still have a ticket) would you like to see? (0 to cancel)");
                        usersChoice = Integer.parseInt(scanner.nextLine());

                        if (usersChoice == 0) {
                            System.out.println("Cancel");
                        } else if (movieHistory.contains(usersChoice)) {
                            System.out.printf("You are watching the movie %s. Have fun! %n", movieHistory.get(usersChoice));
                            movieHistory.remove(usersChoice);
                        } else {
                            System.out.println("Invalid choice. Please select a valid film.");
                        }
                    } while (usersMenuChoice < 1 || usersMenuChoice > movieHistory.size() || usersChoice != 0);


                    break;

                case 4:
                    //Eat some snacks
                    do {
                        for (int i = 0; i < snackInventory.size(); i++) {
                            System.out.println((i + 1) + ". " + snackInventory.get(i));
                        }

                        System.out.println("Which of your snacks do you want to eat? (0 to cancel)");
                        usersMenuChoice = Integer.parseInt(scanner.nextLine());

                        if (usersMenuChoice == 0) {
                            break;
                        } else {
                            System.out.println("Invalid choice. Please select a valid snack.");
                        }
                    } while (usersMenuChoice < 1 || usersMenuChoice > snackInventory.size());

                    System.out.printf("You eat  %s. Mmm! Have fun! %n", snackInventory.get(usersMenuChoice - 1));
                    snackInventory.remove(usersMenuChoice - 1);
                    break;

                //Take part in a competition
                case 5:
                    int min = 1;
                    int max = 200;
                    int userNumber = (int) (Math.random() * (max - min + 1) + min);

                    System.out.println("You are taking part in the competition!");
                    System.out.println("your lucky number is: " + userNumber);

                    if (userNumber % 10 == 0) {
                        System.out.println("It is a number that is  teilbar by 10");
                    } else {
                        int a = 0, b = 1, c = 1;
                        while (c < userNumber) {
                            a = b;
                            b = c;
                            System.out.println(a + "+" + b + "=" + c);
                            c = a + b;
                        }
                        if (userNumber == c) {
                            System.out.printf("%d is a Fibonacci number! You win €25! you get €20 back. %n", userNumber);
                            usersMoney = usersMoney + 20;
                        } else {
                            System.out.printf("%d is a not Fibonacci number! %n", userNumber);
                            usersMoney = usersMoney - 5;
                        }
                    }

                    break;

                case 6:
                    // leave
                    System.out.println("It's sad to see you go :( until next time!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        System.out.println("Thank you for using IMAX, bye bye");
    }

    public static String[][] menu() {
        String[][] menu = {
                {"Buy a movie ticket"},
                {"Buy some snacks"},
                {"Watch a film"},
                {"Eat some snacks"},
                {"Take part in competition"},
                {"Leave IMAX :("}
        };
        return menu;
        //What do you want to do next? (You still have 40.0€)
        //1. Buy a ticket (from KinoVerwaltungV1)
        //2. Buy snacks
        //3. Watch a film
        //4. Eat snacks
        //5. Take part in the competition (costs 5€)
        //6. Leave the cinema
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

    public static String[][] snackBoard() {
        String[][] snackInfo = {
                {"Popcorn", "1", "3", "in-stock"},
                {"Chips", "2", "3", "in-stock"},
                {"Chocolate", "3.50", "2", "in-stock"},
                {"PepsiMax", "3", "2", "in-stock"}
        };
        return snackInfo;
        //Nr Snack                    Price      In stock?
        //-----------------------------------------------------
        // 1. Popcorn                   1.00       in stock
        // 2. Chips                     2.00       in stock
        // 3. Chocolate                3.50       in stock
        //-----------------------------------------------------
    }


    public static void showCinemaMenu(String[][] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d.\t\t%-10s\t%n", i + 1, menu[i][0]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void showSnacks(String[][] snackInfo) {
        System.out.println("Snack-Number \tPrice\t\t\tavailable\t\t\t\tIn-Stock");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < snackInfo.length; i++) {
            System.out.printf("%d.\t\t\t%-10s\t\t%-10s\t%-10s\t%-7s%n", i + 1, snackInfo[i][0], snackInfo[i][1], snackInfo[i][2], snackInfo[i][3]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void showScreen(String[][] filmInfo) {
        System.out.println("Film number \tFilm name\t\tTime\tRemaining places \tRoom");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < filmInfo.length; i++) {
            System.out.printf("%d.\t\t\t%-10s\t\t%-10s\t%-7s\t%-7s\t%-10s %n", i + 1, filmInfo[i][0], filmInfo[i][1], filmInfo[i][2], filmInfo[i][3], filmInfo[i][4]);
        }
        System.out.println("--------------------------------------------------------------");
    }
}
