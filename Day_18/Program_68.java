import java.util.*;
class Program_68
{
    public static void main ( String args [] )
    {
        int i , j , size , temp ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of the array : ");
        size = sc.nextInt() ;

        int a[] = new int[size] ;
        System.out.println("Enter array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }
        
        System.out.print("Entered array : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for ( i = 0 ; i < size -1 ; i ++ )
        {
            for ( j = 0 ; j < size - i - 1 ; j ++ )
            {
                if ( a[j] < a[j+1] )
                {
                    temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                }
            }
        }

        System.out.print("Sorted array in descending order : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}