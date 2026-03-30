package entities;
import entities.Product;

public final class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return Name + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")\n";
    }

    public double totalPrice() {
        return price+customsFee;
    }
}
