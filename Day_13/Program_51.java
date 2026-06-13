import java.util.*;
class Program_51       // Program to find largest and smallest element of array.

{
    public static void main (String args [])
    {
        int n , i , largest , smallest  ;

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

        largest = smallest = a[0];

        for ( i = 1 ; i < n ; i++ )
        {
            if( largest < a[i] )
                largest = a[i] ;

            if ( smallest > a[i] )
                smallest  = a[i] ;
        }

        System.out.println("Largest element of entered array : " + largest );
        System.out.println("Smallest element of entered array : " + smallest );

    }
}