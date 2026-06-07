import java.util.*;
class Program_26        // Program to find Fibonacci of a number using recursion
{
    int fibonacci ( int n)
    {
        if ( n==0)
            return 0;
        else if ( n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String args [])
    {
        int i, n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_26 obj = new Program_26();

        System.out.print("Fibonacci of entered number " + n + " is : " );
        for ( i=0; i<n; i++)
            System.out.print(obj.fibonacci(i) + " ");

    }
}