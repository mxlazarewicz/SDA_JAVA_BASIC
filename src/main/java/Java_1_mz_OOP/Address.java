package Java_1_mz_OOP;


public class Address {
    private String street;
    private String city;
    private String country;
    private int houseNo;
    private int flatNo;

    public Address(String street, String city, String country, int houseNo, int flatNo) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.houseNo = houseNo;
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }
    public void showAdress1(){
        System.out.println(this.city + " " + this.street + " ");
    }

}
