package linkedlistchallenge;

public class PlaceClass {
    private String name;
    private double distance;

    public PlaceClass(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " (" + distance + "km)";
    }
}
