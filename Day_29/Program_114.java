import java.util.*;
class Program_114    // Program to create a menu driven array operations system.
{
    public static void main(String args[]) 
    {
        int choice;
        int a[] = new int[0];
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) 
        {
            System.out.println("\n=== Menu Driven Array Operating System ===");
            System.out.println("1. Create/Reset array");
            System.out.println("2. Display array");
            System.out.println("3. Insert element");
            System.out.println("4. Delete element");
            System.out.println("5. Search element");
            System.out.println("6. Sort array");
            System.out.println("7. Reverse array");
            System.out.println("8. Exit");
            System.out.print("Choose an option (1-8): ");

            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter size of array: ");
                    int size = sc.nextInt();
                    a = new int[size];
                    for (int i = 0; i < size; i++) 
                    {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        a[i] = sc.nextInt();
                    }
                    System.out.println("Array created successfully.");
                    break;
                case 2:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Create it first.");
                    } else 
                    {
                        System.out.println("Array contents: " + Arrays.toString(a));
                    }
                    break;
                case 3:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Create it first.");
                        break;
                    }
                    System.out.print("Enter element to insert: ");
                    int newValue = sc.nextInt();
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length - 1] = newValue;
                    System.out.println("Element inserted at the end.");
                    break;
                case 4:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Nothing to delete.");
                        break;
                    }
                    System.out.print("Enter element to delete: ");
                    int deleteValue = sc.nextInt();
                    int deleteIndex = -1;
                    for (int i = 0; i < a.length; i++) 
                    {
                        if (a[i] == deleteValue) 
                        {
                            deleteIndex = i;
                            break;
                        }
                    }
                    if (deleteIndex == -1) 
                    {
                        System.out.println("Element not found in the array.");
                    } 
                    else
                    {
                        int temp[] = new int[a.length - 1];
                        for (int i = 0, j = 0; i < a.length; i++) {
                            if (i == deleteIndex) 
                            {
                                continue;
                            }
                            temp[j] = a[i];
                            j++;
                        }
                        a = temp;
                        System.out.println("Element deleted successfully.");
                    }
                    break;
                case 5:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Create it first.");
                        break;
                    }
                    System.out.print("Enter element to search: ");
                    int searchValue = sc.nextInt();
                    int foundIndex = -1;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == searchValue) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }
                    if (foundIndex == -1) 
                    {
                        System.out.println("Element not found.");
                    } 
                    else 
                    {
                        System.out.println("Element found at index " + foundIndex + ".");
                    }
                    break;
                case 6:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Create it first.");
                    } 
                    else 
                    {
                        Arrays.sort(a);
                        System.out.println("Array sorted: " + Arrays.toString(a));
                    }
                    break;
                case 7:
                    if (a.length == 0) 
                    {
                        System.out.println("Array is empty. Create it first.");
                    } 
                    else 
                    {
                        for(int i = 0 ; i < a.length/2 ; i++)
                        {
                            a[i] = a[a.length-i-1];
                        }
                        System.out.println("Array reversed: " + Arrays.toString(a));
                    }
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting array operating system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-8.");
            }
        }

        sc.close();
    }
}
