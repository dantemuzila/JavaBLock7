/**
 * Created by block7 on 9/12/16.
 */
public class ComputerPlayer extends Player{
    int roundNumb;

    public void setRoundNumb(int newRoundNumb){
        roundNumb = (newRoundNumb % 3) + 1;
    }

    public String choose() {
            if (roundNumb == 1)
                return "rock";
            else if (roundNumb == 2)
                return "paper";
            else if (roundNumb == 3)
                return "scissors";
            else
                return "error";

    }
}


