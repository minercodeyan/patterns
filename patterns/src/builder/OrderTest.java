package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void buildCake() {
        Order order = new Order();
        order.setBuilder(new BiscuitStrawberryCakeBuilder());
        String actual = order.buildCake().toString();
        String expected = "Cake{name='Biscuit strawberry cake', weight=3.0, decor=Berries, price=100}";
        assertEquals(expected,actual);
    }
}