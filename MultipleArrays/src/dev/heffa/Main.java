package dev.heffa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }

//            System.out.println();
        }

//        both does the same

//        for (var outer : array2) {
//            for (var el : outer) {
//                System.out.print(el + " ");
//            }
//            System.out.println();
//        }
//        prints out the int[][] int to [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]
        System.out.println(Arrays.deepToString(array2));
//        we need new int[] for this to work
        array2[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        System.out.println("_".repeat(20));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{{"1", "2"}, {"3", "4", "5"}, {"6", "7", "8", "9"}};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("_".repeat(20));
        for (Object el : anyArray) {
            System.out.println("el type = " + el.getClass().getSimpleName());
            System.out.println("el toString = " + el);
//                                                 we are casting (Object[]) to el
            System.out.println(Arrays.deepToString((Object[]) el));
        }
    }
}
