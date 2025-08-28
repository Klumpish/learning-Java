package polymorphismchallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("im a normal car");
        Car electricCar = new ElectricCar("im a electric car", 400,
          20);
        Car gasCar = new GasPoweredCar("GasCar here", 699, 8);
        Car HybridCar = new HybridCar("I go both ways", 1000000, 20,
          12);

        runRace(car);
        System.out.println();
        runRace(electricCar);
        System.out.println();
        runRace(gasCar);
        System.out.println();
        runRace(HybridCar);


    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();

    }
}
