package WumpusModified;

/**
 * Created by block7 on 11/2/16.
 */
public class Bats extends RoomElement{
    public void printSenses(){
        System.out.println("You hear fluttering");
    }
    public void handle(){
        int newRoom = WumpusGame.map.randomEmptyRoom();
        WumpusGame.currentRoomIndex = newRoom;
        System.out.println("Bats whisk you away!!");
    }
}
