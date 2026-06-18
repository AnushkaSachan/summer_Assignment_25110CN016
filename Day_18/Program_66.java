import java.util.*;
class Program_66
{
    public static void main ( String args [] )
    {
        int i , j , size , temp , min_index ;

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

        for ( i = 0 ; i < size - 1 ; i ++ )
        {
            min_index = i ;
            for ( j = i + 1 ; j < size ; j ++ )
            {
                if ( a[j] < a[min_index] )
                {
                    min_index = j ;
                }
            }
            temp = a[min_index] ;
            a[min_index] = a[i] ;
            a[i] = temp ;
        }    

        System.out.print("Sorted array : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
    }
}