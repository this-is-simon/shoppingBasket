public abstract class Item {

    public String name;
    public String brand;
    public double price;

    public Item(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }

}
