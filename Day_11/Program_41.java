import java.util.*;
class Program_41       // Program to write a function to find sum of two numbers
{
    void sum ( int a , int b )
    {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a+b));
    }
    public static void main (String args [])
    {
        int a, b;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        Program_41 obj = new Program_41() ;
        obj.sum( a , b );
    }
}