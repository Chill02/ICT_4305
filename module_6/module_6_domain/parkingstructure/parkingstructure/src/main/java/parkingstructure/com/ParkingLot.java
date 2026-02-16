package parkingstructure.com;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Parking lot
public class ParkingLot {

    private String lotId;
    private Address address;
    private int capacity;
    private List<Car> cars;
    private ParkingOffice office;

    public ParkingLot(String lotId, Address address, int capacity, ParkingOffice office) {
        this.lotId = lotId;
        this.address = address;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
        this.office = office;
    }

    public String getLotId() {
        return lotId;
    }

    public int getCarCount() {
        return cars.size();
    }

    /**
     * Car enters the lot; if admitted, a parking charge is incurred.
     * Returns the Money charged, or null if entry denied.
     */
    public Money entry(Car car) {
        if (cars.size() >= capacity) {
            System.out.println("Parking lot is full. Car denied entry.");
            return null;
        }
        cars.add(car);
        System.out.println("Car entered: " + car.getLicense());

        // Simple flat fee example: $5.00 per entry
        Money fee = new Money(500);
        if (office != null) {
            office.addChargeForEntry(car, this, fee);
        }
        return fee;
    }

    @Override
    public String toString() {
        return "ParkingLot[" +
                "lotId='" + lotId + '\'' +
                ", address=" + address +
                ", capacity=" + capacity +
                ", carsParked=" + cars.size() +
                ']';
    }
}
