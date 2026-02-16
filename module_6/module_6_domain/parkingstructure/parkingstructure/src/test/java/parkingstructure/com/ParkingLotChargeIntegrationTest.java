package parkingstructure.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotChargeIntegrationTest {

    @Test
    void testEntryCreatesCharge() {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Address custAddr = new Address("123 Main", "", "Magna", "UT", "84044");
        Customer c = office.register("Carl", custAddr, "801-555-1212");
        Car car = office.register(c, "AAA111", CarType.SUV);

        ParkingLot lot = new ParkingLot("LOT-1", officeAddr, 2, office);
        office.addLot(lot);

        Money fee = lot.entry(car);

        assertNotNull(fee);
        assertEquals(1, lot.getCarCount());
        assertEquals(1, office.getCharges().size());
        assertEquals(500, office.getCharges().get(0).getAmount().getCents());
    }

    @Test
    void testEntryDeniedWhenFull() {
        Address officeAddr = new Address("100 Office Way", "", "Magna", "UT", "84044");
        ParkingOffice office = new ParkingOffice("Magna Parking Office", officeAddr);

        Address custAddr = new Address("123 Main", "", "Magna", "UT", "84044");
        Customer c = office.register("Carl", custAddr, "801-555-1212");
        Car car1 = office.register(c, "AAA111", CarType.SUV);
        Car car2 = office.register(c, "BBB222", CarType.COMPACT);

        ParkingLot lot = new ParkingLot("LOT-1", officeAddr, 1, office);

        Money fee1 = lot.entry(car1);
        Money fee2 = lot.entry(car2);

        assertNotNull(fee1);
        assertNull(fee2);
        assertEquals(1, lot.getCarCount());
        assertEquals(1, office.getCharges().size());
    }
}
