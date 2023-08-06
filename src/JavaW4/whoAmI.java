package JavaW4;

public class whoAmI {
    public static void main(String[] args) {
        String firstName = "Alexander";
        String lastName = "Kagerer";
        String gender = "Male";
        String DOB = "July the 4th";

        int age = 27;
        int averageGrade = 74;

        boolean isMarried = false;

        System.out.println("Hi my name is " + firstName + " " + lastName);
        System.out.println("------------------------------------------->");
        System.out.println("I am " + age + " years old");
        System.out.println("I was born on " + DOB);
        System.out.println("------------------------------------------->");
        System.out.println("My average grade is school (Out Of 100 for each exam) was " + averageGrade + "%");
        System.out.println("------------------------------------------->");
        System.out.println("Gender: " + gender);
        System.out.println("Marriage status: " + isMarried);
    }
}
