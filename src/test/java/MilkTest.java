import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MilkTest {

    Milk milk1;

    @Before
    public void before(){
        milk1 = new Milk("1L SuperCow Milk", "SuperCow", 1.20);
    }

    @Test
    public void hasName(){
        assertEquals("1L SuperCow Milk", milk1.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("SuperCow", milk1.getBrand());
    }

    @Test
    public void hasCost(){
        assertEquals(1.20, milk1.getPrice(), 0.0);
    }

}