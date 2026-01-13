package Arrays.Level1;

import java.util.Scanner;

class P01_VotingEligibilityArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
            // invalid age 
            if (ages[i] < 0) {
                System.err.println("Invalid Age");
                input.close();
                return;
            }
        }
        // voting eligibility criteria
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}
