import java.util.Scanner;

class P08_RocketCountdownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take starting counter value
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

    }
}
