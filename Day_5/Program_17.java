import java.util.*;
class Program_17      // Program to check whether a number is perfect or not
{
    public static void main(String args [])
    
    {
            int n, i, sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum+=i;
        }

        if(sum==n)
            System.out.println("Entered number " + n + " is a perfect number");
        else
            System.out.println("Entered number " + n + " is not a perfect number");
    }
}