import java.util.*;
class Program_56      // Program to print duplicate elements
{
    public static void main (String args [])
    {
        int i , j , size , temp , count = 1 ;
        boolean foundDuplicate = false;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter size of array : ");
        size = sc.nextInt();

        int a [] = new int [size] ;

        System.out.println("Enter array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        // Sorting the array using bubble sort
        for ( i = 0 ; i < size-1 ; i ++ )
        {
            for ( j = i+1 ; j < size ; j ++ )
            {
                if ( a [i] > a [j] )
                {
                    temp = a [i] ;
                    a [i] = a [j] ;
                    a [j] = temp ;
                }
            }
        }

        System.out.println("\nDuplicate elements in the entered array : ");
        // Counting duplicate frequency
        for ( i = 0 ; i < size-1 ; i ++ )
        {
            if ( a [i] == a [i+1] )
            {
                count ++ ;
            }
            else 
            {
                if ( count > 1 )
                {
                    foundDuplicate = true;
                    System.out.println(a [i] + " appears " + count + " times.");
                }
                count = 1 ;
            }
        }

        if ( count > 1 )
        {
            foundDuplicate = true;
            System.out.println(a [i] + " appears " + count + " times.");
        }

        if ( !foundDuplicate )
        {
            System.out.println("No duplicate elements found.");
        }

    }
    
}