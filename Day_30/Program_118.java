import java.util.*;
class Program_118    // Program to create mini library system.
{
     static Scanner sc = new Scanner(System.in);
     static List<Book> books = new ArrayList<>();
     static int nextBookId = 1;

    public static void main(String args[]) 
    {
        while (true) 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            String input = sc.nextLine().trim();

            switch (input) 
            {
                case "1":
                    addBook();
                    break;
                case "2":
                    viewAllBooks();
                    break;
                case "3":
                    searchBook();
                    break;
                case "4":
                    issueBook();
                    break;
                case "5":
                    returnBook();
                    break;
                case "6":
                    removeBook();
                    break;
                case "7":
                    System.out.println("Thank you for using the Mini Library System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }
    }

    static void displayMenu() 
    {
        System.out.println("\n===== MINI LIBRARY SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Remove Book");
        System.out.println("7. Exit");
        System.out.println("===============================");
    }

    static void addBook() 
    {
        System.out.print("Enter book title: ");
        String title = sc.nextLine().trim();
        System.out.print("Enter book author: ");
        String author = sc.nextLine().trim();
        System.out.print("Enter book ISBN: ");
        String isbn = sc.nextLine().trim();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) 
        {
            System.out.println("All fields are required. Book was not added.");
            return;
        }

        for (Book book : books) 
        {
            if (book.isbn.equalsIgnoreCase(isbn)) 
            {
                System.out.println("A book with this ISBN already exists.");
                return;
            }
        }

        Book book = new Book(nextBookId++, title, author, isbn);
        books.add(book);
        System.out.println("✓ Book added successfully with ID " + book.id + "!");
    }

    static void viewAllBooks() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books are currently available in the library.");
            return;
        }

        System.out.println("\nID   Title                      Author                 ISBN          Status");
        System.out.println("-------------------------------------------------------------------------------");
        for (Book book : books) 
        {
            System.out.printf("%-4d %-25s %-22s %-12s %s\n",
                    book.id,
                    truncate(book.title, 25),
                    truncate(book.author, 22),
                    truncate(book.isbn, 12),
                    book.issued ? "Issued to " + book.borrower : "Available");
        }
    }

    static void searchBook() 
    {
        System.out.print("Search by (1) ID, (2) ISBN, (3) Title: ");
        String option = sc.nextLine().trim();

        Book book = null;
        switch (option) 
        {
            case "1":
                System.out.print("Enter book ID: ");
                book = findBookById(parseInt(sc.nextLine().trim()));
                break;
            case "2":
                System.out.print("Enter book ISBN: ");
                book = findBookByIsbn(sc.nextLine().trim());
                break;
            case "3":
                System.out.print("Enter book title keyword: ");
                book = findBookByTitle(sc.nextLine().trim());
                break;
            default:
                System.out.println("Invalid search option.");
                return;
        }

        if (book == null) 
        {
            System.out.println("Book not found.");
        } 
        else 
        {
            displayBookDetails(book);
        }
    }

    static void issueBook() 
    {
        System.out.print("Enter book ID to issue: ");
        Book book = findBookById(parseInt(sc.nextLine().trim()));
        if (book == null) 
        {
            System.out.println("Book not found.");
            return;
        }
        if (book.issued) 
        {
            System.out.println("This book is already issued to " + book.borrower + ".");
            return;
        }

        System.out.print("Enter borrower name: ");
        String borrower = sc.nextLine().trim();
        if (borrower.isEmpty()) 
        {
            System.out.println("Borrower name cannot be empty.");
            return;
        }

        book.issued = true;
        book.borrower = borrower;
        System.out.println("✓ Book issued successfully to " + borrower + "!");
    }

    static void returnBook() 
    {
        System.out.print("Enter book ID to return: ");
        Book book = findBookById(parseInt(sc.nextLine().trim()));
        if (book == null) 
        {
            System.out.println("Book not found.");
            return;
        }
        if (!book.issued) 
        {
            System.out.println("This book is not currently issued.");
            return;
        }

        book.issued = false;
        String borrower = book.borrower;
        book.borrower = "";
        System.out.println("✓ Book returned successfully from " + borrower + "!");
    }

    static void removeBook() 
    {
        System.out.print("Enter book ID to remove: ");
        int id = parseInt(sc.nextLine().trim());
        Book book = findBookById(id);
        if (book == null) 
        {
            System.out.println("Book not found.");
            return;
        }
        if (book.issued) 
        {
            System.out.println("Cannot remove a book while it is issued.");
            return;
        }

        books.remove(book);
        System.out.println("✓ Book removed successfully.");
    }

    static Book findBookById(int id) 
    {
        if (id < 1) return null;
        for (Book book : books) 
        {
            if (book.id == id) return book;
        }
        return null;
    }

    static Book findBookByIsbn(String isbn) 
    {
        if (isbn.isEmpty()) return null;
        for (Book book : books) 
        {
            if (book.isbn.equalsIgnoreCase(isbn)) return book;
        }
        return null;
    }

    static Book findBookByTitle(String keyword) 
    {
        if (keyword.isEmpty()) return null;
        String lower = keyword.toLowerCase();
        for (Book book : books) 
        {
            if (book.title.toLowerCase().contains(lower)) return book;
        }
        return null;
    }

    static void displayBookDetails(Book book)
    { 
        System.out.println("\n===== BOOK DETAILS =====");
        System.out.println("ID       : " + book.id);
        System.out.println("Title    : " + book.title);
        System.out.println("Author   : " + book.author);
        System.out.println("ISBN     : " + book.isbn);
        System.out.println("Status   : " + (book.issued ? "Issued to " + book.borrower : "Available"));
        System.out.println("========================");
    }

    static int parseInt(String text) 
    {
        try 
        {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) 
        {
            return -1;
        }
    }

    static String truncate(String text, int length) 
    {
        if (text.length() <= length) return text;
        return text.substring(0, length - 3) + "...";
    }

    static class Book 
    {
        int id;
        String title;
        String author;
        String isbn;
        boolean issued;
        String borrower;

        Book(int id, String title, String author, String isbn) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.issued = false;
            this.borrower = "";
        }
    }
}
