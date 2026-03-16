package parkingstructure.com;

public class App {

    public static void main(String[] args) {

        // Create office
        Address officeAddr = new Address(
                "123 Main St",
                "",
                "Magna",
                "UT",
                "84044"
        );

        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        // Register a customer
        Address custAddr = new Address(
                "456 Elm St",
                "",
                "Salt Lake City",
                "UT",
                "84101"
        );

        Customer customer = office.registerCustomer(
                "Alice Johnson",
                custAddr,
                "801-555-1212"
        );

        // Register a car for the customer
        Car car = office.registerCar(customer, "ABC123", CarType.SUV);

        System.out.println("Registered Car: " + car);
        System.out.println("Assigned Permit: " + car.getPermit());

        // Create a parking lot
        ParkingLot lot = new ParkingLot(
                "LOT-1",
                new Address("100 Office Way", "", "Magna", "UT", "84044"),
                new Money(500)
        );
        office.addLot(lot);


        // Car enters the lot
        Money fee = lot.entry(car);
        ParkingCharge charge = office.addChargeForEntry(car, lot, fee);

        System.out.println("Parking Charge Recorded: " + charge);

        // Show all charges for this car
        System.out.println("\nCharges for Car " + car.getLicense() + ":");
        for (ParkingCharge c : office.getChargesForCar(car)) {
            System.out.println(" - " + c);
        }

        // Show all charges in the system
        System.out.println("\nAll Charges in System:");
        for (ParkingCharge c : office.getAllCharges()) {
            System.out.println(" - " + c);
        }
    }
}

