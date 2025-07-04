package dev.heffa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 23, 14, 22, 77};
        System.out.println(Arrays.toString(numbers));

//        reverse(numbers);
//        System.out.println(Arrays.toString(numbers));
        System.out.println("-".repeat(20));
//        int[] numbers2 = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(numbers2));
//        reverse2v(numbers2);
//        System.out.println(Arrays.toString(numbers2));
        int[] reversedCopy = reverseCopy(numbers);
        System.out.println(
          "After reverse " + Arrays.toString(numbers));
        System.out.println(
          "reversedCopy " + Arrays.toString(reversedCopy));
    }

    private static void reverse(int[] arr) {
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int first = arr[i];
            int last = arr[arr.length - i - 1];

            arr[i] = last;
            arr[arr.length - i - 1] = first;
            System.out.println(
              "--> Swapping " + first + " to " + last);
            System.out.println("--> " + Arrays.toString(arr));

        }

    }

    private static void reverse2v(int[] arr) {
        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;

            System.out.println("--> " + Arrays.toString(arr));
        }
    }

    private static int[] reverseCopy(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int maxIndex = arr.length - 1;
        for (int el : arr) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
