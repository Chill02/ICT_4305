package parkingstructure.com;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

// Class to represent a Customer
public class Customer {

    private String customerId;
    private String name;
    private Address address;
    private String phoneNumber;

    public Customer(String name, Address address, String phoneNumber) {
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Car register(String license, CarType type) {
        String permit = "PERMIT-" + UUID.randomUUID().toString().substring(0, 8);
        LocalDate expiration = LocalDate.now().plusYears(1);
        return new Car(permit, expiration, license, type, this.customerId);
    }

    @Override
    public String toString() {
        return "Customer[" +
                "id='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phoneNumber + '\'' +
                ']';
    }
}
