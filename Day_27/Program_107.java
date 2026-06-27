import java.util.*;
class Program_107   // Program to create salary management system.
{
    static class Employee 
    {
        int id;
        String name;
        String department;
        double baseSalary;
        double bonus;

        Employee(int id, String name, String department, double baseSalary, double bonus) 
        {
            this.id = id;
            this.name = name;
            this.department = department;
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        double getTotalSalary() 
        {
            return baseSalary + bonus;
        }
    }

    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n\t\tSALARY MANAGEMENT SYSTEM");
            System.out.println("1. Add employee salary record");
            System.out.println("2. Update salary record");
            System.out.println("3. Display salary details");
            System.out.println("4. Search by employee ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    addSalaryRecord(sc);
                    break;
                case 2:
                    updateSalaryRecord(sc);
                    break;
                case 3:
                    displaySalaryDetails();
                    break;
                case 4:
                    searchSalaryRecord(sc);
                    break;
                case 5:
                    System.out.println("Exiting salary management system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    static void addSalaryRecord(Scanner sc) 
    {
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
            {
            if (e.id == id) 
            {
                System.out.println("Employee ID already exists.");
                return;
            }
        }

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter base salary: ");
        double baseSalary = sc.nextDouble();

        System.out.print("Enter bonus amount: ");
        double bonus = sc.nextDouble();
        sc.nextLine();

        employees.add(new Employee(id, name, department, baseSalary, bonus));
        System.out.println("Salary record added successfully.");
    }

    static void updateSalaryRecord(Scanner sc) 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No salary records found.");
            return;
        }

        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
        {
            if (e.id == id) 
            {
                System.out.print("Enter new base salary: ");
                e.baseSalary = sc.nextDouble();
                System.out.print("Enter new bonus amount: ");
                e.bonus = sc.nextDouble();
                sc.nextLine();
                System.out.println("Salary record updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void displaySalaryDetails() 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No salary records available.");
            return;
        }

        System.out.println("\nSalary records:");
        for (Employee e : employees) 
        {
            System.out.println("---------------------------");
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Department: " + e.department);
            System.out.println("Base Salary: " + e.baseSalary);
            System.out.println("Bonus: " + e.bonus);
            System.out.println("Total Salary: " + e.getTotalSalary());
        }
    }

    static void searchSalaryRecord(Scanner sc) 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No salary records available.");
            return;
        }

        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
        {
            if (e.id == id) 
            {
                System.out.println("Employee salary details:");
                System.out.println("ID: " + e.id);
                System.out.println("Name: " + e.name);
                System.out.println("Department: " + e.department);
                System.out.println("Base Salary: " + e.baseSalary);
                System.out.println("Bonus: " + e.bonus);
                System.out.println("Total Salary: " + e.getTotalSalary());
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}