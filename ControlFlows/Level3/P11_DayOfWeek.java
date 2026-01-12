package ControlFlows.Level3;

class P11_DayOfWeek {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Adjust month and year for Jan and Feb
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;
        int j = y / 100;

        int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        System.out.println("Day = " + dayOfWeek);
    }
}
