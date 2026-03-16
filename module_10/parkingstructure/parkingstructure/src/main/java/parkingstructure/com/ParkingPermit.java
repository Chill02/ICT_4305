package parkingstructure.com;

import java.time.LocalDate;

public class ParkingPermit {

    private final String id;
    private final Car car;
    private final LocalDate registrationDate;
    private final LocalDate expirationDate;

    public ParkingPermit(String id, Car car) {
        this.id = id;
        this.car = car;
        this.registrationDate = LocalDate.now();
        this.expirationDate = registrationDate.plusYears(1);
    }

    public String getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Permit{id='" + id + "', car=" + car.getLicense() + "}";
    }
}




