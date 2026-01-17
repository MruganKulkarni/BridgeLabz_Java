package Inheritance.HierarchicalInheritance.SchoolSystemRoles;
public class Person {

    /*
     This class represents a generic person in a school system.
     It acts as the superclass in a hierarchical inheritance structure
     and contains common attributes shared by all roles in the school.
    */

    // Stores person name
    protected String name;

    // Stores person age
    protected int age;

    // Initializes person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
