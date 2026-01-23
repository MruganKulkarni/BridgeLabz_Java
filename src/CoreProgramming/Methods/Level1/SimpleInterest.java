package Methods.Level1;

import java.util.Scanner;

class P01_SimpleInterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {

        double simpleInterest = principal * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest + " for Principal " + principal +
                           ", Rate of Interest " + rate + " and Time " + time);

        input.close();
    }
}
