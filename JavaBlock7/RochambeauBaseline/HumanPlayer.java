/**
 * Created by block7 on 9/12/16.
 */
public class HumanPlayer extends Player{
    public HumanPlayer() {
        String tempName = Rochambeau.readLine("What is your name? ");
        name = tempName;
    }
    public String choose() {
        String tempChoice;
        do {
            tempChoice = Rochambeau.readLine(name + ", what is your choice? ");
            tempChoice.toLowerCase();
        } while(!Rochambeau.isValid(tempChoice));
            return tempChoice;
    }
}
