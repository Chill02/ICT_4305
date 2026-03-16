package parkingstructure.com;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkingOfficeTest {

    @Test
    void testRegisterCustomerAndCarAssignsPermit() {
        ParkingOffice office = new ParkingOffice(
                "Magna Parking Office",
                new Address("123 Main St", "", "Magna", "UT", "84044")
        );

        Customer customer = office.registerCustomer(
                "Alice Johnson",
                new Address("456 Elm St", "", "Salt Lake City", "UT", "84101"),
                "801-555-1212"
        );

        Car car = office.registerCar(customer, "ABC123", CarType.SUV);

        assertNotNull(car.getPermit());
        assertEquals(car, car.getPermit().getCar());
    }

    @Test
    void testAddChargeForEntryAndQueries() {
        ParkingOffice office = new ParkingOffice(
                "Magna Parking Office",
                new Address("123 Main St", "", "Magna", "UT", "84044")
        );

        Customer customer = office.registerCustomer(
                "Bob Smith",
                new Address("789 Oak St", "", "Provo", "UT", "84601"),
                "801-555-9999"
        );

        Car car = office.registerCar(customer, "XYZ789", CarType.COMPACT);

        ParkingLot lot = new ParkingLot(
                "LOT-1",
                new Address("100 Office Way", "", "Magna", "UT", "84044"),
                new Money(500)
        );
        office.addLot(lot);

        Money fee = lot.entry(car);
        ParkingCharge charge = office.addChargeForEntry(car, lot, fee);

        assertNotNull(charge);

        List<ParkingCharge> carCharges = office.getChargesForCar(car);
        assertEquals(1, carCharges.size());

        List<ParkingCharge> allCharges = office.getAllCharges();
        assertEquals(1, allCharges.size());
    }
}

