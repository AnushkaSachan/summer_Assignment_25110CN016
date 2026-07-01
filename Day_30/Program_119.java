import java.util.*;
public class Program_119   // Program to create mini employee management system.
{
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();
    static int nextEmployeeId = 1;

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    viewAllEmployees();
                    break;
                case "3":
                    searchEmployee();
                    break;
                case "4":
                    updateEmployee();
                    break;
                case "5":
                    removeEmployee();
                    break;
                case "6":
                    System.out.println("Thank you for using the Mini Employee Management System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }

    static void displayMenu() {
        System.out.println("\n===== MINI EMPLOYEE MANAGEMENT =====");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Remove Employee");
        System.out.println("6. Exit");
        System.out.println("===================================");
    }

    static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter employee department: ");
        String department = sc.nextLine().trim();
        System.out.print("Enter employee salary: ");
        double salary = parseDouble(sc.nextLine().trim());

        if (name.isEmpty() || department.isEmpty() || salary < 0) {
            System.out.println("Invalid input. Employee was not added.");
            return;
        }

        Employee employee = new Employee(nextEmployeeId++, name, department, salary);
        employees.add(employee);
        System.out.println("✓ Employee added successfully with ID " + employee.id + "!");
    }

    static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\nID   Name                     Department            Salary");
        System.out.println("============================================================");
        for (Employee employee : employees) {
            System.out.printf("%-4d %-24s %-20s $%.2f\n",
                    employee.id,
                    truncate(employee.name, 24),
                    truncate(employee.department, 20),
                    employee.salary);
        }
    }

    static void searchEmployee() {
        System.out.print("Search by (1) ID, (2) Name: ");
        String option = sc.nextLine().trim();

        switch (option) {
            case "1":
                System.out.print("Enter employee ID: ");
                Employee byId = findEmployeeById(parseInt(sc.nextLine().trim()));
                if (byId != null) {
                    displayEmployeeDetails(byId);
                } else {
                    System.out.println("Employee not found.");
                }
                break;
            case "2":
                System.out.print("Enter employee name keyword: ");
                Employee byName = findEmployeeByName(sc.nextLine().trim());
                if (byName != null) {
                    displayEmployeeDetails(byName);
                } else {
                    System.out.println("Employee not found.");
                }
                break;
            default:
                System.out.println("Invalid search option.");
        }
    }

    static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        Employee employee = findEmployeeById(parseInt(sc.nextLine().trim()));
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter new name (current: " + employee.name + "): ");
        String newName = sc.nextLine().trim();
        System.out.print("Enter new department (current: " + employee.department + "): ");
        String newDepartment = sc.nextLine().trim();
        System.out.print("Enter new salary (current: " + employee.salary + "): ");
        double newSalary = parseDouble(sc.nextLine().trim());

        if (newName.isEmpty() || newDepartment.isEmpty() || newSalary < 0) {
            System.out.println("Invalid input. Employee was not updated.");
            return;
        }

        employee.name = newName;
        employee.department = newDepartment;
        employee.salary = newSalary;
        System.out.println("✓ Employee updated successfully!");
    }

    static void removeEmployee() {
        System.out.print("Enter employee ID to remove: ");
        Employee employee = findEmployeeById(parseInt(sc.nextLine().trim()));
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        employees.remove(employee);
        System.out.println("✓ Employee removed successfully.");
    }

    static Employee findEmployeeById(int id) {
        if (id < 1) return null;
        for (Employee employee : employees) {
            if (employee.id == id) return employee;
        }
        return null;
    }

    static Employee findEmployeeByName(String keyword) {
        if (keyword.isEmpty()) return null;
        String lower = keyword.toLowerCase();
        for (Employee employee : employees) {
            if (employee.name.toLowerCase().contains(lower)) return employee;
        }
        return null;
    }

    static void displayEmployeeDetails(Employee employee) {
        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("ID        : " + employee.id);
        System.out.println("Name      : " + employee.name);
        System.out.println("Department: " + employee.department);
        System.out.println("Salary    : $" + String.format("%.2f", employee.salary));
        System.out.println("============================");
    }

    static int parseInt(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    static double parseDouble(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    static String truncate(String text, int length) {
        if (text.length() <= length) return text;
        return text.substring(0, length - 3) + "...";
    }

    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }
}
