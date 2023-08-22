package PersonalManagment;

class Address {
    private int addressID;
    private String streetName;
    private String city;
    private String postCode;
    private int houseNum;


    //Constructors
    Address(int addID, String street, String town, String postalCode, int houseNumber) {
        setAddressID(addID);
        setStreetName(street);
        setCity(town);
        setPostCode(postalCode);
        setHouseNum(houseNumber);
    }

    //Getters
    public int getAddressID() {
        return addressID;
    }

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


    //Setters
    public void setAddressID(int addID) {
        this.addressID = addID;
    }

    public void setStreetName(String street) {
        this.streetName = street;
    }

    public void setCity(String town) {
        this.city = town;
    }

    public void setPostCode(String postalCode) {
        this.postCode = postalCode;
    }

    public void setHouseNum(int houseNumber) {
        this.houseNum = houseNumber;
    }


    @Override
    public String toString() {
        return ("\n" + "-Address-" + "\n" +
                "Address-ID: " + getAddressID() + "\n" +
                "Street: " + getStreetName() + "\n"
                + "City: " + getCity() + "\n" + "Post Code: " + getPostCode()
                + "\n" + "House Number: " + getHouseNum() + "\n");
    }
}