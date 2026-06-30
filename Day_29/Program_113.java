import java.util.*;
class Program_113    // Program to create a menu-driven calculator.
{
    public static void main( String args[]) 
    {
        int choice;
        double num1, num2;
        boolean keepRunning = true;

        Scanner sc = new Scanner(System.in);

        while (keepRunning) 
        {
            System.out.println("\n=== Menu Driven Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) 
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else 
                    {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) 
                    {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else 
                    {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
                case 6:
                    System.out.print("Enter base number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 7:
                    keepRunning = false;
                    System.out.println("Exiting calculator. Thank you for using it. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a number from 1 to 7.");
            }
        }

        sc.close();
    }
}
