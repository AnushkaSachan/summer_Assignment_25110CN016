import java.util.*;
class Program_86     // Program to count number of words in the string.
{
    public static void main ( String args [] )
    {
        int i , count = 0 ;
        char c ;
        String s;

        Scanner sc = new Scanner ( System.in );

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        boolean inWord = false;

        for ( i = 0 ; i < s.length() ; i ++ )
        {
            c = s.charAt(i) ;

            if (c != ' ' && !inWord)
            {
                count++;
                inWord = true;
            }
            else if (c == ' ')
            {
                inWord = false;
            }
        }

        System.out.println("Number of words in the given string are : " + count);
    }
}