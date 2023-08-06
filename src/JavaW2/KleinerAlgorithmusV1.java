package JavaW2;

import java.util.Scanner;

public class KleinerAlgorithmusV1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c;
        int counter;
        System.out.println("Enter a number: ");
        counter = sc.nextInt();
        for (int i = 0; i < counter; i++) {
            c = a + b;
            System.out.println(a + "+" + b + "=" + c);
            a = b;
            b = c;
        }
    }
}