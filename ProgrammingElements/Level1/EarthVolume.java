class EarthVolume
/*
 * Problem Statement:
 * Write a program to calculate the volume of the Earth assuming it to
 * be a perfect sphere. The program should use the mathematical formula
 * for the volume of a sphere using a given radius.
 *
 * This program demonstrates the use of mathematical constants and formulas.
 */
 {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.14159;
        double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);
        // printing the volume of earth in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}
