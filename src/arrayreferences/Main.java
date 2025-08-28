package arrayreferences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        a references is an address to the object in memory
        int[] myIntArray = new int[5];
//        reference to the same array hold the same address
        int[] anotherArray = myIntArray;

        System.out.println(
          "myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(
          "anotherArray = " + Arrays.toString(anotherArray));


//        will change both
        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println(
          "myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(
          "anotherArray = " + Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
