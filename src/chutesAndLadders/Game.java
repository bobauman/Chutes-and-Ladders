package chutesAndLadders;

public class Game {

	private boolean inProgress;
	
	public Game(){
		inProgress = true;
	}
	
	public boolean getProgress(){
		return inProgress;
	}
	
	public void stopGame(){
		inProgress = false;
		System.out.println("The game is now over, thanks for playing!");
	}	
	
}
