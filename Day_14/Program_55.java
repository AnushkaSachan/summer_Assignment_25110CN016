import java.util.*;
class Program_55      // Program to find second largest element in the array 
{
    public static void main (String args [])
    {
        int i , size , first_largest , second_largest ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter size of array : ");
        size = sc.nextInt();

        int a [] = new int [size] ;

        System.out.println("Enter array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        if ( size < 2 )
        {
            System.out.println("Array must contain at least two elements.");
            System.exit(0) ;
        }

        first_largest = Integer.MIN_VALUE ;
        second_largest = Integer.MIN_VALUE ;

        for ( i = 0 ; i < size ; i ++ )
        {
            if ( a[i] > first_largest )
            {
                second_largest = first_largest ;
                first_largest = a[i] ;
            }
            else if ( a[i] > second_largest && a[i] < first_largest )
            {
                second_largest = a[i] ;
            }
        }

        if ( second_largest == Integer.MIN_VALUE )
        {
            System.out.println("There is no distinct second largest element in the entered array.");
        }
        else
        {
            System.out.println("Second largest element in the entered array is : " + second_largest);
        }

    }
    
}