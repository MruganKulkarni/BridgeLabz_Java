class SpringSeason

/*
 * Problem Statement:
 * Write a program to determine whether a given date falls within
 * the spring season. The program should check the day and month
 * against predefined seasonal conditions.
 *
 * This problem applies compound conditional expressions.
 */
{

    public static void main(String[] args) {

        // Get command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check spring season condition
        boolean isSpring =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        // Display result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } 
        else {
            System.out.println("Not a Spring Season");
        }
    }
}
