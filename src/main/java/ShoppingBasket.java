import java.util.ArrayList;

public class ShoppingBasket {

    public ArrayList<Item> items;
    public double basketTotal;

    public ShoppingBasket(){
        this.items = new ArrayList<>();
        this.basketTotal = 0.0;
    }

    public double getBasketTotal(){
        for (Item item : items) {
            basketTotal += item.getPrice();
        }

        if (basketTotal >= 20.0) {
            applyDiscountOverTwentyPounds();
        }

        return this.basketTotal;
    }

    public void applyDiscountOverTwentyPounds(){
        if (basketTotal >= 20.0) {
            double discount = basketTotal * 0.1;
            basketTotal -= discount;
        }
    }

    public void addItemToBasket(Item item){
        items.add(item);
    }

    public int countItems(){
        return items.size();
    }

}
