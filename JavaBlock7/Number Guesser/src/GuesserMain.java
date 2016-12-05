import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by block7 on 9/30/16.
 */
public class GuesserMain {
    public static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
            line = c.readLine(prompt);
        } else {
            System.out.print(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                //Ignore
            }
        }
        return line;
    }
    public static void main(String[] args) {
        String name = readLine("What is your name ");
        String input = readLine("Choose a number between 1 and 100 ");
        BinaryGuesser guesser = new BinaryGuesser();
        boolean isGuessIncorrect = true;
        while (isGuessIncorrect){
            int guess = guesser.guess();
            int guessMin = guesser.getMin();
            if (guess < guessMin){
                System.out.println("Gosh " + name + ", I'm stumped. I give up");
                break;
            }
            System.out.println(name +" ,my guess is " + guess);
            String answer = readLine("Is this correct? Is your number lower? Higher? =, -, + ");
            if (answer.equals("-")) {
                guesser.setMax(guess);
                System.out.println("I'll guess again ");
            }
            else if (answer.equals("+")) {
                guesser.setMin(guess);
                System.out.println("I'll guess again ");
            }
            else if (answer.equals("=")) {
                isGuessIncorrect = false;
                System.out.println("I got it! ");
            }
        }
    }
}

