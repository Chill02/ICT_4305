package parkingstructure.com;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargeTest {

    @Test
    void testConstructorAndGetters() {
        Money amount = new Money(500);
        Instant now = Instant.now();

        ParkingCharge charge = new ParkingCharge("PERMIT-1234", "LOT-1", now, amount);

        assertEquals("PERMIT-1234", charge.getPermitId());
        assertEquals("LOT-1", charge.getLotId());
        assertEquals(now, charge.getIncurred());
        assertEquals(amount, charge.getAmount());
    }
}
