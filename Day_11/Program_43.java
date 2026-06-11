import java.util.*;
class Program_43        // Program to write a function to check if the number is prime or not
{
    void check_prime ( int n )
    {
        int i , count = 0 ;

        if ( n <= 1 )
        {
            System.out.println("Entered number " + n + " is not a prime number.");
            count = 1;
        }
        for ( i = 2 ; i < n/2 ; i++ )
        {
            if ( n % i == 0)
            {
                count = 1;
                System.out.println("Entered number " + n + " is not a prime number.");
                break;
            }     
        }
        if( count == 0 )
           System.out.println("Entered number " + n + " is a prime number.");
    }

    public static void main (String args [])
    {
        int n;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_43 obj = new Program_43();
        obj.check_prime( n );

    }
}