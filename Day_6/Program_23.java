import java.util.*;
class Program_23      // Program to count the number of set bits in a given number
{
    public static void main(String args [])
    {
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        while(n>0)
        {
            if(n%2==1)
                count = count +1;
            n/=2;
        }

        System.out.println("Total number of set bits in the entered number : "+count);
    }
}