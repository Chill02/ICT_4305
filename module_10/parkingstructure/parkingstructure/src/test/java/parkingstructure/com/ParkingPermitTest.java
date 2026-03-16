package parkingstructure.com;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ParkingPermitTest {

    @Test
    void testPermitFields() {
        Car car = new Car("ABC123", CarType.SUV, "CUST-1");
        ParkingPermit permit = new ParkingPermit("PERMIT-1234", car);

        assertEquals("PERMIT-1234", permit.getId());
        assertEquals(car, permit.getCar());
        assertEquals(LocalDate.now(), permit.getRegistrationDate());
        assertEquals(LocalDate.now().plusYears(1), permit.getExpirationDate());
    }
}
