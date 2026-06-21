import java.util.*;
class Program_82
{
    public static void main ( String args [] )
    {
        int i ;
        String s , rev = "" ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        for ( i = s.length()-1 ; i >= 0 ; i -- )
        {
            rev = rev + s.charAt(i) ;
        }

        System.out.println("Reversed string : " + rev );
    }
}