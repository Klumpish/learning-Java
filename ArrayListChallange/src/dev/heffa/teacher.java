package dev.heffa;

import java.util.ArrayList;
import java.util.Scanner;

public class teacher {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void addItems(ArrayList<String> groceries) {
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
//             will check if an input is already in list if so it will have
//             index of > 1
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }

        }

    }

    private static void removeItems(ArrayList<String> groceries) {
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);


        }

    }
}
