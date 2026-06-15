import java.util.*;
class Program_60       // Program to move zeroes to end.
{
    public static void main ( String args [] )
    {
        int i , j = 0 , size ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a [] = new int [size] ;
        int temp [] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        System.out.print("Input : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ") ;
        }

        for ( i = 0 ; i < size ; i ++ )
        {
            if( a[i] != 0 )
            {
                temp[j] = a[i] ;
                j++ ;
            }
        }

        for ( i = 0 ; i < j ; i ++ )
        {
            a[i] = temp[i] ;
        }
        for ( ; i < size ; i ++ )
        {
            a[i] = 0 ;
        }

        System.out.println();
        System.out.print("Output : ");
        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if ( j == size )
            System.out.println("No change in array as there are no 0s in the entered array.");
        else if ( j == 0 )
            System.out.println("No change in array as all the elements in the entered array are 0s.");
        else if ( size-j == 1 )
            System.out.println("There is 1 zero and it is present at the last.");
        else 
            System.out.println("There are " + (size-j) + " 0s in the entered array and are moved to the end.");

    }
}