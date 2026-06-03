import java.util.*;
class Program_10
{
    public static void main (String args [])
    {
        int n, i, j, k, check;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the range between which prime numbers are to be found : ");
        i=sc.nextInt();
        j=sc.nextInt();

        System.out.print("Prime numbers between "+i+" and "+j+" are : ");

        for (n=i; n<=j; n++)
        {
            check=0;
            if(n<=1)
            {
                check=1;  
            }
             
            for(k=2; k<n/2; k++)
            {
                if(n%k==0)
                {
                    check=1;
                    break;
                }
            }

            if (check==0)
                System.out.print(n+" ");
        }
    }
}