package RandomStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Random {
    public static void main(String[] args) {

//        System.out.println(backAround(new int[]{1, 1, 2, 3, 1}));
//        System.out.println(backAround(new int[]{1, 1, 2, 4, 1}));
//        System.out.println(backAround(new int[]{1, 1, 2, 1, 2, 3}));
//        System.out.println(backAround("yakpak"));
//        System.out.println(backAround("pakyak"));
//        System.out.println(backAround("yak123ya"));

//        var b1 = Arrays.asList("hello", "there");
//        var c1 = Arrays.asList("yay");

//        var b = Arrays.asList(16, 8, 886, 8, 1);
//        var c = Arrays.asList(10, 0);

//        System.out.println(backAround1(b));
//        System.out.println(backAround1(c));

//        System.out.println(backAround(b1));
//        System.out.println(backAround(c1));

        var a = Arrays.asList(3, 1, 4);
        System.out.println(backAround1(a));
//        var a1 = Arrays.asList("a", "b", "cy");
//        System.out.println(backAround(a1));

    }

    public static List<Integer> backAround1(List<Integer> nums) {
        return nums.stream()
                   .map(n -> (n * n) + 10)
                   .filter(n -> n % 10 != 5 && n % 10 != 6)
                   .collect(Collectors.toList());

    }

    public static List<String> backAround(List<String> strings) {
        return strings.stream()
                      .map(s -> s + "y")
                      .filter(s -> s.contains("yy") == false)
                      .collect(Collectors.toList());


    }
}

