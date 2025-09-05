package abstractClasses;

public class Dog extends Mammal {
//Animal is abstract, dog is not

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.toLowerCase()
                 .equals("slow")) {
            System.out.println(getExplicitType() + " moves slow");
        } else {
            System.out.println(getExplicitType() + "moves " + speed);
        }
    }

    @Override
    public void shedHair() {
        System.out.println("-- " + getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }


}
