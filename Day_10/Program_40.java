import java.util.*;
class Program_40         // Program to print character pyramid
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows : ");
        n = sc.nextInt();

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 0 ; j <= n-i ; j++ )
            {
                System.out.print(" ");
            }
            for ( j = 0 ; j <= i ; j++ )
            {
                System.out.print((char)(65+j));
            }
            for ( j = j-2 ; j >= 0 ; j-- )
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }

    }
}