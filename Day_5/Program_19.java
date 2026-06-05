import java.util.*;
class Program_19          // Program to find factors of a number
{
    public static void main(String args [])
    
    {
        int n, i;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        System.out.print("Factors of " + n + " are : ");
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}