package PersonalManagment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PV {
    List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        PV pvCodersBay = new PV();

        pvCodersBay.createNewUser(100, "Garth", "Smith", "04/12", User.Gender.MALE);
        pvCodersBay.createNewUser(103, "Gareth", "Bale", "04/09", User.Gender.MALE);
        pvCodersBay.createNewUser(104, "Jessie", "Bale", "04/09", User.Gender.FEMALE, new Address("Heindlstrasse", "Linz", "4020", 22));

        pvCodersBay.createNewUser(109, "Alex", "Kagerer");

        System.out.println(pvCodersBay.users);
        System.out.println("-".repeat(10));

        pvCodersBay.removeUser(103);
        System.out.println("UPDATED LIST");
        System.out.println("-".repeat(10));
        System.out.println(pvCodersBay.users.toString());
    }
    public void removeUser(int ID) {
        //iterate the list for ID and then remove
        Iterator<User> userToDelete = users.iterator();
        int removeByID;

        while (userToDelete.hasNext()){
            removeByID = userToDelete.next().getID();
            if(removeByID == ID){
                userToDelete.remove();
            }
        }
    }

    public void createNewUser(int ID, String name, String surname) {
        User newUser = new User(ID, name, surname);
        users.add(newUser);
    }

    public void createNewUser(int ID, String name, String surname, String birthday, User.Gender gender, Address address) {
        User newUser = new User(ID, name, surname, birthday, gender, address);
        users.add(newUser);
    }

    public void createNewUser(int ID, String name, String surname, String birthday, User.Gender gender) {
        User newUser = new User(ID, name, surname, birthday, gender);
        users.add(newUser);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (User u: users) {
            sb.append(u.toString()).append("\n");
        }
        return sb.toString();
    }
}