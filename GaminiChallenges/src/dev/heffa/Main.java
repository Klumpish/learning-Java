package dev.heffa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 33, 12};
        Arrays.sort(numbers);
        String oddEven = Arrays.toString(countEvenAndOdd(numbers));
        System.out.println("even ->" + oddEven + "<- odd");
    }

    public static int[] countEvenAndOdd(int[] arr) {
        int[] oddsAndEven = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddsAndEven[0]++;
            } else {
                oddsAndEven[1]++;
            }
        }
        return oddsAndEven;
    }
}
