
// Player -- this class provides a simple interface for different Rochambeau
public class Player {
	int score = 0;
	String name = "DEFAULT PLAYER";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	Player() {}   // shouldn't create just a Player; have to create a ComputerPlayer or HumanPlayer

	// choose -- subclasses of Player override this to provide a polymorphic method of selecting
	// whether a Player chooses rock, paper, or scissors
	public String choose() {
		return"paper";
	}
	//public int numberOfRounds = 0;
	//public void setNumberOfRounds(int number){this.numberOfRounds= number;}
	public void setRoundNumb(int i){

	}

}
