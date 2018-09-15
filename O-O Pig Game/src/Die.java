//***************************************************************************************************
// Die.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Represents the mechanics for a die that will be rolled per turn.
//***************************************************************************************************

import java.util.Random; 

public class Die {
	private int dieFaces, minimum;   
	private int[] results;
   
	//-------------------------------------------------------------------
	// Creates a dice with values and faces of 1 - 6 used for each roll.
	//-------------------------------------------------------------------
	public Die() {      
		this(6, 1);
		   
		results = new int[dieFaces];
		   
		// Represents an array for a six sided dice that will be rolled per turn. 
		results[0] = minimum;   
		results[1] = 2;
		results[2] = 3;
		results[3] = 4;
		results[4] = 5;
		results[5] = 6;
	    
	   }
	
	//-----------------------------------------------------------
	// Forms a new Die instance with the stated integer outcomes
	//-----------------------------------------------------------
	public Die(int[] outcomes) {
		results = outcomes; 
	}
   
	//---------------------------------------------------------------------------------
	// Forms a certain amount of die faces and incremental values with a minimum of 1.
	//---------------------------------------------------------------------------------
	public Die(int sides, int min) {
		dieFaces = sides; 
		minimum = min; 
	}
   
	//----------------------------------------------------------------------
	// Gives a random value between 1 - 6 when the user hits enter (rolls).
	//----------------------------------------------------------------------
	public int nextRoll() {
		Random rand = new Random();
		return results[rand.nextInt(results.length)];
	}
}