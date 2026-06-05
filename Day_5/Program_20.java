import java.util.*;
class Program_20     // Program to find largest prime factor of a number
{
    public static void main (String args [])
    {
        int i, j, prime_large=0;
        boolean check=true;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for (i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                for(j=2;j<i/2;j++)
                {
                    if(i%j==0)
                    {
                        check=false;
                        break;
                    }
                }
                if(check)
                    prime_large = i;
            }
        }
        if(prime_large==0)
            System.out.println("There is no prime factor of " + n);
        else
            System.out.println("Largest prime factor of " + n + " is : " + prime_large);
    }
}