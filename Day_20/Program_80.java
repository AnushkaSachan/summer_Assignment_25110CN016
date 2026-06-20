import java.util.*;
class Program_80      // Program to column-wise sum.
{
    public static void main ( String args [] )
    {
        int i , j , row , column ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row and column for matrix : ");
        row = sc.nextInt() ;
        column = sc.nextInt() ;

        int a[][] = new int[row][column] ;
        int sum[] = new int[column] ;

        System.out.println("Enter the elements for matrix : ");

        for ( i = 0 ; i < row ; i ++ )
        {
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

        for ( i = 0 ; i < column ; i ++ )
        {
            sum[i] = 0 ;
            for ( j = 0 ; j < row ; j ++ )
            {
                sum[i] += a[j][i] ;
            }
        }
        System.out.println("Column-wise Sum : ");

        for ( i = 0 ; i < column ; i ++ )
        {
            System.out.println("Sum of column " + (i+1) + " : " + sum[i]) ;
        }
    }
}