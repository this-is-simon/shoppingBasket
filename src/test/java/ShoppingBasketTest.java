import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket1;
    Milk milk1;

    @Before
    public void before(){
        shoppingBasket1 = new ShoppingBasket();
    }

    @Test
    public void emptyBasketTotalIsZero(){
        assertEquals(0.0, shoppingBasket1.getBasketTotal(), 0.0);
    }

    @Test
    public void canAddToBasket(){
        shoppingBasket1.addItemToBasket(milk1);
        assertEquals(1, shoppingBasket1.countItems());
    }

//    @Test
//    public void canGetBasketTotal(){
//        assertEquals(0.0, shoppingBasket1.getBasketTotal(), 0.0);
//    }

}