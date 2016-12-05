import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by block7 on 10/21/16.
 */

public class GTBMain {
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

    public static void main(String args[]){
        String name = readLine("What is your name? ");
        int scoreA = 0;
        int scoreB = 0;
        while (scoreA < 50 && scoreB < 50){
            int a = new GTBPlayer(name).rollForOneRound();
            int b = new GTBPlayer("Computer").rollForOneRound();
            if (a>b){
                scoreA += (a-b);
            }
            else if (b>a){
                scoreB += (b-a);
            }
            else{
                System.out.println("It's a tie");
            }
            if (scoreA >= 50){
                System.out.println("Congrats " + name + " ,you won");
            }
            if (scoreB >= 50){
                System.out.println("Sorry you lost");
            }
        }
    }
}
