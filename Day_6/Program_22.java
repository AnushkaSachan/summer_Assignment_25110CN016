import java.util.*;
import java.lang.Math;
class Program_22               // Program to convert a binary number to decimal
{
    public static void main (String args [])
    {
        int dec=0, i=0, bin;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a binary number : ");
        bin = sc.nextInt();
        
        while(bin>0)
        {
            if(bin%10 == 1)
                dec+=Math.pow(2, i);
            i++;
            bin/=10;
        }

        System.out.println("Decimal equivalent : " + dec);
    }
}