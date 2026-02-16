package parkingstructure.com;

public class App {
    public static void main(String[] args) {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Address custAddr = new Address("123 Main St", "Apt 4B", "Magna", "UT", "84044");
        Customer customer = office.register("Carl", custAddr, "801-555-1212");

        Car car = office.register(customer, "ABC123", CarType.SUV);

        ParkingLot lot = new ParkingLot("LOT-1", officeAddr, 2, office);
        office.addLot(lot);

        Money charge = lot.entry(car);
        System.out.println("Charge incurred: " + charge);

        System.out.println("Total charges recorded: " + office.getCharges().size());
    }
}

