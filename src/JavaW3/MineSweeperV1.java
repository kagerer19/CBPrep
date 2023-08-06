package JavaW3;

import java.util.Random;
import java.util.Scanner;

public class MineSweeperV1 {
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
                for (int j = 0; j < map.length; j++) {
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

            double percentageCleared = (checkedCount * 100.0) / map.length;
            System.out.printf("You have checked %d/%d (%.1f%%) of the unmined area for mines\n", checkedCount, 100 - mineCount, percentageCleared);
            System.out.println("There are still " + mineCount + " mines hidden.");

            System.out.println("Where do you want to look for mines? ");
            String input = scanner.nextLine();


            int row = input.charAt(1) - '0';
            int col = input.charAt(0) - 'A';


            if (map[row][col] == 0) {
                map[row][col] = -2;
                revealed[row][col] = true;
                gameOver = true;
                System.out.println("That... was a mine. Unfortunately you lost.");
            } else {
                if (!revealed[row][col]) {
                    revealed[row][col] = true;
                    checkedCount++;
                }
            }
        }
        scanner.close();
    }
}