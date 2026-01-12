package ControlFlows.Level3;

import java.util.Scanner;

class P10_SwitchCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        double result;

        switch (op) {

            case "+":
                result = first + second;
                break;

            case "-":
                result = first - second;
                break;

            case "*":
                result = first * second;
                break;

            case "/":
                result = first / second;
                break;

            default:
                System.out.println("Invalid Operator");
                input.close();
                return;
        }

        System.out.println("Result = " + result);
        input.close();
    }
}
