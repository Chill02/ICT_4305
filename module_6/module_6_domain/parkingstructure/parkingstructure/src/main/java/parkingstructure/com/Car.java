package parkingstructure.com;

import java.time.LocalDate;

// Class to represent a Car
public class Car {

    private String permit;
    private LocalDate permitExpiration;
    private String license;
    private CarType type;
    private String owner; // customerId

    public Car(String permit, LocalDate permitExpiration,
               String license, CarType type, String owner) {
        this.permit = permit;
        this.permitExpiration = permitExpiration;
        this.license = license;
        this.type = type;
        this.owner = owner;
    }

    public String getPermit() {
        return permit;
    }

    public LocalDate getPermitExpiration() {
        return permitExpiration;
    }

    public String getLicense() {
        return license;
    }

    public CarType getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car[" +
                "permit='" + permit + '\'' +
                ", expires=" + permitExpiration +
                ", license='" + license + '\'' +
                ", type=" + type +
                ", owner='" + owner + '\'' +
                ']';
    }
}

