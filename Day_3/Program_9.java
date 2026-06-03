import java.util.*;
class Program_11
{
1    public static void main (String args [])
    {
        int n, i, check=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        if(n<=1)
        {
            check=1;  
        }
         
        for(i=2; i<n/2; i++)
        {
            if(n%i==0)
            {
                check=1;
                break;
            }
        }

        if (check==0)
            System.out.println("Entered number "+n+" is a prime number");
        else
            System.out.println("Entered number "+n+" is not a prime number");
    
    }
}
