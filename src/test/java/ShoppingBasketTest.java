import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket1;
    Milk milk1;
    Milk milk2;

    @Before
    public void before(){
        shoppingBasket1 = new ShoppingBasket();
        milk1 = new Milk("1L SuperCow", "SuperCow", 1.20);
        milk2 = new Milk("1L HappyCow", "HappyCow", 1.30);
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

    @Test
    public void canGetBasketTotal__oneItem(){
        shoppingBasket1.addItemToBasket(milk1);
        assertEquals(1.20, shoppingBasket1.getBasketTotal(), 0.0);
    }

    @Test
    public void canGetBasketTotal__twoItems(){
        shoppingBasket1.addItemToBasket(milk1);
        shoppingBasket1.addItemToBasket(milk2);
        assertEquals(2.50, shoppingBasket1.getBasketTotal(), 0.0);
    }

}