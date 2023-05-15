import java.util.Random;
        import javax.swing.JOptionPane;
public class guessnumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int numAttempts = 5;
        int score = 0;

        Random random = new Random();
        int secretNumber = random.nextInt(max - min + 1) + min;

        for (int i = 0; i < numAttempts; i++) {
            String guessStr = JOptionPane.showInputDialog("Guess the number between " + min + " and " + max + " (attempt " + (i+1) + "/" + numAttempts + ")");
            int guess = Integer.parseInt(guessStr);
            if (guess == secretNumber) {
                JOptionPane.showMessageDialog(null, "Correct! You guessed the number in " + (i+1) + " attempts.");
                score += (numAttempts - i) * 10;
                break;
            } else if (guess < secretNumber) {
                JOptionPane.showMessageDialog(null, "Too low. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Too high. Try again.");
            }
        }

        JOptionPane.showMessageDialog(null, "Your score is " + score);
    }
}




//In this implementation, the game starts by generating a random number between the given range (min and max). The user is then prompted to enter their guess using a JOptionPane dialogue box. The game continues until the user guesses the correct number or until they reach the maximum number of attempts (numAttempts).
//
//        If the user guesses the correct number, the game displays a message saying so, along with the number of attempts it took and the user's score. The score is calculated based on the number of attempts remaining when the user guessed the number. For example, if the user guessed the number on their first attempt, they would get a score of 50 (5 attempts remaining * 10 points per attempt). If they guessed it on their last attempt, they would get a score of 10 (1 attempt remaining * 10 points per attempt).
//
//        If the user does not guess the correct number, the game displays a message telling them whether their guess was too high or too low, and prompts them to guess again.
//
//        You can modify the values of min, max, numAttempts, and the score calculation to adjust the difficulty and scoring of the game to your liking.
//
//
