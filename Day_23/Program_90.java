import java.util.*;
class Program_90    // Program to find first repeating character.
{
    public static void main ( String args [] ) 
    {
        int i, j, count;
        char c;
        String s;
        boolean found = false;

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

            if ( count > 1 )
            {
                System.out.println("First repeating character is '" + c + "' with repeating " + count + " times.");
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("There is no repeating character in the entered string.");

        sc.close();
    }
}