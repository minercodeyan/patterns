package template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CourierTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {20, 40, 20}, {30, 25, -5}, {15, 15, 0}, {56, 50, -7}, {40, 50, 10}
        });
    }

    private int input1;
    private int input2;
    private int expected;

    public CourierTest(int input1, int input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Test
    public void countTheChangeTest() {
        assertEquals(Courier.countTheChange(input1, input2), expected);
    }
}