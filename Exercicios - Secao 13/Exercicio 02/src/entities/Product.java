package entities;

public class Product {
    protected String Name;
    protected double price;

    public Product(String name, double price) {
        Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceTag(){
        return Name + " $ " + price;
    }
}
