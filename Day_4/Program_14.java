import java.util.*;
class Program_14        // Program to print Fibonacci number at n position
{
    public static void main (String args [])
    {
        int a=0, b=1, c, i, n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        for(i=0;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Fibonacci number at "+n+" position is : " + a);
    }
}
