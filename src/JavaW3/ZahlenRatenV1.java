package JavaW3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int guessAttempts = 0;
        int cpuGuessAttempts = 0;
        int upperLimit = 100;
        int lowerLimit = 0;

        ArrayList<Integer> usersGuessHistory = new ArrayList<>();
        ArrayList<Integer> cpuGuessHistory = new ArrayList<>();

        System.out.println("Welcome to the Number Guessing game!");
        System.out.println("Enter the level (1, 2, 3) or 0 to exit: ");
        int usersChoice = Integer.parseInt(sc.nextLine());

        while (usersChoice != 0) {
            if (usersChoice == 1) {
                // Level 1
                int randomNumber = r.nextInt(100);
                System.out.println("Guess a number between 0 and 100.");

                do {
                    int usersGuess = Integer.parseInt(sc.nextLine());
                    usersGuessHistory.add(usersGuess);
                    guessAttempts++;

                    if (usersGuess == randomNumber) {
                        System.out.println("Well Done! You guessed the correct number!");
                        System.out.println("Would you like to play again? (yes/no):");
                        String playAgain = sc.nextLine();
                        if (playAgain.equalsIgnoreCase("yes")) {
                            usersGuessHistory.clear();
                            randomNumber = r.nextInt(100);
                            System.out.println("Guess a number between 0 and 100.");
                        } else {
                            break;
                        }
                    } else if (guessAttempts >= 10) {
                        System.out.println("You have run out of guesses. The correct number was: " + randomNumber);
                        System.out.println("Would you like to play again? (yes/no):");
                        String playAgain = sc.nextLine();
                        if (playAgain.equalsIgnoreCase("yes")) {
                            usersGuessHistory.clear();
                            randomNumber = r.nextInt(100);
                            System.out.println("Guess a number between 0 and 100.");
                        } else {
                            break;
                        }
                    } else if (usersGuess < randomNumber) {
                        System.out.println("The number is bigger. Guess again.");
                    } else {
                        System.out.println("The number is smaller. Guess again.");
                    }
                } while (true);
            } else if (usersChoice == 2) {
                guessAttempts = 0;

                // Level 2
                int randomNumber = r.nextInt(100);
                System.out.println("Guess a number between 0 and 100.");

                do {
                    int usersGuess = Integer.parseInt(sc.nextLine());
                    usersGuessHistory.add(usersGuess);
                    guessAttempts++;

                    int DistanceToNextNum = Math.abs(usersGuess - randomNumber);
                    if (usersGuess == randomNumber) {
                        System.out.println("Well Done! You guessed the correct number!");
                        System.out.println("Would you like to play again? (yes/no):");
                        String playAgain = sc.nextLine();
                        if (playAgain.equalsIgnoreCase("yes")) {
                            usersGuessHistory.clear();
                            randomNumber = r.nextInt(100);
                            System.out.println("Guess a number between 0 and 100.");
                        } else {
                            break;
                        }
                    } else if (guessAttempts >= 10) {
                        System.out.println("You have run out of guesses. The correct number was: " + randomNumber);
                        System.out.println("Would you like to play again? (yes/no):");
                        String playAgain = sc.nextLine();
                        if (playAgain.equalsIgnoreCase("yes")) {
                            guessAttempts = 0;
                            usersGuessHistory.clear();
                            randomNumber = r.nextInt(101);
                            System.out.println("Guess a number between 0 and 100.");
                        } else {
                            break;
                        }
                    } else if (DistanceToNextNum <= 3) {
                        System.out.println("Almost there: between 1 and 3 off.");
                        System.out.println("You guessed: " + usersGuessHistory);
                    } else if (DistanceToNextNum <= 10) {
                        System.out.println("Relatively close: between 4 and 10 off.");
                        System.out.println("You guessed: " + usersGuessHistory);
                    } else if (DistanceToNextNum <= 20) {
                        System.out.println("Not that far away: between 11 and 20 off.");
                        System.out.println("You guessed: " + usersGuessHistory);
                    } else {
                        System.out.println("Far away: over 20 missed.");
                        System.out.println("You guessed: " + usersGuessHistory);
                    }
                } while (true);
            } else if (usersChoice == 3) {

                // Level 3
                int randomNumber = r.nextInt(100);
                boolean playerFirst = r.nextBoolean();
                System.out.println("Guess a number between 0 and 100.");
                guessAttempts = 0;

                do {
                    //playerFirst=false;
                    if (playerFirst) {
                        System.out.println("Your turn. Enter your guess:");
                        int usersGuess = Integer.parseInt(sc.nextLine());
                        usersGuessHistory.add(usersGuess);
                        guessAttempts++;

                        if (usersGuess == randomNumber) {
                            System.out.println("Well Done! You guessed the correct number!");
                            System.out.println("Your guesses: " + usersGuessHistory);
                            break;
                        } else if (guessAttempts >= 10) {
                            System.out.println("You have run out of guesses. The correct number was: " + randomNumber);
                            System.out.println("Your guesses: " + usersGuessHistory);

                            usersGuessHistory.clear();
                            break;
                        } else if (usersGuess < randomNumber) {
                            System.out.println("The number is bigger. Guess again.");
                            System.out.println("You guessed: " + usersGuessHistory);
                            if (lowerLimit <= usersGuess) {
                                lowerLimit = usersGuess + 1;
                            }
                        } else {
                            System.out.println("The number is smaller. Guess again.");
                            System.out.println("You guessed: " + usersGuessHistory);
                            if (upperLimit >= usersGuess) {
                                upperLimit = usersGuess - 1;
                            }
                        }
                    } else {
                        System.out.println("CPU's turn.");


                        int cpuGuess = lowerLimit + (upperLimit - lowerLimit) / 2;
                        cpuGuessHistory.add(cpuGuess);
                        cpuGuessAttempts++;

                        System.out.println("CPU guessed: " + cpuGuess);
                        if (cpuGuess == randomNumber) {
                            System.out.println("CPU guessed the correct number!");
                            System.out.println("The CPU guessed: " + cpuGuess);
                            System.out.println("CPU guesses: " + cpuGuessHistory);
                            break;
                        } else if (cpuGuessAttempts >= 10) {
                            System.out.println("You have run out of guesses. The correct number was: " + randomNumber);
                            System.out.println("The CPU guessed: " + cpuGuess);
                            System.out.println("CPU guesses: " + cpuGuessHistory);
                            cpuGuessAttempts = 0;
                            cpuGuessHistory.clear();
                            break;
                        } else if (cpuGuess < randomNumber) {
                            lowerLimit = cpuGuess + 1;
                            System.out.println("The number is bigger. CPU Guesses again.");
                            System.out.println("CPU guesses: " + cpuGuessHistory);
                        } else {
                            upperLimit = cpuGuess - 1;
                            System.out.println("The number is lower. CPU Guesses again.");
                            System.out.println("CPU guesses: " + cpuGuessHistory);
                        }
                    }
                    playerFirst = !playerFirst;
                } while (true);
            } else {
                System.out.println("Not a valid choice. Please enter a valid level (1, 2, 3) or 0 to exit.");
            }
            upperLimit = 100;
            lowerLimit = 0;
            System.out.println("Enter the level (1, 2, 3) or 0 to exit: ");
            usersChoice = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Thank you for playing the guessing game!");
    }
}