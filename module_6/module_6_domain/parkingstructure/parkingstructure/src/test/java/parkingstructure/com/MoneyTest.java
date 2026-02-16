package parkingstructure.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void testGetDollars() {
        Money m = new Money(1234); // $12.34
        assertEquals(12.34, m.getDollars(), 0.0001);
    }

    @Test
    void testToString() {
        Money m = new Money(500); // $5.00
        assertEquals("$5.00", m.toString());
    }
}
