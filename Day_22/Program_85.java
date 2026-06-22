import java.util.*;
class Program_85   // Program to check pallindrome string.
{
    public static void main ( String args [] )
    {
        int i ;
        String s , rev = "" ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string :");
        s = sc.nextLine();

        for ( i = s.length()-1 ; i >= 0 ; i -- )
        {
            rev = rev + s.charAt(i) ;
        }

        if ( s.equals(rev) )
        {
            System.out.println("Entered string is a pallindrime string.");
        }
        else{
            System.out.println("Entered string is not a pallindrome string.");
        }
    }
}