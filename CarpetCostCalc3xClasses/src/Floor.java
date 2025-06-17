public class Floor {
    // write code here
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = Math.max(0, width);
        this.length = Math.max(0, length);

    }

    public double getArea() {
        return width * length;
    }

}