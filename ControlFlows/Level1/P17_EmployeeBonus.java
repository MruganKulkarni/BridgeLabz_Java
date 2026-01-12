import java.util.Scanner;

class P17_EmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = input.nextInt();
        // bonus calculation
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        } 
        else {
            System.out.println("No Bonus Applicable");
        }

    }
}
