package ConstructorsAndAccessModifiers.AccessModifiers;
class DefaultAccessDemo {

    /*
     This program illustrates default (package-private) access.
     When no access modifier is specified, members are accessible
     only within the same package, helping organize related classes.
    */

    // Default access variable
    String info = "Default access in action";

    // Default access method
    void showInfo() {
        System.out.println(info);
    }

    public static void main(String[] args) {
        DefaultAccessDemo demo = new DefaultAccessDemo();
        demo.showInfo();
    }
}
