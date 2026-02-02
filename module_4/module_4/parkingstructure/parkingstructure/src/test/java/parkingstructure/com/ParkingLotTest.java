package parkingstructure.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void testParkingLotCapacity() {
        Address a = new Address("123 Main", "", "Magna", "UT", "84044");
        ParkingLot lot = new ParkingLot("LOT-1", a, 1);

        Customer c = new Customer("Carl", a, "801-555-1212");
        Car car1 = c.register("AAA!!!", CarType.SUV);
        Car car2 = c.register("BBB@@@", CarType.COMPACT);

        lot.entry(car1);
        lot.entry(car2); //should be denied

        assertEquals(1, lot.getCarCount());
    }
}