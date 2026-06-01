import java.util.*;
class Program_4
{
    public static void main(String args[])
    {
        int n, count=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        while(n>0)
        {
            n = n/10;
            count++;
        }
        System.out.println("Number of digits in the entered number is: " + count);
    }
}