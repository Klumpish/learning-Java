package AbstractClassChallenge;

public abstract class ProductForSale {
    private type type;
    private double price;
    protected String description;

    public ProductForSale() {

    }

    public ProductForSale(type type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected enum type {
        Food, Electricity, Home
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", quantity, price,
          type, description);
    }

    public abstract void showDetails();
}
