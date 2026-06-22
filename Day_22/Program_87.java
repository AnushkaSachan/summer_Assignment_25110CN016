import java.util.*;
class Program_87    // Program to find character frequency. 
{
    public static void main ( String args [] )
    {
        int i , j , count ; 
        String s ;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        char ch[] = s.toCharArray() ;
        boolean b[] = new boolean[s.length()] ;

        System.out.println("Chararcter Occcurence : ");

        for ( i =0 ; i < ch.length ; i ++ )
        {
            if ( b[i] )
                continue;

            count = 1 ;

            for ( j = i +1 ; j < ch.length ; j ++ )
            {
                if ( ch[i] == ch[j] )
                {
                    count ++ ;
                    b[j] = true ;
                }
            }

            System.out.println(ch[i] + " : " + count);
        }
    } 
}