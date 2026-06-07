import java.util.*;
class Program_25           // Program to find factorial of a number using recursion
{
    long fact ( int n)
    {
        if ( n==0 || n==1)
            return 1;
            return n*fact(n-1);
    }
    public static void main (String args [])
    {
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_25 obj = new Program_25();
    
        System.out.println("Factorial of entered number " + n + " is : " + obj.fact(n));

    }
}