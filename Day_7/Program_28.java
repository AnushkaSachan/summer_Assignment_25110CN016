import java.util.*;
class Program_28     // Program to find reverse of a number using recursion
{
    int reverse ( int n, int rev )
    {

        if(n==0)
            return rev;
        else
            return reverse(n/10, rev*10 + n%10) ;
    }

    public static void main (String args [])
    {
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_28 obj = new Program_28();
    
        System.out.println("Reverse of entered number " + n + " is : " + obj.reverse(n,0));

    }
}