import java.util.*;
class Program_21        // Program to convert a decimal number to binary
{
    public static void main (String args [])
    {
        int n, dec, temp=0, bin=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a decimal number : ");
        n = sc.nextInt();
        dec = n;

        while(n > 0)
        {
            temp = (temp*10) + (n%2);
            n/=2;
        }

        while(temp > 0)
        {
            bin = (bin*10) + (temp%10); ;
            temp/=10;
        }

        if(dec%2 == 0)
            bin = (bin*10) + 0;

        System.out.println("Binary equivalent : " + bin);

    }
}