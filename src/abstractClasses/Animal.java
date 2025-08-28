package abstractClasses;

/*
the abstract class is declared with the abstract modifier
An abstract class is a class that's incomplete
you cant create an instance of an abstract class ()
it can still have a constructor which will be called by its subclasses
 */
public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    /*method is declared abstract
        it simply ends with a semicolon
        it doesn't have a body, not even curly braces
        abstract methods can only be declared on an abstract class
        or interface
         */
    public abstract void move(String speed);

    public abstract void makeNoise();

    /* an abstract method tells the world that all Animals
    will move
    Any code that uses a subtype of Animal, knows it can call
    the move method and the subtype will implement
    this method with this signature
     */


}
