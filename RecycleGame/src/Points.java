/*
 * This class keeps track of a Player's exp and equipment points 
 */

public class Points {
	private int expPoints;
	private int equipPoints;
	
	/*
	 * This constructor sets the initial points for each category equal to 0
	 */
	public Points () {
		expPoints = 0;
		equipPoints = 0;
	}
	
	/*
	 * Takes in an int and adds to the Player's exp points
	 */
	void addExp (int pointIn) {
		expPoints += pointIn;
	}
	
	/*
	 * Takes in an int and adds to the Player's equipment points
	 */
	void addEquip (int pointIn) {
		equipPoints += pointIn;
	}
	
	/*
	 * This method will add 2 points to the Player's equipment points
	 */
	void dailyBonus () {
		addEquip(2);
	} 
	
	/*
	 * This method will return the number of exp points a Player has
	 */
	public int getExp () {
		return expPoints;
	} 
	
	/*
	 * This method will return the number of equipment points a Player has
	 */
	public int getEquip () {
		return equipPoints;
	}
	
	/*
	 * This method takes in an int parameter, and simulates spending equipment 
	 * points. If the Player has at least that number of points, the Player 
	 * will "spend" those points and their total equipment points will be 
	 * decreased by that amount. If the player does not have enough points 
	 * nothing will happen
	 */
	public void spendEquip(int amt) {
		if (amt > equipPoints) {
			
		} else {
			equipPoints -= amt;
		}
	}

}
