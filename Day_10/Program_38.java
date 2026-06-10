import java.util.*;
class Program_38       // Program to print reverse pyramid
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows : ");
        n = sc.nextInt();

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 0 ; j < i ; j++ )
            {
                System.out.print(" ");
            }
            for ( j = 0 ; j < 2*(n-i)-1 ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}