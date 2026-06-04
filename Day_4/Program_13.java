import java.util.*;
class Program_13      // Program to print Fibonacci series up to n terms
{
    public static void main (String args [])
    {
        int a=0, b=1, c, i, n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range for fibonacci series : ");
        n=sc.nextInt();
        System.out.print("Fibonacci series upto " + n + " :: ");

        for(i=0;i<n;i++)
        {
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}