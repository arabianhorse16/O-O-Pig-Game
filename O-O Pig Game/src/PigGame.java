//***************************************************************************************************
// PigGame.java      Author: Mohammad Khan      Publication Date: 07/30/2018
//
// Sets up the mechanics of how the game plays with player one and two playing.
//***************************************************************************************************

public class PigGame {
	private PigPlayer playerOne, playerTwo;
	public static final int GOAL_SCORE = 100; // Sets a threshold for winning the game.
   
	//---------------------------------------------------------------------------------------------
	// Declares user player with the ability to Roll/Hold when it's their turn as either position.
	//---------------------------------------------------------------------------------------------
	public PigGame() { 
		UserPigPlayer playerOne = new UserPigPlayer();
		UserPigPlayer playerTwo = new UserPigPlayer();		
	}	
   
	//-----------------------------------------------------
	// Forms new instance for the first and second player.
	//-----------------------------------------------------
	public PigGame(PigPlayer player1, PigPlayer player2) {
		playerOne = player1;
		playerTwo = player2;
   
	}
   
	//-----------------------------------------------------------------
	// Creates the turn based gameplay between player one and two with 
	//-----------------------------------------------------------------
	public void play() {
		Die die = new Die(); // Die class used to declare a new object for "nextRoll method later on.
	   
		int playOneScore = 0, playTwoScore = 0, turnTotal1 = 0, turnTotal2 = 0; // Sets all game values to 0 at the games beginning.
        
		// A loop that gives the overall score of each player and tells that it's player one's turn as long as GOAL_SCORE isn't reached and a 1 isn't rolled.
		while(playOneScore < GOAL_SCORE && playTwoScore < GOAL_SCORE) {
			System.out.println("Player 1 score: " + playOneScore);
			System.out.println("Player 2 score: " + playTwoScore);
  		   	System.out.println("It is player 1's turn.");
          
  		   	// A loop that allows player one to roll if it's their turn and ends if a roll produces a 1.
  		   	while (playerOne.isRolling(playOneScore, playTwoScore, turnTotal1)) {  
  		   		
  		   		int enter = die.nextRoll();
        	  
  		   		System.out.println("Roll: " + enter);
                
  		   		if(enter >= 2 && enter <= 6) { // Allows the loop to continue as long as a 1 (or "pig") isn't produced.
  		   			turnTotal1 += enter; // Adds each "turn" value per roll to the total turn score as long as a roll doesn't give a pig.
  		   			continue;      
  		   		}
  		   		
  		   		// A value of 1 causes the while loop to break and gives a turn total of 0 to the player.
  		   		else if(enter == 1) {
  		   			turnTotal1 = 0;
  		   			break;      
  		   		}
  		   	}
          
  		   	playOneScore += turnTotal1; // Adds the turn total to player one's total score. 
  		   
  		   	System.out.println("New Score: " + playOneScore);
  		   	turnTotal1 = 0; // Sets the turn total back to 0.
  		   	
  		   	// The game ends if player one's overall score reaches the threshold of 100 and congratulates them.
  		   	if(playOneScore >= GOAL_SCORE) {
  		   		System.out.println("Player One wins! Thank you for playing."); //
  		   		break;
  		   	}
  		   	
  		   	// A loop that gives the overall score of each player and tells that it's player two's turn as long as GOAL_SCORE isn't reached and a 1 isn't rolled.
  		   	System.out.println("Player 1 score: " + playOneScore);
  		   	System.out.println("Player 2 score: " + playTwoScore);
  		   	System.out.println("It is player 2's turn.");
          
  		   	// Loop that allows player two to roll if it's their turn and ends if a turn produces a 1.
  		   	while (playerTwo.isRolling(playTwoScore, playOneScore, turnTotal2)) {  
  		   		int turn = die.nextRoll();
  			   
  		   		System.out.println("Roll: " + turn);
                
  		   		if(turn >= 2 && turn <= 6) { // Allows the loop to continue as long as a 1 (or "pig") isn't produced.
  		   			turnTotal2 += turn; // Adds each "turn" value per roll to the total turn score as long as a roll doesn't give a pig.
  		   			continue;                   
  		   		}
  		   		
  		   		// A value of 1 causes the while loop to break and gives a turn total of 0 to the player.
  		   		else if(turn == 1) {
  		   			turnTotal2 = 0;
  		   			break;       
  		   		}
  		   	}
          
  		   	playTwoScore += turnTotal2; // Adds the turn total to player two's total score. 
  		   
  		   	System.out.println("New Score: " + playTwoScore);
  		   	turnTotal2 = 0; // Sets the turn total back to 0.
  		   	
  		   	// The game ends if player two's overall score reaches the threshold of 100 and congratulates them.
  		   	if(playTwoScore >= GOAL_SCORE) {
  		   		System.out.println("Player Two wins! Thank you for playing.");
  		   		break;
		   	}
	   	}
	}
}