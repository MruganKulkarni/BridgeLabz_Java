package Methods.Level1;
import java.util.Scanner;

class P09_ChocolateDistributionMethod {

    public static int calculateRemainingChocolates(int chocolates, int children) {

        int remaining = chocolates % children;
        return remaining;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int remaining = calculateRemainingChocolates(chocolates, children);

        System.out.println("Remaining Chocolates = " + remaining);
        input.close();
    }
}
