//***************************************************************************************************
// OOPig.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Determines the player positioning of the user player and computer player.
//***************************************************************************************************

import java.util.Random;

public class OOPig {
	//---------------------------------------------------------------------------------------------------------
	// Gives the user player and the computer player their positions based on a random value of either 1 or 2.
	//---------------------------------------------------------------------------------------------------------
	public static void main (String[] args) {
      
		PigPlayer playerOne, playerTwo; // Represents players one and two.
		
		// Sets up the random assignment of value 1 or 2 to determine player positioning.
		Random rand = new Random();
		int digit = rand.nextInt(2) + 1;
		
		// Dictates that if 1 is produced, then player one is given to user and player two is given to the computer. 
		if(digit == 1) {          
			playerOne = new UserPigPlayer();
			playerTwo = new HoldAt20PigPlayer();
			
			System.out.println("Welcome Player One!");	
		}
		
		// Dictates that if 1 isn't produced (2 is given at random instead), then the roles are reversed for player one and two.
		else {
			playerTwo = new UserPigPlayer();
			playerOne = new HoldAt20PigPlayer();
			
			System.out.println("Welcome Player Two!");
		}
      
		// Now "play" method from PigGame.java is used to play the game with the assigned players.
		PigGame begin = new PigGame(playerOne, playerTwo);
		begin.play();
	}
}