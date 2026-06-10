import java.util.*;
class Program_39        // Program to print number pyramid
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows : ");
        n = sc.nextInt();

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 1 ; j < n-i ; j++ )
            {
                System.out.print(" ");
            }
            for ( j = 1 ; j <= i ; j++ )
            {
                System.out.print(j);
            }
            for ( ; j > 0 ; j-- )
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}