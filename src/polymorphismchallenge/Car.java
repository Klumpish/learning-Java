package polymorphismchallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(
          "Starting engine of " + instanceType + ", " + description);
    }

    public void drive() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(
          "Driving " + instanceType + ", " + description);
        runEngine();
    }

    protected void runEngine() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(
          "Running engine of " + instanceType + ", " + description);
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre,
                         int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Billows of fume comes out");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("By Turning the key");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge,
                       int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("By pushing the start button");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Silent like a ghost. you hit 2 kids.");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre,
                     int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(
          "By pushing the start button and turning" + " the key");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("WHAT IM I?!?!? hybrid emotions!");
    }
}


