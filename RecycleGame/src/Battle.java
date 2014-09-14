import java.util.Random;

/*
 * After GUI checks if player is allowed to attack, battle occurs.
 */

public class Battle {
	// player1 is attacker and player2 is defender
	Player player1, player2;
	int attack1, defense1, speed1, hp1, attack2, defense2, speed2, hp2;
	
	public Battle(Player attacker, Player defender) {
		player1 = attacker;
		player2 = defender;
		
		attack1 = player1.stats.getAttack();
		defense1 = player1.stats.getDefense();
		speed1 = player1.stats.getSpeed();
		hp1 = player1.stats.getHp();
		attack2 = player2.stats.getAttack();
		defense2 = player2.stats.getDefense();
		speed2 = player2.stats.getSpeed();
		hp2 = player2.stats.getHp();
	}
	
	// Returns true if player wins and false if player loses attack
	public boolean battleRound() {
		boolean playerWin = false;
		
		// player1 attack player2
		if (miss() == false)
			hp2 -= attack1 + defense2;
		
		// player2 attacks back at player1
		if (miss() == false)
			hp1 -= attack2 + defense1;
		
		return playerWin;
	}
	
	/*
	 * This method adds a slight randomness factor to the battling portion of
	 * the game. Each time a player attacks there is a 5% chance that the 
	 * player will miss. This method runs the random number generator and 
	 * returns whether or not an attack missed
	 */
	public boolean miss() {
		boolean miss = false;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		
		if (randomNumber >= 95 && randomNumber <= 100)
			miss = true;
		
		return miss;

	}
	
}