import java.util.*;
import java.lang.Math;
class Program_16           // Program to print Armstrong numbers up to n    
{
    public static void main (String args [])
    {
        int n, i, temp, sum = 0, p = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range for armstrong numbers : ");
        n = sc.nextInt();
        System.out.print("Armstrong numbers between 1 and " + n + " are : ");
        for(i=1; i<=n; i++)
        {
            sum=0;
            p=0;
            temp = i;
            while(temp > 0)
            {
                p++;
                temp /= 10;
            }
            temp = i;
            while(temp > 0)
            {
                sum += (int) Math.pow(temp % 10, p);
                temp /= 10;
            }
            if(i == sum)
                System.out.print(i + " ");
        }
    }
}
