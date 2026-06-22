import java.util.*;
class Program_88     // PProgram to remove spaces from string.
{
    public static void main ( String args [] )
    {
        int i ;
        char c ;
        String s , str = "" ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string :");
        s = sc.nextLine();

        for ( i = 0 ; i < s.length() ; i ++ )
        {
            c = s.charAt(i) ;

            if ( c != ' ')
                str = str + c ;
        }

        System.out.println("String after removing spaces : " + str);
    }
}