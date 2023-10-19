    import java.util.*;
    public class NumberGuessingGame {

    public static void main(String[] args) {
        int number = 1 + (int) (100 * Math.random());
        int i, guess;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Trials : ");
        int trials = sc.nextInt();

        System.out.println("A number is guessed between 1 and 100 . Guess the number in " + trials + " trials.");

        for (i = 0; i < trials; i++) {
            System.out.println("Guess a Number: ");
            guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Congratulations!! You have Guessed the Number Accurately !! ");
                break; 
            } else if (guess < number) {
                System.out.println("The Number is Greater than " + guess);
            } else if (guess > number) {
                System.out.println("The Number is Smaller than " + guess);
            }
        }

        if (i == trials) { 
            System.out.println("You have exhausted all your " + trials + " trials.");
            
            System.out.println("You Just Lost the Game !! The Correct number was " + number);
        }
    }
}
