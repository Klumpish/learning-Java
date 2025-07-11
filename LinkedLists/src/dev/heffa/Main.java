package dev.heffa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//                           this is how we instantiate  something ()
//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Berlin");
        System.out.println(placesToVisit);

        addMoreEl(placesToVisit);
        System.out.println(placesToVisit);

//        removeEl(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
//        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
    }

    private static void addMoreEl(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
//        Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
//        Stack methods
        list.push("Alice Springs");
    }

    private static void removeEl(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println("-".repeat(5) + list);
        String s1 = list.remove(); // removes first el
        System.out.println("-> " + s1 + " Was removed");

        String s2 = list.removeFirst(); // removes first el
        System.out.println("-> " + s2 + " Was removed");

        String s3 = list.removeLast(); // removes last el
        System.out.println("-> " + s3 + " Was removed");

        //Queue/deque poll methods
        String p1 = list.poll(); // removes first el
        System.out.println("-> " + p1 + " Was removed");
        String p2 = list.pollFirst(); // removes first el
        System.out.println("-> " + p2 + " Was removed");
        String p3 = list.pollLast(); // remove last el
        System.out.println("-> " + p3 + " Was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); //removes first el
        System.out.println("-> " + p4 + " Was removed");

    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(4));

        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println(
          "Melbourne is at position : " + list.indexOf("Melbourne"));

//        queue retrieval method
//         gives us the first in first out
        System.out.println("Element from element() = " + list.element());
        System.out.println("-".repeat(5));
//        Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
        System.out.println("-".repeat(5));

    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("-".repeat(5));
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println(
              "--> From: " + list.get(i - 1) + " to: " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("-".repeat(5));
        System.out.println("Trip2 starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to: " + town);
            previousTown = town;
        }
        System.out.println("Trip2 ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
//        list iterate
        System.out.println("-".repeat(5));
        System.out.println("Trip3 starts at " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to: " + town);
            previousTown = town;
        }
        System.out.println("Trip3 ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
//                list.remove(); will give us error
            }
        }
//        this wont work bcz the pointer is already pointing at the end
//         so it returns false
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
