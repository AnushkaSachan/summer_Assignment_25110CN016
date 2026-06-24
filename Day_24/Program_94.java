import java.util.*;
class Program_94    // Program to compress the entered string.
{
    public static void main ( String args [] )
    {
        int i , count = 1 ;
        String str , str_compressed = "" ;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        str = sc.nextLine();

        for ( i = 0 ; i < str.length() ; i ++ )
        {
            if ( i+1 < str.length() && str.charAt(i) == str.charAt(i+1) )
            {
                count ++ ;
            }
            else
            {
                str_compressed += str.charAt(i) ;
                str_compressed += count ;

                count = 1 ;
            }
        }

        System.out.println("Original string : " + str);
        System.out.println("Compressed string : " + str_compressed);

        sc.close();
    }
}