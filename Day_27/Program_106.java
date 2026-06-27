import java.util.*;
class Program_106    // Program to create employee management system.
{
    static class Employee 
    {
        int id;
        String name;
        int age;
        String department;
        double salary;

        Employee(int id, String name, int age, String department, double salary) 
        {
            this.id = id;
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }
    }

    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n\t\tEMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Add employee");
            System.out.println("2. Delete employee");
            System.out.println("3. Update employee");
            System.out.println("4. Search employee");
            System.out.println("5. Display all employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    deleteEmployee(sc);
                    break;
                case 3:
                    updateEmployee(sc);
                    break;
                case 4:
                    searchEmployee(sc);
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    System.out.println("Exiting employee management system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    static void addEmployee(Scanner sc) 
    {
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
        {
            if (e.id == id) 
            {
                System.out.println("Employee with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        employees.add(new Employee(id, name, age, department, salary));
        System.out.println("Employee added successfully.");
    }

    static void deleteEmployee(Scanner sc) 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) 
        {
            if (iterator.next().id == id) 
            {
                iterator.remove();
                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void updateEmployee(Scanner sc) 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
        {
            if (e.id == id) 
            {
                System.out.print("Enter new name: ");
                e.name = sc.nextLine();

                System.out.print("Enter new age: ");
                e.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new department: ");
                e.department = sc.nextLine();

                System.out.print("Enter new salary: ");
                e.salary = sc.nextDouble();
                sc.nextLine();

                System.out.println("Employee updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void searchEmployee(Scanner sc) 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No employee records found.");
            return;
        }

        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) 
        {
            if (e.id == id) 
            {
                System.out.println("Employee found:");
                System.out.println("ID: " + e.id);
                System.out.println("Name: " + e.name);
                System.out.println("Age: " + e.age);
                System.out.println("Department: " + e.department);
                System.out.println("Salary: " + e.salary);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    static void displayEmployees() 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\nCurrent employees:");
        for (Employee e : employees) 
        {
            System.out.println("----------------------------");
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Department: " + e.department);
            System.out.println("Salary: " + e.salary);
        }
    }
}