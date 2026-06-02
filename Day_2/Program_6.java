import java.util.*;
class Program_6
{
    public static void main (String args [])
    {
        int n, rev=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        while (n>0)
        {
            rev = rev*10 + n%10 ;
            n/=10;
        }

        System.out.println("Reverse of the given number is : " +rev);
    }
}