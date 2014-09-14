
public class Weapon {
	public enum Type {
		SWORD, SHIELD, BOOTS
	}
	Type type; 
	int level;
	
	public Weapon (Type wType) {
		type = wType;
		level = 1;
	} 
	
	public int getLevel() {
		return level;
	}
	
	public void upgrade() {
		level++;
	}

}
