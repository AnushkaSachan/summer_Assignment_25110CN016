import java.util.*;
class Program_27         // Program to find sum of digits of a number using recursion
{
    int sum (int n)
    {
        if (n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }

    public static void main (String args [])
    {
        int n;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();
    
        Program_27 obj = new Program_27();

        System.out.println("Sum of digits of " + n + " is : " + obj.sum(n));

    }
}