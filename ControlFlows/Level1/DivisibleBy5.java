import java.util.Scanner;

class P01_DivisibleBy5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String decision = "No";
        // condition for checking divisibility
        if(num % 5 == 0)
        {
             decision = "Yes";
        }

        System.out.println("Is the number\s" + num + "\sdivisble by 5?\s" + decision );

    }
}