import java.util.*;
class Program_108   // Program to create marksheet generation system.
{
    static class Student 
    {
        int rollNo;
        String name;
        String studentClass;
        int english;
        int maths;
        int science;
        int social;
        int computer;

        Student(int rollNo, String name, String studentClass, int english, int maths, int science, int social, int computer) 
        {
            this.rollNo = rollNo;
            this.name = name;
            this.studentClass = studentClass;
            this.english = english;
            this.maths = maths;
            this.science = science;
            this.social = social;
            this.computer = computer;
        }

        int getTotal() 
        {
            return english + maths + science + social + computer;
        }

        double getPercentage() 
        {
            return getTotal() / 5.0;
        }

        String getGrade() 
        {
            if (!hasPassed()) return "F";
            double percent = getPercentage();

            if (percent >= 90) return "A1";
            if (percent >= 80) return "A2";
            if (percent >= 70) return "B1";
            if (percent >= 60) return "B2";
            if (percent >= 50) return "C1";
            return "C2";
        }

        boolean hasPassed() 
        {
            return english >= 35 && maths >= 35 && science >= 35 && social >= 35 && computer >= 35;
        }
    }

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n\t\tMARKSHEET GENERATION SYSTEM");
            System.out.println("1. Add marksheet");
            System.out.println("2. Display all marksheets");
            System.out.println("3. Search marksheet by roll number");
            System.out.println("4. Update marksheet");
            System.out.println("5. Delete marksheet");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    addMarksheet(sc);
                    break;
                case 2:
                    displayAllMarksheets();
                    break;
                case 3:
                    searchMarksheet(sc);
                    break;
                case 4:
                    updateMarksheet(sc);
                    break;
                case 5:
                    deleteMarksheet(sc);
                    break;
                case 6:
                    System.out.println("Exiting marksheet generation system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    static void addMarksheet(Scanner sc) 
    {
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        if (findStudent(rollNo) != null) 
        {
            System.out.println("A marksheet with this roll number already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter class/grade: ");
        String studentClass = sc.nextLine();

        int english = readMark(sc, "English");
        int maths = readMark(sc, "Mathematics");
        int science = readMark(sc, "Science");
        int social = readMark(sc, "Social Science");
        int computer = readMark(sc, "Computer");

        students.add(new Student(rollNo, name, studentClass, english, maths, science, social, computer));
        System.out.println("Marksheet added successfully.");
    }

    static int readMark(Scanner sc, String subject) 
    {
        while (true) 
        {
            System.out.print("Enter marks for " + subject + " (0-100): ");
            if (!sc.hasNextInt()) 
            {
                sc.nextLine();
                System.out.println("Please enter a valid integer mark.");
                continue;
            }

            int mark = sc.nextInt();
            sc.nextLine();

            if (mark < 0 || mark > 100) 
            {
                System.out.println("Marks must be between 0 and 100.");
            } 
            else 
            {
                return mark;
            }
        }
    }

    static void displayAllMarksheets() 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No marksheets available.");
            return;
        }

        for (Student s : students) 
        {
            printMarksheet(s);
            System.out.println();
        }
    }

    static void searchMarksheet(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No marksheets available.");
            return;
        }

        System.out.print("Enter roll number to search: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(rollNo);
        if (student == null) 
        {
            System.out.println("Marksheet not found.");
        } 
        else 
        {
            printMarksheet(student);
        }
    }

    static void updateMarksheet(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No marksheets available.");
            return;
        }

        System.out.print("Enter roll number to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(rollNo);
        if (student == null) 
        {
            System.out.println("Marksheet not found.");
            return;
        }

        System.out.print("Enter new student name (leave blank to keep current): ");
        String name = sc.nextLine();
        if (!name.isEmpty()) student.name = name;

        System.out.print("Enter new class/grade (leave blank to keep current): ");
        String studentClass = sc.nextLine();
        if (!studentClass.isEmpty()) student.studentClass = studentClass;

        System.out.println("Enter new marks or press Enter to keep current values.");
        student.english = readOptionalMark(sc, "English", student.english);
        student.maths = readOptionalMark(sc, "Mathematics", student.maths);
        student.science = readOptionalMark(sc, "Science", student.science);
        student.social = readOptionalMark(sc, "Social Science", student.social);
        student.computer = readOptionalMark(sc, "Computer", student.computer);

        System.out.println("Marksheet updated successfully.");
    }

    static int readOptionalMark(Scanner sc, String subject, int currentValue) 
    {
        while (true) 
        {
            System.out.print("Enter " + subject + " marks (current " + currentValue + ", 0-100, blank to keep): ");
            String line = sc.nextLine();
            if (line.isEmpty()) return currentValue;

            try 
            {
                int mark = Integer.parseInt(line);
                if (mark < 0 || mark > 100) 
                {
                    System.out.println("Marks must be between 0 and 100.");
                } 
                else 
                {
                    return mark;
                }
            } 
            catch (NumberFormatException ex) 
            {
                System.out.println("Please enter a valid integer or leave blank.");
            }
        }
    }

    static void deleteMarksheet(Scanner sc) 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No marksheets available.");
            return;
        }

        System.out.print("Enter roll number to delete: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) 
        {
            if (iterator.next().rollNo == rollNo) 
            {
                iterator.remove();
                System.out.println("Marksheet deleted successfully.");
                return;
            }
        }

        System.out.println("Marksheet not found.");
    }

    static Student findStudent(int rollNo) 
    {
        for (Student s : students) 
        {
            if (s.rollNo == rollNo) return s;
        }
        return null;
    }

    static void printMarksheet(Student s) 
    {
        System.out.println("--------------------------------------------------");
        System.out.println("MARKSHEET");
        System.out.println("--------------------------------------------------");
        System.out.println("Roll Number: " + s.rollNo);
        System.out.println("Name       : " + s.name);
        System.out.println("Class      : " + s.studentClass);
        System.out.println("--------------------------------------------------");
        System.out.println("Subject           Marks");
        System.out.println("English           " + s.english);
        System.out.println("Mathematics       " + s.maths);
        System.out.println("Science           " + s.science);
        System.out.println("Social Science    " + s.social);
        System.out.println("Computer          " + s.computer);
        System.out.println("--------------------------------------------------");
        System.out.println("Total             " + s.getTotal() + "/500");
        System.out.printf("Percentage        %.2f%%\n", s.getPercentage());
        System.out.println("Result            " + (s.hasPassed() ? "Pass" : "Fail"));
        System.out.println("Grade             " + s.getGrade());
        System.out.println("--------------------------------------------------");
    }
}