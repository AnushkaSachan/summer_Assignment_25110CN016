import java.util.*;
class Program_12                               // Program to find LCM of two numbers    
{
    public static void main (String args [])
    {
        int a, b, i;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers : ");
         a = sc.nextInt();
         b = sc.nextInt();

        if (a<b)
            i=a;
        else
            i=b;

        for (; i>=1; i--)
        {
            if (a%i==0 && b%i==0)
            {
                System.out.println("LCM of "+a+" and "+b+" is : " +(a*b)/i);
                break;
            }
        }
    }
}