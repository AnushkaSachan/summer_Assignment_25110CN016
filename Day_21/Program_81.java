import java.util.*;
class Program_81
{
    public static void main ( String args [] )
    {
        int i = 0 ;
        String s ;
        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        s = s + '\0' ;

        while( s.charAt(i) != '\0' )
        {
            i++ ;
        }

        System.out.println("Length of string : " + i);
    }
}