import java.util.*;
class Program_47           // Program to write a function for fibonacci series
{
    void print_fibonacci ( int n )
    {
        int a=0, b=1, c, i ;

        for(i=0;i<n;i++)
        {
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
        }
    }

    public static void main (String args [])
    {
        int n; 

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the range for fibonacci series : ");
        n=sc.nextInt();
        System.out.print("Fibonacci series upto " + n + " :: ");

        Program_47 obj = new Program_47();
        obj.print_fibonacci( n );
    }
}