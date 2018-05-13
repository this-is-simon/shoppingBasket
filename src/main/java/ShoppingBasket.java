import java.util.ArrayList;

public class ShoppingBasket {

    public ArrayList<Item> items;
    public double basketTotal;

    public ShoppingBasket(){
        this.items = new ArrayList<>();
        this.basketTotal = 0.0;
    }

    public double getBasketTotal(){
        //for each item in array
        //get cost
        //add to total
    
        return this.basketTotal;

    }

    public void addItemToBasket(Item item){
        items.add(item);
    }

    public int countItems(){
        return items.size();
    }


}
