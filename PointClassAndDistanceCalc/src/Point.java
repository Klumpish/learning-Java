public class Point {
    // write code here
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }


}
