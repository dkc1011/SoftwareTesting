package Feb12;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class RobotTest3 {

    private int age;
    private double expected;

    public RobotTest3(double expected, int age) {
        this.age = age;
        this.expected = expected;
    }

    @Parameterized.Parameters (name= "{index}: checkCost({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {10000, 1},
                {10000 , 5},
                {7500, 6},
                {7500, 10},
                {5000, 64},
        });
    }

    @Test
    public void checkCostAll()
    {

    }
}