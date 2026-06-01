import java.util.*;
class Program_2
{
     public static void main(String args[]) 
    {
        int n, i, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of whose multipication table is to be printed: ");
        x=sc.nextInt();
        System.out.println("Enter a number upto which the multpication table of "+ x +"is to be printed:");
        n=sc.nextInt();
        System.out.println("Multiplication table for " + x + ":");
        for (i=1; i<=n; i++) 
        {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}