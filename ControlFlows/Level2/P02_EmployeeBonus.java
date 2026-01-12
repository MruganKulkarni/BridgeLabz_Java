package ControlFlows.Level2;

import java.util.Scanner;

class P02_EmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        }

        input.close();
    }
}
