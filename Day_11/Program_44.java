import java.util.*;
class Program_44       // Program to write a function to find factorial of a number
{
    void factorial ( int n )
    {
        int i , fact = 1;
        if( n < 0 )
        {
            System.out.println("Error! Factorial for negative numbers does not exist.");
            System.out.println("Please enter a positive number.");
        }
        else
        {
            for ( i = 2 ; i <= n ; i++ )
            {
                fact*= i;
            }
            System.out.println("Factorial of " + n + " is : " + fact);
        }
    }

    public static void main (String args [])
    {
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_44 obj = new Program_44();
        obj.factorial( n );

    }
}