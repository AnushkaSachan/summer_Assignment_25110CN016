import java.util.*;
class Program_5
{
    public static void main (String args [])
    {
        int n, sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }

        System.out.println("Sum of digits : " + sum);
    }
}