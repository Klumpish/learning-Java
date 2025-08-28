package polymorphismchallenge;

public class MainV2 {
    public static void main(String[] args) {
        CarV2 car = new CarV2(2, "jonny");
        CarV2 holden = new Holden(2, "Holden");

        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden.startEngine());
        
    }
}
