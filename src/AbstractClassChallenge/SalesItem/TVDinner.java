package AbstractClassChallenge.SalesItem;

import AbstractClassChallenge.ProductForSale;

public class TVDinner extends ProductForSale {
    public TVDinner(double price, String description) {
        super(ProductForSale.type.Food, price, description);
    }

    @Override public void showDetails() {
        System.out.println(this.description);
    }
}
