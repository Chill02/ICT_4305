package parkingstructure.com;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargeTest {

    @Test
    void testParkingChargeFields() {
        Money amount = new Money(750);
        Instant now = Instant.now();
        ParkingCharge charge = new ParkingCharge("PERMIT-1234", "LOT-1", now, amount);

        assertEquals("PERMIT-1234", charge.getPermitId());
        assertEquals("LOT-1", charge.getLotId());
        assertEquals(amount, charge.getAmount());
        assertNotNull(charge.toString());
    }
}
