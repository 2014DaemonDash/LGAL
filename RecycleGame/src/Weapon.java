
public class Weapon {
	public enum Type {
		SWORD, SHIELD, BOOTS
	}
	Type type; 
	int level;
	int nextLevel = 6;
	
	public Weapon (Type wType) {
		type = wType;
		level = 1;
	} 
	
	public int getLevel() {
		return level;
	}
	
	public int getNext() {
		return nextLevel;
	}
	
	public void upgrade() {
		level++;
		nextLevel += 2;
	}

}
