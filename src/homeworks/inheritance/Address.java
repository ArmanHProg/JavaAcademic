package homeworks.inheritance;

public class Address {

    private String City;
    private String Street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        City = city;
        Street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
