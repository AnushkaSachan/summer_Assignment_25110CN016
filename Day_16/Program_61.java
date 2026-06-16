import java.util.*;
class Program_61        // Program to find missing number in array.
{
    public static void main ( String args [] )
    {
        int i , j , size , missing_number = -1 ;
        boolean found ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a[] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

        for ( i = 1 ; i <= size ; i ++ )
        {
            found = false ;
            for ( j = 0 ; j < size ; j ++ )
            {
                if ( a[j] == i)
                {
                    found = true ;
                    break;
                }
            }
            
            if ( !found && i<=size)
            {
                missing_number = i ;
                break ; 
            }
        }

        if ( missing_number == -1 )
            System.out.println("There is no missing number. All the numbers are present from " + 1 + " to " + size + ".");
        else 
            System.out.println("The missing number is : " + missing_number);
    }
}