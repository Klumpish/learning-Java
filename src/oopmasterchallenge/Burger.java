package oopmasterchallenge;

import java.util.ArrayList;

public class Burger {
    private String type;
    protected double basePrice;
    private ArrayList<String> toppings;
    private ArrayList<Double> toppingPrices;

    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        this.toppings = new ArrayList<>();
        this.toppingPrices = new ArrayList<>();
    }

    public void addTopping(String toppingName, double price) {
        if (toppings.size() >= getMaxToppings()) {
            System.out.printf("Too many toppings, max is %d",
              getMaxToppings());
        } else {
            toppings.add(toppingName);
            toppingPrices.add(price);
        }
    }

    public int getMaxToppings() {
        return 3;
    }

    public double getBurgerPrice() {
        double sum = 0;
        for (double price : toppingPrices) {
            sum += price;
        }
        return basePrice + sum;
    }

    public void printDetails() {
        System.out.printf("Burger: %s - %.2f%n", type, basePrice);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.printf(" + %s: %.2f%n", toppings.get(i),
              toppingPrices.get(i));

        }
        System.out.printf("Burger total: %.2f%n", getBurgerPrice());


    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public ArrayList<Double> getToppingPrices() {
        return toppingPrices;
    }

    public int getToppingCount() {
        return toppings.size();
    }

}
