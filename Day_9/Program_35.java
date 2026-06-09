import java.util.*;
class Program_35      // Program to print repeated character pattern
{
    public static void main (String args [])
    {
        int i, j, n;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows : ");
        n = sc.nextInt();

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 0 ; j <= i ; j++ )
            {
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }
}