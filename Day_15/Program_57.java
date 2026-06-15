import java.util.*;
class Program_57      // Program to reverse the array.
{
    public static void main ( String args [] )
    {
        int i , size , temp ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a [] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        System.out.print("Entered array is : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ") ;
        }

        for ( i = 0 ; i < size/2 ; i ++ )
        {
            temp = a [i] ;
            a [i] = a [size-i-1] ;
            a [size-i-1] = temp ;
        }

        System.out.println();
        System.out.print("Reversed array is : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}