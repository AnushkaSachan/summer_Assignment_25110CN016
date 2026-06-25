import java.util.*;
class Program_98    /// Program to find common characters in strings.
{
    public static void main (String args [])
    {
        int i ;
        char ch ;
        String s1 , s2 ;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first string : ");
        s1 = sc.nextLine();

        System.out.println("Enter second string : ");
        s2 = sc.nextLine();

        boolean present[] = new boolean[256];

        for (i = 0; i < s1.length(); i++) {
            present[s1.charAt(i)] = true;
        }

        System.out.print("Common characters: ");
        for (i = 0; i < s2.length(); i++) 
        {
            ch = s2.charAt(i);
            if (present[ch]) 
            {
                System.out.print(ch);
                present[ch] = false; // avoid duplicate output
            }
        }

        sc.close();
    }
}