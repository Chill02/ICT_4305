package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCustomerFieldsStoredCorrectly() {
        Address addr = new Address("123 Main", "", "Magna", "UT", "84044");
        Customer c = new Customer("Alice", addr, "801-555-1212");

        assertEquals("Alice", c.getName());
        assertEquals(addr, c.getAddress());
        assertEquals("801-555-1212", c.getPhoneNumber());
        assertNotNull(c.getCustomerId());
    }

    @Test
    void testToStringContainsKeyFields() {
        Address addr = new Address("456 Elm", "", "Salt Lake City", "UT", "84101");
        Customer c = new Customer("Charlie", addr, "801-222-3333");

        String s = c.toString();
        assertTrue(s.contains("Charlie"));
        assertTrue(s.contains("801-222-3333"));
        assertTrue(s.contains(addr.toString()));
    }
}
