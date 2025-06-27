package dev.heffa;

import com.abc.first.Item;

public class Main {
    public static void main(String[] args) {

        Item firstItem = new Item("Burger");
        System.out.println(firstItem);
        com.abc.first.Item burger = new com.abc.first.Item("Burger2");
        System.out.println(burger);
    }
}
