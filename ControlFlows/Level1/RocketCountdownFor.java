import java.util.Scanner;

class P09_RocketCountdownFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take starting counter value
        System.out.print("Enter countdown start number: ");
        int number = input.nextInt();

        // Countdown using for loop
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
