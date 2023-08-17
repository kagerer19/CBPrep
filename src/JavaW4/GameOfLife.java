package JavaW4;

import java.util.Arrays;
import java.util.Random;

public class GameOfLife {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        int[][] grid = new int[10][10];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = r.nextInt(2);
            }
        }


        boolean ready = false;
        while (!ready) {
            printGame(grid);
            int[][] newGrid = nextGeneration(grid);
            Thread.sleep(500);
            if (Arrays.deepEquals(grid, newGrid)) {
                ready = true;
            }
            grid = newGrid;
        }
    }

    static int[][] nextGeneration(int[][] grid) {
        int[][] newGrid = new int[grid.length][grid[0].length];

        for (int l = 0; l < grid.length; l++) {
            for (int m = 0; m < grid[l].length; m++) {
                int aliveNeighbours = countNeighbours(grid, l, m);

                if (aliveNeighbours == 3) {
                    newGrid[l][m] = 1; // Cell is born
                } else if (aliveNeighbours == 2) {
                    newGrid[l][m] = grid[l][m]; // Cell stays the same
                } else {
                    newGrid[l][m] = 0; // Cell dies
                }
            }
        }
        return newGrid;
    }

    static int countNeighbours(int[][] grid, int row, int col) {
        int aliveNeighbours = -grid[row][col];

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (!(newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[row].length)) {
                    aliveNeighbours += grid[newRow][newCol];
                }
            }
        }
        return aliveNeighbours;
    }

    static void printGame(int[][] grid) {
        System.out.println("----Next Generation----");
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid.length; x++) {
                if (grid[y][x] == 0) {
                    System.out.printf("%2s", "  ");
                } else {
                    System.out.printf("%2s", " # ");
                }
            }
            System.out.println();
        }
    }
}