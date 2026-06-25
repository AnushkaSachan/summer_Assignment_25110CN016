import java.util.*;
class Program_99    // Program to sort names alphabetically.
{
    public static void main (String args[])
    {
        int i, j, size;
        String temp ;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names to be stored : ");
        size = sc.nextInt();
        sc.nextLine();

        String names[] = new String[size];

        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.println("Enter name " + (i + 1) + " : ");
            names[i] = sc.nextLine();
        }

        for (i = 0; i < size - 1; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (names[i].compareToIgnoreCase(names[j]) > 0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names sorted alphabetically:");
        for (i = 0; i < size; i++)
        {
            System.out.println(names[i]);
        }

        sc.close();
    }
}