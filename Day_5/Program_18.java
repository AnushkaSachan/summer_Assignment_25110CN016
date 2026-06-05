import java.util.*;
class Program_18   // Program to check whether a number is strong or not
{
    public static void main (String args [])
    {
        int n, i, sum=0, fact, temp;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        temp=n;

        while(temp>0)
        {
            fact=1;
            for(i=2;i<=(temp%10);i++)
                fact*=i;
            temp/=10;
            sum+=fact;

        }

        if(sum==n)
            System.out.println("Entered number " + n + " is a strong number");
        else
            System.out.println("Entered number " + n + " is not a strong number");
    }
}