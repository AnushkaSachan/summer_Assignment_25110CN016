import java.util.*;
class Program_102    // Program to create a voting eligibility system.
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***** Voting Eligibility System *****\n");
        
            // Collect inputs with validation
            String name = "";
            int age = -1;
            Boolean isCitizen = null;
            Boolean isRegistered = null;
            Boolean hasCriminalRecord = null;

            // Name
            while (name.trim().isEmpty()) {
                System.out.print("Enter your full name: ");
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty. Please try again.");
                }
            }

            // Age
            while (age < 0) {
                System.out.print("Enter your age: ");
                String ageInput = sc.nextLine().trim();
                try {
                    age = Integer.parseInt(ageInput);
                    if (age < 0 || age > 150) {
                        System.out.println("Please enter a valid age between 0 and 150.");
                        age = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please enter your age as digits.");
                }
            }

            // Yes/no helper
            java.util.function.Function<String, String> ynNormalize = s -> s == null ? "" : s.trim().toLowerCase();

            // Citizenship
            while (isCitizen == null) {
                System.out.print("Are you a citizen? (yes/no): ");
                String input = ynNormalize.apply(sc.nextLine());
                if (input.equals("yes") || input.equals("y")) isCitizen = true;
                else if (input.equals("no") || input.equals("n")) isCitizen = false;
                else System.out.println("Please answer 'yes' or 'no'.");
            }

            // Registration
            while (isRegistered == null) {
                System.out.print("Are you registered to vote? (yes/no): ");
                String input = ynNormalize.apply(sc.nextLine());
                if (input.equals("yes") || input.equals("y")) isRegistered = true;
                else if (input.equals("no") || input.equals("n")) isRegistered = false;
                else System.out.println("Please answer 'yes' or 'no'.");
            }

            // Criminal record
            while (hasCriminalRecord == null) {
                System.out.print("Do you have any disqualifying criminal convictions? (yes/no): ");
                String input = ynNormalize.apply(sc.nextLine());
                if (input.equals("yes") || input.equals("y")) hasCriminalRecord = true;
                else if (input.equals("no") || input.equals("n")) hasCriminalRecord = false;
                else System.out.println("Please answer 'yes' or 'no'.");
            }
        
        System.out.println("\n***** Eligibility Result *****\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // Check eligibility
        boolean isEligible = checkVotingEligibility(age, isCitizen, isRegistered, hasCriminalRecord);
        
        if (isEligible) {
            System.out.println("\n✓ Congratulations! You are ELIGIBLE to vote.");
        } else {
            System.out.println("\n✗ Sorry! You are NOT eligible to vote.\n");
            
            // Provide specific reasons
            if (age < 18) {
                System.out.println("Reason: You must be at least 18 years old to vote.");
            }
            if (!isCitizen) {
                System.out.println("Reason: You must be a citizen to vote.");
            }
            if (!isRegistered) {
                System.out.println("Reason: You must be registered to vote.");
            }
            if (hasCriminalRecord) {
                System.out.println("Reason: Disqualifying criminal convictions prevent voting.");
            }
        }
        
        sc.close();
    }
    
    public static boolean checkVotingEligibility(int age, boolean isCitizen, 
                                                  boolean isRegistered, boolean hasCriminalRecord) {
        // All conditions must be met
        if (age < 18) {
            return false;
        }
        if (!isCitizen) {
            return false;
        }
        if (!isRegistered) {
            return false;
        }
        if (hasCriminalRecord) {
            return false;
        }
        
        return true;
    }
}
