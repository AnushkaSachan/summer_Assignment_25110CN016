import java.util.*;
class Program_101   // Program to create a number guessing game.
{
    public static void main (String args [])
    {
        int min = 1 , max = 100 , max_attempts = 7 , attempts_count = 0 , user_guess ;
        boolean guessed_correctly = false ;

        Scanner sc = new Scanner (System.in);
        Random  random = new Random ();

        int secret_number = random.nextInt(( max - min ) + 1) + min ;

        System.out.println("***** Welcome to the Number Guessing Game! *****");
        System.out.println("Pick a number between 1 and 100.");
        System.out.println("You have " + max_attempts + " attempts to guess it. \n");

        while ( attempts_count < max_attempts )
        {
            attempts_count ++ ;
            System.out.println("Attempt " + attempts_count + " / " + max_attempts + " : Enter your guess: ");
            user_guess = sc.nextInt();

            if ( user_guess < 1 || user_guess > 100 )
            {
                System.out.println("Invalid input! Please enter a valid whole number between 1 and 100.");
                sc.nextLine();
                attempts_count--;
                continue;
            }

            if ( user_guess == secret_number )
            {
                guessed_correctly = true ;
                break;
            }
            else if ( user_guess < secret_number )
            {
                System.out.println("Too low! Try a higher number.");
            }
            else
            {
                System.out.println("Too high! Try a lower number.");
            }
            
            if ( max_attempts - attempts_count > 0 )
            {
                System.out.println("Attempts remaining : " + (max_attempts-attempts_count) + "\n");
            }
        }

        System.out.println();
        System.out.println("***** Game Over *****");
        if( guessed_correctly )
        {
            System.out.println("Congratulations! You guessed the number in " + attempts_count + " attempts!");
        }
        else
        {
            System.out.println("You are out of attempts!");
            System.out.println("The correct secret number was : " + secret_number);
        }
        sc.close(); 
    }
}