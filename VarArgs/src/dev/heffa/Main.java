package dev.heffa;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World");
//        splits string split on a space
        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    //                                String... textList is the
//                                Variable argument.
    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
