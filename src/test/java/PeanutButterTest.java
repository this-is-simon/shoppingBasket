import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeanutButterTest {
    PeanutButter peanutButter1;

    @Before
    public void before(){
        peanutButter1 = new PeanutButter("Mr Jones Peanut Butter", "Mr Jones", 3.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Mr Jones Peanut Butter", peanutButter1.getName());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Mr Jones", peanutButter1.getBrand());
    }

    @Test
    public void canGetPrice() {
        assertEquals(3.50, peanutButter1.getPrice(), 0);
    }
}
