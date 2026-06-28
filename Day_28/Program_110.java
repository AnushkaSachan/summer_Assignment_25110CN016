import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program_110 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Bank Management System ===");

        while (running) {
            System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Account Statement");
            System.out.println("7. List Accounts");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = readInt(scanner);
            System.out.println();

            switch (choice) {
                case 1 -> createAccount(bank, scanner);
                case 2 -> performDeposit(bank, scanner);
                case 3 -> performWithdrawal(bank, scanner);
                case 4 -> performTransfer(bank, scanner);
                case 5 -> checkBalance(bank, scanner);
                case 6 -> printStatement(bank, scanner);
                case 7 -> bank.listAccounts();
                case 8 -> {
                    running = false;
                    System.out.println("Thank you for using the bank management system.");
                }
                default -> System.out.println("Invalid choice. Please select a number from 1 to 8.");
            }
        }

        scanner.close();
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static void createAccount(Bank bank, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Customer name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Initial deposit: ");
        double initialDeposit = readDouble(scanner);
        if (initialDeposit < 0) {
            System.out.println("Initial deposit cannot be negative.");
            return;
        }

        BankAccount account = bank.createAccount(name, initialDeposit);
        System.out.println("Account created successfully.");
        System.out.println(account.getSummary());
    }

    private static void performDeposit(Bank bank, Scanner scanner) {
        System.out.print("Account number: ");
        int accountNumber = readInt(scanner);
        System.out.print("Deposit amount: ");
        double amount = readDouble(scanner);
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        if (bank.deposit(accountNumber, amount)) {
            System.out.printf("%.2f deposited to account %d.%n", amount, accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void performWithdrawal(Bank bank, Scanner scanner) {
        System.out.print("Account number: ");
        int accountNumber = readInt(scanner);
        System.out.print("Withdrawal amount: ");
        double amount = readDouble(scanner);
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (bank.withdraw(accountNumber, amount)) {
            System.out.printf("%.2f withdrawn from account %d.%n", amount, accountNumber);
        } else {
            System.out.println("Withdrawal failed. Check account number or balance.");
        }
    }

    private static void performTransfer(Bank bank, Scanner scanner) {
        System.out.print("Source account number: ");
        int source = readInt(scanner);
        System.out.print("Destination account number: ");
        int destination = readInt(scanner);
        System.out.print("Transfer amount: ");
        double amount = readDouble(scanner);
        if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
            return;
        }

        if (bank.transfer(source, destination, amount)) {
            System.out.printf("%.2f transferred from %d to %d.%n", amount, source, destination);
        } else {
            System.out.println("Transfer failed. Check account numbers or available balance.");
        }
    }

    private static void checkBalance(Bank bank, Scanner scanner) {
        System.out.print("Account number: ");
        int accountNumber = readInt(scanner);
        BankAccount account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.println(account.getSummary());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void printStatement(Bank bank, Scanner scanner) {
        System.out.print("Account number: ");
        int accountNumber = readInt(scanner);
        BankAccount account = bank.findAccount(accountNumber);
        if (account != null) {
            account.printStatement();
        } else {
            System.out.println("Account not found.");
        }
    }

    private static class Bank {
        private final Map<Integer, BankAccount> accounts = new HashMap<>();
        private int nextAccountNumber = 1001;

        public BankAccount createAccount(String customerName, double initialDeposit) {
            int accountNumber = nextAccountNumber++;
            BankAccount account = new BankAccount(accountNumber, customerName, initialDeposit);
            accounts.put(accountNumber, account);
            return account;
        }

        public BankAccount findAccount(int accountNumber) {
            return accounts.get(accountNumber);
        }

        public boolean deposit(int accountNumber, double amount) {
            BankAccount account = accounts.get(accountNumber);
            if (account == null) {
                return false;
            }
            account.deposit(amount);
            return true;
        }

        public boolean withdraw(int accountNumber, double amount) {
            BankAccount account = accounts.get(accountNumber);
            return account != null && account.withdraw(amount);
        }

        public boolean transfer(int sourceAccountNumber, int destinationAccountNumber, double amount) {
            BankAccount source = accounts.get(sourceAccountNumber);
            BankAccount dest = accounts.get(destinationAccountNumber);
            if (source == null || dest == null || amount <= 0) {
                return false;
            }
            return source.transferTo(dest, amount);
        }

        public void listAccounts() {
            if (accounts.isEmpty()) {
                System.out.println("No accounts found.");
                return;
            }
            System.out.println("Accounts:");
            for (BankAccount account : accounts.values()) {
                System.out.println(account.getSummary());
            }
        }
    }

    private static class BankAccount {
        private final int accountNumber;
        private final String customerName;
        private double balance;
        private final List<String> transactions = new ArrayList<>();

        public BankAccount(int accountNumber, String customerName, double initialDeposit) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
            this.balance = initialDeposit;
            addTransaction("Account opened", initialDeposit);
        }

        public void deposit(double amount) {
            balance += amount;
            addTransaction("Deposit", amount);
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            addTransaction("Withdrawal", -amount);
            return true;
        }

        public boolean transferTo(BankAccount destination, double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            destination.balance += amount;
            addTransaction("Transfer to " + destination.accountNumber, -amount);
            destination.addTransaction("Transfer from " + accountNumber, amount);
            return true;
        }

        public String getSummary() {
            return String.format("[%d] %s - Balance: %.2f", accountNumber, customerName, balance);
        }

        public void printStatement() {
            System.out.println("Account Statement for " + customerName + " (" + accountNumber + ")");
            System.out.println("Balance: " + String.format("%.2f", balance));
            System.out.println("Transactions:");
            if (transactions.isEmpty()) {
                System.out.println("  No transactions recorded.");
                return;
            }
            for (String transaction : transactions) {
                System.out.println("  " + transaction);
            }
        }

        private void addTransaction(String type, double amount) {
            transactions.add(String.format("%s: %.2f", type, amount));
        }
    }
}
