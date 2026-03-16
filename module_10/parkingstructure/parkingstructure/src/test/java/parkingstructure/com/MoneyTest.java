package parkingstructure.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testGetCents() {
        Money m = new Money(750);
        assertEquals(750, m.getCents());
    }

    @Test
    void testGetDollars() {
        Money m = new Money(1234); // $12.34
        assertEquals(12.34, m.getDollars(), 0.0001);
    }

    @Test
    void testToStringFormatting() {
        Money m = new Money(500); // $5.00
        assertEquals("$5.00", m.toString());
    }

    @Test
    void testZeroMoney() {
        Money m = new Money(0);
        assertEquals("$0.00", m.toString());
        assertEquals(0, m.getCents());
        assertEquals(0.0, m.getDollars(), 0.0001);
    }
}
