package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeTest {

    @Test
    void beMade() {
        Cake cake = new Cake();
        Confectioner strawberryCakeConfectioner = new StrawberryCakeConfectioner();
        int actual = cake.beMade(strawberryCakeConfectioner);
        int expected = 2;
        assertEquals(expected, actual);
    }
}