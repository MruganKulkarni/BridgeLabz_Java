package Methods.Level1;

import java.util.Scanner;

class P02_MaxHandshakes {

    public static int calculateHandshakes(int numberOfStudents) {

        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        int result = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes = " + result);
        input.close();
    }
}
