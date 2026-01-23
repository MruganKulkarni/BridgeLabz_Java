package Arrays.Level2;

import java.util.Scanner;

class P01_EmployeeBonusArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < salary.length; i++) {

            salary[i] = input.nextDouble();
            yearsOfService[i] = input.nextDouble();

            // Validate salary and years of service
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid Input");
                i--;
            }
        }

        for (int i = 0; i < salary.length; i++) {

            // Apply bonus rule based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
