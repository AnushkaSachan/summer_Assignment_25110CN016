import java.util.*;
class Program_91     // Program to check anagram string.
{
    public static void main(String args[])
    {
        int i ;
        char temp ;
        String s1 , s2 ;
        boolean anagram = true ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.println("Enter the second string:");
        s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length())
        {
            System.out.println("Strings entered are not anagrams.");
        }
        else
        {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            for (i = 0; i < arr1.length - 1; i++)
            {
                for (int j = i + 1; j < arr1.length; j++)
                {
                    if (arr1[i] > arr1[j])
                    {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }

            for (i = 0; i < arr2.length - 1; i++)
            {
                for (int j = i + 1; j < arr2.length; j++)
                {
                    if (arr2[i] > arr2[j])
                    {
                        temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            for (i = 0; i < arr1.length; i++)
            {
                if (arr1[i] != arr2[i])
                {
                    anagram = false;
                    break;
                }
            }

            if (anagram)
                System.out.println("Strings entered are anagrams.");
            else
                System.out.println("Strings entered are not anagrams.");
        }

        sc.close();
    }
}
