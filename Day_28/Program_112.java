import java.util.*;
class Program_112   // Program to create a Contact Management System.
{
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Contact Management System ===");

        while (running) {
            System.out.println();
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = readInt(scanner);
            System.out.println();

            switch (choice) {
                case 1:
                    manager.addContact(scanner);
                    break;
                case 2:
                    manager.viewContacts();
                    break;
                case 3:
                    manager.searchContact(scanner);
                    break;
                case 4:
                    manager.deleteContact(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the contact management system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static class ContactManager {
        private final ArrayList<Contact> contacts = new ArrayList<>();

        void addContact(Scanner scanner) {
            System.out.print("Enter name: ");
            scanner.nextLine();
            String name = scanner.nextLine().trim();
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine().trim();
            System.out.print("Enter email: ");
            String email = scanner.nextLine().trim();

            contacts.add(new Contact(name, phone, email));
            System.out.println("Contact added successfully.");
        }

        void viewContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts available.");
                return;
            }

            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }

        void searchContact(Scanner scanner) {
            System.out.print("Enter name to search: ");
            scanner.nextLine();
            String keyword = scanner.nextLine().trim().toLowerCase();

            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.name.toLowerCase().contains(keyword)) {
                    System.out.println(contact);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching contact found.");
            }
        }

        void deleteContact(Scanner scanner) {
            if (contacts.isEmpty()) {
                System.out.println("No contacts to delete.");
                return;
            }

            viewContacts();
            System.out.print("Enter contact number to delete: ");
            int index = readInt(scanner) - 1;

            if (index >= 0 && index < contacts.size()) {
                contacts.remove(index);
                System.out.println("Contact deleted successfully.");
            } else {
                System.out.println("Invalid contact number.");
            }
        }
    }

    static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String toString() {
            return "Name: " + name + " | Phone: " + phone + " | Email: " + email;
        }
    }
}
