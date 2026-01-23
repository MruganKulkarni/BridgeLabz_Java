package ConstructorsAndAccessModifiers.Constructors;
public class PersonCopyConstructor {

    /*
     This program demonstrates the concept of a copy constructor.
     A copy constructor is used to create a new object by copying
     the values of an existing object, ensuring data consistency.
    */

    String name;
    int age;

    // Parameterized constructor
    public PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public PersonCopyConstructor(PersonCopyConstructor otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Displays person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonCopyConstructor original =
                new PersonCopyConstructor("Alice", 28);

        PersonCopyConstructor copy =
                new PersonCopyConstructor(original);

        original.displayPersonDetails();
        System.out.println();
        copy.displayPersonDetails();
    }
}
