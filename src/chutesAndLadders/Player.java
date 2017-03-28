package chutesAndLadders;

import java.util.Random;

public class Player {

	private int number;
	private int position = 0;
	
	public Player(int playerNumber){
		number = playerNumber;
	}
	
	public int getPlayerNumber(){
		return number;
	}
	
	public int getPlayerPosition(){
		return position;
	}
	
	public void spin(Game g){
		if(g.getProgress() == true){
			Random r = new Random();
			int spaces = r.nextInt(6) + 1;
			if(position + spaces > 100){
				System.out.println("Sorry, you can not go past space number 100.");
			}
			else{
				position += spaces;
				
				int spot = position;
				
				checkChutes();
				checkLadders();
				
				int spotAfterCheck = position;
				
				if(spot == spotAfterCheck){
					System.out.println("Player " + number + " moved " + spaces + " space(s) to square number " + position + "!");
				}
				else if(spot > spotAfterCheck){
					System.out.println("Oh no! Player " + number + " landed on a chute after spinning a " + spaces + " and went from square " + spot + " to square " + spotAfterCheck + "!");
				}
				else if(spot < spotAfterCheck){
					System.out.println("Yippee! Player " + number + " landed on a ladder after spinning a " + spaces + " and went from square " + spot + " to square " + spotAfterCheck + "!");
				}
			}
			checkCompletion(g);
		}
	}
	
	
	public void checkChutes(){
		if(position == 16){
			position = 6;
		}
		else if(position == 47){
			position = 26;
		}
		else if(position == 49){
			position = 11;
		}
		else if(position == 56){
			position = 53;
		}
		else if(position == 62){
			position = 19;
		}
		else if(position == 64){
			position = 60;
		}
		else if(position == 87){
			position = 24;
		}
		else if(position == 93){
			position = 73;
		}
		else if(position == 95){
			position = 75;
		}
		else if(position == 98){
			position = 78;
		}
	}
	
	
	public void checkLadders(){
		if(position == 1){
			position = 38;
		}
		else if(position == 4){
			position = 14;
		}
		else if(position == 9){
			position = 31;
		}
		else if(position == 21){
			position = 42;
		}
		else if(position == 28){
			position = 84;
		}
		else if(position == 36){
			position = 44;
		}
		else if(position == 51){
			position = 67;
		}
		else if(position == 71){
			position = 91;
		}
		else if(position == 80){
			position = 100;
		}
	}	
	
	public void checkCompletion(Game g){
		if(position == 100){
			System.out.println("Player " + number + " has won the game!");
			g.stopGame();
		}
	}
}
