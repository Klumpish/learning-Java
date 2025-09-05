package abstractClasses;

public class Fish extends Animal {
//Animal is abstract, dog is not

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(getExplicitType() + " lazily swiming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("goldfish")) {
            System.out.print("blubber! ");
        } else {
            System.out.print("swimmy noise ");
        }
    }

}
