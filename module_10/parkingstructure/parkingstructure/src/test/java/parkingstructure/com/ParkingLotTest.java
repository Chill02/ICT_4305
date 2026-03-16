package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void testEntryReturnsRate() {
        ParkingLot lot = new ParkingLot(
                "LOT-1",
                new Address("100 Office Way", "", "Magna", "UT", "84044"),
                new Money(500)
        );

        Car car = new Car("ABC123", CarType.SUV, "CUST-1");
        Money fee = lot.entry(car);

        assertEquals(500, fee.getCents());
    }
}
