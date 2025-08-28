package abstractClasses;

public class Main {
    public static void main(String[] args) {
//      Animal animal = new Animal("animal", "big", 100); //wont work
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
