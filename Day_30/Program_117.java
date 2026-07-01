import java.util.*;
class Program_117    // Program to create student record system using array and string.
{
    // Arrays to store student records
    static String studentNames[] = new String[100];
    static int studentIDs[] = new int[100];
    static double studentGrades[] = new double[100];
    static int studentCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;
        
        while (true) 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you for using Student Record System!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void displayMenu() 
    {
        System.out.println("\n========== STUDENT RECORD SYSTEM ==========");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student Record");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.println("==========================================");
    }

    // Add a new student
    static void addStudent() 
    {
        if (studentCount >= 100) 
        {
            System.out.println("Cannot add more students! Maximum limit reached.");
            return;
        }

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check if ID already exists
        for (int i = 0; i < studentCount; i++) 
        {
            if (studentIDs[i] == id) 
            {
                System.out.println("Student with this ID already exists!");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Grade: ");
        double grade = sc.nextDouble();
        sc.nextLine();

        // Store the data
        studentIDs[studentCount] = id;
        studentNames[studentCount] = name;
        studentGrades[studentCount] = grade;
        studentCount++;

        System.out.println("✓ Student added successfully!");
    }

    // View all students
    static void viewAllStudents() 
    {
        if (studentCount == 0) 
        {
            System.out.println("No students in the system!");
            return;
        }

        System.out.println("\n========== STUDENT RECORDS ==========");
        System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Grade");
        System.out.println("===================================");

        for (int i = 0; i < studentCount; i++) 
        {
            System.out.printf("%-10d %-20s %-10.2f\n", 
                studentIDs[i], studentNames[i], studentGrades[i]);
        }
        System.out.println("===================================");
    }

    // Search student by ID
    static void searchStudent() 
    {
        System.out.print("Enter Student ID to search: ");
        int searchID = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < studentCount; i++) 
        {
            if (studentIDs[i] == searchID) 
            {
                System.out.println("\n========== STUDENT FOUND ==========");
                System.out.println("ID: " + studentIDs[i]);
                System.out.println("Name: " + studentNames[i]);
                System.out.println("Grade: " + studentGrades[i]);
                System.out.println("===================================");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Update student record
    static void updateStudent() 
    {
        System.out.print("Enter Student ID to update: ");
        int updateID = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < studentCount; i++) 
        {
            if (studentIDs[i] == updateID) 
            {
                System.out.print("Enter new name (current: " + studentNames[i] + "): ");
                String newName = sc.nextLine();
                
                System.out.print("Enter new grade (current: " + studentGrades[i] + "): ");
                double newGrade = sc.nextDouble();
                sc.nextLine();

                studentNames[i] = newName;
                studentGrades[i] = newGrade;

                System.out.println("✓ Student record updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Delete student record
    static void deleteStudent() 
    {
        System.out.print("Enter Student ID to delete: ");
        int deleteID = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < studentCount; i++) 
        {
            if (studentIDs[i] == deleteID) 
            {
                // Shift elements to fill the gap
                for (int j = i; j < studentCount - 1; j++) 
                {
                    studentIDs[j] = studentIDs[j + 1];
                    studentNames[j] = studentNames[j + 1];
                    studentGrades[j] = studentGrades[j + 1];
                }
                studentCount--;
                System.out.println("✓ Student record deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}
