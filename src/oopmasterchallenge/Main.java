package oopmasterchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bill's Burger Joint!");
        System.out.println("1. Default Meal");
        System.out.println("2. Custom Meal");
        System.out.println("3. Deluxe Meal");
        System.out.print("Choose your meal type: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (choice == 1) {
            MealOrder defaultMeal = new MealOrder();
            System.out.println(
              "\n--- You selected: default Meal " + "---");
            defaultMeal.printItemizedList();
        } else if (choice == 2) {
            System.out.print("Enter burger type: ");
            String burgerType = scanner.nextLine();

            System.out.print("Enter burger base price: ");
            double burgerPrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter drink type: ");
            String drinkType = scanner.nextLine();

            System.out.print(
              "Enter drink size (small/medium/large): ");
            String drinkSize = scanner.nextLine();

            System.out.print("Enter side item type: ");
            String sideType = scanner.nextLine();

            System.out.print("Enter side item price: ");
            double sidePrice = scanner.nextDouble();
            scanner.nextLine();

            Burger customBurger = new Burger(burgerType, burgerPrice);
            Drink customDrink = new Drink(drinkType, drinkSize);
            SideItem customSide = new SideItem(sideType, sidePrice);
            MealOrder customMeal = new MealOrder(customBurger,
              customDrink, customSide);

            System.out.print(
              "How many toppings would you like to add? (0–3): ");
            int toppingCount = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int i = 1; i <= toppingCount && i <= 3; i++) {
                System.out.printf("Enter topping %d name: ", i);
                String toppingName = scanner.nextLine();

                System.out.printf("Enter topping %d price: ", i);
                double toppingPrice = scanner.nextDouble();
                scanner.nextLine();

                customMeal.addBurgerTopping(toppingName,
                  toppingPrice);
            }

            System.out.println("\n--- Your Custom Meal ---");
            customMeal.printItemizedList();

        } else if (choice == 3) {
            DeluxeBurger deluxeBurger = new DeluxeBurger();

            System.out.print(
              "How many toppings for your deluxe burger? (0–5): ");
            int toppingCount = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int i = 1; i <= toppingCount && i <= 5; i++) {
                System.out.printf("Enter topping %d name: ", i);
                String toppingName = scanner.nextLine();

                deluxeBurger.addTopping(toppingName,
                  0); // price doesn’t matter
            }

            System.out.print("Enter drink type: ");
            String drinkType = scanner.nextLine();

            System.out.print(
              "Enter drink size (small/medium/large): ");
            String drinkSize = scanner.nextLine();

            System.out.print("Enter side item type: ");
            String sideType = scanner.nextLine();

            System.out.print("Enter side item price: ");
            double sidePrice = scanner.nextDouble();
            scanner.nextLine();

            Drink drink = new Drink(drinkType, drinkSize);
            SideItem sideItem = new SideItem(sideType, sidePrice);

            MealOrder deluxeMeal = new MealOrder(deluxeBurger, drink,
              sideItem);

            System.out.println("\n--- Your Deluxe Meal ---");
            deluxeMeal.printItemizedList();

        }


//        MealOrder mealOrder = new MealOrder();
//        mealOrder.printItemizedList();
//
//        var burger = new Burger("bacon", 4.33);
//        var drink = new Drink("Fanta", "medium");
//        var sideItem = new SideItem("cheese", 1.5);
//        System.out.println();
//        MealOrder baconBurger = new MealOrder(burger, drink,
//          sideItem);
//        baconBurger.addBurgerTopping("cheese", 0.33);
//        baconBurger.addBurgerTopping("cheese", 0.33);
//        baconBurger.addBurgerTopping("onions", 0.15);
//        baconBurger.printItemizedList();
//
//        var deluxburger = new DeluxeBurger();
//
//        deluxburger.addTopping("ice-cream", 0.33);
//
//        deluxburger.addTopping("a whole goat", 0.33);
//        deluxburger.addTopping("basketball", 0.33);
//
//        MealOrder delux = new MealOrder(deluxburger, drink, sideItem);
//        System.out.println();
//        delux.printItemizedList();


    }
}
