package Strings.Level1;
import java.util.Scanner;

public class LowercaseConversion {

    /*
     * Problem Statement:
     * Convert a string to lowercase using charAt()
     * and compare it with toLowerCase().
     */

    String convertToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase to lowercase using ASCII difference
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LowercaseConversion obj = new LowercaseConversion();

        String text = sc.nextLine();
        String manual = obj.convertToLower(text);

        System.out.println(manual.equals(text.toLowerCase()));
    }
}
