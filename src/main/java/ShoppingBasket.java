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
        return this.basketTotal;
    }

    //public Ticket sellTicket(Destination destination){
    //        for (int i = 0; i < ticketsForSale.size(); i++) {
    //            if (ticketsForSale.get(i).getDestination() == destination){
    //                return ticketsForSale.remove(i);
    //            }
    //        }
    //        return null;
    //    }


    public void addItemToBasket(Item item){
        items.add(item);
    }

    public int countItems(){
        return items.size();
    }


}
