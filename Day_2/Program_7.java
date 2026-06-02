import java.util.*;
class Program_7
{
    public static void main (String args [])
    {
        int n, product=1 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();

        while (n>0)
        {
            product = product*(n%10);
            n/=10;
        }
        System.out.println("Product of digit of entered number : " + product);

    }
}