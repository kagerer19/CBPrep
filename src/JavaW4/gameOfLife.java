package JavaW4;
public class gameOfLife {
    public static void main(String[] args) throws Exception {

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
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid.length; x++) {
                if (grid[y][x] == 1) {
                    System.out.printf("%2s", " # ");
                } else {
                    System.out.printf("%2s", "  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            nextGeneration(grid, col, row);
            Thread.sleep(500);
        }
        /*System.out.println(Arrays.deepToString(grid) + " "); // Testing*/
    }

    static void nextGeneration(int[][] grid, int col, int row) {
        int [][] nextGrid = new int[col][row];


        //Loop the cells
        for(int l = 0; l < row; l++){
            for(int m = 0; m < col; m++){

                int aliveNeighbours = 0;

                //Find neighbours
                for(int i = -1; i <= l; i++){
                    for(int j = -1; j <= 1; j++){
                        if((l + i >= 0 && l + i < m) && (col + j >= 0 && col + j < row)){
                            aliveNeighbours += grid[m][l];
                        }

                        aliveNeighbours -= grid[l][m];

                        if (grid[l][m] == 0 && aliveNeighbours == 3){
                            nextGrid[l][m] = 1;
                        } else if (grid[l][m] == 1 && aliveNeighbours < 2){
                            nextGrid[l][m] = 0;
                        } else if(grid[l][m] == 1 && aliveNeighbours > 2){
                            nextGrid[l][m] = 1;
                        } else if (grid[l][m] == 1 && aliveNeighbours > 3){
                            nextGrid[l][m] = 0;
                        }
                    }
                }
            }
        }
    }
}

//if a cell is dead and has exactly 3 living neighbors, it will be born in the next generation 👶
//if a cell is alive and has less than 2 neighbors it dies of loneliness 😔
//if a cell is alive and has 2 or 3 neighbors, it stays alive 🤝‍
//if a cell is alive and has more than 3 neighbors, it dies from overpopulation 💀