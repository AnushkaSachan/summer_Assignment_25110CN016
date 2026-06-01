import java.util.*;
class Program_1
{
        public static void main(String args[])
    {
        int n, i, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        for (i=1; i<=n; i++)
        {
            sum += i;
        }
        
        System.out.println("The sum of first "+ n +" natural numbers is : "+ sum);
    }

}