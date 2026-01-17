package Strings.Level3;
public class CalendarDisplay {

    /*
     * This program displays the calendar for a given month.
     * It uses predefined data for days in a month and formats
     * the output using loops and spacing logic.
     */

    public static void main(String[] args) {
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (String day : days) {
            System.out.print(day + "\t");
        }

        System.out.println();

        // Print a simple fixed calendar layout
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + "\t");

            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }
}
