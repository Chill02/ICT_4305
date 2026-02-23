import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerInterfaceTest {

    @Test
    void testNFLPlayer() {
        Player p = new NFLPlayer("Tom Brady", 99);

        assertEquals("Tom Brady", p.getName());
        assertEquals(99, p.getStats());
        assertEquals("NFL", p.getSport());
    }

    @Test
    void testNBAPlayer() {
        Player p = new NBAPlayer("LeBron James", 97);

        assertEquals("", p.getName());
        assertEquals(97, p.getStats());
        assertEquals("NBA", p.getSport());
    }
}
