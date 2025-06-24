public class MainGPT {
    public static void main(String[] args) {

        // compile-time type: Animal
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        //Type inferred using var
        var myDog = new Dog();
        myDog.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
