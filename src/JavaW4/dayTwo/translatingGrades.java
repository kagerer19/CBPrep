package JavaW4.dayTwo;

import java.util.Scanner;
public class translatingGrades {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What grade did you get");
        int grade = sc.nextInt();

        switch (grade) {
            case 1:
                System.out.println("Very Good");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Sufficient");
                break;
            case 5:
                System.out.println("Not Sufficient");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
