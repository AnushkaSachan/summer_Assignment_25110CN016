import java.util.*;
class Program_50       // Program to find sum and average of array.
{
    public static void main (String args [])
    {
        int n , i , sum = 0 ;
        double average ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the range of array : ");
        n = sc.nextInt();
        System.out.println("Enter array elements : ");
        
        int a [] = new int [ n ] ;

        for ( i = 0 ; i < n ; i++ )
        {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        average = (double) sum / n ;

        System.out.println();
        System.out.println("Sum of entered array : " + sum );
        System.out.println("Average of entered array : " + average );
    }
}