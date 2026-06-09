import java.util.*;
class Program_33        // Program to print reverse star Pattern
{
    public static void main (String args [])
    {
        int i, j, n;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no.of rows : ");
        n = sc.nextInt();

        for (i = 0 ; i < n ; i++)
        {
            for (j = 0 ; j < (n-i) ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}