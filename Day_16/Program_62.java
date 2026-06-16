import java.util.*;
class Program_62     // Program to find maximum frequency element.
{
    public static void main ( String args [] )
    {
        int i , j , size , count , max_frequency = 0 ,max_freq_element = 0 ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter the size of array : ");
        size = sc.nextInt() ;

        int a[] = new int [size] ;

        System.out.println("Enter the array elements : ");

        for ( i = 0 ; i < size ; i ++ )
        {
            a[i] = sc.nextInt() ;
        }

        for ( i = 0 ; i < size ; i ++ )
        {
            count = 1 ;
            for ( j = i + 1 ; j < size ; j ++ )
            {
                if ( a[i] == a[j])
                    count ++ ;
            }
            
            if ( max_frequency < count || ( count == max_frequency && a[i] > max_freq_element))
            {
                max_frequency = count ;
                max_freq_element = a[i] ;
            }
        }

        if ( max_frequency <= 1 )
            System.out.println("There is no repetition of elements in the array.");
        else 
            System.out.println("The element with maximum frequency is " + max_freq_element + " being repeated " + max_frequency + " times.");
    }
}