package parkingstructure.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCarRegistration() {
        Address a = new Address("123 Main", "", "Magna", "UT", "84044");
        Customer c = new Customer("Carl", a, "801-555-1212");

        Car car = c.register("XYZ999", CarType.COMPACT);

        assertEquals("XYZ999", car.getLicense());
        assertEquals(c.getCustomerId(), car.getOwner());
    }
}