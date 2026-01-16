package Methods.Level2;

import java.util.Scanner;

class P08_StudentVoteChecker {

    public static boolean canVote(int age) {

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (canVote(age)) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }

        input.close();
    }
}
