import java.util.Scanner;

class P05_VotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take age input
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
        else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
