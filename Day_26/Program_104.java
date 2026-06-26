import java.util.*;
class Program_104    // Program to create a quiz application.
{
    static class Question 
    {
        String prompt;
        List<String> options;
        int answerIndex;

        Question(String prompt, List<String> options, int answerIndex) 
        {
            this.prompt = prompt;
            this.options = options;
            this.answerIndex = answerIndex;
        }
    }

    public static void main(String[] args) 
    {
        List<Question> quiz = Arrays.asList(
            new Question("What is the capital of France?",
                Arrays.asList("Berlin", "Madrid", "Paris", "Rome"), 2),
            new Question("Which language runs on the JVM?",
                Arrays.asList("Python", "C#", "Java", "JavaScript"), 2),
            new Question("What is 5 * 6?",
                Arrays.asList("11", "30", "56", "20"), 1)
        );

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz! Answer by entering the option number.");
        for (int i = 0; i < quiz.size(); i++) 
        {
            Question q = quiz.get(i);
            System.out.println("\nQuestion " + (i+1) + ": " + q.prompt);
            for (int j = 0; j < q.options.size(); j++) 
            {
                System.out.println((j+1) + ". " + q.options.get(j));
            }
            System.out.print("Your answer: ");
            String line = sc.nextLine().trim();
            int choice = -1;
            try 
            {
                choice = Integer.parseInt(line) - 1;
            } catch (NumberFormatException e) {
                // invalid input
            }
            if (choice == q.answerIndex) 
            {
                System.out.println("Correct!");
                score++;
            } else 
            {
                System.out.println("Incorrect. Correct answer: " + (q.answerIndex+1) + ". " + q.options.get(q.answerIndex));
            }
        }

        System.out.println("\nQuiz finished. Your score: " + score + "/" + quiz.size());
        sc.close();
    }
}