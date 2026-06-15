import java.util.*;
class Program_59      // Program to rotate array right.
{
    public static void main ( String args [] )
    {
        int i , d , size , temp ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a [] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a [i] = sc.nextInt() ;
        }

        System.out.println("Enter the number of positions to be rotated to right : ");
        d = sc.nextInt() ;

        System.out.print("Input : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ") ;
        }

        for ( i = 0 ; i < size/2 ; i ++ )
        {
            temp = a[i] ;
            a[i] = a[size-i-1] ;
            a[size-i-1] = temp ;
        }
        for ( i = 0 ; i < d/2 ; i ++ )
        {
            temp = a[i] ;
            a[i] = a[d-i-1];
            a[d-i-1] = temp ;
        }
        for ( i = 0 ; i < (size-i)/2 ; i ++ )
        {
            temp = a[d+i] ;
            a[d+i] = a[size-i-1] ;
            a[size-i-1] = temp ;
        }
    
        System.out.println();
        System.out.print("Output : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}