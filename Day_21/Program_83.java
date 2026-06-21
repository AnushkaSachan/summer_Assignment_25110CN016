import java.util.*;
class Program_83
{
    public static void main ( String args [] )
    {
        int i , vowels = 0 , consonants = 0 ;
        char c ;
        String s ;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        s = sc.nextLine() ;

        for ( i = 0 ; i < s.length() ; i ++ )
        {
            c = s.charAt(i) ;

            if ( Character.isLetter(c))
            {
                if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
                {
                    vowels ++ ;
                }
                else
                {
                    consonants ++ ;
                }
            }
        }

        System.out.println("Number of vowels : " + vowels);
        System.out.println("Number of consonants : " + consonants);
    }
}