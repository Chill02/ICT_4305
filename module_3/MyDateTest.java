import org.junit.jupiter.api.Test;

import static javax.management.Query.and;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyDateTest {

    @Test
    void monthIsValid(){
    var month = new MyDate();
    assertTrue((month >1) and (month < 13) );month.getMonth();
    }
}