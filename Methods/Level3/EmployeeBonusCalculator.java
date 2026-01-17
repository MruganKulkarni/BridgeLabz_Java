package Methods.Level3;
public class EmployeeBonusCalculator {

    /*
     * Problem Statement:
     * Calculate the bonus of an employee based on their salary.
     * The bonus percentage varies depending on salary range.
     */

    double calculateBonus(double salary) {

        // Applies bonus percentage based on salary slabs
        if (salary < 30000) {
            return salary * 0.10;
        } else if (salary <= 50000) {
            return salary * 0.15;
        } else {
            return salary * 0.20;
        }
    }

    public static void main(String[] args) {
        EmployeeBonusCalculator obj = new EmployeeBonusCalculator();

        double salary = 45000;
        double bonus = obj.calculateBonus(salary);

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}
