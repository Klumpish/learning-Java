package pointclassanddistancecalc;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(25, 4);
        System.out.println("p1: " + p1.distance());
        System.out.println("p1: " + p1.distance(p2));
        System.out.println("p1: " + p1.distance(2, 2));
        Point point = new Point();
        System.out.println("p1: " + point.distance());
    }
}
