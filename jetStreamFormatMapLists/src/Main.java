import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,
          10);
        numbers.stream()
               .filter(even -> even % 2 == 0)
               .map(even -> even * even)
               .forEach(System.out::println);
    }
}
