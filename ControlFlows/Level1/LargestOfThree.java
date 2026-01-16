import java.util.Scanner;

class P03_LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        // testing which number is largest
        boolean decision1 = (num1>num2 && num1>num3);
        boolean decision2 = (num2>num3 && num2>num1);
        boolean decision3 = (num3>num2 && num3>num1);

        //printing in 3 lines using a single statement

        System.out.println(" Is the First number the largest?\s" + decision1 + "\n Is the Second number the Largest?\s" + decision2 + "\n Is the Third number the Largest?\s" + decision3);
        
        sc.close();

        }
}