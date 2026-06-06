import java.util.*;
class program_24           // Program to calculate x^n withouut pow() function
{
    public static void main (String args [])
    {
        int i;
        double x, n, res=1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the vale of x : ");
        x = sc.nextDouble();
        System.out.println("Enter the value of n : ");
        n = sc.nextDouble();

        for (i=1;i<=n;i++)
            res*=x;

        System.out.println("Result : " + res);
    }
}