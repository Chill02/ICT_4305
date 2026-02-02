package parkingstructure.com;

public class App {
    public static void main(String[] args) {

        // Create a customer
        Address addr = new Address("123 Main St", "Apt 4B", "Magna", "UT", "84044");
        Customer c = new Customer("Carl", addr, "801-555-1212");

        // Register car for customer
        Car car = c.register("ABC123", CarType.SUV);

        // Create a ParkingLot
        ParkingLot lot = new ParkingLot("LOT-1", addr, 2);
        lot.entry(car);

        System.out.println("This is the lot object " +lot);
        System.out.println("This is the customer object " + c);
        System.out.println("This is the car object " + car);


    }
}
