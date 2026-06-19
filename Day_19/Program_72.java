import java.util.*;
class Program_72      // Program to find sum of diagonal elements.
{
    public static void main ( String args [] )
    {
        int i , j , row , right_sum = 0 , left_sum = 0 ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the order for matrix : ");
        row = sc.nextInt() ;

        int a[][] = new int[row][row] ;

        System.out.println("Enter the elements for matrix : ");

        for ( i = 0 ; i < row ; i ++ )
        {
            for ( j = 0 ; j < row ; j ++ )
            {
                a[i][j] = sc.nextInt() ;

                if ( i == j )
                    left_sum += a[i][j] ;
                if( i + j == row - 1 )
                    right_sum += a[i][j] ;
            }
        }

        System.out.println("Entered matrix :");

        for ( i = 0 ; i < row ; i ++ )
        {
            for ( j = 0 ; j < row ; j ++ )
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of left or primary diagonal elements : " + left_sum);
        System.out.println("Sum of right diagonal elements : " + right_sum);
    }
}