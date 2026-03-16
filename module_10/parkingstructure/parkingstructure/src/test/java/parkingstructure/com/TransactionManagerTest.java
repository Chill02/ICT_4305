package parkingstructure.com;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    @Test
    void testRecordChargeAndQueries() {
        TransactionManager tm = new TransactionManager();
        Car car = new Car("ABC123", CarType.SUV, "CUST-1");
        ParkingPermit permit = new ParkingPermit("PERMIT-1", car);
        ParkingLot lot = new ParkingLot(
                "LOT-1",
                new Address("100 Office Way", "", "Magna", "UT", "84044"),
                new Money(500)
        );

        ParkingCharge charge = tm.recordCharge(permit, lot, new Money(500));

        assertNotNull(charge);
        assertEquals("PERMIT-1", charge.getPermitId());
        assertEquals("LOT-1", charge.getLotId());

        List<ParkingCharge> byPermit = tm.getChargesForPermit("PERMIT-1");
        assertEquals(1, byPermit.size());
        assertEquals(charge, byPermit.get(0));

        List<ParkingCharge> all = tm.getAllCharges();
        assertEquals(1, all.size());
    }
}

