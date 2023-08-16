package JavaW4;

import java.util.Arrays;

public class gameOfLife {
    public static void main(String[] args) {

        int col = 10;
        int row = 10;
        //0th generation grid
        int[][] grid = {{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        };

        //Display grid
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (grid[y][x] == 0) {
                    System.out.printf("%2s", " . ");
                } else {
                    System.out.printf("%2s", " # ");
                }
            }
            System.out.println();
            newGeneration(grid, col, row);
        }
    }



    static void newGeneration(int[][] grid, int col, int row) {
        int[][] nextGeneration = new int[col][row];


        //Loop the cells
        for (int l = 0; l < col; l++) {
            for (int m = 0; m < row; m++) {

                int aliveNeighbours = 0;

                //Find neighbours
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((l + i >= 0 && l + i < row) && (m + j >= 0 && m + j < row)) {
                            aliveNeighbours += grid[l + i][m + j];


                            aliveNeighbours -= grid[l][m];
                            if ((grid[l][m]) == 1 && (aliveNeighbours < 2)) {
                                nextGeneration[l][m] = 0;
                            } else if ((grid[l][m]) == 1 && (aliveNeighbours > 3)) {
                                nextGeneration[l][m] = 0;
                            } else if ((grid[l][m] == 0) && (aliveNeighbours == 3)) {
                                nextGeneration[l][m] = 1;
                            } else {
                                nextGeneration[l][m] = grid[l][m];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Next Generation");
        for (int y = 0; y < col; y++) {
            for (int x = 0; x < row; x++) {
                if (nextGeneration[y][x] == 0) {
                    System.out.printf("%2s", " . ");
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