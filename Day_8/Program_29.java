import java.util.*;
class Program_29       // Program to print half pyramid pattern
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows : ");
        n = sc.nextInt ();

        System.out.println ("Right half pyramid pattern of stars of " + n + " rows : ");

        for (i = 0; i < n; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print ("* ");
            }
            System.out.println ();
        }
    }
}