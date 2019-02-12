package Feb12;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

public class DriverTest {

        Driver driver1 = new Driver("Liam", 1234);

        @Rule
        public Timeout globalTimeout = Timeout.millis(900);

        @Test
        public void testDriverInstance()
        {
            assertEquals("Liam", driver1.getDriverName());
            assertEquals(1234, driver1.getDriverNum());
        }

        @Test (expected = IllegalArgumentException.class)
        //Expected illegalArgumentException.class
        public void testDriverNumberFail()
        {
            Driver driver2 = new Driver("Modestas", 98);
        }

        @Test
        public void waitTillBanned()
        {

        }
}