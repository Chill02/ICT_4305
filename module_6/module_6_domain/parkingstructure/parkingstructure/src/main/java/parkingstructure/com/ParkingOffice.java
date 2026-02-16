package parkingstructure.com;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingOffice {

    private String name;
    private Address address;
    private List<Customer> customers;
    private List<Car> cars;
    private List<ParkingLot> lots;
    private List<ParkingCharge> charges;

    public ParkingOffice(String name, Address address) {
        this.name = name;
        this.address = address;
        this.customers = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.lots = new ArrayList<>();
        this.charges = new ArrayList<>();
    }

    public void addLot(ParkingLot lot) {
        lots.add(lot);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<ParkingCharge> getCharges() {
        return charges;
    }

    public Customer register(String name, Address address, String phone) {
        Customer c = new Customer(name, address, phone);
        customers.add(c);
        return c;
    }

    public Car register(Customer c, String license, CarType t) {
        String permit = "PERMIT-" + UUID.randomUUID().toString().substring(0, 8);
        LocalDate expiration = LocalDate.now().plusYears(1);
        Car car = new Car(permit, expiration, license, t, c.getCustomerId());
        cars.add(car);
        return car;
    }

    public Customer getCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Adds a charge and returns the amount of this charge.
     * (Can be used to return total charges for a permit or customer.)
     */
    public Money addCharge(ParkingCharge charge) {
        charges.add(charge);
        return charge.getAmount();
    }

    /**
     * This method is used by ParkingLot to create and record a charge.
     */
    public Money addChargeForEntry(Car car, ParkingLot lot, Money amount) {
        ParkingCharge charge = new ParkingCharge(
                car.getPermit(),
                lot.getLotId(),
                Instant.now(),
                amount
        );
        return addCharge(charge);
    }
}

