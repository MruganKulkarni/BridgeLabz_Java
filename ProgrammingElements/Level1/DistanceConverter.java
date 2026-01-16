class DistanceConverter
/*
 * Problem Statement:
 * Write a program to convert a given distance from kilometers to miles.
 * The program should apply the standard conversion formula where
 * 1 kilometer is equal to 0.621371 miles.
 *
 * This program demonstrates unit conversion using arithmetic calculations.
 */
{
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;
        // printing the distance in miles
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
