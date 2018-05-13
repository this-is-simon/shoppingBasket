import java.util.ArrayList;

public class ShoppingBasket {

    public ArrayList<Item> items;
    public double basketTotal;

    public ShoppingBasket(){
        this.items = new ArrayList<>();
        this.basketTotal = 0.0;
    }

    public double getBasketTotal(){
        return this.basketTotal;
    }

    public void addItemToBasket(Item item){
        items.add(item);
    }


}
