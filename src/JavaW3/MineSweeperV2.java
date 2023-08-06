package JavaW3;

import java.util.Scanner;
import java.util.Random;

public class MineSweeperV2 {
    public static void main(String[] args) {
        int[][] map = new int[10][10];
        int mineCount = 0;

        Random random = new Random();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = random.nextInt(4) - 3;
                if (map[i][j] == 0) {
                    mineCount++;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean[][] revealed = new boolean[10][10];
        int checkedCount = 0;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("      A    B    C    D   E    F    G    H    I    J\n");
            for (int i = 0; i < map.length; i++) {
                System.out.print(i + "   ");
                for (int j = 0; j < map[i].length; j++) {
                    if (revealed[i][j]) {
                        if (map[i][j] == 0) {
                            System.out.print("[ * ]");
                        } else {
                            System.out.print("[ - ]");
                        }
                    } else {
                        System.out.print("[   ]");
                    }
                }
                System.out.println();
            }
            System.out.println();

            int totalNonMineLocations = 100 - mineCount;
            double percentageCleared = (checkedCount / (double) totalNonMineLocations) * 100;
            System.out.printf("You have checked %d/%d (%.1f%%) of the unmined area for mines\n", checkedCount, 100 - mineCount, percentageCleared);
            System.out.println("There are still " + mineCount + " mines hidden.");


            String input;
            int row = -1, col = -1;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Where do you want to look for mines? ");
                input = scanner.nextLine().trim().toUpperCase();


                if (input.matches("[A-J][0-9]")) {
                    col = input.charAt(0) - 'A';
                    row = input.charAt(1) - '0';

                    // Check if row and column are within the correct range (0-9)
                    if (row >= 0 && row < 10 && col >= 0 && col < 10) {
                        // Check if the coordinates have been used before
                        if (!revealed[row][col]) {
                            validInput = true;
                        } else {
                            System.out.println("You've already checked this coordinate. Choose another one.");
                        }
                    } else {
                        System.out.println("Invalid coordinates. Row and column should be between 0 and 9.");
                    }
                } else {
                    System.out.println("Invalid input format. Please use a letter followed by a number (e.g., A0).");
                }
            }


            if (map[row][col] == 0) {
                map[row][col] = -2;
                revealed[row][col] = true;
                gameOver = true;
                System.out.println("That... was a mine. Unfortunately you lost.");
            } else {
                if (!revealed[row][col]) {
                    revealed[row][col] = true;
                    checkedCount++;


                    if (map[row][col] < 0) {
                        int areaSize = Math.abs(map[row][col]) - 1;
                        for (int i = Math.max(0, row - areaSize); i <= Math.min(9, row + areaSize); i++) {
                            for (int j = Math.max(0, col - areaSize); j <= Math.min(9, col + areaSize); j++) {
                                if (!revealed[i][j]) {
                                    revealed[i][j] = true;

                                    //update the mine count
                                    if (map[i][j] == 0) {
                                        mineCount--;
                                    } else {
                                        checkedCount++;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Check if all non-mine locations have been revealed (player wins)
            totalNonMineLocations = 100 - mineCount;
            if (checkedCount == totalNonMineLocations) {
                gameOver = true;
                System.out.println("Congratulations! You've uncovered all the non-mine locations. You win!");
            }
        }
    }
}
