//************************************************************************************************************************
// HoldAt20PigPlayer.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Uses GOAL_SCORE of 100 from PigGame.java to set the winning value and limits the computer's turn to a threshold of 20.
//************************************************************************************************************************

public class HoldAt20PigPlayer implements PigPlayer {
	//---------------------------------------------------------------------------------------------------------------
	// Implements PigPlayer.java when rolling occurs and set two limits in the game.
	//---------------------------------------------------------------------------------------------------------------
	public boolean isRolling(int myScore, int otherScore, int turnTotal) {
		return ((myScore + turnTotal < PigGame.GOAL_SCORE) && (turnTotal < 20)); // Sets a limit on winning at a threshold of 100 and limits the computer to a score of ~20.
	}  
}