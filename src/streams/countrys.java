package streams;

import java.util.*;
import java.util.stream.Collectors;

public class countrys {
    public static void main(String[] args) {
        World world = new World();
        var countries = populate();
        countries.forEach(world::addCountry);

        world.getPopFromCountriesWith7LettersName();
//        world.getFiveFirstCountriesWithLowestPopulation();
    }

    public static List<Country> populate() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Sverige", "Stockholm", 10.07, 450_295));
        countries.add(new Country("Norge", "Oslo", 5.27, 323_802));
        countries.add(new Country("Island", "Reykjavik", 0.33, 102_775));
        countries.add(new Country("Danmark", "Köpenhamn", 5.75, 42_931));
        countries.add(new Country("Finland", "Helsinki", 5.51, 338_424));
        countries.add(new Country("Belgien", "Bryssel", 11.30, 30_528));
        countries.add(new Country("Tyskland", "Berlin", 82.18, 357_168));
        countries.add(new Country("Frankrike", "Paris", 66.99, 640_679));
        countries.add(new Country("Storbritannien", "London", 60.80, 209_331));
        countries.add(new Country("Niue", "Alofi", 0.0016, 261));
        countries.add(new Country("Mongoliet", "Ulan Batar", 3.08, 1_566_000));
        countries.add(new Country("Polen", "Warszawa", 38.63, 312_679));
        countries.add(new Country("Spanien", "Madrid", 46.5, 505_990));
        countries.add(new Country("Portugal", "Lissabon", 10.31, 92_212));
        countries.add(new Country("Italien", "Rom", 60.59, 301_338));
        countries.add(new Country("Grekland", "Aten", 11.18, 131_957));
        countries.add(new Country("Luxemburg", "Luxemburg", 0.58, 2_586));
        countries.add(new Country("Liechtenstein", "Vaduz", 0.038, 160));

        return countries;
    }

    public record Country(String name, String capital, double population,
                          double area) {
        @Override public String toString() {

            return String.format(
              "Name: %-14s Capital: %-10s Population: %-6.3fM Area: %.0fkm²", name,
              capital, population, area);

        }
    }

    static class World {
        private final List<Country> countries = new ArrayList<>();

        public void addCountry(Country country) {
            countries.add(country);
        }

        //1
        public void firstAndLastCountryInList() {
            var last = countries.get(0);
            var first = countries.get(countries.size() - 1);
            List<Country> firstAndLast = new ArrayList<>();
            firstAndLast.add(first);
            firstAndLast.add(last);
            firstAndLast.forEach(System.out::println);
        }

        //2
        public void getAllCountriesSortedAtoZ() {
            countries.stream()
                     .sorted(Comparator.comparing(Country::name))
                     .forEach(System.out::println);
        }

        //3
        public void getAllCountriesSortedByPopulation() {
            countries.stream()
                     .sorted(Comparator.comparing(Country::population)
                                       .reversed())

                     .forEach(System.out::println);
        }

        public void getHihestPopulation() {
            countries.stream()
                     .max(Comparator.comparingDouble(
                       c -> (c.population() * 1_000_000) / c.area()))
                     .ifPresent(System.out::println);


        }

        public void getAverageArea() {

            double average = countries.stream()
                                      .mapToDouble(Country::area)
                                      .average()
                                      .orElse(0);

            System.out.printf("Average Area is %.0fkm²\n", average);

            var belowAverageCount = countries.stream()
                                             .filter(c -> c.area() < average)
                                             .count();
            System.out.println(
              belowAverageCount + " länder har en mindre area än genomsnittet.");

        }

        public void getCountriesWithLessThen5MillionPopulation() {
            countries.stream()
                     .filter(c -> c.population() < 5)
                     .forEach(System.out::println);
        }


        public void getDiferentAreaCount() {
            var over10k = countries.stream()
                                   .filter(c -> c.area() > 10_000)
                                   .count();
            var over100k = countries.stream()
                                    .filter(c -> c.area() > 100_000)
                                    .count();
            var over1M = countries.stream()
                                  .filter(c -> c.area() > 1_000_000)
                                  .count();

            System.out.printf(
              "%d has over 10k area\n%d has over 100k area\n%d has over 1M area",
              over10k, over100k, over1M);
        }

        public void getSameFirstLetterCountiresAsCapital() {
            System.out.println(
              "the capital and the country starts with the same letter");
            countries.stream()
                     .filter(c -> c.name()
                                   .charAt(0) == c.capital()
                                                  .charAt(0))
                     .forEach(System.out::println);
        }

        public void getCountriesNameLongerThenCapitalName() {
            countries.stream()
                     .filter(c -> c.name()
                                   .length() > c.capital()
                                                .length())
                     .forEach(System.out::println);
        }

        public void getFiveFirstCountriesWithLowestPopulation() {
            countries.stream()
                     .sorted(Comparator.comparing(Country::population))
                     .limit(6)
                     .forEach(System.out::println);
        }

        public void get3FirstCountriesWithOver7MillionPopulation() {
            countries.stream()
                     .filter(c -> c.population() > 7)
                     .sorted(Comparator.comparing(Country::population))
                     .limit(3)
                     .forEach(System.out::println);
        }

        public void getCountriesWithMin500kAreaSortedByName() {
            countries.stream()
                     .filter(c -> c.area() >= 500_000)
                     .sorted(Comparator.comparing(Country::name)
                                       .reversed())
                     .limit(3)
                     .forEach(System.out::println);
        }

        public void getAmountOfCountriesForEachLetter() {
            var result = countries.stream()
                                  .map(c -> Character.toUpperCase(c.name()
                                                                   .charAt(0)))
                                  .collect(Collectors.groupingBy(c -> c,
                                    Collectors.counting()));

            //this part is only needed if i wanna return <Char,int>
//                                  .entrySet()
//                                  .stream()
//                                  .collect(Collectors.toMap(Map.Entry::getKey,
//                                    i -> i.getValue()
//                                          .intValue()));

            System.out.println(result);
        }

        public void getCountriesWithXpopulation(int x) {
            System.out.printf("Länder med %d miljoner invånare:\n", x);
            countries.stream()
                     .filter(c -> Math.floor(c.population()) == x)
                     .forEach(System.out::println);
        }


        public void getCorrectPopulation() {
            countries.stream()
                     .forEach(c -> {
                         var pop = c.population() * 1_000_000;
                         System.out.printf("Name: %-14s population: %.0f\n",
                           c.name(), pop);
                     });
        }

        public void getTrangbodda() {
            countries.stream()
                     .forEach(c -> {
                         var pop = c.population() * 1_000_000;
                         var trangbod = pop / c.area();
                         System.out.printf("Name: %-14s trångboddhet: %.0f\n",
                           c.name(), trangbod);
                     });
        }

        public void backwards() {
            countries.stream()
                     .map(c -> new StringBuilder(c.name()).reverse()
                                                          .toString())
                     .sorted(Comparator.reverseOrder())
                     .forEach(System.out::println);
        }

        public void get6MinPopTotalAnd3MaxPopTotal() {
            var min = (Double) countries.stream()
                                        .sorted(
                                          Comparator.comparing(Country::population))
                                        .limit(6)
                                        .mapToDouble(Country::population)
                                        .sum();
            var max = (Double) countries.stream()
                                        .sorted(
                                          Comparator.comparing(Country::population)
                                                    .reversed())
                                        .limit(3)
                                        .mapToDouble(Country::population)
                                        .sum();

            System.out.printf(
              "the 6 Countries with the smallest pop have together %.3fM\n the 3 " +
                "Countries with the biggest pop have together %.3fM\n", min, max);
        }

        public void getPopFromCountriesWith7LettersName() {
            var all7 = countries.stream()
                                .filter(c -> c.name()
                                              .length() >= 7)
                                .mapToDouble(Country::population)
                                .sum();

            System.out.println(
              "all the countries with 7letter names have together " + all7 +
                "m population");
        }
    }

}
