package WumpusModified;/* class WumpusGame -- main game class; provides main loop and some utilities.  */

import java.io.*;

public class WumpusGame {

	public static WumpusMap map = new WumpusMap();
	public static boolean gameActive = true;
	
	public static int currentRoomIndex = 1;
	
	// special i/o method required because Eclipse does not provide a Console object
	private static String readLine(String prompt) {
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

	
	public static void shootArrow(String input) {
		if(input.length() < 6){
			System.out.println("Huh?");
			return;
		}
		String direction = input.substring(6);  // direction should be input after "shoot " part
		int dirNum = WumpusMap.directionNumber(direction);
		if (dirNum == 0) {
			System.out.println("Huh?");   // bad shoot direction
		} else {
			WumpusRoom room = currentRoom();
			WumpusRoom targetRoom = room.roomInDirection(dirNum); 
			if (targetRoom != null) {
				if (targetRoom.getElement() != null && (targetRoom.getElement() instanceof WumpusElement)) {
					System.out.println("You shoot the wumpus.  Victory!!");
					gameActive = false;
				} else {
					System.out.println("You missed and scared the wumpus.");
					map.moveWumpus();
				}
			} else {
				System.out.println("Can't fire that way.");
			}
		}
	}
	
	public static WumpusRoom currentRoom() {
		return map.getRoom(currentRoomIndex);
	}
	
	public static void main(String[] args) {
		// Set up map
		map.addElement(new Bats());
		map.addElement(new WumpusElement());
		map.addElement(new PitElement());
		
		currentRoomIndex = map.randomEmptyRoom();
		
		do  {
			map.getRoom(currentRoomIndex).printInfo();
			String userInput = readLine("> ");			
			int direction = 0;
			if (userInput.startsWith("shoot")) {
				shootArrow(userInput);
			} else if ((direction = WumpusMap.directionNumber(userInput)) != 0) {
				WumpusRoom nowRoom = map.getRoom(currentRoomIndex);
				WumpusRoom targetRoom = nowRoom.roomInDirection(direction);
				if (targetRoom != null) {
					currentRoomIndex = targetRoom.getIndex();
					targetRoom.handleElement();
				} else {
					System.out.println("You can't move in that direction.");
				}
			} else if (userInput.equals("bye")) {
				gameActive = false;
			} else {
				System.out.println("Command not understood.");
			}
		} while (gameActive);
		System.out.println("GAME OVER");
	}

}
