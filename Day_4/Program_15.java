import java.lang.Math;
import java.util.*;
class Program_15           // Program to check whether a number is Armstrong or not
{
    public static void main (String args [])
    {
        int n, p=0, num, sum = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
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
}