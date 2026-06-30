import java.util.*;
class Program_115     // Program to create a menu driven string operations system.
{
    public static void main(String args[]) 
    {
        int choice;
        String str = "";
        boolean running = true;

        Scanner sc = new Scanner(System.in);

        while (running) 
        {
            System.out.println("\n=== Menu Driven String Operations ===");
            System.out.println("1. Enter/Reset string");
            System.out.println("2. Display string");
            System.out.println("3. String length");
            System.out.println("4. Concatenate another string");
            System.out.println("5. Compare with another string");
            System.out.println("6. Check substring");
            System.out.println("7. Reverse string");
            System.out.println("8. Replace substring");
            System.out.println("9. Exit");
            System.out.print("Choose an option (1-9): ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the new string: ");
                    str = sc.nextLine();
                    System.out.println("String set successfully.");
                    break;
                case 2:
                    if (str.isEmpty()) 
                    {
                        System.out.println("Current string is empty. Use option 1 to enter a string.");
                    } 
                    else 
                    {
                        System.out.println("Current string: " + str);
                    }
                    break;
                case 3:
                    System.out.println("Length: " + str.length());
                    break;
                case 4:
                    System.out.print("Enter text to concatenate: ");
                    String extra = sc.nextLine();
                    str = str + extra;
                    System.out.println("Updated string: " + str);
                    break;
                case 5:
                    System.out.print("Enter string to compare: ");
                    String compare = sc.nextLine();
                    if (str.equals(compare)) 
                    {
                        System.out.println("Strings are exactly equal.");
                    } 
                    else if (str.equalsIgnoreCase(compare)) 
                    {
                        System.out.println("Strings are equal ignoring case.");
                    } 
                    else 
                    {
                        System.out.println("Strings are different.");
                    }
                    break;
                case 6:
                    System.out.print("Enter substring to search for: ");
                    String sub = sc.nextLine();
                    if (str.contains(sub)) 
                    {
                        System.out.println("Substring found at index " + str.indexOf(sub) + ".");
                    } 
                    else 
                    {
                        System.out.println("Substring not found.");
                    }
                    break;
                case 7:
                    StringBuilder reversed = new StringBuilder(str).reverse();
                    System.out.println("Reversed string: " + reversed);
                    break;
                case 8:
                    System.out.print("Enter substring to replace: ");
                    String oldSub = sc.nextLine();
                    System.out.print("Enter replacement text: ");
                    String newSub = sc.nextLine();
                    str = str.replace(oldSub, newSub);
                    System.out.println("Updated string: " + str);
                    break;
                case 9:
                    running = false;
                    System.out.println("Exiting string operation system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number from 1 to 9.");
            }
        }

        sc.close();
    }
}
