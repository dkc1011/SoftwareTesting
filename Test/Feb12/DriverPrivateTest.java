package Feb12;


import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.junit.Assert.*;

public class DriverPrivateTest {

    /**
     * Accessing a private member
     * Test of setDriver method, of class Driver.
     */

    @Test
    public void testSetDriverNum2() throws Exception {
        System.out.println("setDriverNum2");
        /* Set up a new Robot */
        Driver target = new Driver("robbie", 321);

        /* get the setAge method details */
        Method method = Driver.class.getDeclaredMethod("setDriverNum", int.class);

        /* make the method accessible */
        method.setAccessible(true);

        /* invoke the method setDriverNum with the value 7 */
        method.invoke(target, 321);

        /*access the field age and check its value is set to 7*/
        Class secretClass = target.getClass();

        Field f = secretClass.getDeclaredField("driverNum");

        f.setAccessible(true);

        int result =  f.getInt(target);
        System.out.println("The value in f (DriverNum) is " + f.get(target));
        assertEquals("The Driver Numbers should be equal", 321,  result);
    }

}