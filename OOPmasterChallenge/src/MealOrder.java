public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
        this.burger = new Burger("Cheese Burger", 3.5);
        this.drink = new Drink("Cola", "small");
        this.sideItem = new SideItem("Fries", 1.5);
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void addBurgerTopping(String name, double price) {
        burger.addTopping(name, price);
    }

    public void changeDrinkSize(String newSize) {
        drink.setSize(newSize);
    }

    public void printItemizedList() {
        burger.printDetails();
        System.out.printf("Drink: %s (%s) - %.2f\n", drink.getType(),
          drink.getSize(), drink.getPrice());
        System.out.printf("Side: %s - %.2f\n", sideItem.getType(),
          sideItem.getPrice());
        System.out.printf("TOTAL: %.2f\n", getTotalPrice());
    }

    public double getTotalPrice() {
        return burger.getBurgerPrice() + drink.getPrice() +
          sideItem.getPrice();
    }
}
