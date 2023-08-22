package PersonalManagment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PeopleManager {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Address> userAddress = new ArrayList<>();

        //Map for user Personal details linking correct address.
        Map<User, Address> PersonalDetails = new HashMap<>();

        //Create regular user
        CreateNewUser(101, "lex", "Smith");
        users.add(CreateNewUser(101, "Alyssa", "Smith"));
        users.add(CreateNewUser(101, "Garth", "Smith"));

        //Create user with birthday and gender
        users.add(CreateNewUserDOB(102, "Alexander", "Kagerer", "07/04/1996", User.Gender.MALE));

        //add address
        userAddress.add(CreateNewAddressEntry(101, "Strand St", "Cape Town", "34510", 33));

        System.out.println(users);
        System.out.println("-".repeat(10));
        System.out.println(userAddress);

    }

    public static User CreateNewUser(int ID, String name, String surname) {
        return new User(ID, name, surname);
    }

    //For adding a user and an Address
    public static User CreateNewUserFullDetails(int ID, String name, String surname, String birthday, User.Gender gender) {
        return new User(ID, name, surname, birthday, gender);
    }

    public static User CreateNewUserDOB(int ID, String name, String surname, String birthday, User.Gender gender) {
        return new User(ID, name, surname, birthday, gender);
    }

    public static Address CreateNewAddressEntry(int addID, String street, String town, String postalCode, int houseNumber) {
        return new Address(addID, street, town, postalCode, houseNumber);
    }
}