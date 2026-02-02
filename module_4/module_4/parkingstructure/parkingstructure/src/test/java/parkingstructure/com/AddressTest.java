package parkingstructure.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testAddressFormatting() {
        Address a = new Address("123 Main St", "Unit 5", "Magna", "UT", "84044");
        assertEquals("123 Main St, Unit 5, Magna, UT 84044", a.getAddressInfo());
    }
}