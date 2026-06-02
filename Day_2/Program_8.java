import java.util.*;
class Program_8
{
    public static void main (String args [])
    {
        int n, num, check=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        num=n;
        while (n>0)
        {
            check = (check*10) + (n%10);
            n/=10;
        }

        if(num==check)
            System.out.println("Enterd number "+num+" is a pallindrome number.");
        else 
            System.out.println("Enterd number "+num+" is not a pallindrome number.");

    }
}