import java.util.*;
class Program_96     // Program to remove duplicate characters.
{
    public static void main ( String args [] )
    {
        int i ;
        char ch ;
        String original_str , result = "" ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        original_str = sc.nextLine();
        
        for ( i = 0 ; i < original_str.length() ; i ++ )
        {
            ch = original_str.charAt(i);
            if ( result.indexOf(ch) == -1 )
            {
                result += ch;
            }
        }

        System.out.println("Original string : " + original_str);
        System.out.println("After removing duplicate characters : " + result);

        sc.close();
    }
}