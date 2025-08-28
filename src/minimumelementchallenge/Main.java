package minimumelementchallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
          "Starting the array processor " + "application...");

        System.out.println("\n--- Reading Integers ---");
        int[] myNumbers = readIntegers();

        System.out.println(
          "You entered the array: " + Arrays.toString(myNumbers));

        System.out.println("\n--- Finding Minimum ---");
        int minimumValue = findMin(myNumbers);

        if (minimumValue == Integer.MAX_VALUE) {
            System.out.println("No minimum value found");
        } else {
            System.out.println(
              "The minimum value is " + minimumValue);
        }

        System.out.println("\nArray Processor application finished.");
    }

    public static int[] readIntegers() {
//      create scanner to read input form console
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a comma-delimited list of " +
              "numbers (e.g. 1,2,3,4,5):");
//            read input
            String inputLine = scanner.nextLine();

//            split the input string by commas into an array of
//            strings. .trim() removes any leading/trailing
//            whitespace.
            String[] numberStrings = inputLine.split(",");

//            create a new integer array
            int[] numbers = new int[numberStrings.length];

//            Loop through the string array, convert each string to
//            an int
            for (int i = 0; i < numberStrings.length; i++) {
                try {
//                    Integer.parseInt() converts a String to an int.
                    numbers[i] = Integer.parseInt(
                      numberStrings[i].trim());

                } catch (NumberFormatException e) {
//                    handle cases where the user might enter a non
//                   numeric text.
                    System.err.println("Warning: Could not parse '" +
                      numberStrings[i].trim() + "' as an integer.");

                }
            }
            return numbers;

        }

    }

    public static int findMin(int[] array) {
//        check if array is empty.
        if (array == null || array.length == 0)
            return Integer.MAX_VALUE;

//        assume the first element of the array is the minimum
//        initially
        int min = array[0];

//        loop through the rest of the array (starting from second
//        element)
        for (int i = 1; i < array.length; i++) {
//            if the current element is smaller than ou current
//            min, update min
            if (array[i] < min) {
                min = array[i];
            }
        }
//        after checking all elements, "min" will hold the smallest
//        value
        return min;

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input.trim());
    }

}
