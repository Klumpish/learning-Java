package teacher;
// how the teacher did it

import java.util.LinkedList;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d km)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, adelaide);
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        list.add(place);
    }
}
