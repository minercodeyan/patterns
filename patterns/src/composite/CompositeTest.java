package composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {

    @Test
    public void confectionerTest() {
        Confectioner confectioner = new Confectioner();
        String actual = confectioner.fulfillAnOrder();
        String expected = "Confectioner makes a cake";
        assertEquals(expected,actual);
    }

    @Test
    public void packerTest() {
        Packer packer = new Packer();
        String actual = packer.fulfillAnOrder();
        String expected = "Packer packs a cake";
        assertEquals(expected,actual);
    }

    @Test
    public void courierTest() {
        Courier courier = new Courier();
        String actual = courier.fulfillAnOrder();
        String expected = "Courier delivers cookies";
        assertEquals(expected,actual);
    }
}