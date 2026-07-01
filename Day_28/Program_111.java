import java.util.*;
class Program_111   // Program to create a Ticket Booking System.
{
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Ticket Booking System ===");

        while (running) {
            System.out.println();
            System.out.println("1. View Available Tickets");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = readInt(scanner);
            System.out.println();

            switch (choice) {
                case 1:
                    system.showAvailableTickets();
                    break;
                case 2:
                    system.bookTicket(scanner);
                    break;
                case 3:
                    system.viewBookings();
                    break;
                case 4:
                    system.cancelBooking(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the ticket booking system.");
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

    static class TicketBookingSystem {
        private final List<Ticket> tickets = new ArrayList<>();
        private final List<Booking> bookings = new ArrayList<>();
        private int nextBookingId = 1001;

        TicketBookingSystem() {
            tickets.add(new Ticket("Morning Show", "10:00 AM", 50));
            tickets.add(new Ticket("Afternoon Show", "2:00 PM", 40));
            tickets.add(new Ticket("Evening Show", "8:00 PM", 60));
        }

        void showAvailableTickets() {
            if (tickets.isEmpty()) {
                System.out.println("No tickets available.");
                return;
            }

            System.out.println("Available Tickets:");
            for (int i = 0; i < tickets.size(); i++) {
                Ticket ticket = tickets.get(i);
                System.out.println((i + 1) + ". " + ticket);
            }
        }

        void bookTicket(Scanner scanner) {
            showAvailableTickets();
            System.out.print("Enter ticket number: ");
            int ticketNumber = readInt(scanner);

            if (ticketNumber < 1 || ticketNumber > tickets.size()) {
                System.out.println("Invalid ticket number.");
                return;
            }

            Ticket ticket = tickets.get(ticketNumber - 1);
            System.out.print("Enter your name: ");
            scanner.nextLine();
            String customerName = scanner.nextLine().trim();
            System.out.print("Enter number of seats: ");
            int seats = readInt(scanner);

            if (seats <= 0) {
                System.out.println("Seats must be greater than zero.");
                return;
            }

            if (seats > ticket.availableSeats) {
                System.out.println("Only " + ticket.availableSeats + " seats are available.");
                return;
            }

            ticket.availableSeats -= seats;
            bookings.add(new Booking(nextBookingId++, customerName, ticket, seats));
            System.out.println("Booking successful!");
            System.out.println("Booking ID: " + (nextBookingId - 1));
        }

        void viewBookings() {
            if (bookings.isEmpty()) {
                System.out.println("No bookings found.");
                return;
            }

            System.out.println("Current Bookings:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }

        void cancelBooking(Scanner scanner) {
            if (bookings.isEmpty()) {
                System.out.println("No bookings to cancel.");
                return;
            }

            viewBookings();
            System.out.print("Enter booking ID to cancel: ");
            int bookingId = readInt(scanner);

            for (int i = 0; i < bookings.size(); i++) {
                Booking booking = bookings.get(i);
                if (booking.bookingId == bookingId) {
                    for (Ticket ticket : tickets) {
                        if (ticket.name.equals(booking.ticket.name)) {
                            ticket.availableSeats += booking.seats;
                            break;
                        }
                    }
                    bookings.remove(i);
                    System.out.println("Booking cancelled successfully.");
                    return;
                }
            }

            System.out.println("Booking ID not found.");
        }
    }

    static class Ticket {
        String name;
        String time;
        int availableSeats;

        Ticket(String name, String time, int availableSeats) {
            this.name = name;
            this.time = time;
            this.availableSeats = availableSeats;
        }

        public String toString() {
            return name + " | Time: " + time + " | Available Seats: " + availableSeats;
        }
    }

    static class Booking {
        int bookingId;
        String customerName;
        Ticket ticket;
        int seats;

        Booking(int bookingId, String customerName, Ticket ticket, int seats) {
            this.bookingId = bookingId;
            this.customerName = customerName;
            this.ticket = ticket;
            this.seats = seats;
        }

        public String toString() {
            return "Booking ID: " + bookingId + " | Customer: " + customerName +
                    " | Ticket: " + ticket.name + " | Seats: " + seats;
        }
    }
}
