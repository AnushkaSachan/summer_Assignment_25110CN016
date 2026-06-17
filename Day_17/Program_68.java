import java.util.*;
class Program_68    // Program to find common elemnts in ywo arrays.
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

        HashMap<Integer, Integer> countA = new HashMap<Integer, Integer>() ;
        ArrayList<Integer> common = new ArrayList<Integer>() ;

        for ( i = 0 ; i < size_1 ; i ++ )
        {
            int value = a[i] ;
            countA.put(value, countA.getOrDefault(value, 0) + 1) ;
        }

        for ( i = 0 ; i < size_2 ; i ++ )
        {
            int value = b[i] ;
            if ( countA.containsKey(value) && countA.get(value) > 0 )
            {
                common.add(value) ;
                countA.put(value, countA.get(value) - 1) ;
            }
        }

        System.out.print("Common elements are : ");
        for ( int element : common )
        {
            System.out.print(element + " ");
        }
    }
}