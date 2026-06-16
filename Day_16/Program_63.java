import java.util.*;
class Program_63  // Program to find pair with given sum.
{
    public static void main ( String args [] )
    {
        int i , j , size , sum ;
        boolean found = false ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a[] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

        System.out.println();
        System.out.println("Enter the sum : ");
        sum = sc.nextInt();

        System.out.println("Pair whose sum is equal to " + sum + " are : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            for ( j = i + 1 ; j < size ; j ++ )
            {
                if ( a[i] + a[j] == sum )
                {
                    System.out.println(a[i] + " and " + a[j] );
                    found = true ;
                }
            }
        }
    }
}