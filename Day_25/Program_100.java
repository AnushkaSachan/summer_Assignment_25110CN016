import java.util.*;
class Program_100    // Program to sort words by their length.
{
    public static void main (String args [])
    {
        int i , j ;
        String temp ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        for ( i = 0 ; i < words.length - 1 ; i++ ) 
        {
            for ( j = 0 ; j < words.length - 1 - i ; j++ ) 
            {
                if (words[j].length() > words[j + 1].length()) 
                {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.print("Words sorted by length:");
        for ( i = 0 ; i < words.length ; i++ )
        {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}