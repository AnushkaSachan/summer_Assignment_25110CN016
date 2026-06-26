import java.util.*;
// Program to create an ATM stimulation.
class BankAccount {
    private double balance;
    private int pin;

    public BankAccount(double initialBalance, int initialPin) {
        this.balance = initialBalance;
        this.pin = initialPin;
    }

    public boolean authenticate(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please take your cash. Successfully withdrawn $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Program_103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1500.0, 1234);

        System.out.println("Welcome to the ATM Simulation!");
        
        // Authentication Phase
        int attempts = 3;
        boolean isAuthenticated = false;
        while (attempts > 0) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = scanner.nextInt();
            if (account.authenticate(enteredPin)) {
                isAuthenticated = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. You have " + attempts + " attempts left.");
            }
        }

        // Transaction Phase
        if (isAuthenticated) {
            int choice;
            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        account.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 4);
        } else {
            System.out.println("Card locked. Too many incorrect PIN attempts.");
        }
        scanner.close();
    }
}