package arraychallange;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = randomArray(10);
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        int[] reversedArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            reversedArray[i] = array1[array1.length - i - 1];

        }
        
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] randomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }


}
