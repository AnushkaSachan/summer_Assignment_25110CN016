import java.util.*;
class Program_45     // Program to write a function for pallindrome number
{
    void pallindrome ( int n )
    {
        int num = n , check = 0 ;

        while ( n >  0 )
        {
            check = ( check*10 ) + n % 10 ;
            n /= 10 ;
        }

        if ( num == check )
            System.out.println("Entred number " + num + " is a palindrome number.");
        else
            System.out.println("Entered number " + num + " is not a palindrome number.");
    }

    public static void main (String args [] )
    {
        int n;  

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_45 obj = new Program_45();
        obj.pallindrome( n );

    }
}