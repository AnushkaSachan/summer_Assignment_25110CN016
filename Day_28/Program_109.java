import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_109 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> addBook(scanner, library);
                case "2" -> library.displayBooks();
                case "3" -> searchBook(scanner, library);
                case "4" -> issueBook(scanner, library);
                case "5" -> returnBook(scanner, library);
                case "6" -> removeBook(scanner, library);
                case "7" -> {
                    running = false;
                    System.out.println("Exiting library management system. Goodbye!");
                }
                default -> System.out.println("Invalid option. Please choose a number from 1 to 7.");
            }
        }

        scanner.close();
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.println("\n--- Add Book ---");
        System.out.print("Book ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Author: ");
        String author = scanner.nextLine().trim();

        boolean added = library.addBook(new Book(id, title, author));
        if (added) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("A book with that ID already exists.");
        }
    }

    private static void searchBook(Scanner scanner, Library library) {
        System.out.println("\n--- Search Book ---");
        System.out.print("Enter title keyword: ");
        String query = scanner.nextLine().trim();
        List<Book> results = library.searchByTitle(query);

        if (results.isEmpty()) {
            System.out.println("No books found matching the title.");
        } else {
            System.out.println("Matching books:");
            for (Book book : results) {
                System.out.println(book);
            }
        }
    }

    private static void issueBook(Scanner scanner, Library library) {
        System.out.println("\n--- Issue Book ---");
        System.out.print("Enter book ID to issue: ");
        String id = scanner.nextLine().trim();
        boolean success = library.issueBook(id);
        if (success) {
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Unable to issue book. It may not exist or may already be issued.");
        }
    }

    private static void returnBook(Scanner scanner, Library library) {
        System.out.println("\n--- Return Book ---");
        System.out.print("Enter book ID to return: ");
        String id = scanner.nextLine().trim();
        boolean success = library.returnBook(id);
        if (success) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Unable to return book. It may not exist or may already be available.");
        }
    }

    private static void removeBook(Scanner scanner, Library library) {
        System.out.println("\n--- Remove Book ---");
        System.out.print("Enter book ID to remove: ");
        String id = scanner.nextLine().trim();
        boolean success = library.removeBook(id);
        if (success) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Unable to remove book. It may not exist.");
        }
    }
}

class Book {
    private final String id;
    private final String title;
    private final String author;
    private boolean available;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issue() {
        this.available = false;
    }

    public void returned() {
        this.available = true;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Title: %s | Author: %s | Status: %s",
                id,
                title,
                author,
                available ? "Available" : "Issued");
    }
}

class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if (findBookById(book.getId()) != null) {
            return false;
        }
        books.add(book);
        return true;
    }

    public void displayBooks() {
        System.out.println("\n--- All Books ---");
        if (books.isEmpty()) {
            System.out.println("No books are currently available in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> searchByTitle(String keyword) {
        List<Book> results = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(lowerKeyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public boolean issueBook(String id) {
        Book book = findBookById(id);
        if (book != null && book.isAvailable()) {
            book.issue();
            return true;
        }
        return false;
    }

    public boolean returnBook(String id) {
        Book book = findBookById(id);
        if (book != null && !book.isAvailable()) {
            book.returned();
            return true;
        }
        return false;
    }

    public boolean removeBook(String id) {
        Book book = findBookById(id);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }

    private Book findBookById(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }
}
