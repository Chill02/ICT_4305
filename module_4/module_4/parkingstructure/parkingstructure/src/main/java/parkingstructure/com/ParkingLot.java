package parkingstructure.com;

import java.util.ArrayList;
import java.util.List;

// Class to represent a Parking lot
public class ParkingLot {

    private String lotId;
    private Address address;
    private int capacity;
    private List<Car> cars;

    public ParkingLot(String lotId, Address address, int capacity) {
        this.lotId = lotId;
        this.address = address;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public void entry(Car car) {
        if (cars.size() >= capacity) {
            System.out.println("Parking lot is full. Car denied entry.");
            return;
        }
        cars.add(car);
        System.out.println("Car entered: " + car.getLicense());
    }

    public int getCarCount() {
        return cars.size();
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
