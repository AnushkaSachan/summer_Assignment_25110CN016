import java.util.*;
class Program_30      // Program to print half pyramid pattern of numbers
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int i, j, n;

        System.out.println ("Enter the number of rows : ");
        n = sc.nextInt ();

        System.out.println ("Right half pyramid pattern of nnumbers of " + n + " rows : ");

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print (j+ " ");
            }
            System.out.println ();
        }
    }
}
