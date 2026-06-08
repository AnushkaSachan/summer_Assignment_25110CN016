import java.util.*;
class Program_32           // Program to print half pyramid pattern of repeated numbers
{
    public static void main (String args [])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows : ");
        n = sc.nextInt ();

        System.out.println ("Right half pyramid pattern of repeated numbers of " + n + " rows : ");

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print (i + " ");
            }
            System.out.println ();
        }
    }
}