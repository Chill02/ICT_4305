import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerAbstractTest {

    @Test
    void testNFLPlayerA() {
        PlayerA p = new NFLPlayerA("Patrick Mahomes", 98);

        assertEquals("Patrick Mahomes", p.getNameA());
        assertEquals(98, p.getStatsA());
        assertEquals("NFL", p.getSportA());
    }

    @Test
    void testNBAPlayerA() {
        PlayerA p = new NBAPlayerA("Stephen Curry", 96);

        assertEquals("Stephen Curry", p.getNameA());
        assertEquals(96, p.getStatsA());
        assertEquals("NBA", p.getSportA());
    }
}
