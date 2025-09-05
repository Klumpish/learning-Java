package AbstractClassChallenge.SalesItem;

import AbstractClassChallenge.ProductForSale;

public class Pc extends ProductForSale {
    public Pc(double price, String description) {
        super(ProductForSale.type.Electricity, price, description);
    }

    @Override public void showDetails() {
        System.out.println(this.description);
    }
}
