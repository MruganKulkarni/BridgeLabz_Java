import java.util.Scanner;

class P03_SquareSideFinder {
    public static void main(String[] args) {
        System.out.println("Enter the perimeter of square");
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is\s"+ side +  "\swhose perimeter is "+ perimeter );



        }
}