/*
 * This class contains information about the different weapons 
 */
public class Weapon {
	/*
	 * Weapon can be a sword, shield, or boots
	 */
	public enum Type {
		SWORD, SHIELD, BOOTS, HP
	}
	Type type; 
	int level;
	int nextLevel = 6;
	
	/*
	 * When a weapon is created its type is stored as a field
	 */
	public Weapon (Type wType) {
		type = wType;
		level = 1;
	} 
	
	/*
	 * returns an int of the weapon's level 
	 */
	public int getLevel() {
		return level;
	}
	
	/*
	 * returns the amount of points necessary to reach the next weapon level 
	 */
	public int getNext() {
		return nextLevel;
	}
	
	/*
	 * increases the level of the weapon and increases the amount of points 
	 * necessary to reach the next level 
	 */
	public void upgrade() {
		level++;
		nextLevel += 2;
	}

}
