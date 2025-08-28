package jetstreamformatmaplists;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,
          10);
        numbers.stream()
               .filter(even -> even % 2 == 0)
               .map(even -> even * even)
               .forEach(System.out::println);

        System.out.println("-".repeat(30));

        List<String> words = List.of("sun", "cloud", "sky", "moon",
          "star", "space", "Sea", "mountain", "Stone", "storm");

        words.stream()
             .filter(word -> word.toUpperCase().startsWith("S"))
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);

        System.out.println("-".repeat(30));

        List<Person> people = List.of(new Person("Alice", 17),
          new Person("Bob", 20), new Person("Charlie", 16),
          new Person("Diana", 23), new Person("Eve", 18));

//      toList makes sends our filtered people to
//        the list we assigned it too.
        List<Person> adults = people.stream()
                                    .filter(
                                      person -> person.getAge() >= 18)
                                    .toList();


        for (Person person : adults) {
            System.out.println(person);
        }
    }

}
