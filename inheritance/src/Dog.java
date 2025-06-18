public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {

//        it calls the animal. much like we use this.
//        super has to be the first thing in the constructor
//        same as when we use this()
        super("Mutt", "Big", 50);
    }


    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape,
               String tailShape) {
        super(type,
          weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"),
          weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" + "earShape='" + earShape + '\'' +
          ", tailShape='" + tailShape + '\'' + "} " +
          super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    //    we make it private and call it from another method in dog
    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}
