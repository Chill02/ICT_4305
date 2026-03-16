package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testAddressFormattingWithStreet2() {
        Address a = new Address("123 Main St", "Apt 4B", "Magna", "UT", "84044");
        assertEquals("123 Main St, Apt 4B, Magna, UT 84044", a.getAddressInfo());
    }

    @Test
    void testAddressFormattingWithoutStreet2() {
        Address a = new Address("456 Elm St", "", "Salt Lake City", "UT", "84101");
        assertEquals("456 Elm St, Salt Lake City, UT 84101", a.getAddressInfo());
    }

    @Test
    void testToStringDelegatesToGetAddressInfo() {
        Address a = new Address("789 Oak St", "", "Provo", "UT", "84601");
        assertEquals(a.getAddressInfo(), a.toString());
    }

    @Test
    void testEqualsAndHashCode() {
        Address a1 = new Address("123 Main St", "Apt 4B", "Magna", "UT", "84044");
        Address a2 = new Address("123 Main St", "Apt 4B", "Magna", "UT", "84044");

        assertEquals(a1, a2);
        assertEquals(a1.hashCode(), a2.hashCode());
    }
}
