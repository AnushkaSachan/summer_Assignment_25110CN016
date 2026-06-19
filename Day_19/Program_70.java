import java.util.*;
class Program_70     // Program to subtract matrices.
{
    public static void main ( String args [] )
    {
        int i , j , row_1 , row_2 , column_1 , column_2 ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row and column for first matrix : ");
        row_1 = sc.nextInt() ;
        column_1 = sc.nextInt() ;

        int a[][] = new int[row_1][column_1] ;

        System.out.println("Enter the elements for first matrix : ");

        for ( i = 0 ; i < row_1 ; i ++ )
        {
            for ( j = 0 ; j < column_1 ; j ++ )
            {
                a[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Enter the row and column for second matrix : ");
        row_2= sc.nextInt() ;
        column_2 = sc.nextInt() ;

        int b[][] = new int[row_2][column_2] ;

        System.out.println("Enter the elements for second matrix : ");

        for ( i = 0 ; i < row_2 ; i ++ )
        {
            for ( j = 0 ; j < column_2 ; j ++ )
            {
                b[i][j] = sc.nextInt() ;
            }
        }

        if ( row_1 != row_2 || column_1 != column_2 )
        {
            System.out.println("Subtraction of given two matrices is not possible as they are not of same order.");
        }
        else
        {
            int c[][] = new int[row_1][column_1] ;

            for ( i = 0 ; i < row_1 ; i ++ )
            {
                for ( j = 0 ; j < column_1 ; j ++ )
                {
                    c[i][j] = a[i][j] - b[i][j] ;
                }
            }

            System.out.println("First matrix : ");
            for ( i = 0 ; i < row_1 ; i ++ )
            {
                for ( j = 0 ; j < column_1 ; j ++ )
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Second matrix : ");
            for ( i = 0 ; i < row_1 ; i ++ )
            {
                for ( j = 0 ; j < column_1 ; j ++ )
                {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Their difference : ");
            for ( i = 0 ; i < row_1 ; i ++ )
            {
                for ( j = 0 ; j < column_1 ; j ++ )
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}