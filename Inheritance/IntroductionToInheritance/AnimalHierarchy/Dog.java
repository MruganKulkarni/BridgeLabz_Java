package Inheritance.IntroductionToInheritance.AnimalHierarchy;
public class Dog extends Animal {

    /*
     This class represents a Dog which is a specific type
     of Animal. It inherits common behavior from the Animal
     class and also defines its own specific behavior.
    */

    // Method specific to Dog
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog();

        // Calling inherited method
        dog.eat();

        // Calling Dog-specific method
        dog.bark();
    }
}
