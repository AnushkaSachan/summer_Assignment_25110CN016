import java.util.*;
class Program_67
{
    public static void main ( String args [] )
    {
        int i , j , temp , key , size , start_point , end_point , mid_point ;
        boolean found = false ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of the array : ");
        size = sc.nextInt() ;

        int a[] = new int[size] ;

        System.out.println("Enter array elements : ");

        for ( i = 0 ; i  < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

         for ( i = 0 ; i < size -1 ; i ++ )
        {
            for ( j = 0 ; j < size - i - 1 ; j ++ )
            {
                if ( a[j] > a[j+1] )
                {
                    temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted array : ");
 
        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element to search : ");
        key = sc.nextInt() ;

        start_point = 0 ;
        end_point = size - 1 ;
        mid_point = -1 ;

        while ( start_point <= end_point )
        {
            mid_point = ( start_point + end_point ) / 2 ;
            
            if ( a[mid_point] == key )
            {
                found = true ;
                break ;
            }
            else if ( a[mid_point] < key )
            {
                start_point = mid_point + 1 ;
            }
            else
            {
                end_point = mid_point - 1 ;
            }
        }

        if ( !found )
            System.out.println("Element not found ! ");
        else
            System.out.println("Element found at index : " + mid_point);
    }
}