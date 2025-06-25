import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe Burger", 8.00); // fix type and price
    }

//    @Override
//    public void addTopping(String toppingName, double price) {
//        if (getToppingCount() >= getMaxToppings()) {
//            System.out.printf("Too many toppings, max is %d",
//              getMaxToppings());
//        } else {
//            super.addTopping(toppingName, price);
//
//        }
//    }

    @Override
    public int getMaxToppings() {
        return 5;
    }

    @Override
    public double getBurgerPrice() {
        return super.getBasePrice();
    }

    @Override
    public void printDetails() {
        System.out.printf(
          "Deluxe Burger: %s - %.2f (toppings " + "included)%n",
          getType(), getBasePrice());
        ArrayList<String> toppingNames = getToppings();
        for (String topping : toppingNames) {
            System.out.println(" + " + topping);
        }
        System.out.printf("Burger total: %.2f%n", getBurgerPrice());
    }

}
