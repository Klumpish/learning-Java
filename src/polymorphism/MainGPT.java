package polymorphism;

public class MainGPT {
    public static void main(String[] args) {

        //Flexible: compile-time type is Animal

        Animal myAnimal = new Dog();
        myAnimal = new Cat();
        myAnimal.makeSound();

        //Type inferred using var (this is fixed as Dog)
        var myDog = new Dog();
//        myDog = new Cat(); //compile-time error
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
