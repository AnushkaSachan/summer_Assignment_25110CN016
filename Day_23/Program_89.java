import java.util.*;
class Program_89    // Program to find first non-repeating character.
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

            if ( count == 1 )
            {
                System.out.println("First non-repeating character is : " + c);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("All the characters present in the entered string are repeating.");

        sc.close();
    }
}