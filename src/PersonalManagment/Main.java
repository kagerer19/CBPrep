package PersonalManagment;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Used for generation of User IDs
        Random rand = new Random();

        //Offices available
        PV pvCodersBay = new PV();
        PV pvLinz = new PV();
        PV pvVienna = new PV();

        Scanner sc = new Scanner(System.in);

        boolean shouldExit = false;

        //Choose office you would like to administrate for
        System.out.println("Which office would you like to create for? ");
        System.out.println("1. Coders Bay");
        System.out.println("2. Linz");
        System.out.println("3. Vienna");
        int managementOffice = sc.nextInt();


        while (!shouldExit) {
            System.out.println("Choose an option:");
            System.out.println("1. Create user with first and last name");
            System.out.println("2. Create user with first and last name, DOB, and gender");
            System.out.println("3. Create user with all details (Address included)");
            System.out.println("4. Print user list");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");

            int userOption = sc.nextInt();

            switch (userOption) {
                case 1 -> {
                    System.out.println("Enter first name: ");
                    String firstName = sc.next();
                    System.out.println("Enter last name: ");
                    String lastName = sc.next();

                    if (managementOffice == 1) {
                        pvCodersBay.createNewUser(rand.nextInt(1000, 5000), firstName, lastName); // ID is not specified
                    } else if (managementOffice == 2) {
                        pvLinz.createNewUser(rand.nextInt(1000, 5000), firstName, lastName);
                    } else {
                        pvVienna.createNewUser(rand.nextInt(1000, 5000), firstName, lastName);
                    }
                }

                case 2 -> {
                    System.out.println("Enter first name: ");
                    String firstName = sc.next();
                    System.out.println("Enter last name: ");
                    String lastName = sc.next();
                    System.out.println("Enter DOB: ");
                    String dob = sc.next();
                    System.out.println("Enter gender (MALE or FEMALE): ");
                    String genderStr = sc.next();
                    User.Gender gender = User.Gender.valueOf(genderStr.toUpperCase());

                    if (managementOffice == 1) {
                        pvCodersBay.createNewUser(rand.nextInt(1000, 5000), firstName, lastName, dob, gender); // ID is not specified
                    } else if (managementOffice == 2) {
                        pvLinz.createNewUser(rand.nextInt(1000, 5000), firstName, lastName, dob, gender);
                    } else {
                        pvVienna.createNewUser(rand.nextInt(1000, 5000), firstName, lastName, dob, gender);
                    }
                }

                case 3 -> {
                    System.out.println("Enter first name: ");
                    String firstNameWithAddress = sc.next();
                    System.out.println("Enter last name: ");
                    String lastNameWithAddress = sc.next();
                    System.out.println("Enter DOB: ");
                    String birthday = sc.next();
                    System.out.println("Enter gender (MALE or FEMALE): ");
                    String genderStrWithAddress = sc.next();
                    User.Gender genderWithAddress = User.Gender.valueOf(genderStrWithAddress.toUpperCase());
                    System.out.println("Enter street address: ");
                    String street = sc.nextLine();

                    //Consume newline
                    sc.nextLine();

                    System.out.println("Enter city: ");
                    String city = sc.nextLine();
                    System.out.println("Enter zip code: ");
                    String zipCode = sc.nextLine();
                    System.out.println("Enter house number: ");
                    int houseNumber = sc.nextInt();
                    Address address = new Address(street, city, zipCode, houseNumber);

                    if (managementOffice == 1) {
                        pvCodersBay.createNewUser(rand.nextInt(1000, 5000), firstNameWithAddress, lastNameWithAddress, birthday, genderWithAddress, address); // ID is not specified
                    } else if (managementOffice == 2) {
                        pvLinz.createNewUser(rand.nextInt(1000, 5000), firstNameWithAddress, lastNameWithAddress, birthday, genderWithAddress, address);
                    } else {
                        pvVienna.createNewUser(rand.nextInt(1000, 5000), firstNameWithAddress, lastNameWithAddress, birthday, genderWithAddress, address);
                    }
                }

                case 4 -> {
                    System.out.print("User List for -> ");

                    if (managementOffice == 1) {
                        System.out.println("Coders Bay Office " + pvCodersBay);
                    } else if (managementOffice == 2) {
                        System.out.println("Linz Office " + pvLinz);
                    } else {
                        System.out.println("Vienna Office " + pvVienna);
                    }
                }

                case 5 -> {
                    System.out.println("Enter the ID of the user that you want to delete: ");
                    int userIDToDelete = sc.nextInt();

                    if (managementOffice == 1) {
                        pvCodersBay.removeUser(userIDToDelete);
                        System.out.println("Updated list after the deletion: " + pvCodersBay);
                    } else if (managementOffice ==2) {
                        pvLinz.removeUser(userIDToDelete);
                        System.out.println("Updated list after the deletion: " + pvLinz);
                    } else{
                        pvVienna.removeUser(userIDToDelete);
                        System.out.println("Updated list after the deletion: " + pvVienna);
                    }
                }

                case 6 -> shouldExit = true;

                default -> System.out.println("Invalid option, please choose a valid option.");
            }
        }
    }
}
