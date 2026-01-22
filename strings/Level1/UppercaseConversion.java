package Strings.Level1;
import java.util.Scanner;

public class UppercaseConversion {

    /*
     * Problem Statement:
     * Convert a string to uppercase using charAt()
     * and compare it with toUpperCase().
     */

    String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert lowercase to uppercase using ASCII difference
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UppercaseConversion obj = new UppercaseConversion();

        String text = sc.nextLine();
        String manual = obj.convertToUpper(text);

        System.out.println(manual.equals(text.toUpperCase()));
    }
}
