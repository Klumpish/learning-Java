public class CarV2 {
    // write code here
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarV2(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String startEngine() {
        return "The car's engine is starting" + getType();

    }

    public String accelerate() {
        return "The car is accelerating" + getType();

    }

    public String brake() {
        return "The car is breaking " + getType();
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }


}

class Mitsubishi extends CarV2 {
    // write code here
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "The car's engine is starting" + this.getType();

    }

    @Override
    public String accelerate() {
        return "The car is accelerating" + this.getType();

    }

    @Override
    public String brake() {
        return "The car is breaking " + this.getType();
    }
}

class Holden extends CarV2 {
    // write code here
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The car's engine is starting" + getType();

    }

    @Override
    public String accelerate() {
        return "The car is accelerating" + getType();

    }

    @Override
    public String brake() {
        return "The car is breaking " + getType();
    }
}

class Ford extends CarV2 {
    // write code here
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The car's engine is starting" + this.getType();

    }

    @Override
    public String accelerate() {
        return "The car is accelerating" + this.getType();

    }

    @Override
    public String brake() {
        return "The car is breaking " + this.getType();
    }
}