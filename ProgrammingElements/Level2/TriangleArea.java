import java.util.Scanner;

class P02_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter Height (cm): ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

    }
}
