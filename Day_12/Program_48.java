import java.util.*;
class Program_48         // Program to write a funcyion for perfect number 
{
    void perfect_number ( int n )
    {
       int i, sum=0 ;

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
    
    public static void main (String args [])
    {
        int n ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n=sc.nextInt();

        Program_48 obj = new Program_48();
        obj.perfect_number( n );

    }
}