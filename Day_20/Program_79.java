import java.util.*;
class Program_79      // Program to find row-wise sum.
{
    public static void main ( String args [] )
    {
        int i , j , row , column ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row and column for matrix : ");
        row = sc.nextInt() ;
        column = sc.nextInt() ;

        int a[][] = new int[row][column] ;
        int sum[] = new int[row] ;

        System.out.println("Enter the elements for matrix : ");

        for ( i = 0 ; i < row ; i ++ )
        {
            sum[i] = 0 ;
            for ( j = 0 ; j < column ; j ++ )
            {
                a[i][j] = sc.nextInt() ;
                sum[i] += a[i][j] ;
            }
        }

        System.out.println("Entered matrix : ");

        for ( i = 0 ; i < row ; i ++ )
        {
            for ( j = 0 ; j < column ; j ++ )
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Row-wise Sum : ");

        for ( i = 0 ; i < row ; i ++ )
        {
            System.out.println("Sum of row " + (i+1) + " : " + sum[i]) ;
        }
    }
}