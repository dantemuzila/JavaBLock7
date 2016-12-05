package WumpusModified;

/**
 * Created by block7 on 11/2/16.
 */
public class PitElement extends RoomElement{
    public void printSenses(){
        System.out.println("Watch out there's a pit near you");
    }
    public void handle(){
        System.out.println("You fell down the pit. You died!!");
        WumpusGame.gameActive = false;
    }
}
