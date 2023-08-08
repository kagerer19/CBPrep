package JavaW4;

import java.util.Random;

public class bingoCardGenerator {
    public static void main(String[] args) {
        int[][] bingoBoard = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = random.nextInt(16);
                while (temp == 0) {
                    temp = random.nextInt(16);
                }

                temp += i * 15;

                while (temp == bingoBoard[0][i] || temp == bingoBoard[1][i] || temp == bingoBoard[2][i] || temp == bingoBoard[3][i]) {
                    temp = random.nextInt(16);
                    temp += i * 15;
                }
                bingoBoard[j][i] = temp;
            }
        }


        System.out.println("  B   I   N   G   O");
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (x == 2 && y == 2) {
                    System.out.printf("[%2s]", " + ");
                } else {
                    System.out.printf("[%2d]", bingoBoard[y][x]);
                }
            }
            System.out.println();
        }

    }
}