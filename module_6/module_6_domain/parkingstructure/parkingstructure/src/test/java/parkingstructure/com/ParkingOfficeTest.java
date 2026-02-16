package parkingstructure.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingOfficeTest {

    @Test
    void testRegisterCustomerAndCar() {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Address custAddr = new Address("123 Main", "", "Magna", "UT", "84044");
        Customer c = office.register("Carl", custAddr, "801-555-1212");

        assertNotNull(c.getCustomerId());
        assertEquals("Carl", c.getName());
        assertEquals(1, office.getCustomers().size());

        Car car = office.register(c, "XYZ999", CarType.COMPACT);
        assertEquals("XYZ999", car.getLicense());
        assertEquals(c.getCustomerId(), car.getOwner());
        assertEquals(1, office.getCars().size());
    }

    @Test
    void testGetCustomerByName() {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Address custAddr = new Address("123 Main", "", "Magna", "UT", "84044");
        office.register("Carl", custAddr, "801-555-1212");

        Customer found = office.getCustomer("Carl");
        assertNotNull(found);
        assertEquals("Carl", found.getName());

        assertNull(office.getCustomer("Nonexistent"));
    }

    @Test
    void testAddCharge() {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Money amount = new Money(500);
        ParkingCharge charge = new ParkingCharge("PERMIT-1", "LOT-1", java.time.Instant.now(), amount);

        Money returned = office.addCharge(charge);
        assertEquals(amount, returned);
        assertEquals(1, office.getCharges().size());
    }
}
