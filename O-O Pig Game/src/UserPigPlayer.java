//***************************************************************************************************
// PigGame.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Allows the user player to choose between holding or rolling when it's their turn.
//***************************************************************************************************

import java.util.*;

public class UserPigPlayer implements PigPlayer {
	//------------------------------------------------------------------------------
	// Represents dialogue for actions that are given at the beginning of the game.
	//------------------------------------------------------------------------------
	public UserPigPlayer() {		
		System.out.println("Press Enter to roll; enter anything else to hold."); 
	}
   
	//-------------------------------------------------------------------------------------------------------
	// Gives the user player the ability to roll by inputting enter, and to hold by inputting anything else.
	//-------------------------------------------------------------------------------------------------------
	public boolean isRolling(int myScore, int otherScore, int turnTotal) {
		String input;
		Scanner scan = new Scanner(System.in);
	   
		System.out.println("Turn total: " + turnTotal + " " + "Roll/Hold? "); // Dialogue that's given when it's the user's turn and after each roll.
	   	
		// Registers an input from the user and allows for another roll if enter is given.
		input = scan.nextLine();
		return (input.equals("")); 
	}
   
}
