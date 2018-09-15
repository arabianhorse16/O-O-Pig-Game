//***************************************************************************************************
// PigPlayer.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Represents as an interface and is implemented by HoldAt20PigPlayer.java and UserPigPlayer.java 
//***************************************************************************************************

public interface PigPlayer {
	//----------------------------------------------------------------------------------------------------
	// Dictates the rolling of dice and values associated with rolling whether the player holds or rolls.
	//----------------------------------------------------------------------------------------------------
	public boolean isRolling(int myScore, int otherScore, int turnTotal);
}