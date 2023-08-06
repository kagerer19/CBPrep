package JavaW4.dayOne;

public class workingWithStrings {
    public static void main(String[] args) {
        String greeting = "Hello World";

        for (int i = 0; i < 15; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println(greeting + " is " + greeting.length() + " characters long");
            System.out.println("Upper case: " + greeting.toUpperCase());
            System.out.println("Lower case: " + greeting.toLowerCase());
            System.out.println(greeting.replace("World", "CodersBay"));
            System.out.println("-----------------------------------------------------");
            System.out.println();
        }

    }
}
