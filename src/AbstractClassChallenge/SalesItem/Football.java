package AbstractClassChallenge.SalesItem;

import AbstractClassChallenge.ProductForSale;

public class Football extends ProductForSale {
    public Football(double price, String description) {
        super(ProductForSale.type.Home, price, description);
    }

    @Override public void showDetails() {
        System.out.println(this.description);
    }
}
