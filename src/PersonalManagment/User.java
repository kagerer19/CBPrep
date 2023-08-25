package PersonalManagment;

class User {
    public User() {
    }

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
        StringBuilder result = new StringBuilder();
        result.append("\n-Person's details-\n");
        result.append("User-ID: ").append(getID()).append("\n");
        result.append("Name: ").append(getFirstName()).append("\n");
        result.append("Last Name: ").append(getLastName()).append("\n");
        result.append("DOB: ").append(getDOB()).append("\n");
        result.append("Gender: ").append(getGender()).append("\n");

        if (address != null) {
            result.append("\n-Address-\n");
            result.append("User-ID: ").append(getID()).append("\n");
            result.append("Street: ").append(address.getStreetName()).append("\n");
            result.append("City: ").append(address.getCity()).append("\n");
            result.append("Post Code: ").append(address.getPostCode()).append("\n");
            result.append("House Number: ").append(address.getHouseNum()).append("\n");
        } else {
            result.append("\nNo Address Information\n");
        }

        return result.toString();
    }

}
