import java.util.*;
class Program_36         // Program to print hollow square pattern
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows : ");
        n = sc.nextInt();

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 0 ; j < n ; j++ )
            {
                if ( i == 0 || i == n-1 || j == 0 || j == n-1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}