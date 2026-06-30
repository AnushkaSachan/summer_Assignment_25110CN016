import java.util.*;
class Program_116   // Program to create a inveventory management system.
{
    static class InventoryItem 
    {
        int id;
        String name;
        int quantity;
        double price;

        InventoryItem(int id, String name, int quantity, double price) 
        {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("%4d | %-20s | %8d | %10.2f", id, name, quantity, price);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        List<InventoryItem> inventory = new ArrayList<>();

        int nextId = 1, choice;
        boolean running = true;

        while (running) 
        {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add new item");
            System.out.println("2. Display inventory");
            System.out.println("3. Update item");
            System.out.println("4. Add stock");
            System.out.println("5. Remove stock");
            System.out.println("6. Delete item");
            System.out.println("7. Search item");
            System.out.println("8. Exit");
            System.out.print("Choose an option (1-8): ");

            choice = readInt(sc);
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine().trim();
                    if (name.isEmpty())
                    {
                        System.out.println("Item name cannot be empty.");
                        break;
                    }
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextInt();

                    if (quantity < 0 || price < 0) 
                    {
                        System.out.println("Quantity and price must be zero or positive.");
                        break;
                    }
                    inventory.add(new InventoryItem(nextId++, name, quantity, price));
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    displayInventory(inventory);
                    break;
                case 3:
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("Inventory is empty. Add items first.");
                        break;
                    }

                    System.out.print("Enter item ID to update: ");
                    int updateId = sc.nextInt();
                    InventoryItem itemToUpdate = findItemById(inventory, updateId);

                    if (itemToUpdate == null) 
                    {
                        System.out.println("Item not found.");
                        break;
                    }

                    System.out.print("Enter new name (leave blank to keep current): ");
                    String updatedName = sc.nextLine().trim();

                    if (!updatedName.isEmpty())
                    {
                        itemToUpdate.name = updatedName;
                    }

                    System.out.print("Enter new quantity (-1 to keep current): ");
                    int newQuantity = sc.nextInt();

                    if (newQuantity >= 0) 
                    {
                        itemToUpdate.quantity = newQuantity;
                    }

                    System.out.print("Enter new price (-1 to keep current): ");
                    double newPrice = sc.nextDouble();

                    if (newPrice >= 0) 
                    {
                        itemToUpdate.price = newPrice;
                    }
                    System.out.println("Item updated successfully.");
                    break;
                case 4:
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("Inventory is empty. Add items first.");
                        break;
                    }
                    System.out.print("Enter item ID to add stock: ");
                    int addId = sc.nextInt();
                    InventoryItem addItem = findItemById(inventory, addId);
                    if (addItem == null) 
                    {
                        System.out.println("Item not found.");
                        break;
                    }
                    System.out.print("Enter quantity to add: ");
                    int addQuantity = sc.nextInt();
                    if (addQuantity <= 0) 
                    {
                        System.out.println("Added quantity must be positive.");
                        break;
                    }
                    addItem.quantity += addQuantity;
                    System.out.println("Stock added successfully.");
                    break;
                case 5:
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("Inventory is empty. Add items first.");
                        break;
                    }
                    System.out.print("Enter item ID to remove stock: ");
                    int removeId = sc.nextInt();
                    InventoryItem removeItem = findItemById(inventory, removeId);
                    if (removeItem == null) 
                    {
                        System.out.println("Item not found.");
                        break;
                    }
                    System.out.print("Enter quantity to remove: ");
                    int removeQuantity = sc.nextInt();
                    if (removeQuantity <= 0) 
                    {
                        System.out.println("Removed quantity must be positive.");
                        break;
                    }
                    if (removeQuantity > removeItem.quantity) 
                    {
                        System.out.println("Not enough stock available.");
                        break;
                    }
                    removeItem.quantity -= removeQuantity;
                    System.out.println("Stock removed successfully.");
                    break;
                case 6:
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("Inventory is empty. Add items first.");
                        break;
                    }
                    System.out.print("Enter item ID to delete: ");
                    int deleteId = sc.nextInt();
                    InventoryItem deleteItem = findItemById(inventory, deleteId);
                    if (deleteItem == null) 
                    {
                        System.out.println("Item not found.");
                        break;
                    }
                    inventory.remove(deleteItem);
                    System.out.println("Item deleted successfully.");
                    break;
                case 7:
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("Inventory is empty. Add items first.");
                        break;
                    }
                    System.out.print("Enter name or keyword to search: ");
                    String query = sc.nextLine().trim().toLowerCase();
                    if (query.isEmpty()) 
                    {
                        System.out.println("Search query cannot be empty.");
                        break;
                    }

                    List<InventoryItem> results = new ArrayList<>();
                    
                    for (InventoryItem item : inventory) 
                    {
                        if (item.name.toLowerCase().contains(query)) 
                        {
                            results.add(item);
                        }
                    }
                    if (results.isEmpty()) 
                    {
                        System.out.println("No matching items found.");
                    } 
                    else 
                    {
                        System.out.println("Found items:");
                        printHeader();
                        for (InventoryItem item : results) 
                        {
                            System.out.println(item);
                        }
                    }
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting inventory management. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number from 1 to 8.");
            }
        }

        sc.close();
    }

    static int readInt(Scanner sc) 
    {
        while (!sc.hasNextInt()) 
        {
            sc.nextLine();
            System.out.print("Please enter a valid integer: ");
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    static double readDouble(Scanner sc) 
    {
        while (!sc.hasNextDouble()) 
        {
            sc.nextLine();
            System.out.print("Please enter a valid number: ");
        }
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    static InventoryItem findItemById(List<InventoryItem> inventory, int id) {
        for (InventoryItem item : inventory) 
        {
            if (item.id == id) 
            {
                return item;
            }
        }
        return null;
    }

    static void displayInventory(List<InventoryItem> inventory) 
    {
        if (inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\nCurrent inventory:");
        printHeader();
        for (InventoryItem item : inventory) 
        {
            System.out.println(item);
        }
    }

    static void printHeader() 
    {
        System.out.println(" ID  | Item Name            | Quantity |      Price");
        System.out.println("-----+----------------------+----------+-----------");
    }
}
