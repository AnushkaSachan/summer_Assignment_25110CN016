import java.util.*;
class Program_95    // Program to find the longest word in the entered string.
{
    public static void main ( String args [] )
    {
        int i , length_max = 0 ;
        char c ;
        String str , word = "" , word_max = "" ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        str = sc.nextLine();
        str += " ";

        for ( i = 0 ; i < str.length() ; i ++ )
        {
            c = str.charAt(i);
            if ( c != ' ')
            {
                word += c;
            }
            else if ( c == ' ' && word.length() > 0 )
            {
                if ( length_max < word.length() )
                {
                    length_max = word.length();
                    word_max = word ;
                }

                word = "";
            }
        }
        System.out.println("Longest word : " + word_max);

        sc.close();
    }
}