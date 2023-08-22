package PersonalManagment;

class User {
    enum Gender {
        MALE, FEMALE, OTHER
    }

    private int userID;
    private String firstName;
    private String lastName;
    private String DOB;
    private Gender gender;


    //Constructors
    User(int ID, String name, String surname) {
        setID(ID);
        setFirstName(name);
        setLastName(surname);
    }

    User(int ID, String name, String surname, String birthday, Gender gender) {
        setID(ID);
        setFirstName(name);
        setLastName(surname);
        setDOB(birthday);
        setGender(gender);
    }

    //Getters
    public int getID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public Gender getGender() {
        return gender;
    }

    //Setters
    public void setID(int ID) {
        this.userID = ID;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public void setDOB(String birthday) {
        this.DOB = birthday;
    }

    public void setGender(Gender ofGender) {
        this.gender = ofGender;
    }

    @Override
    public String toString() {
        return ("\n" + "-Persons details-" + "\n" +
                "User-ID: " + getID() + "\n" +
                "Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "DOB: " + getDOB() + "\n" +
                "Gender: " + getGender() + "\n");
    }
}
