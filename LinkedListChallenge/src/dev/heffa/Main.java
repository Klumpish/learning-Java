package dev.heffa;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> travleList = new LinkedList<>();
        travleList.add(new Place("Sydney", 0));
        travleList.add(new Place("Melbourn", 2000));
        travleList.add(new Place("Brisbane", 680));
//        System.out.println(travleList);
        addPlace(travleList, new Place("boob", 0));
        System.out.println(travleList);
        addPlace(travleList, new Place("boob", 0));
        addPlace(travleList, new Place("Melbourn", 500));

        visitPlaces(travleList);

    }

    public static void addPlace(LinkedList<Place> travleList, Place place) {
        var listIterator = travleList.listIterator();
        while (listIterator.hasNext()) {
            Place current = listIterator.next();

//           Check for duplicate by name
            if (current.getName().equalsIgnoreCase(place.getName())) {
                System.out.println(place.getName() + " already exists");
                return;
            }

//           check if current place is farther then the new one
            if (current.getDistance() > place.getDistance()) {
//               move back one so we can insert before current
                listIterator.previous();
                listIterator.add(place);
                return;

            }
        }
        listIterator.add(place);
    }

    public static void visitPlaces(LinkedList<Place> places) {
        Scanner input = new Scanner(System.in);
        var listIterator = places.listIterator();
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                               Available actions (select word or letter):
                               (F)orward
                               (B)ackward
                               (L)ist Places
                               (M)enu
                               (Q)uit""");
            switch (input.nextLine().toLowerCase()) {
                case "forward":
                case "f":
                    if (listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                    } else {
                        System.out.println("Nothing going forward");
                    }
                    input.nextLine();
                    break;
                case "backward":
                case "b":
                    if (listIterator.hasPrevious()) {

                        System.out.println(listIterator.previous());
                    } else {
                        System.out.println("Nothing going backward");
                    }
                    input.nextLine();

                    break;
                case "list":
                case "l": {
                    for (Place place : places) {
                        System.out.println(place);
                    }
                    input.nextLine();
                    break;
                }
                case "quit":
                case "q":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;


            }
        }
    }
}
