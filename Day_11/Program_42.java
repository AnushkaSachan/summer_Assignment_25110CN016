import java.util.*;
class Program_42        // Program to write a function to find maximum of two numbers
{
    void max ( int a , int b)
    {
        if ( a == b )
            System.out.println("Both numbers are same.");
        else if ( a > b)
            System.out.println("Maximum : " + a);
        else
            System.out.println("Maximum : " + b );
    }

    public static void main (String args [])
    {
        int a , b ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        Program_42 obj = new Program_42();
        obj.max( a , b );

    }
}