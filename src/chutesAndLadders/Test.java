package chutesAndLadders;

public class Test {

	public static void main(String[] args){
		Game game = new Game();
		Player bo = new Player(1);
		Player joe = new Player(2);
		while(game.getProgress()){
			bo.spin(game);
			joe.spin(game);
			String joey = null;
		}
	}
}
