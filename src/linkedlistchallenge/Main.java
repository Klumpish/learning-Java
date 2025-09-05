package linkedlistchallenge;
// how the teacher did it

import java.util.LinkedList;
import java.util.Scanner;


record Place(String name, int distance) {

    @Override
    public String toString() {

        return String.format("%s (%d km)\n", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<PlaceClass> placesToVisit = new LinkedList<>();

        PlaceClass adelaide = new PlaceClass("Adelaide", 1374);
        PlaceClass adelaide2 = new PlaceClass("adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, adelaide2);
        addPlace(placesToVisit, new PlaceClass("Brisbane", 917));
        addPlace(placesToVisit, new PlaceClass("Perth", 3923));
        addPlace(placesToVisit, new PlaceClass("Alice Springs", 2771));
        addPlace(placesToVisit, new PlaceClass("Darwin", 3972));
        addPlace(placesToVisit, new PlaceClass("Melbourne", 877));
        placesToVisit.addFirst(new PlaceClass("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine()
                                     .toUpperCase()
                                     .substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {    // Reversing direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); //adjust position forward
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if (forward) {    // Reversing direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous(); //adjust position backwards
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<PlaceClass> list, PlaceClass placeClass) {

        if (list.contains(placeClass)) {
            System.out.println("Found duplicate: " + placeClass);
            return;
        }

        for (PlaceClass p : list) {
            if (p.getName()
                 .equalsIgnoreCase(placeClass.getName())) {
                System.out.println("Found duplicate: " + placeClass);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (placeClass.getDistance() < listPlace.getDistance()) {
                list.add(matchedIndex, placeClass);
                return;
            }
            matchedIndex++;

        }
        list.add(placeClass);
    }

    private static void printMenu() {
        System.out.println("""
                           Available actions (select word or letter):
                           (F)orward
                           (B)ackward
                           (L)ist Places
                           (M)enu
                           (Q)uit""");
    }
}
