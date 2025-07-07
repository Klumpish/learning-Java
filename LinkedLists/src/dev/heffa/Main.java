package dev.heffa;

import java.util.LinkedList;

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

        removeEl(placesToVisit);
        System.out.println(placesToVisit);
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
}
