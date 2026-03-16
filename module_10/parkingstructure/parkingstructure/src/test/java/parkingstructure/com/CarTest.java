package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarFieldsStoredCorrectly() {
        Car car = new Car("ABC123", CarType.SUV, "CUST-001");

        assertEquals("ABC123", car.getLicense());
        assertEquals(CarType.SUV, car.getType());
        assertEquals("CUST-001", car.getOwnerId());
        assertNull(car.getPermit());
    }

    @Test
    void testAssignPermit() {
        Car car = new Car("XYZ789", CarType.COMPACT, "CUST-002");
        ParkingPermit permit = new ParkingPermit("PERMIT-1", car);

        car.assignPermit(permit);

        assertNotNull(car.getPermit());
        assertEquals("PERMIT-1", car.getPermit().getId());
        assertEquals(car, car.getPermit().getCar());
    }

    @Test
    void testEqualsBasedOnLicense() {
        Car c1 = new Car("ABC123", CarType.SUV, "C1");
        Car c2 = new Car("abc123", CarType.COMPACT, "C2");

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    @Test
    void testNotEqualsDifferentLicense() {
        Car c1 = new Car("AAA111", CarType.SUV, "C1");
        Car c2 = new Car("BBB222", CarType.SUV, "C1");

        assertNotEquals(c1, c2);
    }
}
