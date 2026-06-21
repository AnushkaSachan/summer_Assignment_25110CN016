import java.util.*;
class Program_84
{
    public static void main ( String args [] )
    {
        int i ;
        char c ;
        String s , result = "" ;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        for ( i = 0 ; i < s.length() ; i ++ )
        {
            c = s.charAt(i) ;

            if ( Character.isLowerCase(c) )
            {
                result = result + Character.toUpperCase(c);
            }
            else
            {
                result = result + c;
            }
        }

        System.out.println("Uppercase string: " + result);
    }
}