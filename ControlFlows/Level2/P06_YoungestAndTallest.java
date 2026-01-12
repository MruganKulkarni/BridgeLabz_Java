package ControlFlows.Level2;

import java.util.Scanner;

class P06_YoungestAndTallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        int youngestAge = ageAmar;

        // Find the smallest age
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
        }

        double tallestHeight = heightAmar;

        // Find the greatest height
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
        }

        System.out.println("Youngest Age = " + youngestAge);
        System.out.println("Tallest Height = " + tallestHeight);

        input.close();
    }
}
