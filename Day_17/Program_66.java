import java.util.*;
class Program_66     // Program to find umion of two arrays.
{
    public static void main ( String args [] )
    {
        int i , j = 0 , size_1 , size_2 , temp ;
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

        System.out.println("Enter the first array elements : ");

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

        for ( i = 0 ; i < size_1 + size_2 - 1 ; i ++ )
        {
            for ( j = i + 1 ; j < size_1+size_2 ; j ++ )
            {
                if ( c[i] > c[j] )
                {
                    temp = c[i] ;
                    c[i] = c[j] ;
                    c[j] = temp ;
                }
            }
        }

        j=0 ;

        for ( i = 1 ; i < size_1 + size_2 ; i ++ )
        {
            if ( c[i] != c[j] )
            {
                j++ ;
                c[j] = c[i] ;
            }
        }

        System.out.print("Union of arrays : ");

        for ( i = 0 ; i <=j ; i ++ )
        {
            System.out.print(c[i] + " ");
        }

    }
}