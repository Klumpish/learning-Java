import java.awt.*;
import java.util.stream.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String bulletIt =
          "Print a bulleted list:\n" + "\t\u2022 First Point\n " +
            "\t\t\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
                           Print a bulleted List:
                                    \u2022 First Point
                                        \u2022 Second Point"
                           """;
        System.out.println(textBlock);

        int age = 36;
        System.out.printf("Your age is %d%n", age);
        int yearOfBirth = 2025 - age;
        double test = 25.44;
        System.out.printf("Age = %d, Birth year = %d%n test=%.2f%n",
          age, yearOfBirth, test);

        for (int i = 1; i <= 100_000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
//        works the same
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        
    }
}
