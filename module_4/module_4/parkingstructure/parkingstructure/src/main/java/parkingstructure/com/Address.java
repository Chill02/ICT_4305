package parkingstructure.com;
// Class to represent an Address
public class Address {

    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String zipCode;

    public Address(String streetAddress1, String streetAddress2,
                   String city, String state, String zipCode) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddressInfo() {
        return streetAddress1 +
                (streetAddress2 != null && !streetAddress2.isEmpty()
                        ? ", " + streetAddress2 : "") +
                ", " + city + ", " + state + " " + zipCode;
    }

    @Override
    public String toString() {
        return getAddressInfo();
    }
}
