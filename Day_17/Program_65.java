import java.util.*;
class Program_65        // Program to merge two array.
{
    public static void main ( String args [] )
    {
        int i , size_1 , size_2 ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of first array : ");
        size_1 = sc.nextInt() ;

        int a[] = new int[size_1] ;

        System.out.println("Enter the first array elements : ");

        for ( i = 0 ; i < size_1 ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

        System.out.println("Enter the size of second array : ");
        size_2 = sc.nextInt() ;

        int b[] = new int[size_2] ;

        System.out.println("Enter the second array elements : ");

        for ( i = 0 ; i < size_2 ; i ++ )
        {
            b[i] = sc.nextInt() ;
        }

        int c[] = new int[size_1 + size_2] ;

        for( i = 0 ; i < size_1 ; i ++ )
        {
            c[i] = a[i] ;
        }
        for ( i = 0 ; i < size_2 ; i ++ )
        {
            c[size_1 + i] = b[i] ;
        }

        System.out.print("Merged array : ");

        for ( i = 0 ; i < (size_1 + size_2) ; i ++ )
        {
            System.out.print(c[i] + " ");
        }

    }
}