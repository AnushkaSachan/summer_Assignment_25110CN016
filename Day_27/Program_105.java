import java.util.*;
class Program_105    // Program to create student management system,
{
    static class Student 
    {
        int roll_no;
        String name;
        int age;
        String course;
        String contact_no ;

        Student(int roll_no, String name, int age, String course, String contact_no) 
        {
            this.roll_no = roll_no;
            this.name = name;
            this.age = age;
            this.course = course;
            this.contact_no = contact_no;
        }
    }

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n\t\tMENU");
            System.out.println("Press 1 : to add student");
            System.out.println("Press 2 : to delete student");
            System.out.println("Press 3 : to update student");
            System.out.println("Press 4 : to search student");
            System.out.println("Press 5 : to display student");
            System.out.println("Press 6 : to exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    deleteStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    searchStudent(sc);
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    System.out.println("Exiting student record management system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 6);

        sc.close();
    }

    static void addStudent(Scanner sc) 
    {
        System.out.print("Enter roll number: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        for (Student s : students) 
        {
            if (s.roll_no == roll_no) 
            {
                System.out.println("Student with this roll number already exists.");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter contact number: ");
        String contact_no = sc.nextLine();

        students.add(new Student(roll_no,  name, age, course, contact_no));
        System.out.println("Student added successfully.");
    }

    static void deleteStudent(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter roll number to delete: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < students.size(); i++) 
        {
            if (students.get(i).roll_no == roll_no) 
            {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateStudent(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter roll number to update: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        for (Student s : students) 
        {
            if (s.roll_no == roll_no) 
            {
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new course: ");
                s.course = sc.nextLine();

                System.out.print("Enter contact number: ");
                s.contact_no = sc.nextLine();

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void searchStudent(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter roll number to search: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        for (Student s : students) 
        {
            if (s.roll_no == roll_no) 
            {
                System.out.println("Student found:");
                System.out.println("Roll Number: " + s.roll_no);
                System.out.println("Name: " + s.name);
                System.out.println("Age: " + s.age);
                System.out.println("Course: " + s.course);
                System.out.println("Contact Number: " + s.contact_no);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void displayStudents() 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (Student s : students) 
        {
            System.out.println("Roll Number: " + s.roll_no + ", Name: " + s.name + ", Age: " + s.age + ", Course: " + s.course + ", Contact Number: " + s.contact_no);
        }
    }
}