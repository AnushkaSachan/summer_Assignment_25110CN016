import java.util.*;
class Program_53         // Program to search an element using linear search method
{
    public static void main ( String args [] )
    {
        int i , size , n , position = -1 ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a [] = new int [size] ;
        System.out.println("Enter elements of array : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        System.out.println("Enter the element to be searched : ");
        n = sc.nextInt() ;

        for ( i = 0 ; i < size ; i ++ )
        {
            if ( a[i] == n )
                position = i+1 ;
        }

        if ( position == -1 )
            System.out.println(n + " is not present in the entered array.");
        else
            System.out.println(n + " is present at position " + position + " in the entered array.");
    }
}