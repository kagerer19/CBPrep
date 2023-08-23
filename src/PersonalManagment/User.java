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
    private Address address;


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

    User(int ID, String name, String surname, String birthday, Gender gender,  Address address1) {
        setID(ID);
        setFirstName(name);
        setLastName(surname);
        setDOB(birthday);
        setGender(gender);
        setAddress(address1);
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

    public void setAddress(Address address1){
        this.address = address1;
    }

    @Override
    public String toString() {
        return ("\n" + "-Persons details-" + "\n" +
                "User-ID: " + getID() + "\n" +
                "Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "DOB: " + getDOB() + "\n" +
                "Gender: " + getGender() + "\n" +"\n" + "-Address-" + "\n" +
                "Street: " + address.getStreetName() + "\n"
                + "City: " + address.getCity() + "\n" + "Post Code: " + address.getPostCode()
                + "\n" + "House Number: " + address.getHouseNum() + "\n");
    }
}
