package PersonalManagment;

class Address {
    private String streetName;
    private String city;
    private String postCode;
    private int houseNum;

    Address(){
    }
    //Constructors
    Address(String street, String town, String postalCode, int houseNumber) {
        setStreetName(street);
        setCity(town);
        setPostCode(postalCode);
        setHouseNum(houseNumber);
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


    //Setters
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
}