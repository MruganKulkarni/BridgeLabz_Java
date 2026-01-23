package ConstructorsAndAccessModifiers.InstanceVsClassVariables;
public class CounterStaticVsInstance {

    /*
     This program compares static and instance variables by using counters.
     The instance counter is unique to each object, while the static counter
     is shared across all objects, clearly showing the difference in behavior.
    */

    static int staticCount = 0;
    int instanceCount = 0;

    // Constructor increments both counters
    public CounterStaticVsInstance() {
        staticCount++;
        instanceCount++;
    }

    // Displays counter values
    public void displayCounts() {
        System.out.println("Static Count: " + staticCount);
        System.out.println("Instance Count: " + instanceCount);
    }

    public static void main(String[] args) {
        CounterStaticVsInstance c1 = new CounterStaticVsInstance();
        CounterStaticVsInstance c2 = new CounterStaticVsInstance();

        c1.displayCounts();
        System.out.println();
        c2.displayCounts();
    }
}
