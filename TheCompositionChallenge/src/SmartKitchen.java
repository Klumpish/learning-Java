public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher,
                        Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
        System.out.println("CoffeeMaker - true");
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
        System.out.println("Refrigerator - true");
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
        System.out.println("DishWasher - true");
    }

    public void setKitchenState(boolean CoffeeMaker,
                                boolean Refrigerator,
                                boolean DishWasher) {
        brewMaster.setHasWorkToDo(CoffeeMaker);
        iceBox.setHasWorkToDo(Refrigerator);
        dishWasher.setHasWorkToDo(DishWasher);
        System.out.printf("coffee %s, fridge %s, washer %s\n",
          CoffeeMaker, Refrigerator, DishWasher);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

