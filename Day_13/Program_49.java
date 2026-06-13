import java.util.*;
class Program_49       // Program to input and display array.
{
    public static void main (String args [])
    {
        int n , i ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the range of array : ");
        n = sc.nextInt();
        System.out.println("Enter array elements : ");
        
        int a [] = new int [ n ] ;

        for ( i = 0 ; i < n ; i++ )
        {
            a[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Entred array elements are : ");

        for ( i = 0 ; i < n ; i++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}