import java.util.*;
class Program_64    // Program to remove duplicates from array.
{
    public static void main ( String args [] )
    {
        int i , j = 0 , size ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a[] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

        System.out.print("Entered array is : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }

        for ( i = 1 ; i < size ; i ++ )
        {
            if ( a[i] != a[j] )
            {
                j++ ;
                a[j] = a[i] ;
            }
        }

        System.out.println();
        System.out.print("After removing duplicates array becomes : ");

        for ( i = 0 ; i <= j ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}