package abstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//      Animal animal = new Animal("animal", "big", 100); //wont work
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
        /*here when we are making a list
        the abstract Animal is great, it makes it so we can hold
        all Animals that extends Animal
         */
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Wolf", "Big", 100));
        animals.add(new Fish("Goldfish", "tiny", 0.5));
        animals.add(new Dog("German Shepard", "medium", 100));
        animals.add(new Dog("Pug", "small", 100));
        animals.add(new Fish("BlueFin", "tiny", 2.5));
        animals.add(new Horse("Clydesdale", "large", 1000));

        animals.forEach(animal -> {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        });
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
