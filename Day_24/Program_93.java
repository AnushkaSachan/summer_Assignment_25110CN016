import java.util.*;
class Program_93    // Program to check string rotation.
{
    public static void main ( String args [] )
    {
        int i = 0 ;
        boolean rotation = false ;
        char last ;
        String s1 , s2 , original_s1 ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first string : ");
        s1 = sc.nextLine() ;

        System.out.println("Enter second string : ");
        s2 = sc.nextLine() ;

        original_s1 = s1 ;

        if ( s1.length() != s2.length() )
        {
            System.out.println("Both strings cannot be the rotation of each other as their length is different.");
        }
        else if ( s1.length() == 0 || s1.equals(s2) )
        {
            rotation = true ;
            i = 0 ;
        }
        else
        {
            for ( i = 0 ; i < s1.length() ; i ++ )
            {
                last = s1.charAt(s1.length()-1) ;
                s1 = last + s1.substring(0, s1.length()-1) ;

                if ( s1.equals(s2) )
                {
                    rotation = true ;
                    i++ ;
                    break ;
                }
            }
        }

        if ( !rotation )
            System.out.println("Second string '" + s2 + "' is not a rotation of first string '" + original_s1 + "'.");
        else
        {
            System.out.println("Second string '" + s2 + "' is a rotation of first string '" + original_s1 + "'.");
            System.out.println("After " + i + " rotations '" + s2 + "' becomes equal to '" + s1 + "'.");
        }

        sc.close();
    }
}