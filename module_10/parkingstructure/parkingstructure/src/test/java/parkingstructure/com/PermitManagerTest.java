package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermitManagerTest {

    @Test
    void testRegisterCreatesPermit() {
        PermitManager pm = new PermitManager();
        Car car = new Car("ABC123", CarType.SUV, "CUST-1");

        ParkingPermit permit = pm.register(car);

        assertNotNull(permit);
        assertNotNull(permit.getId());
        assertTrue(permit.getId().startsWith("PERMIT-"));
        assertEquals(car, permit.getCar());
        assertEquals(permit, pm.getPermit(permit.getId()));
    }
}

