package JavaW4.dayOne;

public class workingWithStrings {
    public static void main(String[] args) {
        String greeting = "Hello World ";

        System.out.println("-----------------------------------------------------");
        System.out.println(greeting.strip() + " is " + greeting.length() + " characters long");
        System.out.println("Upper case: " + greeting.toUpperCase());
        System.out.println("Lower case: " + greeting.toLowerCase());
        System.out.println(greeting.replace("World", "CodersBay").strip());
        System.out.println("-----------------------------------------------------");

        System.out.println((greeting.strip() + "\n").repeat(15));
    }
}
// stringLead needs to be implemented