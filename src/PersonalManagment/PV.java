package PersonalManagment;

import java.util.*;

class PV {
    List<User> users = new ArrayList<>();
    public void removeUser(int ID) {
        //iterate the list for ID and then remove
        Iterator<User> userToDelete = users.iterator();
        int removeByID;

        while (userToDelete.hasNext()) {
            removeByID = userToDelete.next().getID();
            if (removeByID == ID) {
                userToDelete.remove();
            }
        }
    }

    public void createNewUser(int ID, String name, String surname) {
        User newUser = new User(ID, name, surname);
        users.add(newUser);
    }

    public void createNewUser(int ID, String name, String surname, String birthday, User.Gender gender) {
        User newUser = new User(ID, name, surname, birthday, gender);
        users.add(newUser);
    }

    public void createNewUser(int ID, String name, String surname, String birthday, User.Gender gender, Address address) {
        User newUser = new User(ID, name, surname, birthday, gender, address);
        users.add(newUser);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (User u : users) {
            sb.append(u.toString()).append("\n");
        }
        return sb.toString();
    }
}