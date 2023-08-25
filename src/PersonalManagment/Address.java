package PersonalManagment;

class Address extends User {
    private String streetName;
    private String city;
    private String postCode;
    private int houseNum;

    Address(){
        super();
    }
    //Constructors
    Address(String street, String town, String postalCode, int houseNumber) {
        this.streetName = street;
        this.postCode = postalCode;
        this.houseNum = houseNumber;
    }

    //Getters
    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getHouseNum() {
        return houseNum;
    }
}