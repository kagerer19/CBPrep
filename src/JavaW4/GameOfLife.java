package JavaW4;

public class GameOfLife {
    public static void main(String[] args) throws InterruptedException {

        int[][] grid = {{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0},
        };

        while (true) {
            printGame(grid);
            nextGeneration(grid);
            Thread.sleep(500);
        }
    }

    static void nextGeneration(int[][] grid) {
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

        // Copy newGrid into grid to update the current generation
        for (int l = 0; l < grid.length; l++) {
            for (int m = 0; m < grid[l].length; m++) {
                grid[l][m] = newGrid[l][m];
            }
        }
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

//if a cell is dead and has exactly 3 living neighbors, it will be born in the next generation 👶
//if a cell is alive and has less than 2 neighbors it dies of loneliness 😔
//if a cell is alive and has 2 or 3 neighbors, it stays alive 🤝‍
//if a cell is alive and has more than 3 neighbors, it dies from overpopulation 💀

//   #  #  #  #  #  #  #  #  #
//             #  #  #  #
//   #  #    #
//   #  #    #  #
//   #  #    #  #
//   #  #    #  #
//   #  #    #  #
//     #
//   #  #    #    #  #  #  #
//   #        #  #  #  #  #