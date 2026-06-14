import java.util.*;
class Program_54      // Program to find frquency of elements
{
    public static void main (String args [])
    {
        int i , j , size , temp , count = 1 ;
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

        System.out.println("\nFrequency of elements : ");
        // Counting frequency
        for ( i = 0 ; i < size-1 ; i ++ )
        {
            if ( a [i] == a [i+1] )
            {
                count ++ ;
            }
            else 
            {
                System.out.println(a [i] + " is present " + count + " times in the entered array.");
                count = 1 ;
            }
        }

        if ( a[i] == a[i-1] )
            System.out.println(a [i] + " is present " + count + " times in the entered array.");
        else 
            System.out.println(a [i] + " is present 1 times in the entered array.");

    }
    
}