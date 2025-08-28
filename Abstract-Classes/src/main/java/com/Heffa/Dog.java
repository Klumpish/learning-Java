package com.Heffa;

public class Dog extends Animal {
//Animal is abstract, dog is not

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.toLowerCase()
                 .equals("slow")) {
            System.out.println(type + " moves slow");
        } else {
            System.out.println(type + "moves " + speed);
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }

}
