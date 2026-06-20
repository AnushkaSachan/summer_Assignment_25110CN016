import java.util.*;
class Program_78     // Program to check symmetric matrix.
{
    public static void main ( String args [] )
    {
        int i , j , row , column ;
        boolean check =  true ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row and column for matrix : ");
        row = sc.nextInt() ;
        column = sc.nextInt() ;

        int a[][] = new int[row][column] ;

        System.out.println("Enter the elements for matrix : ");

        for ( i = 0 ; i < row ; i ++ )
        {
            for ( j = 0 ; j < column ; j ++ )
            {
                a[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Entered matrix :");

        for ( i = 0 ; i < row ; i ++ )
        {
            for ( j = 0 ; j < column ; j ++ )
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int t[][] = new int[column][row] ;

        for ( i = 0 ; i < column ; i ++ )
        {
            for ( j = 0 ; j < row ; j ++ )
            {
                t[i][j] = a[j][i] ;
            }
        }

        System.out.println("Transpose of matrix : ");

        for ( i = 0 ; i < column ; i ++ )
        {
            for ( j = 0 ; j < row ; j ++ )
            {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        if ( row != column )
        {
            System.out.println("Entered matrix is not a symmetric matrix.");
        }
        else
        {
            for ( i = 0 ; i < row ; i ++ )
            {
                for ( j = 0 ; j < column ; j ++ )
                {
                    if ( a[i][j] != t[i][j] )
                    {
                        check = false ;
                        break ;
                    }
                }
                if( !check )
                    break ;
            }
            if ( !check )
                System.out.println("Entered matrix is not a symmetric matrix.");
            else
                System.out.println("Entered matrix is a symmetric matrix.");
        }
    }
}