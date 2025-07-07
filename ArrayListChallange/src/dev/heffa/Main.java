package dev.heffa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<String>();

        boolean running = true;

        while (running) {

            System.out.println("Available actions: \n" + "0 - to shutdown\n" +
              "1 - to add item(s) to list (comma delimited list)\n" +
              "2 - to remove any items (comma delimited list)\n" +
              "\nEnter a number for which action you want to do: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> running = false;
                case 1 -> add(shoppingList);
                case 2 -> remove(shoppingList);
                default -> System.out.println("Invalid choice");
            }
            shoppingList.sort(Comparator.naturalOrder());
            System.out.println();
            for (String item : shoppingList) {
                System.out.println(item);
            }
            System.out.println();


        }
    }

    private static void add(ArrayList<String> shoppingList) {
        System.out.println("Add to shopping list. eg(apple,oranges,cookies)");
        Scanner scanner = new Scanner(System.in);
//        could have used
//        String[] userInput = scanner.nextLine().split(",");
        String userInput = scanner.nextLine();

        String[] userInputArray = userInput.split(",");
        for (String newItemRaw : userInputArray) {
//            Trim spaces
            String newItem = newItemRaw.trim();

//            handle empty strings
            if (newItem.isBlank()) {
                continue;
            }

            boolean foundMatch = false;

            for (String itemInList : shoppingList) {
                if (newItem.equalsIgnoreCase(itemInList)) {
                    System.out.println(
                      "'" + itemInList + "' is already in the shopping list.");
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch) {
                shoppingList.add(newItem);
                System.out.println(
                  "'" + newItem + "' is added to the shopping list.");
            }

        }


    }

    private static void remove(ArrayList<String> shoppingList) {
        System.out.println(
          "To remove item from shopping list, write the item" + "(s)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split(",");

        for (String itemInListRaw : userInputArray) {

            String item = itemInListRaw.trim();

            if (item.isBlank()) {
                continue;
            }
            boolean foundMatch = false;

            for (String itemInList : shoppingList) {
                if (item.equalsIgnoreCase(itemInList)) {
                    System.out.println("'" + itemInList +
                      "' is removed from the shopping list.");
                    shoppingList.remove(item);
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch) {
                System.out.println("'" + item + "' is not on the list");

            }


        }
    }
}
