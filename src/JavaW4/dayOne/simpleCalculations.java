package JavaW4.dayOne;

public class simpleCalculations {
    public static void main(String[] args) {
        //Exercise 1.2

        int a = 137;
        int b = 231;

        double fractionOne = 137.0;
        double fractionTwo = 490.0;

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = b / a;

        double sumFractional = fractionOne + fractionTwo;
        double diffFractional = fractionOne - fractionTwo;
        double productFractional = fractionOne * fractionTwo;
        double quotientFractional = fractionTwo / fractionOne;


        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quotient);


        System.out.printf("Sum: %.2f %n", sumFractional);
        System.out.printf("Difference: %.2f %n", diffFractional);
        System.out.printf("Product %.2f %n", productFractional);
        System.out.printf("Quotient: %.2f %n", quotientFractional);


    }
}
