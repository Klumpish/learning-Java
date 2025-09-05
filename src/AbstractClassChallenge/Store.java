package AbstractClassChallenge;

import AbstractClassChallenge.SalesItem.Football;
import AbstractClassChallenge.SalesItem.Pc;
import AbstractClassChallenge.SalesItem.TVDinner;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static ArrayList<ProductForSale> StoreProducts = new ArrayList<>();

    public static void main(String[] args) {
        stackItems();
        List<OrderItem> orderItems = new ArrayList<>();
        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems.add(new OrderItem(3, new Football(20, "booncy ball")));
        orderItems.add(new OrderItem(5, new Football(20, "booncy ball")));
//        displayItemsOnSale(StoreProducts);
//        printOrder(orderItems);
        System.out.println("\nOrder 1");
        addItemToOrder(orderItems2, 1, 3);
        addItemToOrder(orderItems2, 0, 3);
//        displayItemsOnSale(StoreProducts);
        printOrder(orderItems2);

    }

    public static void displayItemsOnSale(List<ProductForSale> forSales) {
        forSales.forEach(p -> p.showDetails());
    }


    public static void stackItems() {
        StoreProducts.add(new Pc(50, "A pc of some kind."));
        StoreProducts.add(new Football(20, "look a ball"));
        StoreProducts.add(new TVDinner(5, "steamy tvdinner"));
        StoreProducts.add(new Football(20, "look a ball"));
        StoreProducts.add(new TVDinner(5, "steamy tvdinner"));

    }

    public static void addItemToOrder(List<OrderItem> order, int orderInxed,
                                      int quantity) {
        order.add(new OrderItem(quantity, StoreProducts.get(orderInxed)));
    }

    public static void printOrder(List<OrderItem> order) {
        double totalCost = 0;
        for (var item : order) {
            item.getProduct()
                .printPricedItem(item.getQuantity());
            totalCost += item.getProduct()
                             .getSalesPrice(item.getQuantity());
        }
        System.out.printf("Total cost: $%6.2f %n", totalCost);
    }
}
