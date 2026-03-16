package parkingstructure.com;

import java.util.ArrayList;
import java.util.List;

public class ParkingOffice {

    private final String name;
    private final Address address;

    private final List<Customer> customers = new ArrayList<>();
    private final List<Car> cars = new ArrayList<>();
    private final List<ParkingLot> lots = new ArrayList<>();

    private final PermitManager permitManager = new PermitManager();
    private final TransactionManager transactionManager = new TransactionManager();

    public ParkingOffice(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Customer registerCustomer(String name, Address addr, String phone) {
        Customer c = new Customer(name, addr, phone);
        customers.add(c);
        return c;
    }

    public Car registerCar(Customer c, String license, CarType type) {
        Car car = new Car(license, type, c.getCustomerId());
        cars.add(car);

        ParkingPermit permit = permitManager.register(car);
        car.assignPermit(permit);

        return car;
    }

    public void addLot(ParkingLot lot) {
        lots.add(lot);
    }

    public ParkingCharge addChargeForEntry(Car car, ParkingLot lot, Money amount) {
        return transactionManager.recordCharge(car.getPermit(), lot, amount);
    }

    public List<ParkingCharge> getChargesForCar(Car car) {
        return transactionManager.getChargesForPermit(car.getPermit().getId());
    }

    public List<ParkingCharge> getAllCharges() {
        return transactionManager.getAllCharges();
    }
}


