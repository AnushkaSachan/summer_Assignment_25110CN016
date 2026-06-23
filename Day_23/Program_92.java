import java.util.*;
class Program_92     // Program to find maximum occuring character.
{
    public static void main ( String args [] ) 
    {
        int i , j , count , count_max = 0 ;
        char c , ch = ' ' ;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        s = sc.nextLine();

        for ( i = 0 ; i < s.length() ; i ++ )
        {
            c = s.charAt(i) ;
            count = 0 ;

            for ( j = 0 ; j < s.length() ; j ++ )
            {
                if ( c == s.charAt(j) )
                {
                    count ++ ;
                }
            }

            if ( count_max < count )
            {
                count_max = count ;
                ch = c ;
            }
        }

        if ( count_max != 1 )
            System.out.println("The character with maximum repeatition in the entered string is '" + ch + "' being rerpeated " + count_max + " times.");
        else
            System.out.println("No character is bieng repeated.");

        sc.close();
    }
}