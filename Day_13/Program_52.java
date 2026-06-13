import java.util.*;
class Program_52       // Program to count even and odd elements of array.
{
    public static void main (String args [])
    {
        int n , i , even_count = 0 , odd_count = 0 ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the range of array : ");
        n = sc.nextInt();
        System.out.println("Enter array elements : ");
        
        int a [] = new int [ n ] ;

        for ( i = 0 ; i < n ; i++ )
        {
            a[i] = sc.nextInt();

            if ( a[i]%2 == 0 )
                even_count ++ ;
            else
                odd_count ++ ;
        }
        System.out.println("There are " + even_count + " even elements in the entered array.");
        System.out.println("There are " + odd_count + " odd elements in the entered array.");

    }
}