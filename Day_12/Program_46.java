import java.lang.Math;
import java.util.*;
class Program_46      // Program to write a function for armstrong number 
{
    void check_armstrong ( int n )
    {
        int p=0, num, sum = 0;
        num = n;

        while(n > 0)
        {
            p++;
            n /= 10;
        }

        n = num;

        while(n > 0)
        {
            sum += (int) Math.pow(n % 10, p);
            n /= 10;
        }

        if(num == sum)
            System.out.println("Entered number " + num + " is an Armstrong number.");
        else
            System.out.println("Entered number " + num + " is not an Armstrong number.");
    }

    public static void main (String args [])
    {
        int n ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        Program_46 obj = new Program_46();

        obj.check_armstrong( n );

    }
}